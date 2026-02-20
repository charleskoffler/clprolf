# CLPROLF – Explaining Declensions

Clprolf is a language and framework that helps you design objects with a **single, explicit responsibility**.
By assigning each class a **role** (also called its **declension**), you ensure compliance with the **Single Responsibility Principle (SRP)**.
Objects become **components**, and this clarity remains intact even with inheritance.

---

### Domain (Clprolf Definition)

In Clprolf, a *Domain* is the subject of a class — the specific conceptual topic the class is about. The Domain does not organize code by itself; the class is the organizing abstraction. By clearly identifying its Domain, a class structures code around a single, well-defined subject. This simplifies programming by separating subjects into distinct abstractions, rather than structuring code only around data structures or machine-level concerns. It keeps the focus on conceptual meaning instead of mere technical implementation.

This approach is not new. Object-oriented programming already tends to structure classes around subjects. Similar organizing subjects can be observed even in system-level programming, where code is structured around concepts such as sockets or files. These are not merely data structures, but conceptual focuses around which code is organized.

---

## What Is a Declension?

A **declension** expresses the *nature* of a class — its fundamental role in the system.
Clprolf defines only a few basic roles, which keeps design unambiguous and intuitive.

The five available declensions are:

1. **`agent`**
   Synonyms: `abstraction`, `simu_real_obj`.

2. **`worker_agent`**
   Synonyms: `comp_as_worker`.

3. **`model`**
   (no synonyms).

4. **`information`**
   (no synonyms).

5. **`indef_obj`**
   A flexible object without explicit role, behaving like a traditional OO class.

---

## Synonyms and Aspects

Each declension keeps only a minimal set of synonyms, and every synonym reflects a specific aspect:

* **Agent declension** → `agent` (agent aspect), `abstraction` (object aspect), `simu_real_obj` (simulation aspect)
* **Worker_agent declension** → `worker_agent` (agent aspect), `comp_as_worker` (simulation aspect)
* **Model declension** → `model`
* **Information declension** → `information`
* **Indef_obj declension** → `indef_obj`

This structure makes the system both easy to memorize and easy to teach.
Synonyms are no longer arbitrary alternatives but clearly justified by the perspective they express.

---

## Domain Objects

These objects represent **real-world abstractions** or domain concepts.

* **`agent`**: the active actor.

  * `agent` emphasizes action.
  * `simu_real_obj` emphasizes simulation.
  * `abstraction` emphasizes conceptual encapsulation (e.g., a `Connection`, a `Socket`).

* **`abstraction`**: for abstract concepts and system elements (connections, sockets, system utilities).
  
* **`simu_real_obj`**: a micro-simulation of a real-world entity.
  Example: a `Giraffe` class with states and behaviors simulating how a giraffe acts.

* **`model`**: a passive entity with no behavior — just attributes.
  Example: a `Customer` with fields but no methods.

---

## Technical Objects

These objects handle **purely computational or support tasks**.
Here, the **computer itself** is seen as the actor.

* **`worker_agent`**: the computer as a worker executing algorithms.
  Synonyms: `comp_as_worker`.

* **`information`**: a coherent data container, used by workers in algorithms.
  ⚠️ Unlike `model`, it does not represent a real-world entity, only technical data.

Examples: system utilities, DAOs, repositories, low-level services, or MVC *view* components.

---

## Interfaces and Declensions

Interfaces also have declensions:

* **`compat_interf_version`** = `version_inh`
* **`compat_interf_capacity`** = `capacity_inh`
* **`compat_interf`** (no synonym)

---

## Inheritance Consistency

Clprolf enforces that inheritance stays **role-consistent**:

* Domain and technical objects cannot be mixed in the same hierarchy.
* Synonyms of a declension are accepted with a warning.
* Exceptions may be forced with `@Forced_inh`.

---

## Using Declensions

In pure Clprolf, the declension **replaces the `class` keyword**.
In the framework, it appears as an annotation above the class.

Example:

```clprolf
public class_for agent Animal { ... }
```

```java
@Agent
public class Animal { ... }
```

---

## Algorithm for Choosing a Declension

Every class must declare a role.

**Step 1 – Does the class have methods?**

* Yes → it is **active** → choose `@Agent` or `@Worker_agent`.
* No → it is **passive** → use `@Model` (entity) or `@Information` (technical container).

**Step 2 – Is the responsibility domain or technical?**

* Business/Domain logic or expert knowledge → `@Agent`.
* Technical or support layer → `@Worker_agent`.

---

## Summary

* Declensions make objects into **components** with explicit roles.
* Roles clarify responsibilities, improve readability, and ensure inheritance coherence.
* Synonyms keep flexibility while preserving consistency.

Result: a simpler, more maintainable system, where every object is clearly positioned.

---

### Notice

If the class already fits one of the well-known architectural categories, you can directly assign a matching role:

* A service → `@Agent`
* A helper → `@Agent` or `@Worker_agent`
* A DAO or repository → `@Worker_agent`
* A controller → `@Agent`

---
