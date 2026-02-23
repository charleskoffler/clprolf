# 📘 Getting Started with Clprolf

## Prerequisites

Clprolf builds upon classical Object-Oriented Programming.

To fully benefit from this guide, readers should already be familiar with:

* the fundamentals of OOP,
* inheritance and composition,
* basic design principles and common patterns.

## Making Responsibilities Explicit

Clprolf is a language and framework designed to make architectural roles explicit.

In most object-oriented systems, separation of responsibilities relies on discipline.

Clprolf encodes that discipline structurally.

Every class declares what it is.

---

## Foundational Principles of Clprolf

Clprolf is based on two core principles:

1. A class is either technical or organized around a well-defined class domain.
2. Inheritance must preserve the class domain; if it does not, composition is used instead.

These principles define how Clprolf structures components and relationships.

---

The class domain is the central subject around which a class is organized.
It defines what the class fundamentally represents and what it is responsible for.

* A `File` class has a class domain related to file handling.

A technical class, by contrast, does not represent a conceptual domain.
It provides technical support (e.g., logging, parsing, low-level utilities).

---

## 1️⃣ Declaring a Role

Instead of writing:

```java
public class OrderManager { }
```

In Clprolf you declare the role:

```clprolf
public class_for agent OrderProcessor { }
```

or

```clprolf
public class_for worker_agent OrderRepository { }
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
public class_for indef_obj OrderManager {
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
public class_for agent OrderProcessor {
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
public class_for worker_agent OrderRepository { ... }
public class_for worker_agent OrderNotifier { ... }
```

The behavior is unchanged.
The architecture becomes explicit.

---

## 4️⃣ Structural Rules Are Enforced

Clprolf does not only suggest discipline.

It enforces structural coherence.

Example:

```clprolf
public class_for agent A1AnimalImpl nature AnimalWorker { }
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
