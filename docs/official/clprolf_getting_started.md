# 📘 Getting Started with Clprolf

## Making Responsibilities Explicit

Clprolf is a language and framework designed to make architectural roles explicit.

In most object-oriented systems, separation of responsibilities relies on discipline.

Clprolf encodes that discipline structurally.

Every class declares what it is.

---

## 1️⃣ Declaring a Role

Instead of writing:

```java
public class OrderManager { }
```

In Clprolf you declare the role:

```clprolf
public agent OrderProcessor { }
```

or

```clprolf
public worker_agent OrderRepository { }
```

Each class has a **declension** (its architectural nature).

The core declensions are:

* `agent` → business responsibility
* `worker_agent` → technical execution
* `model` → passive domain entity
* `information` → technical data container
* `indef_obj` → transitional, undefined role

---

## 2️⃣ Start Flexible: `indef_obj`

Clprolf does not require architectural clarity upfront.

You can begin with:

```clprolf
public indef_obj OrderManager {
    public void process(Order order) {
        validate(order);
        save(order);
        notify(order);
    }
}
```

`indef_obj` represents a temporary state.

Refactoring can happen later.

---

## 3️⃣ Making Responsibilities Explicit

After identifying responsibilities:

| Concern             | Nature    |
| ------------------- | --------- |
| Business validation | Business  |
| Persistence         | Technical |
| Notification        | Technical |

You refactor:

```clprolf
public agent OrderProcessor {
    private OrderRepository repository;
    private OrderNotifier notifier;

    public void process(Order order) {
        validate(order);
        repository.save(order);
        notifier.notify(order);
    }
}
```

```clprolf
public worker_agent OrderRepository { ... }
public worker_agent OrderNotifier { ... }
```

The behavior is unchanged.
The architecture becomes explicit.

---

## 4️⃣ Structural Rules Are Enforced

Clprolf does not only suggest discipline.

It enforces structural coherence.

Example:

```clprolf
public agent A1AnimalImpl nature AnimalWorker { }
```

This attempts to inherit a `worker_agent` from an `agent`.

Result:

```
ARCH-A1 => Class A1AnimalImpl:
the parent class should be an agent (AnimalWorker)
```

The equivalent Java code would compile:

```java
public class A1AnimalImpl extends AnimalWorker { }
```

Clprolf rejects it as architecturally inconsistent.

---

## 5️⃣ Interface Discipline

Clprolf also distinguishes between:

* `version_inh` (alternative implementations)
* `capacity_inh` (shared capabilities)

Example of forbidden usage:

```clprolf
public agent BA4Animal contracts Animal, Vehicle { }
```

Error:

```
ARCH-BA4 => contracts multiple version_inh interfaces (forbidden)
```

The rule prevents ambiguous role inheritance.

---

## 6️⃣ What Clprolf Changes

Clprolf does not change:

* algorithms
* execution flow
* runtime model

It changes:

* role visibility
* inheritance coherence
* architectural guarantees

---

## 7️⃣ Philosophy in One Sentence

Clprolf encodes architectural responsibility at the language level
instead of leaving it to convention.

---
