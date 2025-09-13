# The `underst` Method Modifier

The `underst` modifier (`@Underst` in the Clprolf framework) is used to **mark methods whose implementation is not straightforward**.

It highlights algorithms that are **non-trivial**, where the way a computer solves a task is different from how a human would naturally reason about it.

---

## Purpose

* `underst` means **“understanding”**.
* It shows that the method exists to **make the computer understand** a process that is not directly intuitive.
* It applies to both **agents** and **worker\_agents**.

Even with human-like algorithms (such as those written in Algol-like languages), it is sometimes tricky to express jobs for the computer.
A classical example is **sorting**: while humans sort in a very direct way, computers need a step-by-step algorithm.

---

## Example: Bubble Sort

Consider the **bubble sort** algorithm.

* A **human expert** would probably take the largest elements and move them directly to the top in one pass.
* A **computer**, however, is taught to repeatedly compare and swap pairs of elements until no more changes are needed.

This approach is efficient for the computer, but it is **not the intuitive human way**.
Therefore, the method should be marked with `underst` to indicate that the implementation is more technical than natural.

---

### In Clprolf

```java
public agent BubbleSorter {
    private int[] theElements;

    public int[] getElements() {
        return this.theElements;
    }

    public BubbleSorter(int[] theArray) {
        this.theElements = theArray;
    }

    public underst void sort() {
        // Non-trivial algorithm here
    }
}
```

---

### In the Clprolf Java Framework

```java
@Agent
public class BubbleSorter {
    private int[] theElements;

    public int[] getElements() {
        return this.theElements;
    }

    public BubbleSorter(int[] theArray) {
        this.theElements = theArray;
    }

    @Underst
    public void sort() {
        // Non-trivial algorithm here
    }
}
```

---

## Benefits

* **Clarity** – At a glance, readers know that the method contains a non-trivial algorithm.
* **Consistency** – In Clprolf, either methods are straightforward (unmarked), or they are explicitly marked `underst`.
* **Transparency** – Even less intuitive code has a clear purpose: *make the computer understand*.

---

## Design Philosophy

Behind the `underst` modifier lies Clprolf’s philosophy of **keeping implementations simple and explicit**:

* Straightforward code is left unmarked.
* More technical, non-intuitive code is clearly marked with `underst`.

This ensures that **all Clprolf code remains understandable**, regardless of its complexity.

---
