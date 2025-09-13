# Concurrency and Parallelism Aids in Clprolf

Clprolf introduces a set of **semantic aids** to make concurrency and parallelism easier to understand and safer to implement.
These aids are not meant to replace Java’s robust primitives, but to **clarify intent** and bring them closer to the Clprolf methodology of explicit design.

They apply mainly to **agents**, but also to **worker\_agents**, ensuring that both real-world simulations and technical components can benefit.

---

## Concurrency Aids

Two modifiers are available:

* **`long_action`** (`@Long_action`)
* **`prevent_missing_collision`** (`@Prevent_missing_collision`)

These clarify the handling of actions that take time, and ensure that critical interactions (like collisions) are never missed.

---

### `long_action`

Some methods in an **agent** represent actions that **take time**, not just instant state changes.
Example: in a video game, a `Player.jump()` is a long action — the character rises, falls, and lands.

We don’t want to manage each step manually; we just want to *trigger the action*.
Clprolf cuts the action into **steps**, automatically executed until completion.

---

### `prevent_missing_collision`

Collisions can be missed if two entities move simultaneously and pass through each other.
To avoid this, methods updating positions are marked with `prevent_missing_collision`.

This ensures the **collision check** is done before movement is applied.

---

## Parallelism Aids

Clprolf complements Java’s primitives with three modifiers for parallel execution:

* **`one_at_a_time`** (`@One_at_a_time`)
* **`turn_monitor`** (`@Turn_monitor`)
* **`for_every_thread`** (`@For_every_thread`)

These do not change the underlying mechanics, but make multithreading **explicit and readable**.

---

### `one_at_a_time`

Marks a method as **synchronized**.
It makes explicit that only **one thread at a time** may execute this method, giving the feeling of a single-threaded application for critical parts.

---

### `turn_monitor`

Coordinates multiple `one_at_a_time` methods across different classes.
The annotated field represents the **lock object** shared by these methods.

Example: `Player.place()` and `Enemy.place()` can use the same `@Turn_monitor`, ensuring their critical sections behave like a single-threaded sequence.

---

### `for_every_thread`

Marks a field as **volatile** (or equivalent).
It guarantees that the latest value is visible across threads, avoiding cache-related issues.
This makes concurrency-safety **immediately clear** in the code.

---

## Dependent Activities

Some activities cannot proceed until another one completes.
Clprolf expresses this with **`dependent_activity`** (`@Dependent_activity`).

Example: a mailbox with one message slot.

* `read()` must wait until `write()` has placed a message.
* `write()` must wait until the mailbox is empty.

Both are marked `@Dependent_activity` and share the same `@Turn_monitor`.
This models the **producer/consumer** pattern without forcing technical terminology.

---

## Design Recommendations

* **Start simple**: write single-threaded code first, using `long_action` and `prevent_missing_collision`.
* **Add parallelism when needed**: apply `one_at_a_time`, `turn_monitor`, and `for_every_thread` only where true multithreading is required.
* **Use dependent activities**: they make thread dependencies explicit and reduce reasoning complexity.

---

## Performance Considerations

* These modifiers are **semantic aids** — they rely on Java primitives (`synchronized`, `volatile`, `wait`, `notifyAll`).
* No performance overhead is introduced compared to equivalent Java code.
* They simply make the design intent **clear and consistent**.

---

## Example Code

### Agent Example: `Player` with `long_action` and `prevent_missing_collision`

```java
public simu_real_obj Player {
    @Long_action
    private boolean isFalling = false;

    public prevent_missing_collision void place(int xWanted, int yWanted, MovementKind kindWantedMvt) {
        if (isSettingUpLadder && checkPlayerInLadder()==null) {
            this.isSettingUpLadder = false;
        }
        if (!checkIfInEnemyPosition(xWanted, yWanted)) {
            this.x = xWanted;
            this.y = yWanted;
        }
    }

    public long_action void fallIfHole() {
        if (!this.isFalling && !isJumping && !isSettingUpLadder && !checkIfNoPlatformBehind()) {
            this.isFalling = true;
            this.continueFallIfHole();
        }
    }

    public long_action void continueFallIfHole() {
        if (this.isFalling && !this.isSettingUpLadder) {
            if (!isJumping && !checkIfNoPlatformBehind()) {
                this.place(x, y+1, true);
            } else {
                this.isFalling = false;
            }
        }
    }

    public long_action void endLongActions() {
        if (this.game.realiz.waitPaintCount(2)) {
            continueJump();
        }
        if (this.game.realiz.waitPaintCount(2)) {
            continueFallIfHole();
        }
    }
}
```

---

### Worker\_Agent Example: `OneMessageMailBox` with Dependent Activities

```java
/* A class with two dependent activities */
@Abstraction
public class OneMessageMailBox {

    private String message;

    @For_every_thread
    private boolean full; // Not volatile here, because used in a synchronized block

    @Turn_monitor
    private Object mailBoxMonitor; // Shared lock object, also used for wait()/notify()

    public OneMessageMailBox() {
        mailBoxMonitor = new Object();
    }

    @Dependent_activity
    @One_at_a_time
    public String read() {
        synchronized(mailBoxMonitor) {
            while (!this.full) {
                try {
                    this.mailBoxMonitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.full = false;
            this.mailBoxMonitor.notifyAll();
            return this.message;
        }
    }

    @Dependent_activity
    @One_at_a_time
    public void write(String message) {
        synchronized(mailBoxMonitor) {
            while (this.full) {
                try {
                    this.mailBoxMonitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.message = message;
            this.full = true;
            this.mailBoxMonitor.notifyAll();
        }
    }
}
```

---

## Conclusion

Concurrency and parallelism are inherently complex.
Clprolf does not attempt to hide this complexity, but instead provides **clear and explicit tools**:

* `long_action` and `prevent_missing_collision` for concurrency,
* `one_at_a_time`, `turn_monitor`, and `for_every_thread` for parallelism,
* `dependent_activity` to make thread dependencies explicit.

With these aids, code remains **simple, structured, and closer to real-world reasoning**.
Clprolf encourages developers to think first in terms of **single-threaded concurrency**, and only then to extend to multithreading when necessary.

---
