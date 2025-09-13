# CLPROLF – Explaining Declensions

Clprolf is a language and framework that helps you design objects with a **single, explicit responsibility**.
By assigning each class a **role** (also called its **declension**), you ensure compliance with the **Single Responsibility Principle (SRP)**.
Objects become **components**, and this clarity remains intact even with inheritance.

---

## What Is a Declension?

A **declension** expresses the *nature* of a class — its fundamental role in the system.
Clprolf defines only a few basic roles, which keeps design unambiguous and intuitive.

The five available declensions are:

1. **`agent`**
   Synonyms: `simu_agent`, `simu_real_world_obj`, `simu_real_obj`, `abstraction`.

2. **`worker_agent`**
   Synonyms: `simu_comp_as_worker`, `comp_as_worker`.

3. **`model`**
   Synonyms: `model_real_world_obj`, `model_real_obj`.

4. **`information`**
   (no synonyms).

5. **`indef_obj`**
   A flexible object without explicit role, behaving like a traditional OO class.

---

## Business-Like Objects

These objects represent **real-world abstractions** or domain concepts.

* **`agent`**: the active actor.

  * `agent` emphasizes action.
  * `simu_real_obj` emphasizes simulation.
  * `abstraction` emphasizes conceptual encapsulation (e.g., a `Connection`, a `Socket`).
  * `simu_agent` highlights simulation of a real-world agent (e.g., an employee).

* **`simu_real_obj`**: a micro-simulation of a real-world entity.
  Example: a `Giraffe` class with states and behaviors simulating how a giraffe acts.

* **`abstraction`**: for abstract concepts and system elements (connections, sockets, system utilities).

* **`model`**: a passive entity with no behavior — just attributes.
  Example: a `Customer` with fields but no methods.

---

## Technical Objects

These objects handle **purely computational or support tasks**.
Here, the **computer itself** is seen as the actor.

* **`worker_agent`**: the computer as a worker executing algorithms.
  Synonyms: `comp_as_worker`, `simu_comp_as_worker`.

* **`information`**: a coherent data container, used by workers in algorithms.
  ⚠️ Unlike `model`, it does not represent a real-world entity, only technical data.

Examples: system utilities, DAOs, repositories, low-level services, or MVC *view* components.

---

## Declensions and Genders

Declensions can be refined with **genders** (optional sub-roles).
They may also have synonyms:

* `@Expert_component` = `@Human_expert` = `@Design_role`
* `@GUI_role` = `@Machine_tool`
* `@Active_agent` (no synonym)
* `@Static` = `@Expert_component_static` = `@Human_expert_static`
* `@Static` for `worker_agent` (no synonym)

⚠️ Genders apply only to **agents**, except `@Static`, which may also apply to **worker\_agent**.

---

## Interrelationships Between Declensions

* **Agents and Workers**
  Every agent can also act as a worker (computers execute agents as workers).
  But explicit workers should be minimized for clarity.

* **Models and Information**
  A model can be represented as information (stored as data),
  but information should not replace a model.

* **Unidirectional Substitutions**

  * Agent → Worker ✅
  * Worker → Agent ❌
  * Model → Information ✅
  * Information → Model ❌

These reversals usually reveal a **design flaw** or a deliberate reinterpretation.

---

## Interfaces and Declensions

Interfaces also have declensions:

* **`compat_interf_version`** = `version_inh`
* **`compat_interf_capacity`** = `capacity_inh`
* **`compat_interf`** (no synonym)

Declensions on interfaces specify which classes are allowed to implement them.

Capacity interfaces can also have a **gender called Advice**:

* `@For_agent_like`
* `@For_worker_like`

---

## Inheritance Consistency

Clprolf enforces that inheritance stays **role-consistent**:

* Business and technical objects cannot be mixed in the same hierarchy.
* Synonyms of a declension are accepted.
* Exceptions may be forced with `@Forced_inh`.

---

## Using Declensions

In pure Clprolf, the declension **replaces the `class` keyword**.
In the framework, it appears as an annotation above the class.

Example:

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

**Step 2 – Is the responsibility business-related or technical?**

* Business logic or expert knowledge → `@Agent`.
* Technical or support layer → `@Worker_agent`.

---

## Example: System Class in Java

At first sight: `@Worker_agent` (low-level, technical).

But Clprolf favors `@Agent` whenever possible.
System could also be seen as:

* `@Abstraction` — since “the system” is a conceptual entity.
* `@Agent(Role.EXPERT_COMPONENT)` — as an expert component representing the environment.

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
* A helper → `@Agent` or `@Worker_agent` (often with `Role.STATIC`)
* A DAO or repository → `@Worker_agent`
* A controller → `@Agent`

---
