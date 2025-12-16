# **Clprolf Language — Reference Manual**

This document is the **official reference manual** of the Clprolf programming language.
It defines the concepts, roles, rules, and structures that form the core of the language.
All keywords, mechanisms, and architectural principles described here constitute the authoritative definition of Clprolf.

The manual is suitable for any developer with basic knowledge of object-oriented programming, although such familiarity is not strictly required.

It can be read progressively or used as a reference when needed.
Its purpose is to give a clear and coherent understanding of how the language works, how its concepts fit together, and why it was designed this way.

Clprolf was created to make clarity and structure emerge naturally from programming.
This manual presents the ideas that support this vision.

---

## I) Introduction

**CLear PROgramming Language and Framework (Clprolf)**

Clprolf is a niche programming language designed to help build systems with a **mindful and coherent structure**.
It provides a clear framework for creating software with consistency, purpose, and long-term stability.

---

### I.1) Nature of the Language

Clprolf is a **specialized, guided language**.
It defines predefined components and enforces strict rules for inheritance and interfaces, with a strong focus on algorithmic programming.

It is particularly suited for:

* complex systems,
* simulation and MAS-like applications,
* and educational purposes.

---

### I.2) Beyond Programming

Clprolf can also serve as a tool for **memory and comprehension**.
It works much like a mnemonic or *memory palace*, helping developers who struggle to retain large, abstract architectures.

It is also a medium for **testing, explaining, and validating scientific theories**, by means of simulation, algorithm description, and clear actor modeling.

---

### I.3) Language and Framework

This document presents both:

* the **Clprolf programming language**, and
* the **Clprolf framework**, a lightweight, annotation-based framework that brings Clprolf concepts into Java, C#, and PHP.

---

### I.4) Minimalism and Teaching

Clprolf is deliberately **minimalistic** to simplify development.
It is a powerful **teaching tool**, but not limited to educational contexts.

Programming in Clprolf focuses on **functional problems** and on describing the **interactions of actors**.
For technical concerns, it specifies **what a worker must do**, not how the work is carried out internally.

---

### I.5) Embedded Principles

Clprolf is designed for **clarity, simplicity, and ease of use**.
It naturally embeds object-oriented principles and significant design patterns — a rare feature for a programming language.

It supports both:

* **algorithm design**, aided by typed classes and interface constraints,
* and **structural clarity**, through roles and modifiers.

---

🧠 One of the main — perhaps the most important — goals of Clprolf is to make writing programs **easier**.

Programming is the weaving together of **design** and **algorithmic concerns**.
Clprolf was built to support both.

### I.6 — The SRP, Completed: What “One Reason to Change” Really Implies

If a class must have only **one** reason to change,
then this reason must be **shared by all its methods**.
Such a reason can only be the class’s **responsibility**,
and since the SRP speaks of *single* responsibility,
this responsibility must be **unique**.
In other words, it corresponds to the **duty** of the class.

A responsibility is simply the **work** the class performs.
For example, the responsibility of a `Doctor` class is
*maintaining the patient’s health*.
And this responsibility directly follows from the **nature** of the class.
Therefore, the nature must also be **unique**.

From the SRP itself, we can therefore conclude that:

* we must separate **business work** from **technical work**,
  since they are different responsibilities;
* a class cannot have several natures or identities,
  since that would create several reasons to change.

This is exactly the model adopted by Clprolf:
every class has **one nature**, which gives it **one responsibility**,
which all methods collectively express.


> **Clprolf naturally carries out the SRP:
> the unique nature of a class emerges from its declension,
> its consistency is echoed by the synonym,
> and the compiler quietly ensures that this unity is preserved.
> The SRP becomes automatic — applied even without thinking about it.
> This is precisely why Clprolf could finish what the SRP had only started.**

#### I.6.b — The SRP Misinterpretation: “One Method per Class”

Some people interpret the SRP in an extreme way and conclude that a class should contain only one method.
This interpretation contradicts the very definition of an object in object-oriented programming.

An object is not defined by a single action, but by a **set of related behaviors** that all belong to the same domain — the class’s responsibility.

Therefore, *one method per class* is not SRP.
And more importantly, **it is not object-oriented programming at all**.
Classes in OOP have always contained several methods; this is normal and expected.

A class may have many methods and still have **one** responsibility,
as long as they all belong to the same domain (nature).

Clprolf preserves this logic:
**the nature defines the responsibility — not the number of methods.**

---

#### I.6.c) SRP and Classical Multiple Inheritance

Multiple inheritance is often criticized in traditional OOP because it can violate the **Single Responsibility Principle (SRP)**:
a class may end up inheriting **two unrelated responsibilities**, creating an identity that makes no conceptual sense.

For example:

* `Horse extends Vehicle`
* `Car extends Animal`

These combinations are incoherent because the resulting class would have **two incompatible natures**, and therefore **two independent reasons to change** — exactly what SRP forbids.

In Clprolf, this becomes explicit:

##### ✔ A class must have **one nature**

A nature defines the **essence** of the object — what it is.
If a class inherits from two unrelated parent natures, it no longer has a single, unified identity.

##### ✔ Classical multiple inheritance is valid only when the combination forms a **new, coherent nature**

Examples:

* `Assistant = Student + Teacher`
* `Mule = Horse + Donkey`
* `AmphibiousVehicle = Car + Boat`

In such cases, the resulting object does **not** have “two responsibilities”:

> **It has one composite nature, and therefore one composite responsibility.**

This is fully SRP-compatible:

**One class → One nature → One responsibility.**

##### ✔ When the combination is *not* a true nature

(“Horse + Car”, “Human + Oven”, etc.)
the model becomes invalid, because it gives the object *two independent reasons to change*.

Clprolf makes this explicit through its nature system and prevents such incoherent designs.

---


### I.7) SRP at the Method Level (Complete Section)

The Single Responsibility Principle (SRP) is traditionally defined at the **class level**:
a class should have **one single reason to change**, which corresponds to its **conceptual nature** or **domain role**.

However, SRP also has a **valid expression at the method level**, provided we understand clearly what it means — and what it does *not* mean.

This section clarifies method-level SRP, resolves the ambiguities found in traditional OOP, and explains why Clprolf guarantees both class-level and method-level SRP naturally and structurally.

---

#### I.7.a) What SRP *really* means for methods

A method expresses a **single intention**, a **specific operation** within the domain of its class.
Therefore:

 ✔ A method must not perform more than its functional purpose.

 ✔ A business method must not contain technical code.

 ✔ A technical method must not contain business logic.

If a method crosses domain boundaries, it introduces a **second conceptual reason to change**, which is a violation of SRP — not at the class level, but at the *method* level.

This is the *true* SRP for methods:
**keep the method within the domain of the class’s nature.**

---

#### I.7.b) Algorithmic steps are not multiple responsibilities

Many developers interpret several steps inside a method as “multiple responsibilities”.
In reality, most of the time, this is simply **algorithmic decomposition**.

Example:

```text
drink():
    takeGlass()
    pourWater()
    swallow()
```

These are not three responsibilities.
They are **three steps of one single algorithm**: *drinking*.

Whether these steps are written inline or split into sub-methods does **not** change the responsibility of the method.

* A long method is not a violation of SRP by itself.
* Several sub-steps do not imply several responsibilities.
* The presence or absence of sub-methods is an algorithmic choice.

The confusion arises from mixing *readability* concerns with *responsibility* concerns.

---

#### I.7.c) When SRP *does* apply at the method level

There is a specific — and important — case where developers are correct to say that a method violates SRP:

##### ✔ When the internal sub-steps may evolve independently.

If several parts of a method can change for **different reasons**, then the method now contains **multiple reasons to change**, and therefore violates SRP at the method level.

In this case, extracting the sub-steps into dedicated methods is **the correct application of SRP**, because the evolution of each part must be isolated.

This has nothing to do with the number of instructions.
It has everything to do with **independent evolution paths**.

---

#### I.7.d) Why this is confusing in traditional OOP

Languages like Java, C#, or PHP do not define the **nature** or **role** of classes.
Therefore:

* Business logic and technical logic can accidentally mix.
* A long method may hide cross-domain operations.
* Developers fear “doing too much” without clear criteria.
* Some believe every sub-step is a responsibility.
* Others over-fragment methods without architectural benefit.

The result is decades of confusion between:

• algorithmic decomposition

and

• true responsibility boundaries

SRP becomes subjective because the language does not give structural guidance.

---

#### I.7.e) How Clprolf solves this structurally

Clprolf resolves this ambiguity by defining the **nature** of each class:

* **agent** → business logic
* **worker_agent** → technical/infrastructure logic
* **model** → data and state
* **abstraction** → general structures and reusable rules

This strict separation provides a *structural guarantee*:

✔ A business method cannot contain technical code.

✔ A technical method cannot introduce business rules.

✔ Sub-steps of an algorithm remain inside the same domain.

✔ Method-level SRP is respected naturally.

✔ Class-level SRP is protected at the same time.

Because the class has a single nature,
a method cannot accidentally acquire a second domain.

Thus:

* Stable algorithmic steps may remain inline.
* Evolving algorithmic steps should be extracted.
* Domain boundaries prevent conceptual drift.
* SRP becomes clear, objective, and structural.

Clprolf encourages clean algorithms *without imposing rigid micro-rules*.
It supports good engineering while eliminating the confusion between algorithmic complexity and architectural responsibility.

---

#### I.7.f) Summary

* A method has a single responsibility when it stays within the class’s domain.
* Algorithmic steps do not create new responsibilities.
* SRP applies to methods **only** when sub-parts evolve independently.
* Mixing business and technical code is the real violation.
* Traditional OOP struggles because it lacks class natures.
* Clprolf solves this by defining class natures and enforcing domain purity.
* Therefore, SRP is guaranteed both at the class level and the method level.

---

#### I.7.g) Conclusion

Clprolf provides the first model where method-level SRP and class-level SRP coexist without contradiction.
By defining clear natures for classes and separating business, technical, data, and structural roles, Clprolf eliminates the typical ambiguities of traditional OOP and allows developers to reason cleanly about responsibilities and evolution.

---

### I.8) Clprolf Language and Framework — GitHub Repository

A dedicated **GitHub repository** has been created for Clprolf.
The project is **open source** and distributed under the **MIT license**.

### I.9) Clprolf — A Designer of Design

Clprolf was not created to *enforce* design principles, but to make good design emerge by itself.
It works the same way **Bison** builds parsers without requiring you to think about grammar theory — Clprolf helps you design without realizing you are doing so.

Traditional principles such as the **Single Responsibility Principle (SRP)** or the **SOLID** guidelines describe *what* a good design should look like, but not *how* to achieve it.
They are abstract goals — useful, but mostly negative in nature: they tell you what **not** to do, without showing how to design meaningfully.

Clprolf brings the *how* directly into the language.
By simply choosing a role — `agent`, `worker_agent`, `model`, or `information` — you already make a design decision.
Each role carries a unique **nature**, and that nature defines what the class truly *is*.

In Clprolf, a *responsibility* finally becomes something tangible: it’s a **nature**.
A class has one nature — therefore, one responsibility.
There’s no need to debate what “responsibility” means; the language gives it a concrete identity.

But Clprolf goes further than just recommending a single responsibility.
It **guides you toward a design that makes sense** — a design that is *coherent, memorable, and controllable*.
Instead of producing abstract compliance, Clprolf produces *meaningful architecture*.

Whereas classical principles restrict you by saying what must not be done,
Clprolf expands your freedom by making structure *visible* and *intuitive*.
It is not a dictatorial language enforcing rules; it simply makes incoherent design structurally impossible.

That’s why the **SRP becomes a consequence, not a rule**.
A well-formed Clprolf program naturally respects it, because the act of choosing a nature already fixes the class’s scope and purpose.

Clprolf, therefore, is **a designer of design** — a language that doesn’t apply methodology,
but **turns clear thought into structure**.
It’s not about following design rules — it’s about designing so clearly that the rules follow you.

---

### I.10) ⚙️ A Controlled and Coherent System

With **Clprolf**, you obtain a system that remains fully **masterable**.
The mechanics of the objects are intuitive,
and there is a natural separation between **business logic** and **technical code**.

Semantic rules allow the compiler to verify
that the architecture stays **coherent and logical** over time.
They prevent the drift into uncontrolled systems —
those where relationships between objects, or the objects themselves,
become too complex to reason about.

Clprolf acts as a safeguard against the illusion of total freedom —
the belief that “anything is possible”
is often what produces systems that are **unmaintainable and chaotic**.

Clprolf does not remove creativity.
It simply ensures that freedom remains **structured**,
and that every decision stays connected to meaning.

---

### I.11) A Methodology for Effective Object-Oriented Programming

Most existing object-oriented languages are **neutral**:
they provide mechanisms such as classes, objects, and inheritance, but they do not indicate *how* objects should be designed or coded.
As a result, programmers rely on external guidelines, principles, or patterns.

Clprolf is different. It is not only a language, but also a **methodology** — designed to make object-oriented programming as effective as possible.
It embeds a set of practical guidelines directly into its structure.

---

#### Core Guidelines

* **Give meaning to classes**
  Every class should have a clear and unique responsibility.

* **Use inheritance rigorously**
  Inheritance must remain coherent and should never be driven by technical convenience.

* **Separate layers**
  Clearly distinguish simulation or business logic from technical layers such as DAOs, persistence, or infrastructure code.

* **Interfaces for versions**
  Interfaces are primarily intended to provide alternative implementations (*versions*).
  Capacity interfaces are the exception: they express shared functionality across versions.

* **Interface inheritance**
  The inheritance of interfaces should mirror the hierarchy of their corresponding classes, ensuring consistency.

* **Favor composition over inheritance**
  When possible, prefer composition to deep hierarchies, improving flexibility and maintainability.

---

#### Alignment with Established Principles

This methodology is fully compatible with:

* **SOLID principles**,
* and the main **design patterns**.

It reflects both practical experience in object-oriented programming and the synthesis of widely accepted principles, offering a rigorous yet intuitive approach to building robust systems.

However, if you already follow your own methodology, or if you master programming well with existing principles and patterns, you may not need Clprolf.

---

#### Embedded Methodology

Applying methodology becomes far easier when it is **built into the language**.
Principles like SOLID or design patterns are valuable, but hard to constantly keep in mind while coding.

* General rules such as the **Single Responsibility Principle** often remain too vague and open to interpretation.
* Clprolf removes this ambiguity by embedding clear definitions of **responsibility** directly into the language.

### I.12) A New Perspective, Still 100% OOP

Clprolf changes the way you approach design:
you build **agents**, **worker agents**, and other specialized components, rather than starting from generic objects.
The same applies to interfaces — they are defined as **versions**, **capacities**, or **agent-specific variants**.

Yet under the hood, everything remains **pure object-oriented programming**:
agents are still objects, and all interfaces are standard OOP interfaces.

Clprolf is first and foremost a language for **classes and interfaces**, with a strong emphasis on **algorithmic coding** — particularly in the areas of **concurrency** and **parallelism**.
Its features for interface inheritance and its semantic checks on class and interface declensions make it a **full-fledged language in its own right**.

---

### I.13) ☕ Java-Compatible Language

Clprolf is a **Java-compatible language**.
It redefines some Java keywords such as `class`, `interface`, `extends`, and `implements`,
and introduces new ones like `with_compat`, `nature`, and `underst`.

All Java libraries can be used directly in Clprolf.
You can also write Java code inside Clprolf source files,
except for the few replaced keywords.

Clprolf classes replace Java classes,
so all standard Java modifiers can still be used with them —
for example:

```java
public worker_agent Launcher { }
```

The same applies to interfaces.

Clprolf follows the **Open/Closed Principle**,
not by modifying Java,
but by adding **clear notions of role and structure**
on top of existing object-oriented concepts.

> The current Clprolf compiler uses **Java 8 as its host language**.
> Java serves as a stable and portable support,
> while Clprolf brings its own semantic layer and conceptual clarity on top of it.

---
## II) The language

### II.1) The Language Itself

The **Clprolf language** can be seen as a **Java clone with specific changes and additions**.

---

### II.2) LEARNING CURVE

For an experienced Java programmer, becoming proficient in Clprolf may take several weeks on average. The language remains close to Java, and its concepts are relatively easy to grasp for developers already accustomed to abstraction and design. Moreover, the limited number of new keywords helps ease the learning process.

This makes the transition smoother than learning a completely new paradigm.

---

#### Classes

* The `class` keyword disappears.
* Classes are introduced in a prototype-like style.
* Every class must declare its role as either an **agent** or a **worker\_agent** (or one of their synonyms).
* A class may also declare an optional **gender**, which refines the role (sub-role).

---

#### Methods

Clprolf provides **method modifiers** to add additional semantic controls on functions, extending beyond standard Java capabilities.

---

#### Inheritance

* The `extends` keyword is replaced by **`nature`**, which requires the programmer to explicitly declare the **nature** of the parent.
* This ensures **role consistency** across the inheritance hierarchy.
* **Features for inheritance** allow interfaces to follow the same structure as their corresponding classes, maintaining coherence between contracts and implementations.

---

#### Interfaces

* Interfaces are never used directly.
* They must always be preceded by **`with_compat`** when referenced in variables, arguments, or attributes.
* Interfaces serve **only as contracts**, and must be created as either:

  * a **capacity interface**, or
  * a **version interface**.
* With the features for inheritance, interface hierarchies can mirror their class counterparts, ensuring consistency while still enforcing the contractual nature of interfaces.

---

#### Summary

These changes differentiate Clprolf from Java:

* explicit roles (agents, worker agents), refined by optional **genders**,
* semantic modifiers for methods,
* enforced coherence in class inheritance,
* features for inheritance that align interfaces with class hierarchies,
* and interfaces limited to contracts, always accessed via `with_compat`.

Together, these features provide a clearer, more structured, and role-driven approach to programming.


### II.3) 🧬 A Living View of Systems

The early idea behind object-oriented programming came from **biological cells** —
small autonomous entities that communicate through messages.
Over time, this *living vision* faded, replaced by mechanical notions of classes and inheritance.

In **Clprolf**, the idea is reborn in a clearer form.
Each `agent` or `worker_agent` behaves like a **cell**, with its own nature and purpose.
Their relations and communications are **explicitly designed** by the programmer,
so that interaction becomes part of the model itself, not a side-effect of code.

Together, these cells form a **coherent organism** —
a system where roles, flows, and responsibilities maintain balance and meaning.
Clprolf does not imitate biology; it **shares its logic**:
clarity through Autonomy, life through interaction.

---

### II.4) Classes Grouped in Layers — Clprolf and the Three-Tier Architecture

In Clprolf, classes are naturally organized into **layers** that align with the principles of the three-tier architecture.

---

#### The Agent Layer

The top layer is composed of:

* **`agent`** classes (synonyms: `abstraction`, `simu_real_obj`),
* **`model`** classes.

This is where we find the **business logic** of the application, but not exclusively.
Every agent, representing a real-world abstraction, is considered business-level code.

---

#### The Technical Layer

The second layer is composed of **technical classes**, where the computer is seen as a **worker** abstraction.
These are the **`worker_agent`** classes (synonyms: `comp_as_worker`).

This layer typically corresponds to the **Data Access Layer (DAL)** and **Presentation Layer** in a traditional three-tier architecture.

In Clprolf, we make a clear separation:

* **Agents** represent the business or simulation logic.
* **Worker agents** handle everything else: display code, persistence, and any infrastructure logic.

Anything that is not part of an agent’s role must be placed in a worker agent.

---

#### Special Cases

Some types of software — such as parts of an **operating system** — are composed almost entirely of the technical layer.
In these cases, the worker agent layer may directly invoke elements of the agent layer.


### II.5) Declensions and Class Responsibilities

In Clprolf, we strive to capture some of the richness of natural languages.
Every object has a **declension** (also called its *role* or *class responsibility*), which defines its function within the system.
Declensions are central to the design philosophy of Clprolf.

Each declension may also have **synonyms**, which are fully equivalent. Developers may choose one synonym over another depending on their perspective or the emphasis they want to convey.

Every class in Clprolf must take on one of a small set of predefined responsibilities:

* **`worker_agent`** (also `comp_as_worker`)
* **`agent`** (also `abstraction`, `simu_real_obj`)
* **`model`**
* **`information`**
* **`indef_obj`** (indefinite object)

These five declensions represent the core object roles in Clprolf. Some of them have synonyms, which emphasize different aspects but are fully equivalent.

---

* **`agent`**
  Main role for classes that simulate real-world entities.
  Example: an `Animal` with methods like `eat()` or `run()`.
  **Synonyms**: `abstraction`, `simu_real_obj`.
  These older names are still available, but **`agent`** is the preferred keyword.

* **`worker_agent`** (or `comp_as_worker`)
  Declares a class that delegates technical work to the computer, seen as a worker executing algorithms.
  The worker manages its own resources (memory, processor, peripherals) and runs algorithms in compiled form.

* **`model`**
  Declares a class that models real-world data without behavior.
  Example: a `Customer` class with only attributes.
  This is typically used for **entities**.

* **`information`**
  Data-only class, typically used by workers as internal structures.
  It should not be mixed with real-world simulations, except in technical edge cases.

* **`indef_obj`**
  Indefinite object, used when no specific role is desired.
  Equivalent to a traditional OO class without an explicit responsibility.

---

#### II.5.b) Agents and Workers

Clprolf is built on the observation that some objects in a system represent **agents** — abstractions of real-world entities — while others act as **workers**, carrying out technical or computational tasks.

* **Agent objects** simulate or emulate real-world entities (for example, an animal, a connection, or a thread). They hide underlying data structures while exposing meaningful behavior.
* **Worker objects** are like micro-computers, specialized in executing algorithmic tasks. They represent the computer as a worker and require compilation to run their algorithms.

This separation helps clarify design choices, maintain clean responsibilities, and make object-oriented programming easier to reason about.

---

#### II.5.c) Interrelationships Between Declensions

* **Agents and Workers**
  Every agent can also act as a worker, since computers execute agents as specialized workers.
  However, the number of explicit workers in a system should be minimized for clarity and efficiency.
  A worker may also exist *inside* a real agent — for instance, when an agent performs a technical job.
  Such nesting is possible but should remain exceptional, as it blurs the separation between the business and technical layers.

* **Models and Information**
  Every model can also be represented as information, since computers store models as data.
  Conversely, an information structure can sometimes be treated as a model,
  for instance in analytical or reflective contexts.
  Yet this reverse view should also remain rare,
  as it risks mixing data representation with system logic.

* **Perspective and Design Discipline**
  Each declension can be viewed from the perspective of its counterpart when the situation justifies it,
  but such reinterpretations must stay *exceptional* and *explicit*.
  Using an agent as a worker, or information as a model, may be valid in a narrow context —
  yet it often reveals either a **design compromise** or a **deliberate conceptual shift**.
  Clprolf allows such flexibility for experimentation and teaching,
  but its semantic rules encourage developers to keep each declension true to its own world.

---

#### II.5.d) Differences in Class Inheritance

Clprolf introduces a few small but important differences in how **class inheritance** is expressed, compared to Java.

* **`nature` instead of `extends`**
  In Clprolf, inheritance expresses that a class is *of the same nature* as another.
  For example, a car is of the same nature as a vehicle in the real world.
  The keyword `nature` is reserved for **classes only** — it has no meaning for interfaces.
  Even worker agents have a defined role for their job; they must use `nature` when inheriting from another class.

* **`contracts` instead of `implements`**
  The `contracts` keyword lists the interfaces that a class respects — they are seen as **contracts**, not as mere technical implementations.
  Clprolf deliberately avoids `with_compat` in class declarations, since `with_compat` emphasizes that an **object** (not a class) is compatible.
  The traditional Java keyword `implements` focuses on the mechanical aspect of implementation, while `contracts` reflects the **philosophy of respect and agreement**.

---

#### II.5.e) `nature` and Hierarchies with Matching Synonyms

In traditional OOP, the `extends` keyword emphasizes inheritance in a broad sense.
In **Clprolf**, the `nature` keyword takes a more restrictive approach: it allows inheritance **only when classes truly share the same nature**.
This prevents purely technical or arbitrary inheritance and encourages the use of **composition** in all other cases.

But Clprolf goes further — **synonyms** (for both classes and interfaces) must also be **compatible**, meaning identical, otherwise the compiler issues a **warning**.
For example, an `agent` may inherit from an `abstraction`, but this will generate a **compiler warning**.

Because inheritance in Clprolf expresses **a shared nature**, classes (and interfaces) that belong to the same family should ideally share the **same synonym**.
Using a different synonym may also represent a **deliberate change of perspective** — in that case, the developer can simply ignore the warning or explicitly **force the inheritance** using:

* `@Forc_inh` for **classes**, or
* `@Forc_int_inh` for **interfaces**.

> **Only inheritance between different declensions generates a compilation error.**
> Differences in synonyms trigger warnings, never errors.

The compiler does not go further in checking inheritance by nature.
It remains the developer’s responsibility to ensure that the semantic continuity between classes truly makes sense.

---

#### II.5.f) The `class_for` Modifier

In pure Clprolf, there is an optional modifier **`class_for`** that may be used instead of `class`.
It appears before the role keyword and simply expresses that this is “a class for” the agent or worker.

This construct is rarely needed in practice.  
It mainly exists as a stylistic option showing that Clprolf does not hide the notion of class.

Note: this modifier is not available in the Clprolf frameworks, since the standard `class` keyword already exists there.

Examples:

```clprolf
public class_for agent Car { ... }

```

---

#### II.5.g) Compatibility with Java

To remain compatible and powerful, Clprolf accepts all standard Java modifiers in class and interface declarations.
This includes access modifiers and other familiar constructs, which can be used in exactly the same way.

---

#### II.5.h) Synonyms and Aspects

Each declension keeps only a minimal set of synonyms, and every synonym reflects a specific aspect:
However, within each declension, **one synonym is considered the “principal synonym”**,
the one that best represents the nature of the declension.

This principal synonym defines the **default perspective** of the class.

* **Agent declension** → `agent` (agent aspect), `abstraction` (object aspect), `simu_real_obj` (simulation aspect)
* **Worker_agent declension** → `worker_agent` (agent aspect), `comp_as_worker` (simulation aspect)
* **Model declension** → `model`
* **Information declension** → `information`
* **Indef_obj declension** → `indef_obj`

This structure makes the system both easy to memorize and easy to teach.
Synonyms are no longer arbitrary alternatives but clearly justified by the perspective they express.

---

##### **The role of principal synonyms**

For `agent` and `worker_agent`, the **principal synonym** is:

* the most neutral
* the most general
* the most stable
* the one that represents the declension in the clearest way

Thus:

* `agent` is the **principal synonym** of the entire agent family (`agent`, `abstraction`, `simu_real_obj`)
* `worker_agent` is the **principal synonym** of its family (`worker_agent`, `comp_as_worker`)

These synonym families are not “extra declensions”:
they are simply **different perspectives** on the same nature.

---

> In Clprolf, each synonym expresses the **role** of a class or interface.
> For `agent` and `worker_agent`, these roles are often named through synonyms (e.g., `agent`, or `abstraction`).
> For `model` and `information`, there is no synonym — the declension name itself becomes the role name.
>
> More broadly, the **declension itself can abusively be called the “role”**,
> since it determines the entity’s nature and its position in the organism.
>
> During inheritance, synonyms are generally expected to remain **aligned**
> — classes or interfaces of the same nature should ideally share the same synonym,
> unless a deliberate perspective shift is intended by the developer.
> This prevents conceptual drift and keeps the semantic continuity of the design.
>
> This linguistic symmetry keeps the system coherent:
> whether the role is explicit (through a synonym) or implicit (through the declension name),
> every **class or interface** has a defined semantic place in its world.

---

#### II.5.i) NOTICE ON THE USE CASES OF `worker_agent`

In Clprolf, the general recommendation is to avoid overusing `worker_agent`. Real-world simulations (`agent`) are usually more intuitive and less technical.

For example, although interpretations are flexible, it is often more natural to see a `Sort` class as an `agent` rather than a `worker_agent`.

The main recommended use cases for `worker_agent` are:

* **Technical infrastructure classes** such as DAOs.
* **Handling displays and inputs** (e.g., the *View* in MVC). In fact, both the *Model* and the *View* of MVC typically fall under `worker_agent`.
* **Realization classes**: for instance, an `AnimalRealiz` `worker_agent` that contains the computational code and tools to render and manage the interactive behavior of an `Animal` `agent`.
* **Launcher classes**, such as an application entry point.
* **System-level components** (libraries, system tools, etc.), where the computer itself is clearly performing the work.

Even in system programming, however, `worker_agent` classes often collaborate with `agent` classes (e.g., for graphical interfaces, memory handling, connections, threads). The rule of thumb is simple: *it is the computer who does the job*.

---

#### II.5.j) Example: `agent` ↔ `worker_agent` relationship

```
+-----------------+          +----------------------+
|     Agent       |          |     Worker_agent     |
|  (simulation)   |          |   (realization)      |
+-----------------+          +----------------------+
|  Animal         |  <---->  |  AnimalRealiz        |
|  eat(), move()  |          |  render(), input()   |
+-----------------+          +----------------------+
```

Here, `Animal` is an `agent` that simulates the real-world entity.
`AnimalRealiz` is its `worker_agent` counterpart, responsible for computational tasks such as display and input.

---

#### II.5.k) Agent, Abstraction, and Simu_real_obj

In Clprolf, the qualifiers **`agent`**, **`abstraction`**, and **`simu_real_obj`** belong to the same declension,
but they reflect **three different roles** with clearly distinct intentions.

These synonyms are now verified strictly by the compiler,
so each term must be used with the correct meaning.

---

##### **1. `agent` — an active role, but *not* a simulation object**

`agent` represents an **active component** that performs logic connected to its own domain responsibility.

An agent:

* is not part of a simulation environment,
* is not tied to a real-world entity being simulated,
* represents a domain actor or domain component,
* contains only code related to its own responsibility.

Examples:

* `OrderProcessor`
* `AuthenticationAgent`
* `ChatAgent`
* `SensorReader`

Agents execute business logic — they do **not** model real-world objects inside a simulated world.

---

##### **2. `abstraction` — abstract domain concepts or structural abstractions**

`abstraction` designates a **conceptual object** that belongs to the domain
and is represented as a *pure abstraction* in code.

It models a concept, a structure, or a logical entity —
not an active component and not a simulated object.

An abstraction:

* represents a concept, not an actor,
* stays within its conceptual responsibility,
* is typically manipulated by worker_agents,
* belongs fully to the business/domain logic (not to simulation).

### **Examples (clean and representative):**

* `Document`
* `List` / `HashMap` (collections)
* `Rectangle`, `Circle`
* `Image`
* `Color`
* `Connection`
* `Button`
* `Socket`
* `CompilationUnit`
* `Statement`
* `Expression`

An abstraction stays 100% in its conceptual domain;
it is neither an `agent` nor a `simu_real_obj`.

---

##### **3. `simu_real_obj` — components used inside a simulation**

`simu_real_obj` identifies a component that is part of a **simulation universe**,
whether the simulated entity is:

* physical
* virtual
* conceptual
* abstract but evolving in discrete steps

A `simu_real_obj`:

* behaves like an agent,
* but exists **inside a simulated world**,
* typically represents something concrete or acting concretely *inside the simulation*,
* is subject to simulation rules such as collision checks, discrete updates, etc.

Examples:

* `Vehicle`
* `Player`
* `Projectile`
* `DroneAI`
* `SimulatedNode`
* `EconomicAgent` (in a simulation)
* `Particle`

These are **true simulation components**, not business abstractions.

---

#### II.5.l) Usage Recommendations

Clprolf does not force any term —
but with synonym verification enabled,
the correct intention is now important.

**Use `agent`** when representing:

* a domain actor,
* a module with active behavior,
* code tied to a responsibility **outside of a simulation**.

---

**Use `abstraction`** when representing:

* a pure concept,
* a system or GUI abstraction,
* a domain object with no simulation behavior,
* something consumed by worker_agents.

These are conceptual components representing ideas or real-world notions,
but **not** simulation entities.

---

**Use `simu_real_obj`** when representing:

* an entity that lives *inside a simulated environment*,
* something that evolves in simulation time,
* something that can interact, collide, or conflict inside a simulation step,
* any concrete or semi-concrete component used in simulation logic.

These components are “simulation agents,”
but rooted in a real or conceptual world being simulated.

---

#### II.5.m) The `simu_real_obj` synonym

A `simu_real_obj` represents an entity that exists inside a **simulation universe**, whether physical or abstract.
It is not limited to physical objects.
Any entity that:

* evolves over simulation steps
* interacts with an environment
* can interfere, overlap, or conflict with others
* has a location, state, or presence in a simulated world

…belongs naturally to this declension.

Typical examples:

* physical objects (Vehicle, Ball, Projectile)
* virtual characters or agents (Player, NPC)
* non-physical simulation entities (EconomicNode, SocialAgent)
* abstract simulation elements evolving in discrete steps

Every `simu_real_obj` must declare **at least one** method responsible for collision-handling or collision-declaration, via the `prevent_missing_collision` modifier.

This prevents **missed collisions**, a classical simulation pitfall where entities “cross” each other between two discrete updates.

---

#### II.5.n) NOTICE ON WORKER\_AGENT — COMPUTER AS A WORKER

The **`worker_agent`** declension is not only about separating `agent` code from pure computer tasks — it is about treating the **computer as a worker**. The “simu” prefix highlights this metaphor: as if the computer were a real-world worker. Its job is to manage peripherals, handle resources, and perform tasks that are inherently technical.

The idea is algorithmic: an algorithm is executed *for a worker*, and here the worker happens to be a computer. In principle, a human could also play the role of a worker — the distinction lies only in the nature of the task. This perspective connects to ALGOL 60’s vision of algorithms: abstracting the worker, and seeing the computer as an executor in human-like terms.

By assigning technical tasks to `worker_agent` classes, Clprolf reduces the impact of technical code. It is “just work” performed by a worker. The rule of thumb becomes simple: *who is doing the job?*

* In an `agent`, the job belongs to the simulated entity (e.g., an animal calls `eat()`).
* In a `worker_agent`, the job belongs to the computer (e.g., a launcher class running an algorithm).

Thus, `worker_agent` provides a clean simulation of the computer as a worker, just as `agent` provides simulations of real-world entities.

A `worker_agent` can use **system abstractions** (`File`, `Connection`, etc.). Only workers are allowed to use such abstractions, preserving the “third-person” perspective of simulation. Compiler checks enforce this restriction. The only exception is factories of system abstractions (e.g. a connection factory): factories instantiate objects but do not use them, so they can be modeled as `abstraction` classes.

For practical reasons, an `agent` may occasionally need to include small amounts of technical code. In such cases, the `@Forced_pract_code` annotation makes this explicit.

Finally, some design patterns reinforce this distinction: for example, the **View** and the **Model** of MVC cannot be modeled as `agent` classes in Clprolf, since they rely on system abstractions — and therefore belong under `worker_agent`.

---

#### II.5.o) System Abstractions

System abstractions such as `File` or `Connection` should generally appear **only in worker\_agent classes**.
Exceptions may be made for practical reasons or for thread-like abstractions.

This rule follows naturally from the third-person perspective:

* Only a **worker** should perform such method calls,
* not an **agent** (or `simu_real_obj`).

#### II.5.p) Flexibility with `indef_obj`

For situations where a role is not desirable or not yet determined, Clprolf provides the **`indef_obj`** (indefinite object) declension.
It behaves like a traditional OOP object and keeps the system flexible.

* Declared with **`indef_obj`** (or `@Indef_obj` in the framework).
* Used when you do not want to assign a specific role to a class.
* Inheritance checks are **not applied** to indefinite objects.

---

In summary

By integrating **declensions, genders, and advices**, Clprolf ensures clear design choices, unambiguous roles, and a coherent semantic structure for all entities — both classes and interfaces.

These three notions — **declension**, **gender**, and **advice** — form the semantic backbone of Clprolf.
They define *what* a class represents, *how* it behaves, and *for whom* it was designed.

---

### II.6) Gender Annotations

In Clprolf, **genders** are optional markers that refine the interpretation of an **agent declension**.
They do not change the role of the object — it remains an *agent* — but they express a particular **attitude or posture** of that agent within the system.

A gender gives nuance to how the agent acts or is perceived:
whether it behaves like a human expert, a technical component, or a static utility.
It adds *semantic precision* without altering the structure.

Genders make the intent of a class clearer while preserving the same declension and architectural consistency.
They are **optional**, never enforced, and serve only to enrich the meaning of design.

---

#### II.6.b) Available Genders

* **@Human_expert** – represents a simulation of a human expert in a given domain.
* **@Expert_component** – similar to `@Human_expert`, but with a more technical interpretation — the class is an “expert component” specialized in its task.
* **@Active_agent** (no synonyms)
* **@Static / @Human_expert_static / @Expert_component_static** – for classes used mainly for static behavior or shared logic.

> **Note**: Genders are available only for the **agent** declension,
> except `@Static`, which may also apply to the **worker\_agent** declension.

---

💡 *Genders refine meaning; they describe the spirit of a class, not its structure or responsibility.*

---

#### II.6.c) Examples

```java
@Human_expert   // or @Expert_component
public agent MeteoExpert { /* (...) */ }
```

---

#### II.6.d) Compatibility Between Genders

* **@Expert_component ↔ @Human_expert**
  These genders overlap strongly. A human expert can also be viewed as a component.

  ```java
  @Human_expert
  public agent NetworkTalker { /* (...) */ }
  ```

  is equivalent to:

  ```java
  @Expert_component
  public agent NetworkTalker { /* (...) */ }
  ```

---

#### II.6.e) In the Framework

In the Java framework, genders are available for **agent-like roles** through an optional `gender` attribute.
For example:

```java
@Agent(gender = Gender.EXPERT_COMPONENT)
public class Controller { /* (...) */ }
```

The available genders are:
`Gender.HUMAN_EXPERT, Gender.EXPERT_COMPONENT, Gender.STATIC, Gender.HUMAN_EXPERT_STATIC, Gender.EXPERT_COMPONENT_STATIC, Gender.ACTIVE_AGENT`.

---


### II.7) Interfaces in Clprolf

In Clprolf, interfaces are organized into three categories. Collectively, they are called **compatibility interfaces**.

* **`compat_interf_version`**:
  Used when a class provides a concrete implementation — a *version*.
  This is typically the case when offering different implementations of the same DAO (e.g., database, web services, in-memory).
  When interfaces are used for **loose coupling**, they should be declared as `compat_interf_version` to indicate that the design anticipates alternative implementations instead of binding to a specific class.
  Features for interface inheritance allow a class role to be attached to version interfaces, further simplifying loose coupling.

* **`compat_interf_capacity`**:
  Ensures a common functionality across multiple `compat_interf_version` interfaces.
  A capacity interface always targets either an **agent-like** or a **worker-like** version interface.

* **`compat_interf`**:
  A fallback case for when no role is assigned to an interface, in order to remain flexible.
  Its use is not recommended. 
	* Declared with **`compat_interf`** (or `@Compat_interf` in the framework).
	* Unlike version or capacity interfaces, they do not carry role semantics.
	* No compiler checks are performed on these interfaces.

This makes it possible to use **traditional Java interfaces** (or equivalents in other host languages), when desired.


Outside of these scenarios, interfaces are not used in Clprolf. However, the features for interface inheritance allow roles to be attached to version interfaces, making it possible to treat them with a true inheritance perspective (using `nature`, even in multiple inheritance cases).

---


#### II.7.b) Interface Declensions


Interfaces also have declensions, divided into two main types:

* **Version declension** — synonyms: `compat_interf_version`, `version_inh`
* **Capacity declension** — synonyms: `compat_interf_capacity`, `capacity_inh`

Each synonym defines the **role** of the interface,
providing different lexical forms for the same semantic concept.
This keeps the terminology consistent between class and interface hierarchies.

---

#### II.7.c) The `with_compat` Modifier

A key difference in Clprolf is that every use of an interface must be preceded by the keyword **`with_compat`** (with compatibility).

Example:

```java
void drink(with_compat Drink drinkable) { ... }
```

`with_compat` is a modifier applied in **variable declarations** (local variables, attributes, or method parameters). Its purpose is to make explicit that the reference is not tied to a particular class, but to an **interface compatibility**.

Typical usages include local variables and method arguments.

---

#### II.7.d) Notes

* There is **no `with_compat` indication for a method’s return type**. This is the exception to the rule, because the return type is not a variable declaration. In practice:

  * The method body already contains a declaration for the return value.
  * The receiving variable also declares compatibility when the method is called.

* `with_compat` is valid for **all Clprolf interface types**: version, capacity, or generic compatibility.
  This allows capacity interfaces to be used directly in variables, even though a class cannot directly inherit from them.

#### II.7.e) Which interfaces may be used with `with_compat`

The `with_compat` modifier applies **only to Clprolf interfaces**.
It cannot be used with classes or with raw Java interfaces.

`with_compat` is valid in the following cases:

##### ✅ 1) Pure Clprolf interfaces

(version, capacity, or neutral)

##### ✅ 2) Java interfaces imported using `import java_interface` **with a declension**

(e.g. `version_inh agent`, `capacity_inh`, etc.)

Such imports make the Java interface **enter the Clprolf interface system**
and therefore they are treated as **true Clprolf interfaces**.
They are fully eligible for `with_compat`.

`with_compat` is **not allowed** when:

##### ⛔ the imported Java interface has **no declension**

In that case, it remains a raw Java interface
and therefore cannot be referenced using `with_compat`.

---

##### Final clarification

> `with_compat` never accepts raw Java interfaces.
> Only Clprolf interfaces — whether declared in Clprolf or imported with a declension — may be used with it.

---

#### II.7.f) Capacity Interfaces and Advice

Capacity interfaces are only meant to extend **compat\_interf\_version** interfaces. They express functionality that is common across different families of version interfaces, and thus across the classes that implement them.
Think of **versions** as *alternatives*, and **capacities** as *common traits shared across those alternatives*.

A capacity interface can never be implemented directly by a class. This restriction avoids confusion with version interfaces — otherwise, something like a `Connection` might mistakenly be treated as a capacity. By keeping capacities at the **interface level** (interfaces of interfaces), Clprolf prevents unnecessary multiple inheritance on classes and keeps the design clear.

---

#### II.7.g) The Role of Advice

Capacity interfaces can have a **gender called an Advice**, which specifies their **target class role** —
that is, the nature of the classes or versions that are meant to use or implement the capacity.

* `@Agent_like_advice` advice
* `@Worker_like_advice` advice

This **advice** works like a sub-role.
It indicates whether the capacity applies to **agent-like** roles or to **worker-like** roles.
When a version interface implements a capacity, it must declare a **class role**,
and the compiler will check that this role is consistent with the advice (the target class role of the capacity).

* **Agent-like capacities** represent *common business requirements* shared by agents of different families.

* **Worker-like capacities** represent *technical functions* that different workers must provide.

⚠️ If no advice is explicitly given, the **default is agent-like**.

---

##### In pure Clprolf

The advice is given by an annotation above the interface:

* `@Agent_like_advice`
* `@Worker_like_advice`

```java
// This interface can be extended only by a compat_interf_version with an agent-like target class role.

@Agent_like_advice
public compat_interf_capacity Eatable {
 void eat(int quantity);
}

// Must declare a class role, because it has a capacity
public version_inh agent Animal extends Eatable { ... }

// Must declare a class role, because it has a capacity
public version_inh agent Person extends Eatable { ... }

public agent AnimalClass contracts Animal { ... }
public agent PersonClass contracts Person { ... }

public worker_agent Launcher {
 public static void test(with_compat Eatable eatableAgent) {
	 System.out.println("The agent will eat");
	 eatableAgent.eat();
 }

 public static void main(String args[]) {
	 AnimalClass theMonkey = new AnimalClass("monkey", "4");
	 PersonClass john = new PersonClass("John", 25);

	 Launcher.test(theMonkey);
	 Launcher.test(john);
 }
}
```

---

##### In the Java Framework

In the Clprolf Framework, advice is expressed as a **sub-role** of the `@Compat_interf_capacity` annotation:

* `@Compat_interf_capacity(Advice.FOR_AGENT_LIKE)`
* `@Compat_interf_capacity(Advice.FOR_WORKER_LIKE)`

```java
@Compat_interf_capacity(Advice.FOR_AGENT_LIKE)
public compat_interf_capacity Eatable {
 void eat(int quantity);
}

@Agent
public interface Animal extends Eatable { ... }

@Agent
public interface Person extends Eatable { ... }

@Agent
public class AnimalClass implements @Contracts Animal { ... }

@Agent
public class PersonClass implements @Contracts Person { ... }

@Worker_agent
public interface Launcher {
 public static void test(@With_compat Eatable eatableAgent) {
	 System.out.println("The agent will eat");
	 eatableAgent.eat();
 }
 public static void main(String args[]) { ... }
}
```

---

The **advice** therefore acts as a **target class role** for capacities,
providing a semantic contract similar to the one used for version interfaces.
It guarantees clarity, prevents ambiguous capacities,
and reinforces the structural discipline of Clprolf’s two worlds — *agents* and *workers*.

---

#### II.7.h) Special Note: Enforcing a Capacity Across Declensions

Capacities in Clprolf are always **normal capacities**, with a clear advice:
they are either **agent-like** or **worker-like**, never both.

However, an **interface from the other declension** may still contract such a capacity when required.
In this case:

* The capacity keeps its original advice (e.g., worker-like for `Runnable`).
* The **interface of the other declension** can extend it by using **`@Forc_int_inh`**.
* This makes explicit that the interface (and the classes behind it) are temporarily taking on a role outside their primary declension.

**Example:** `Runnable` is a **worker capacity**.
An `agent` interface can still extend it, but must declare it with `@Forc_int_inh`, showing that classes implementing this interface are temporarily seen as workers for execution.

---

#### II.7.i) Neutral Capacity Interfaces

A `compat_interf_capacity` can be declared **without any advice annotation**
(`@Agent_like_advice`, `@Worker_like_advice`, etc.).
Such interfaces are called **neutral capacity interfaces**.

Neutral capacities are designed for **neutral `compat_interf_version`**,
that is, version interfaces **without any class role**
(`agent`, `worker_agent`, `model`, `information`, `indef_obj`).

They define *role-independent capabilities* that may apply
to both conceptual and technical worlds,
but they do not carry any advice or semantic constraint by default.

> **Important:**
> When a neutral capacity is used by a role-declared version,
> it is interpreted as **role-bound** (agent-like by default),
> according to [ARCH_BB8].
> However, when used within a neutral version,
> it remains **strictly neutral** and context-independent.

**Summary:**

* ⚪ Neutral capacities = no advice, no world binding.
* 🟢 When used within a role → interpreted as role-bound (agent-like by default).
* ⚙️ Intended use → with neutral `compat_interf_version`.

---

### II.8) Features for Interface Inheritance

Clprolf provides **features for developers who prefer to think in terms of inheritance for interfaces**, treating them as if they were *pure abstract classes*.
These features become **mandatory whenever a version interface inherits from another version interface**.

---

#### II.8.b) Interfaces as an Implementation-Less World

When `with_compat` is used, it is as if the API of the class were replaced by the implemented interface.
The object now belongs to the hierarchy of the interface, rather than the class — entering an **implementation-less world** where only interfaces define structure.

* Within this hierarchy, both **capacity** and **version** inheritance are possible.
* A class role annotation (e.g., `@Agent`) may be added above an interface declaration to enforce coherence.
* The class implementing such an interface must declare **the exact same class role** — not just an equivalent synonym.

  * Example: if the interface is marked `@Agent`, the implementation must also be `@Agent` (not `@Simu_real_obj`).

For this vision:

* `@Compat_interf_version` = `@Version_inh`
* `@Compat_interf_capacity` = `@Capacity_inh`
  (no class role may be written on a `@Capacity_inh`).

---

#### II.8.c) Inheritance Perspective

Interfaces and concrete classes share the **same inheritance hierarchy** (or equivalent).
This is why it is correct to say that a class *inherits* from an interface:

Example:

* `HorseImpl extends AnimalImpl` and `implements Horse`
* `Horse extends Animal`
* `AnimalImpl implements Animal`

Everything aligns, and we can say that `HorseImpl` inherits from both the class `AnimalImpl` and the interface `Animal`.

In Java, this is often called **simulated multiple inheritance**:

* A class that directly implements several interfaces does not inherit implementation, state, or even method signatures.
* It is only at the point of use (through polymorphism) that an interface can be treated as a parent type.

---

#### II.8.d) Role Checking and Nature in Interfaces

* Class roles on interfaces are checked in the same way as for classes.
* `@Forced_inh` (not `@Forced_int_inh`) must be used to enforce role coherence.
* On **`version_inh` and `capacity_inh` interfaces**, `nature` is **mandatory** on `extends` clauses — even in case of multiple inheritance.
* On **`compat_interf_version` and `compat_interf_capacity` interfaces**, `nature` is **not allowed**: compatibility interfaces never carry a nature.

This means:

* Agent-like interfaces must extend other agent-like interfaces.
* Worker-agent-like interfaces must extend other worker-agent-like interfaces.
* Capacity interfaces can always be inherited, since they do not carry roles.

The **`nature`** keyword (or `@Nature` in the framework) indicates an **inheritance perspective** for the interface, rather than a simple extension.
It is **reserved for inheritance features** and is **never applied to compatibility interfaces**.

---

#### II.8.e) Perspective and Use

The features for interface inheritance allow developers to treat **interfaces like classes**, except without direct access to implementations.

* It establishes an **inheritance perspective**, not just an “extends” perspective.
* Both perspectives remain interchangeable.
* This is especially useful for **loose coupling**, where interfaces are preferred over concrete classes.

---

#### II.8.f) Features for Interface Inheritance: Simple Inheritance with a Class Role

The following example shows a **basic and recommended use** of interface inheritance in Clprolf.
It demonstrates how a simple interface hierarchy works when interfaces are tied to a **class role** (here, `agent`).

```java
public version_inh agent Dog nature Animal {
    void bark(int duration);
}

public version_inh agent Animal {
    public void eat(String foodName);
}

public agent DogImpl nature AnimalImpl contracts Dog {
    public void bark(int duration){
        System.out.println("The dog is barking for " + duration + "s");
    }
}

public agent AnimalImpl contracts Animal {
    public void eat(String foodName){
        System.out.println("The animal is eating " + foodName);
    }
}

package org.clprolf.patterns.optfeaturesinterf.simpleintinh;

import org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl.DogImpl;
import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Dog;

import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;

/**
 * Output:
 * The free impl dog: 
 * The dog is barking for 100s
 * The animal is eating meat
 * The dog impl: 
 * The dog is barking for 100s
 * The animal is eating meat
 */
public worker_agent Launcher {
    public static void main(String[] args) {
        // We can either use a dog with or without direct implementation
        with_compat Dog myFreeImplDog = new DogImpl();
        DogImpl myImplDog = new DogImpl();
        
        System.out.println("The free impl dog: ");
        myFreeImplDog.bark(100);
        myFreeImplDog.eat("meat");
        
        System.out.println("The dog impl: ");
        myImplDog.bark(100);
        myImplDog.eat("meat");
    }
}
```

---

##### Analysis

This is the most **common and recommended case** of interface inheritance:

* No multiple inheritance is involved.
* Interfaces (`Dog` and `Animal`) have a **class role** (`agent`).
* The pattern ensures **loose coupling** through polymorphism.

The implementation can then be used in two ways:

1. through the **interface contract** (`with_compat Dog`),
2. or directly through the **implementation class** (`DogImpl`).

---

##### Conclusion

This **Dog/Animal** example demonstrates how simple interface inheritance works in Clprolf:

* Interfaces provide **loose coupling** and polymorphism.
* Implementations remain **fully usable directly**, if preferred.
* The features for interface inheritance integrate seamlessly, without introducing complexity.

This is the **recommended way** to use interface inheritance in Clprolf, in contrast to **multiple inheritance patterns**, which are possible but discouraged.


#### **II.8.g) Features for Interface Inheritance: A Design Pattern for Multiple Inheritance**

Clprolf normally enforces **one nature per object**, which is the foundation of clarity and SRP coherence.

However, the language also provides the structural tools needed to model **multiple inheritance through interfaces**, for the rare cases where an entity genuinely carries **several fixed natures**.
This chapter presents a **design pattern** showing how such hierarchies can be constructed cleanly.

---

#### ⚠️ **Important — Use With Great Care**

Multiple inheritance is **possible**, but it should remain **exceptional**.

Although Clprolf supports it technically, multiple natures must only be used when they **truly correspond to distinct conceptual identities** that coexist **for the same object**.

In practice:

* most entities only require **one nature at a time**,
* many scenarios that look like “multiple inheritance” are actually **rotating natures** (handled through *ubiquity*),
* and it is very easy to confuse “two roles of the same person” with “two natures”.

Therefore:

👉 **Use multiple inheritance only when the entity genuinely embodies several permanent natures.**
👉 Such cases exist, but they are **rare** and must be justified by the domain, not by convenience.

This pattern is provided mainly to illustrate how Clprolf can support these uncommon designs, not as a recommendation for everyday architecture.

---

##### Example: Multiple Inheritance via Interfaces

```java
@Agent
@Version_inh
public interface Assistant extends @Nature Teacher, Student { 
    
}

@Agent
@Version_inh
public interface Person {
    int getAge();
    void setAge(int age);

    String getName();
    void setName(String name);

    void walk();
}

@Agent
@Version_inh
public interface Student extends @Nature Person {
    void learn();
}

@Agent
@Version_inh
public interface Teacher extends @Nature Person {
    void teach();
}
```

---

##### Implementations

The implementation combines `TeacherClass`, `StudentClass`, and `PersonClass` through delegation.
This approach also enables **code reuse**, though the focus here is on demonstrating multiple inheritance.

```java
@Agent // Must match the role of the interface
public class AssistantClass implements @Contracts Assistant {
    protected TeacherClass teacher;
    protected StudentClass student;
    protected PersonClass person;

    public AssistantClass(String name, int age){
        this.teacher = new TeacherClass(name, age);
        this.student = new StudentClass(teacher); // teacher contains the person part
        this.person = (PersonClass) this.teacher;
    }

    // Delegate Teacher role
    public void teach(){ this.teacher.teach(); }

    // Delegate Student role
    public void learn(){ this.student.learn(); }

    // Delegate Person role
    public int getAge() { return this.person.getAge(); }
    public void setAge(int age) { this.person.setAge(age); }
    public String getName() { return this.person.getName(); }
    public void setName(String name) { this.person.setName(name); }
    public void walk() { this.person.walk(); }
}
```

---

##### Shared Code in the Person Class

```java
@Agent
public class PersonClass implements @Contracts Person {
    protected class PersonProperties {
        private String name;
        private int age;

        public PersonProperties(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // Getters and setters...
    }

    private PersonProperties sharedProperties;

    public void setSharedProperties(PersonProperties sharedProperties) {
        this.sharedProperties = sharedProperties;
    }
    public PersonProperties getSharedProperties() {
        return this.sharedProperties;
    }

    public PersonClass(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
    }

    public String getName() { return sharedProperties.getName(); }
    public int getAge() { return sharedProperties.getAge(); }
    public void setName(String name) { sharedProperties.setName(name); }
    public void setAge(int age) { sharedProperties.setAge(age); }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}
```

---

##### Student and Teacher Implementations

```java
@Agent
public class StudentClass extends @Nature PersonClass implements @Contracts Student {
    public StudentClass(String name, int age) { super(name, age); }

    public StudentClass(PersonClass personTwin) {
        super(null, 0); 
        this.setSharedProperties(personTwin.getSharedProperties());
    }

    public void learn() {
        System.out.println(this.getName() + " is learning.");
    }
}

@Agent
public class TeacherClass extends @Nature PersonClass implements @Contracts Teacher {
    public TeacherClass(String name, int age) { super(name, age); }

    public TeacherClass(PersonClass personTwin) {
        super(null, 0);
        this.setSharedProperties(personTwin.getSharedProperties());
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching.");
    }
}
```

---

#### II.8.h) Multiple Natures Through Ubiquity (The Ubiquity Pattern)

##### *A practical and safe alternative to classical multiple inheritance*

Multiple inheritance traditionally creates conceptual chaos: a class inherits **two identities at once**, often violating the Single Responsibility Principle (SRP) and mixing incompatible natures.

Clprolf offers a radically clearer solution:

> **Ubiquity** — instead of making *one* object with *two* natures,
> we allow *two* objects with *one nature each*,
> **sharing the same underlying state**.

This preserves:

* **single nature per object**
* **pure SRP**
* **safe polymorphism**
* **thread safety**
* **simple conceptual integrity**

And yet, the two objects behave *as if* they were “multiple inheritance of the same person”.

---

##### **1) Concept: One Real Person, Multiple Natures**

Sometimes a single real entity can have multiple natures:

* A person can be **Student** and **Teacher** (but not at the exact same moment).
* A person can be **Singer** and **Actor**.
* A mule is **Horse + Donkey**.
* An employee may occasionally act as **Manager**.

But in real life :

✔ We do not *simultaneously* activate both natures.

✔ We switch roles depending on context.

✔ Each role has its own logic and behavior.

Clprolf models this perfectly:

* One **shared underlying state** (`PersonProperties`)
* One **monitor** shared by all natures
* Several **objects**, each with *one* nature
* No conceptual conflict
* Full SRP compatibility

This is **ubiquity**.

It feels like multiple inheritance, but without any of the conceptual or technical dangers.

---

##### 2) Why Ubiquity Solves Multiple Inheritance

Traditional multiple inheritance does this:

> “Give me *one* class with *two* incompatible natures.”

Clprolf’s ubiquity does this instead:

> “Give me *two* objects, each with *one* nature,
> but sharing the same state and synchronized.”

This is superior because:

* There is **no identity crisis**
* Each object has **one responsibility**
* Behaviors remain cleanly separated
* Polymorphism on `Person` works naturally
* Synchronization keeps the whole entity coherent
* It is intuitive and mirrors the real world

And most importantly:

**SRP stays intact.**

---

##### 3) When to Use Ubiquity

Use ubiquity when:

✔ A real-world entity may have **several roles or natures**
✔ But **not all active at the same time**
✔ And you do not want to create a giant composite class

Examples:

* A person is Student in one context, Teacher in another
* A user has a “Reader” nature and an “Editor” nature
* A game character can be “Trader” or “Warrior” depending on state

Ubiquity is **dynamic**, **flexible**, and **conceptually clean**.

---

##### 4) Thread-Safety Requirements

Because several objects share the same underlying state, thread safety is essential.

The rule is simple:

✔ All shared state must be synchronized using **one common monitor**.

The first nature creates it.
All other natures reuse it automatically through the shared properties.

---

##### 5) Implementation Pattern (Synchronized Version)



**PersonClass (base class with shared properties)**

```java
public agent PersonClass {

// NOTE: PersonProperties is implemented as an inner class.
// This is intentional: the internal state of the person belongs
// conceptually to PersonClass, and the inner structure naturally
// models the shared core used across multiple natures.

    protected abstraction PersonProperties {
        private String name;
        private int age;

        /* One monitor for all natures (Student, Teacher, etc.) */
        private final turn_monitor Object naturesMonitor;

        public PersonProperties(String name, int age, Object naturesMonitor) {
            this.naturesMonitor = naturesMonitor;
            setAge(age);
            setName(name);
        }

        public one_at_a_time void setAge(int age) {
            synchronized(naturesMonitor) {
                this.age = age;
            }
        }

        public one_at_a_time int getAge() {
            synchronized(naturesMonitor) {
                return age;
            }
        }

        // Same synchronized logic for name…
    }

    private PersonProperties sharedProperties;

    /* No need to synchronize this setter/getter:
       It is used only during construction (before any concurrency). */
    public void setSharedProperties(PersonProperties sharedProperties) {
        // intentionally unsynchronized
        // because this happens before threads exist
        this.sharedProperties = sharedProperties;
    }

    public PersonProperties getSharedProperties() {
        return this.sharedProperties;
    }

    public PersonClass(String name, int age, Object monitor) {
        this.sharedProperties = new PersonProperties(name, age, monitor);
    }

    public String getName() { return sharedProperties.getName(); }
    public int getAge() { return sharedProperties.getAge(); }
    public void setName(String name) { sharedProperties.setName(name); }
    public void setAge(int age) { sharedProperties.setAge(age); }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}
```

---

**StudentClass (one nature)**

```java
public agent StudentClass nature PersonClass contracts Student {

    // Constructor for the first nature created
    public StudentClass(String name, int age) {
        super(name, age, new Object()); // monitor shared by all natures
    }

    // Ubiquity constructor
    public StudentClass(PersonClass twin) {
        super(null, 0, null);
        this.setSharedProperties(twin.getSharedProperties());
    }

    public void learn() {
        System.out.println(getName() + " is learning.");
    }
}
```

---

**TeacherClass (another nature)**

```java
public agent TeacherClass nature PersonClass contracts Teacher {

    // Constructor for the first nature created
    public TeacherClass(String name, int age) {
        super(name, age, new Object()); // monitor shared by all natures
    }

    // Ubiquity constructor
    public TeacherClass(PersonClass twin) {
        super(null, 0, null);
        this.setSharedProperties(twin.getSharedProperties());
    }

    public void teach() {
        System.out.println(getName() + " is teaching.");
    }
}
```

---

##### 6) Choosing the Monitor (Why the First Nature Creates It)

Clprolf never forces which nature must be created first.

So the simplest rule applies:

✔ The first nature creates the monitor.

✔ All other natures reuse it via sharedProperties.

This ensures:

* one and only one monitor
* guaranteed memory visibility
* consistent state across all roles
* easy mental model for developers

The developer cannot misuse this pattern unless they intentionally break the ubiquity idea—which means they didn’t want ubiquity in the first place.

---

##### 7) Classical Multiple Inheritance (Static)

*Rare, but valid when the composite nature is real*

Sometimes, natures are known *statically* and form a **composite**:

* Assistant = Student + Teacher
* Mule = Horse + Donkey
* AmphibiousVehicle = Car + Boat

In such cases:

✔ The composite nature is genuine

✔ The class has **one composite responsibility**

✔ This is SRP-compatible

✔ Use `features for interface inheritance`

Even here, behind the scenes, ubiquity usually plays a conceptual role.

---

##### 8) Conclusion

Ubiquity is one of Clprolf’s most elegant design patterns:

* It solves multiple inheritance
* It respects SRP
* It mirrors the real world
* It is thread-safe
* It is simple to implement
* It avoids identity conflicts
* It keeps natures pure and separate

No other language provides a model this clean.

---

#### II.8.i) Using Class Roles on Interfaces for Collaborative Projects


For collaborative projects — such as public APIs or large teams — it can be useful to assign **class roles to interfaces**, in order to make their purpose explicit and to enforce coherence.

In this context, the class role applied to an interface represents its **target class role** —
the role expected for any class that will implement this interface.
This makes the intent explicit for all contributors and allows the compiler to verify that implementations remain semantically consistent.

To do this, you must use the **features for interface inheritance**:

* Declare the interface with **`version_inh`** (or `compat_interf_version`),
* Then add the desired **target class role** (e.g. `agent`, `abstraction`, etc.).

The compiler will then check the coherence between the interface’s target role and the role of each implementing class.

---

##### Example in Clprolf

```java
package clprolf.wrappers.java.sql;

// Using a role-bound compat_interf_version (feature-equivalent form)
// Assigning a target class role for clarity in collaborative projects
@Forc_int_inh
public compat_interf_version abstraction ClpConnection extends Connection {

}
```

---

##### Rule for Implementations

Implementation classes must declare **exactly the same role** as the one defined by the interface’s target class role.
In this example, any class implementing `ClpConnection` must also be annotated as **`abstraction`** —
not just an equivalent or related role.

---

#### II.8.j) Role-Bound `compat_interf_version` — Between Compatibility and Features


Clprolf allows a `compat_interf_version` to declare a **target class role**
(such as `agent`, `abstraction`, `worker_agent`, etc.).
This case remains relatively rare,
but it is especially useful in **collaborative** or **interoperability contexts**,
such as public libraries or Java wrappers.

When a target class role is attached to a `compat_interf_version`,
the interface remains a **compatibility interface** by nature —
it does **not** become a *feature interface* syntactically,
but it behaves as a **role-bound version interface**,
and is therefore **semantically equivalent** to a feature.

This allows developers to express intent explicitly,
without switching to the full feature syntax.

---

##### Example in Clprolf

```java
package clprolf.wrappers.java.sql;

// Using a role-bound compat_interf_version (feature-equivalent form)
// Assigning a target class role for clarity in collaborative projects
@Forc_int_inh
public compat_interf_version abstraction ClpConnection extends Connection {
}
```

Here:

* `compat_interf_version` → preserves the compatibility form, ideal for wrappers or API integration.
* The role `abstraction` → acts as the **target class role**, defining the intended role for implementing classes.
* `@Forc_int_inh` → required since it extends another version (Java’s `Connection`).

This form is therefore **halfway between** the purely structural `version_inh`
and the compatibility-oriented `compat_interf_version`,
offering a flexible way to handle APIs that mix both semantics.

 **Summary:**

* ✅ A `compat_interf_version` can declare a **target class role**.
* ⚙️ It remains a compatibility interface, but behaves as feature-equivalent.
* 🧩 Useful for wrappers, public APIs, and cross-language compatibility.
* ⚠️ Inheritance from another version requires `@Forc_int_inh`.

---

---

#### II.8.k) Synonym Requalification Between Features and Compatibility Interfaces

Clprolf provides two equivalent syntactic forms for defining interfaces:
the *feature-oriented* form (with the `_inh` suffix)
and the *compatibility-oriented* form (`compat_interf_...`).

This duality allows developers to reuse existing interfaces
while expressing them through a different perspective:
**implementation structure** (`_inh`)
or **compatibility semantics** (`compat_interf_...`).

This requalification is purely syntactic —
but **the interface being defined always takes precedence**.
It is the **keyword used in the current definition** that determines the nature of the interface.

---

##### **Rule of Precedence**

The defining keyword (`version_inh`, `compat_interf_version`, etc.)
always determines the semantic category of the interface.
The parent’s form has no impact on that nature.

---

##### **Examples**

```java
// The defined interface is a version interface (feature-oriented),
// even though it inherits from a compatibility form.
public version_inh MyFeatureVersion extends BaseInterface { }
```

Here, `MyFeatureVersion` remains a **feature-oriented interface**,
because the current definition (`version_inh`) defines its identity.

---

```java
// The defined interface is compatibility-oriented,
// but it inherits from a version_inh interface.
// This normally breaks the rule that versions cannot be chained,
// so a semantic forcing is required.
@Forc_int_inh
public compat_interf_version MyCompatVersion extends LegacyVersion { }
```

In this case, `MyCompatVersion` is **compatibility-oriented**,
but since `compat_interf_version` interfaces are not allowed to inherit from versions
(whether they are `version_inh` or other `compat_interf_version`),
the use of `@Forc_int_inh` explicitly authorizes this exception.

---

##### **Summary**

* ✅ `version_inh` ↔ `compat_interf_version` — interchangeable forms.
* ⚙️ The **current definition** decides the interface’s nature.
* ⚠️ A `compat_interf_version` cannot inherit any version
  (`version_inh` or `compat_interf_version`) **without `@Forc_int_inh`**.
* 🚫 No semantic requalification occurs — only explicit exception handling.

---


### II.9) ✳️ Language-Integrated Annotations — A New Step Toward Purity

Clprolf now introduces a refined and mature approach to **language annotations** —
a model that eliminates mechanical redundancy while keeping full expressive clarity.
These annotations are no longer external metadata: they are **words of the language itself.**

---

#### II.9.b) 🌿 Simple by Nature

Clprolf annotations are **marker annotations only** —
lightweight, structural tags understood directly by the compiler.
They are written naturally, without imports or fully qualified names:

```clprolf
@Expert_component
public agent Engine { }
```

No import statements are needed, and none are ever generated.
The compiler knows exactly what they mean — because they belong to the language.

> The annotations no longer live in files.
> They live in Clprolf’s own vocabulary. 🌿

---

#### II.9.c) ⚙️ Clean Generation

During Java code generation, all Clprolf annotations are **removed**.
They are used only to guide semantic understanding,
then disappear, leaving clean, standard Java output.

```java
public class Engine { }
```

The meaning remains preserved inside the compilation process,
not in the mechanical result.

> What guided the design does not need to appear in the code. 💫

---

#### II.9.d) 🧭 Freedom with Awareness

Clprolf allows developers to use any type name —
even one that matches a reserved annotation name —
as long as the Clprolf version of that annotation is not used.

Example:

```clprolf
import org.me.Static   // ✅ allowed
// ... no @Static Clprolf used in this file
```

But if a Clprolf annotation `@Static` is used in the same file,
then any external import of `Static` becomes **illegal**.

```
[ARCH-Gx] Illegal import of reserved annotation name: Static
(use @Clp_Static if you need your own definition)
```

💡 This rule keeps the language free and consistent:
you can use any name you want — unless it already has a role in the Clprolf world.

---

#### II.9.e) 🌱 Synonyms for Harmony

For each built-in annotation, a synonym exists with the prefix `Clp_`,
for example `@Clp_Static`, `@Clp_Expert_component`, etc.
These synonyms serve as **escape routes** for developers
who need to use a similar name without clashing with Clprolf’s built-ins.

> The `Clp_` prefix is a bridge —
> a respectful handshake between your code and the language itself. 🌿

---

#### II.9.f) 💎 A Living Language

Clprolf no longer relies on annotation source files,
nor on Java imports to understand its own vocabulary.
Everything is built into the language itself —
compact, consistent, and self-sufficient.

The compiler checks what matters:
only the imports written by the developer.
If one of them reuses a reserved Clprolf name *and* that annotation is active in the file,
Clprolf raises an error. Otherwise, it stays silent.

> The language knows when to speak —
> and when to let you breathe. 🌿

---

#### II.9.g) 🪶 **Philosophy**

This evolution reflects Clprolf’s deeper truth:
to be clear without being heavy,
to be structured without being rigid,
and to protect its meaning while staying open to the world.

No imports.
No source files.
No redundant mechanics.
Only understanding — pure and precise.

> Clprolf does not imitate Java.
> It finishes what Java began. 💫

---


### II.10) ☕ **Interoperability with Java**

Clprolf is fully interoperable with Java.
It relies on **Java 8 syntax and semantics** for all code embedded in `.clp` files,
while allowing external Java sources to target **any version** of the JVM.

All Java types are imported explicitly through **typed import statements**:

```java
import java_class fully.qualified.ClassName;
import java_interface fully.qualified.InterfaceName;
```

Optionally, these imports may include a **semantic declaration**
and even **Clprolf annotations**
to define how the Java element behaves within Clprolf:

```java
import java_interface version_inh abstraction java.util.List;
@Expert_component
import java_class agent java.util.Timer;
```

This mechanism makes any Java library appear as a **Clprolf-native library**,
verified semantically and integrated into the same conceptual framework.
Each imported type becomes a **true Clprolf entity**,
subject to the same architectural rules as native components.

> 💡 *Clprolf does not wrap Java — it understands it.*

---

### II.11) A Language Focused on Algorithms Too — Algorithmic Enhancements

Clprolf is not only about object-oriented design — it is also **algorithm-centric**.
Its roles and structures are designed to make writing implementations easier and more intuitive.

To this end, Clprolf adds several **algorithmic enhancements**:

* keywords such as `underst`,
* concurrency and parallelism features (`@One_at_a_time`, `@Turn_monitor`, `@For_every_thread`),
* and an emphasis on intuitive object and interface design.

The goal is to make **algorithm writing** as natural as possible, so programmers can focus on the **logic of the algorithm**, rather than the technical details of synchronization.

---

#### II.11.b) Example: The Hypermarket Queue

Imagine a hypermarket with a single main queue that dispatches customers to several checkouts.
Each customer must read the screen to know which checkout is free — but only **one at a time**.

In Clprolf, this scenario can be expressed directly with annotations:

* `@One_at_a_time` models the fact that only one customer can access the screen at once.
* `@Turn_monitor` ensures that all customers waiting in the same queue share the same lock.
* `@For_every_thread` allows each customer’s life cycle to run independently, like real people moving in parallel.

---

##### Java Framework Example

```java
@Agent
public class Customer implements @Contracts Runnable {

    private String name;
    @For_every_thread
    private volatile boolean blnContinue;

    @Turn_monitor
    private Object firstQueueMonitor;

    @Turn_monitor
    private Object secondQueueMonitor;

    public Customer(String name, Object first, Object second){
        this.name = name;
        this.firstQueueMonitor = first;
        this.secondQueueMonitor = second;
    }

    public void run() {
        this.blnContinue = true;
        while (blnContinue) {
            this.waitToFirstMainQueue();
            this.waitToSecondMainQueue();
        }
    }

    @One_at_a_time
    public void waitToFirstMainQueue(){
        synchronized(firstQueueMonitor){
            System.out.println(name + " is waiting in the first queue...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println(name + " got a checkout in the first queue!");
        }
    }

    @One_at_a_time
    public void waitToSecondMainQueue(){
        synchronized(secondQueueMonitor){
            System.out.println(name + " is waiting in the second queue...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println(name + " got a checkout in the second queue!");
        }
    }
}
```

---

#### II.11.c) Conclusion

With these enhancements, Clprolf makes concurrency and parallelism **visible and understandable** directly in the code.
It becomes immediately clear that:

* there are two queues,
* each queue is a shared resource,
* and customers (agents) block each other only within the same queue.

This demonstrates Clprolf’s philosophy: **bringing clarity and human-like readability to algorithmic programming**.

---


### II.12) THE `long_action` MODIFIER

Alongside `underst`, Clprolf introduces another method modifier: `long_action`.
This modifier marks methods — especially in `agent` classes — that represent actions unfolding over time. A typical example would be the movement of a video game enemy, implemented as a loop.

All such methods are declared with `long_action`. They are executed step by step within a dedicated thread for the object. This approach is particularly useful in game development, though not limited to it.

The pattern works as follows:

* A long action has an initial method, e.g. `walk()`.
* It is associated with a continuation method, e.g. `continueWalk()`.
* All continuation methods are coordinated by a single `endLongActions()` method, which the developer can call to advance all ongoing actions in sync.

For example, in a video game, `endLongActions()` could be invoked inside the `paint()` method of the graphical container, ensuring smooth updates.

This design preserves an **action-oriented perspective**, while internally emulating threads. A boolean flag (annotated with `@Long_action` in the Java framework) is typically required to manage state.

In the framework, a single `@Long_action` annotation covers all use cases, keeping the approach simple and consistent.

---

### ⭐ II.13) THE `prevent_missing_collision` MODIFIER

The `prevent_missing_collision` modifier is **a Clprolf method modifier**,
and it is used **exclusively inside `simu_real_obj` classes**.

Its purpose is to mark **the method that performs collision detection**,
so the compiler knows that collisions are intentionally handled **inside the simulation step**.

This avoids a classic simulation issue:

> **If collisions are checked too late, objects may cross each other between two updates.
> The collision never appears and is considered “missed.”**

This problem does **not** come from thread synchronization.
It comes from time-stepped simulation:

* update position
* then detect collision

If two updates happen before the detection step,
the collision is lost forever.

`prevent_missing_collision` forces the developer to declare explicitly:

> **“This method handles collision detection for this simu_real_obj.”**

If *no* method is marked, the compiler warns that this object may “ghost through” others.

---

#### ⭐ **1) Typical Example: `setPosition()` with collision detection**

In most engines, collision detection happens during movement:

```clprolf
public simu_real_obj Player {

    private int x;
    private int y;

    public prevent_missing_collision void setPosition(int wantedX, int wantedY) {

        // Check collision BEFORE moving
        if (wantedX != enemy.getPos().x) {
            this.x = wantedX;
            this.y = wantedY;
        } else {
            // Collision detected → no movement
            handleCollision(enemy);
        }
    }
}
```

Here:

* The detection is done **in the same method** that updates the position.
* That method is the natural place where a “missed collision” could happen if forgotten.

So **that** method must carry the modifier.

---

#### ⭐ **2) Meaning of the modifier**

`prevent_missing_collision` does **not** synchronize threads.
It does **not** lock anything.
It does **not** force parallel correctness.

It means:

* “This method is responsible for collision detection.”
* “No collision will be accidentally missed in this simulation.”
* “If the object moves, collision is checked before applying movement.”

It is a **semantic guarantee**, not a runtime mechanism.

---

#### ⭐ **3) If no such method is found**

If a `simu_real_obj` has **no method** declared with `prevent_missing_collision`,
the compiler warns:

> *Warning: This simu_real_obj has no collision-detection entry point.
> Collisions might be missed if this object moves.*

This protects developers from forgetting the most common simulation rule:

➡ all movements must check collisions **before** applying them.

---

#### ⭐ **4) Abstract / non-physical simulations**

Even in abstract models (economic, social, symbolic),
entities may “interfere” or “overlap” in logical ways.

If the simulation **does not** involve collision checks,
the developer simply marks the method that updates state:

```clprolf
@prevent_missing_collision
public void updateState(...) { ... }
```

This means:

> “I confirm that no collision is expected in this simulation universe.”

It’s an **intention marker**.

---

#### ⭐ **5) Summary (perfectly aligned with your vision)**

* `prevent_missing_collision` is a **method modifier**, not a class modifier.
* It is used **only** in `simu_real_obj`.
* It marks **the method that performs collision detection**.
* It prevents “missed collisions” due to discrete-time updates.
* It does **not** manage threads or parallelism.
* If no method is marked, the compiler warns.
* Works for physical and abstract simulations.

---

### II.14) PARALLELISM AID

To simplify the management of parallelism, Clprolf introduces four modifiers (with equivalent annotations in the Java framework):

* **`one_at_a_time`** (method modifier): ensures that only one thread at a time can execute the method or block of code, similar to `synchronized`.
* **`turn_monitor`** (attribute modifier): applied to a lock object to make its role in synchronization explicit.
* **`for_every_thread`** (attribute modifier): applied to volatile attributes, highlighting their importance in parallel execution.
* **`dependent_activity`** (method modifier): marks methods that call `wait()` on a monitor object, identifying them as dependent on other threads.

#### II.14.b) Dependent activity in detail

A method annotated as `dependent_activity` explicitly depends on the activity of another thread. This is similar to the producer–consumer pattern, but Clprolf emphasizes an **algorithmic perspective** rather than a purely technical one.

Instead of focusing on `wait()` and `notify()` as low-level mechanisms, Clprolf lets developers express the idea directly: *“this action depends on another activity.”* This makes algorithms easier to reason about, implement, and test.

For example, in a hypermarket simulation:

* Customers line up in a queue (consumers).
* Cashiers become available at random intervals (producers).
  It is easier to describe this situation as **dependent activities** (the cashier’s work depends on the customer queue, and the customer’s progress depends on the cashier) rather than to think only in terms of technical synchronization primitives.

This abstraction reduces complexity, helps prevent errors, and keeps the focus on the intended algorithmic behavior.

##### Example (Java Framework)

```java
@Abstraction
public class OneMessageMailBox {

    private String message;

    @For_every_thread // Highlights its use in parallelism
    private volatile boolean full;

    @Turn_monitor
    private final Object mailBoxMonitor;

    public OneMessageMailBox() {
        this.mailBoxMonitor = new Object();
    }

    @Dependent_activity
    @One_at_a_time
    public String read() {
        synchronized (mailBoxMonitor) {
            while (!this.full) {
                try {
                    mailBoxMonitor.wait(); // Wait until a message is available
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.full = false;  // Mailbox is now empty
            mailBoxMonitor.notifyAll(); // Signal waiting writers
            return this.message;
        }
    }

    @Dependent_activity
    @One_at_a_time
    public void write(String message) {
        synchronized (mailBoxMonitor) {
            while (this.full) {
                try {
                    mailBoxMonitor.wait(); // Wait until the mailbox is empty
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.message = message;
            this.full = true; // Mailbox is now full
            mailBoxMonitor.notifyAll(); // Signal waiting readers
        }
    }
}
```

### II.14.c) A NOTE ON CONCURRENCY AND PARALLELISM IN CLPROLF

In Clprolf, the recommended approach is to start with **pure concurrency in a single thread** before introducing parallelism. Many simulation actions take time to run and are not just instantaneous state changes.

* To handle such cases, the `long_action` modifier (`@Long_action` in the Java framework) allows actions to be executed step by step.
* To avoid missing interactions or collisions during these actions, the `prevent_missing_collision` modifier (`@Prevent_missing_collision`) ensures correctness.

This model often suffices for real-time simulations. If threads are later introduced, they must sometimes be synchronized. However, synchronized parts of code behave almost as if there were still a single thread, so the added complexity must be carefully evaluated.

When synchronization is necessary:

* The synchronized parts are often those marked with `prevent_missing_collision`.
* The `one_at_a_time` modifier (`@One_at_a_time`) applies to parallelism, enforcing that only one thread executes the code at a time.
* The `turn_monitor` modifier groups these synchronized sections around a common monitor object.

These notions are compatible with existing Java mechanisms like `synchronized` and `lock`, but Clprolf emphasizes a higher-level, less technical perspective that highlights algorithmic intent rather than implementation detail.

Finally, problems that are purely parallel — especially those involving **dependent activities** — can be implemented directly with multiple threads.

### II.14.d) Integration of Advanced Synchronization Features

Clprolf already defines a set of semantic rules governing basic synchronization:
`one_at_a_time` on methods, `turn_monitor` declarations, and the guarantees they provide in single- and multi-thread scenarios.
These rules remain fully valid and continue to apply in their simple form.

However, Clprolf introduces a structured extension called **Advanced Synchronization Features**, which refine synchronization semantics through optional bracket arguments on both methods and monitors:

```
one_at_a_time[X, Y]
turn_monitor[X, Y]
```

These bracket arguments give explicit declarative control over caller cardinality (`X ∈ {o,f,m}`) and method-group cardinality (`Y ∈ {o,m}`).
They do not replace the existing basic rules; instead, they *extend* them by enabling the compiler to build and verify synchronization groups, detect inconsistencies, and better model complex concurrency patterns such as producer–consumer relations.

The advanced mode is optional.
A class may use either the simple form (no brackets) or the advanced form (brackets everywhere), but not a mixture of both.
When the advanced mode is used, additional semantic checks apply, ensuring structural coherence between methods and their associated turn monitors.

This preserves backward compatibility while enabling a far more expressive, analyzable, and teachable model of parallel execution.

---

#### **One-at-a-Time With Optional Bracket Arguments**

The modifier `one_at_a_time` declares that a method executes within an exclusive critical space.
Bracket arguments are optional refinements that make this intention explicit:

```
one_at_a_time[X, Y]
```

* **`X` – Caller Cardinality:**
  how many callers may enter this critical space (`o` = one, `f` = few, `m` = many).

* **`Y` – Method Cardinality:**
  how many methods share the same critical space (`o` = one, `m` = many).

Bracket arguments are optional.
A class may use the refined form everywhere, or omit the brackets entirely. Mixing both within the same class is not allowed.

**Turn monitors can also declare bracket arguments using the exact same syntax:**

```
turn_monitor[X, Y] groupMon;
```

This ensures a *structural match* between a method’s declared cardinality and the monitor that governs its critical space.
When brackets are used, the compiler can verify that methods and monitors belong to the same concurrency group and that their cardinalities are coherent.
Without brackets, the classic simple mode applies, with no advanced checks.

This dual system preserves the simplicity of the original form while enabling precise, verifiable concurrency semantics for users who need them.

---

### 🟦 II.14.e) Example — A Cashier With a Turn Monitor (Rewritten Example)

Below is a fully rewritten example demonstrating the semantics of advanced synchronization features in the most intuitive possible way:

*Several customers attempt to pass through the same cashier.*
*The cashier exposes a `checkout()` method that belongs to a bracketed concurrency group.*
*All customers share the same cashier object — therefore, they naturally share the same turn monitor.*

This captures the conceptual truth behind the model:

> **The customer does not synchronize himself.
> He simply asks the cashier to serve him.
> The cashier’s turn monitor decides who may pass.**

---

#### **Full Example**

```clprolf
public agent Cashier {

    // Turn monitor for the checkout line.
    // All customers using this cashier share this monitor.
    private turn_monitor[m,o] Object checkoutMonitor;

    public one_at_a_time[m,o] void checkout(Customer c) {
        synchronized(checkoutMonitor) {
            System.out.println(c.getName() + " is now being served...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println(c.getName() + " has finished checkout!");
        }
    }
}

@Forc_int_inh
public agent Customer contracts Runnable {

    private String name;
    private Cashier cashier;
    private for_every_thread volatile boolean running;

    public Customer(String name, Cashier cashier) {
        this.name = name;
        this.cashier = cashier;
    }

    public String getName() { return name; }

    public void run() {
        running = true;
        while (running) {
            cashier.checkout(this); // Customer simply requests service
        }
    }
}
```

---

#### 🟦 **Explanation**

1. **All customers use the same Cashier instance.**
   Therefore, they all use **the same `checkoutMonitor`**.

2. The method `checkout()` is declared:

```
one_at_a_time[m,o]
```

This means:

* **many callers** (`m`) can request service, but
* **only one method** (`o`) represents this critical space.

3. Because the cashier defines:

```
turn_monitor[m,o] checkoutMonitor;
```

the compiler sees a **perfect structural match**:

* method cardinality → matches
* monitor cardinality → matches
* group cardinality → matches

4. All customers are serialized naturally:
   **the cashier decides who may pass**, exactly like a real queue.

---

#### 🟦 **Key Insight (to keep just beneath the example)**

> **Whether the waiting logic sits inside the Customer or inside the Cashier does not change the synchronization semantics.
> The defining element is the shared turn monitor.
> All customers calling the same bracketed method on the same object naturally share the same concurrency group.**

---

### II.15) Ignoring Inheritance Checks

Inheritance checks can be bypassed using **`@Forc_inh`** (for classes) and **`@Forc_int_inh`** (for interfaces).
These annotations apply both to **errors** (when declensions differ) and to **warnings** (when synonyms differ).

They can be written either at the **class/interface level**, or — more precisely — **directly before the inherited type**.
This second form is recommended, as it makes the developer’s intent explicit and localized to the exact inheritance being forced.

Example in pure Clprolf:

```java
/* All inherited classes are accepted in inheritance, even if inconsistent */
@Forc_inh
public agent Car nature CarRealization {
   (...)
}
```

or, more precisely:

```java
public agent Car nature @Forc_inh CarRealization {
   (...)
}
```

with

```java
/* CarRealization handles displays and input for the Car simulation */
public worker_agent CarRealization {
   (...)
}
```

In both cases, the compiler accepts the inheritance despite the semantic mismatch.
The forçage applies whether the issue comes from **different declensions** (normally an error) or from **different synonyms** (normally a warning).
The explicit presence of `@Forc_inh` or `@Forc_int_inh` always signals a **deliberate decision** by the developer.

> 🧭 The forcing rules in Clprolf are perfectly balanced:
> **errors** (declension differences) and **warnings** (synonym differences) never overlap.
> Each case has its own dedicated annotation, ensuring that every inheritance — whether structural or conceptual — can be made explicit, controlled, and intentional.

---

### II.16) THE `underst` MODIFIER

The `underst` modifier (short for *understanding*) is used **exclusively inside `agent` classes**.

It marks methods where the developer provides the computer with
**the logic it needs to “understand” something that is obvious for humans,
but not obvious for machines.**

This distinction exists because:

> **Humans and computers do not share the same cognitive abilities.**
> What is trivial for us (recognizing a pattern, interpreting a shape,
> identifying a condition, applying intuitive logic)
> must be explicitly coded for the machine.

Typical examples include:

* image or pattern recognition
* semantic or symbolic understanding
* rules that the human brain infers naturally
* sorting or decision-making that relies on intuition for humans
* any logic where “the human sees the result instantly”,
  but the machine needs explicit steps

`underst` highlights the fact that the method
**is teaching the computer how to understand something**
that humans find intuitive.

All other methods in an `agent` class are expected to contain
**intuitive business code**, which aligns with the purpose of the declension.

---

#### ⭐ **Compilation Reporting**

For every `agent` class, the compiler generates an *underst report*:

* If an `agent` contains one or more `underst` methods →
  It is listed as requiring **machine understanding support**.

* If an `agent` contains **no `underst` methods** →
  The compiler confirms that the class contains only intuitive business logic.

* If `underst` is used in any other declension (worker_agent, abstraction, simu_real_obj, etc.) →

> **Warning:** `underst` is only valid inside `agent` classes.

This report helps developers quickly see which components
**translate human intuition into machine logic**.

---

#### ⭐ **Example**

```java
public agent ImageAnalyzer {

    // Humans instantly know what the object is; the machine needs help
    public underst boolean recognizeObject(Image img) {
        // Recognition algorithm (machine understanding)
        return true;
    }

    // Humans instantly know how to sort visually; machine needs explicit steps
    public underst void optimizedSort(List<Integer> values) {
        // Algorithm teaching the machine the logic
    }

    // Pure intuitive business logic → no 'underst'
    public void showResult(String result) {
        System.out.println(result);
    }
}
```

---

### II.17) 🧩 **TO COMPILE**

The **Clprolf compiler** is the most direct way to use the language.
However, a **Clprolf framework** also exists for Java developers.

During compilation, **Clprolf keywords and annotations** are translated into standard Java syntax as follows:

---

* **Roles → `class`**
  `agent`, `worker_agent`, `comp_as_worker`,
  `abstraction`, `simu_real_obj`,
  `model`, `information`, `indef_obj`

---

* **Interface roles → `interface`**
  `compat_interf_version`, `compat_interf_capacity`,
  `compat_interf`, `version_inh`, `capacity_inh`

---

* **Other keywords → removed**
  `class_for`, `underst`, `with_compat`, `long_action`,
  `prevent_missing_collision`, `turn_monitor`, `one_at_a_time`,
  `for_every_thread`, `dependent_activity`,
  `java_class`, `java_interface`

  > These keywords are used only for semantic analysis inside Clprolf and have no equivalent in generated Java code.

---

* **Inheritance and contracts**
  `nature` → `extends`
  `contracts` → `implements`

---

✅ **Summary**

* Clprolf-specific keywords are **removed or translated** into valid Java equivalents.
* The resulting code is **100% valid Java**, identical in structure but enriched with semantic clarity.

---

#### II.17.b) Compiler as an Architecture Guardian

Clprolf’s compiler does not merely translate keywords into Java code; its semantic rules act like **continuous architecture tests**.
Each build validates that classes, interfaces, and capacities still respect their declared roles and relationships.
This turns compilation into a first level of **non-regression testing for architecture**: even after major refactoring, developers receive immediate feedback if a class crosses a forbidden boundary, if a capacity is misused, or if an agent/worker separation is broken.

Although not all semantic mismatches can be detected automatically, these built-in checks guarantee the **essential structural integrity** of the system.
They ensure that a project remains faithful to its design principles over time, reducing the risk of silent architectural drift that often occurs in large codebases.
In this sense, Clprolf brings to compilation what automated tests bring to runtime: **a safety net for meaning, not just for syntax.**

---

#### II.17.c) RULES FOR INHERITANCE CHECKING OF CLASSES AND INTERFACES

Clprolf performs several **semantic inheritance checks** to ensure coherence between classes and interfaces.
These checks are based on **declensions**, **synonyms**, and **genders**, and are applied automatically by the compiler.

The detailed definitions of these rules are provided in the **Architectural Annexes**.
This section only summarizes their general principles.

* Inheritance between **different declensions** (for example, `agent` and `worker_agent`) produces a **compiler error**.
* Inheritance between **identical declensions** but with **different synonyms** (for example, `agent` and `abstraction`) produces a **compiler warning**.
* Genders and static checks (such as `@Static` vs non-static) are also verified automatically.
* All these controls can be **explicitly forced** using `@Forc_inh` (for classes) or `@Forc_int_inh` (for interfaces).

These checks guarantee that every inheritance relation keeps its **semantic meaning** intact while preserving full **freedom of interpretation** for the developer.
Forcing annotations exist precisely to indicate **deliberate choices** that go beyond standard consistency.

> ⚙️ For the complete and formal list of semantic inheritance rules, see the **Architectural Annexes** (sections [ARCH_CB] and [ARCH_BC]).

---

### II.17.d) ⚙️ THE CLPROLF COMPILER

A compiler for **Clprolf** is implemented in Java, using **ANTLR4** and based on the official **Java 8 grammar** (from the `antlr4-grammars` repository).

* It parses Clprolf source files (`.clp`) as well as embedded Java 8 code.

* Parsing stops immediately upon encountering a syntax error, whether in Clprolf syntax or embedded Java segments.

* After parsing, the compiler performs **initial semantic checks** based on the Clprolf rule families (ARCH, BA, BB, EB, G).
  For now, only **a subset** of these checks is active, but the **entire structure** of the semantic engine is already in place, ready to be expanded.
  These first checks verify fundamental elements such as:
  – declension coherence,
  – some inheritance constraints,
  – basic interface structure and compatibility usage,
  – early role/synonym consistency.

* When both parsing and the current semantic checks succeed, the compiler generates equivalent and valid Java code.
  Developers can then compile these generated sources with **`javac`**, producing standard Java bytecode executables.

> **In short:** even if semantic checking is still partial,
> the **full architecture** of the Clprolf semantic analyzer is already implemented —
> the foundations are solid, and the rule engine is ready to be expanded.

---

#### II.17.e) 🧩 Compiler Implementation

The **Clprolf compiler** itself is **written in Clprolf**, using the **Clprolf framework** as its structural backbone.
This makes Clprolf not only a **language** and a **methodology**, but also a **self-hosted system** — its own compiler is built with the same principles it enforces.

This self-reference demonstrates Clprolf’s maturity and internal coherence:

* The compiler uses **Clprolf annotations and declensions** to define its own components.
* The **framework layer** (implemented over Java) ensures interoperability with the host language while keeping the compiler’s logic entirely Clprolf-driven.
* This architecture guarantees that Clprolf is **self-descriptive**, **self-validating**, and **consistent** with its own methodology.

> In short: **Clprolf compiles Clprolf** — powered by its own framework.

---

#### II.17.f) Current State and Ongoing Development

The **Clprolf compiler**, written in **Clprolf itself** using the **Clprolf framework**, has now entered its **semantic phase**.
It already **implements several semantic rules (4 as of now)**, which are gradually being added and refined.

The current compiler version still focuses primarily on **syntax analysis** and **code generation**,
but **semantic checking** has become an integral part of its ongoing evolution.

* The **Clprolf Semantic Checker** is active and growing.
  It performs rule-based analysis on **declensions**, **contracts**, **genders**, and **inheritance coherence**,
  operating directly on the **symbol table** generated during parsing.

* In parallel, a dedicated **Framework Checker** is also being developed.
  It reuses the same **semantic engine**, but with a specialized **symbol table visitor**.
  This enables it to validate framework-level structures (wrappers, capacities, version interfaces, and practical components)
  without duplicating compiler logic.

This modular architecture allows both the **compiler** and the **framework checker** to share a **unified rule engine** —
ensuring semantic consistency across the entire Clprolf ecosystem.

> 💡 *In short, Clprolf is no longer just a parser — it is becoming a **self-hosted semantic environment**,
> where its compiler, framework, and rule engine all evolve together within the same language.*

---

#### II.17.g) Example from the Clprolf Compiler

Below is a short excerpt from the **Clprolf compiler**, written with the **Clprolf framework**.
It shows how semantic verification is organized — using clear roles, coherent structure, and object responsibility, all defined in Clprolf style.

```java

package org.clprolf.compiler.semantic.agents.impl;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.clprolf.framework.java.Agent;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticSymbol;
import org.clprolf.compiler.semantic.enums.CompatInterfaceDeclSynonym;
import org.clprolf.compiler.semantic.enums.Declension;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticInterfaceSymbol;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticClassSymbol;

@Agent
public class SemanticCheckerImpl {

    private final @With_compat Map<String, SemanticSymbol> symbols;
    private final @With_compat List<String> errors = new ArrayList<>();

    public SemanticCheckerImpl(@With_compat Map<String, @With_compat SemanticSymbol> symbols) {
        this.symbols = symbols;
    }

    public List<String> getErrors() {
        return errors;
    }

    // -------------------------------------------------------------
    // 🧠 Entry point
    // -------------------------------------------------------------
    public void verify() {
        for (SemanticSymbol s : symbols.values()) {
            if (s instanceof SemanticClassSymbol) {
                verifyClassRules((SemanticClassSymbol) s);
            } else if (s instanceof SemanticInterfaceSymbol) {
                verifyInterfaceRules((SemanticInterfaceSymbol) s);
            }
        }
    }
}
```

> *Excerpt from the current Clprolf compiler — showing the beginning of the semantic rule engine, implemented directly through the Clprolf framework.*

---

#### II.17.h) CLPROLF CODE EDITORS

Clprolf source files can be edited with common tools:

* **Eclipse** (open as Java files)
* **Notepad++** (set language to Java)
* Any other editor with Java syntax highlighting.

The **Clprolf framework for Java** integrates fully with the Java ecosystem:

* It supports Java IDEs and tools, including autocompletion for annotations.
* In Eclipse and IntelliJ IDEA, hovering over classes and interfaces displays tooltips showing Clprolf annotations, making them visible at a glance.

---

## III) The framework
### III.1) Helping Java (and C# or PHP) Development

The **Clprolf framework** offers an elegant way to make writing Java code easier and more enjoyable.
Equivalent versions are also available for **C#** and **PHP**.

Clprolf provides solutions that combine **ease of use** with **high code quality**.
It is not only useful for teaching, but also for developers who simply want more **facilitating tools** in their daily work.

This includes:

* **scientists**, who may need straightforward programming solutions,
* **computer scientists** and **professional developers**, who can benefit from clearer, more intuitive approaches.


### III.2) Clprolf Framework for Java, C# and PHP Developers

The **Clprolf framework** is a package of **Java annotations** (or **C# / PHP attributes**) that provides developers with a toolbox for applying Clprolf concepts directly within their host language.

It allows you to **think in Clprolf** while programming in **Java**, **C#**, or **PHP 8**.

---

### III.3) A Different Way of Programming

With the framework, development in the target language remains the same at its core, but annotations change how we structure systems:

* Instead of generic objects working together,
* We model **agents** and **worker agents** collaborating with each other.

Thus, we continue to use the host language (e.g., Java or C#), but with Clprolf roles and semantics layered on top.

In practice, you can still keep conventional class names (e.g., `InvoiceService`) while adding annotations to define their Clprolf role.

For example, the Java framework could be described as **“Java with agents.”**

---

### III.4) Nature of the Framework

* The C# framework remains **C#**, not Clprolf itself, but enriched with a structural frame for working.
* It provides annotations rather than code libraries, yet it still acts as a **framework** by supplying the structural concepts required by Clprolf.
* These annotations are designed to be paired with an **executable tool** that performs checks for coherence — similar to a compiler.

  * This tool performs syntactic and semantic analysis of the annotated source code (Java, C#, PHP) without generating code.
  * It validates the architecture, roles, inheritance, and structural consistency according to the Clprolf semantics.

---

### III.5) Available Framework Annotations (Java)

The package **`org.clprolf.framework.java`** provides the following **annotations**, **modifiers**, and **enums** used when writing Clprolf code manually in Java.

---

#### **1. Class roles**

Used to express the semantic role of a class:

`@Agent`,
`@Abstraction`,
`@Simu_real_obj`,
`@Worker_agent`,
`@Comp_as_worker`,
`@Model`,
`@Information`.

*(Removed: `@Indef_obj` — not part of the framework.)*

---

#### **2. Interface roles**

Annotations used to express the structural role of an interface:

`@Compat_interf_capacity`,
`@Compat_interf_version`.

*(Removed: `@Compat_interf` — obsolete.)*

---

#### **3. Modifiers and inheritance constraints**

**These annotations specify semantic modifiers and structural inheritance constraints.
`@Nature` is primarily used for inheritance between normal classes
(Agent, Worker_agent, Model, Information, etc.).
`@Version_inh` and `@Capacity_inh` are used only when organizing inheritance
between versions or capacities.**

`@With_compat`,
`@Nature`,
`@Contracts`,
`@Forced_inh`,
`@Forced_int_inh`,
`@Forced_pract_code`,
`@Version_inh`,
`@Capacity_inh`.

**Example :**

```java
@Capacity_inh(Advice.FOR_AGENT_LIKE)
```

> *`@Version_inh` and `@Capacity_inh` are architectural features:
> they are required only when a capacity/version hierarchy is used.*

---

##### 🔹 **Important Note About `@With_compat` in the Java Framework**

In pure Clprolf, `with_compat` may only be applied to **Clprolf interfaces**, or to Java interfaces imported *with a declension*, which makes them equivalent to Clprolf interfaces.

However, in the **Java Framework**, there is **no semantic `import java_interface` mechanism**.
Therefore:

##### ✅ `@With_compat` is allowed on **normal Java interfaces**

because the framework cannot distinguish whether the interface belongs to the Clprolf interface system or not.

This means that, in the Java Framework:

* `@With_compat` may be placed on:

  * Clprolf version interfaces
  * Clprolf capacity interfaces
  * **standard Java interfaces**

* `@With_compat` still **cannot** be used with:

  * classes
  * primitives
  * enums
  * arrays
  * parameterized types without interface semantics

This preserves the practical usability of the framework while keeping conceptual continuity with pure Clprolf.

---

#### **4. Behavioral annotations (concurrency & intention)**

These annotations express **behavioral** or **concurrency-related** intentions:

`@Underst`,
`@Long_action`,
`@Prevent_missing_collision`,
`@One_at_a_time`,
`@For_every_thread`,
`@Turn_monitor`,
`@Dependent_activity`.

---

#### **5. Advice Enum**

The **Advice** enum provides semantic hints for annotations such as `@Capacity_inh` and `@Version_inh`.

Available values:

* `Advice.FOR_AGENT_LIKE`
* `Advice.FOR_WORKER_LIKE`

**Example :**

```java
@Capacity_inh(Advice.FOR_AGENT_LIKE)
```

---

#### **6. Gender Enum**

The **Gender** enum is used mainly with class-role annotations, such as `@Agent(gender = …)` and `@Abstraction(gender = …)`.

Available genders:

* `Gender.HUMAN_EXPERT`
* `Gender.EXPERT_COMPONENT`
* `Gender.STATIC`
* `Gender.HUMAN_EXPERT_STATIC`
* `Gender.EXPERT_COMPONENT_STATIC`
* `Gender.ACTIVE_AGENT`  // optional MAS-aligned refinement

**Example :**

```java
@Agent(gender = Gender.ACTIVE_AGENT)
public class SomeAgent { }
```

---

### III.6) Usage Examples

```java
@Abstraction
public class Car { /* (...) */ }
```

```java
@With_compat UserDao daoUser;
```

```java
@Underst // Recognize object in an image
public void recognizeObject() { }
```

```java
@Compat_interf_capacity(Advice.FOR_AGENT_LIKE)
public interface MySortable { }
```

Annotations are placed in the **same locations as in pure Clprolf** — before class declarations, interface definitions, methods, or types (e.g., `@With_compat` on variables, with the exception of method return types).

---


### III.7) Framework Usage Modes — Strict and Flexible

The Clprolf Framework can operate in **two complementary modes**, depending on how strictly you wish to follow the language rules.

---

#### **1. Strict Mode**

In **Strict Mode**, all Clprolf annotations must be written explicitly —
`@Nature`, `@Contracts`, and `@With_compat` are **mandatory**.

This mode mirrors the **pure language behavior**, ensuring total transparency of intent and perfect semantic control.
It is the preferred mode for **teaching**, **architecture validation**, and **formal projects**, where every structural element must be explicitly visible and verified by the compiler.

---

#### **2. Flexible Mode**

In **Flexible Mode**, the same annotations become **optional**.
If `@Nature`, `@Contracts`, or `@With_compat` are omitted, the compiler **automatically interprets them as present** and applies their semantics.

This keeps the framework **lightweight and enjoyable to use** in everyday Java, C#, or PHP projects, while maintaining full compliance with Clprolf’s conceptual model.
The resulting code remains concise, practical, and free of unnecessary boilerplate — yet semantically equivalent to the strict version.

> 💡 Flexible Mode is the **default** behavior of the framework, designed to make Clprolf concepts naturally usable in host languages, without friction.

---

#### Summary

| **Mode**          | **Annotations Required**                                           | **Typical Use**                | **Goal**                            |
| ----------------- | ------------------------------------------------------------------ | ------------------------------ | ----------------------------------- |
| **Strict Mode**   | All annotations explicit                                           | Teaching, validation, research | Full semantic visibility            |
| **Flexible Mode** | Optional key annotations (`@Nature`, `@Contracts`, `@With_compat`) | Everyday projects, frameworks  | Simplicity with preserved semantics |

---

### III.8) Annotation Categories in the Clprolf Framework (Java)

| **Category**                        | **Annotations / Enums**                                                                                                                 |
| ----------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| **Class Roles**                     | `@Agent`, `@Abstraction`, `@Simu_real_obj`, `@Worker_agent`, `@Comp_as_worker`, `@Model`, `@Information`                                |
| **Interface Roles**                 | `@Compat_interf_capacity`, `@Compat_interf_version`                                                                                     |
| **Semantic & Structural Modifiers** | `@Nature`, `@With_compat`, `@Contracts`, `@Forced_inh`, `@Forced_int_inh`, `@Forced_pract_code`, `@Version_inh`, `@Capacity_inh`        |
| **Behavioral Annotations**          | `@Underst`, `@Long_action`, `@Prevent_missing_collision`, `@One_at_a_time`, `@For_every_thread`, `@Turn_monitor`, `@Dependent_activity` |
| **Enums**                           | `Gender`, `Advice`                                                                                                                      |

---


### III.9) CLPROLF FRAMEWORK FOR C# DEVELOPERS

Since C# is close to Java, a Clprolf framework is also available for C#. It provides **attributes** similar to Java annotations, allowing C# developers to benefit from Clprolf’s methodology.

* Class and interface attributes are supported, with explicit targeting.
* However, **`nature`** and **`contracts`** are not included, due to C# attribute limitations. This is not critical, since C# already uses `:` for inheritance and implementation, and once developers understand Clprolf’s philosophy, the intent remains clear.
* **`with_compat`** is available for fields and parameters, but not for local variables.
* Interface names in C# naturally start with `I`, making them easily distinguishable.
* “Forced” attributes (`Forced_inh`, `Forced_int_inh`, etc.) are applied only at the class or interface definition level, again due to C# attribute limitations.

---

### III.10) CLPROLF FRAMEWORK FOR PHP 8

A Clprolf framework also exists for PHP 8.

* Like in C#, **`nature`** and **`contracts`** are not available due to attribute limitations.
* **`with_compat`** cannot be applied to local variables.
* Thread-related attributes (`turn_monitor`, `for_every_thread`, `one_at_a_time`, `dependent_activity`) are not included, since PHP does not support threading natively.

---
## IV) Philosophy and Design Insights

### IV.1) Applications as a Set of Components

In Clprolf, **every object is treated as a component**.
A component, by definition, has a **single, unique responsibility**.
If an object takes on multiple unrelated responsibilities, it no longer qualifies as a component.

By assigning each object a basic **declension** (its nature), Clprolf ensures that every OOP object is a well-formed component.
The resulting system is therefore a **set of components collaborating** through action calls.

* An **agent** component represents a real-world abstraction.
* A **worker\_agent** component behaves like a micro-computer, specialized in a task.
* Other declensions (`simu_real_obj`, `comp_as_worker`, etc.) can also be applied in the same way.

Traditional roles such as *controller*, *service*, or *repository* can still be layered on top of these basic roles.
This means Clprolf stays **fully compatible with existing design practices**.

---

### IV.2) Embedding Best Practices

Clprolf does not reinvent OOP principles — it **classifies and integrates existing best practices**:

* the **Single Responsibility Principle (SRP)**,
* the separation of **business** and **technical** layers,
* and the use of abstractions and real-world representations.

These practices are already well known in OOP.
What Clprolf adds is the ability to **embed them directly into the language**, making design choices more intuitive and systematic.

---

### IV.3) Components as Actors

With Clprolf, components are not just technical units:
they become **actors in a system**.
Designing an application therefore begins by choosing its **agents** (or worker\_agents), which serve as the foundation for the architecture.


### IV.4) S.O.L.I.D

The Clprolf language is especially compatible with the **S.O.L.I.D. principles**.
Here is how each principle is supported.

---

#### IV.4.a) Single Responsibility Principle (SRP)

The choice of a **declension** and optional **gender** guarantees a unique responsibility, since each carries a precise and well-defined role.
The `nature` keyword ensures that inheritance remains coherent.
Interface inheritance features assign a role to the targeted object, enforcing single responsibility in future extensions.
The compiler checks declensions for both classes and interfaces, ensuring coherence throughout the system.

---

#### IV.4.b) Open/Closed Principle

Clear object natures, class roles, and interfaces naturally enforce the **open/closed principle**.
The design remains open for extension but closed for modification, thanks to explicit roles and targeted abstractions.

---

#### IV.4.c) Liskov Substitution Principle

Class hierarchies are guaranteed to belong to the same family, through the `nature` keyword, declensions, and genders.
This makes **Liskov substitution** straightforward and reliable.

---

#### IV.4.d) Interface Segregation Principle

Clprolf distinguishes two main interface types: **versions** and **capacities**.
Capacity interfaces refine version interfaces, adding cross-cutting functionality.
With interface inheritance features, roles can be specified even more precisely, ensuring that every interface method is justified and useful.

---

#### IV.4.e) Dependency Inversion Principle

The `with_compat` modifier makes the use of interface types explicit, making **dependency injection** immediately visible.
Features for interface inheritance allow interface hierarchies to mirror their class counterparts (`version_inh`), enabling clear abstractions and direct loose coupling.


### IV.5) Clprolf and Multi-Agent Systems (MAS)

Clprolf offers a perspective similar to **multi-agent systems (MAS)**.
The key difference is that in Clprolf, **every abstraction with methods is considered an agent**, even if it appears passive.
By contrast, purely computational or technical code is assigned to **worker\_agent** roles.

This perspective can help beginners understand Clprolf concepts more easily, and may also be of interest to MAS practitioners.

---

#### IV.5.b) Agents and Workers

In Clprolf, a system is built from two main kinds of components:

* **Agent components** (abstractions of real-world entities).
* **Worker\_agent components** (computational workers).

Equivalent synonyms such as `abstraction` or `simu_real_obj` may also be used.
There are no additional object categories in the language.

---

#### IV.5.c) Optional MAS Alignment

For those who want to stay closer to MAS conventions, Clprolf provides the optional gender **`@Active_agent`**.
This can be used to mark an agent explicitly as “active” in MAS terms.

* Expert genders are implicitly MAS-active.
* Developers may choose `@Agent` or any equivalent qualifier, and restrict `@Agent` to active agents if desired.

---

#### IV.5.d) Extending MAS Principles

The difference from traditional MAS approaches is that **Clprolf applies the MAS perspective universally**.
Every software built with Clprolf is, in essence, a **multi-agent system**:

* all agents are active,
* worker agents represent the computer’s technical tasks,
* and both act together instead of relying on generic OOP objects.

Clprolf was not designed exclusively for MAS users, but it can be **adapted for them** when closer alignment is needed — particularly around the notion of active agents.

---

#### IV.5.e) Flexible Role Choices

Object roles in Clprolf remain flexible.
For example, one may use the `abstraction` keyword for a class like `Thread` if it feels more appropriate, or `simu_real_obj` in another case.
Developers can also use `agent` and `worker_agent` roles without explicitly working in a MAS context.
This flexibility makes role assignment an interesting and expressive design choice.


### IV.6) More Than Just a Class Name

In traditional OOP, a class is identified only by its **name**.
Clprolf goes further by explicitly stating the **role** of the class.

A class name alone is often insufficient to convey its full responsibility.
Names usually reflect a concept (e.g., `Horse`, `Connection`), but this may not immediately reveal the role of the class.
Reading the source code can sometimes clarify the role, but this becomes impractical for larger implementations.

By contrast, Clprolf requires each class to declare its **role**.
This role is both:

* a **guarantee from the programmer**,
* and a **contract checked by the compiler**.

Since all objects originate from classes, clear and well-defined roles are essential to building coherent systems.

### IV.7) Storytelling

Clprolf invites you to see programming as a form of **storytelling**.
You describe the **characters** (objects), the **scenes** (interactions), and the unfolding of the **story** (the system’s behavior).

The programmer becomes something like a writer, shaping a narrative through components and their interactions.

By providing clear object roles, well-defined interfaces, and built-in support for algorithmic design — including concurrency and parallelism — Clprolf makes this storytelling mindset natural and intuitive.


### IV.8) A Clearly Defined Way of Seeing Things

Traditionally, programmers tend to write code **as if they were the computer**.
When describing the execution, we often speak in the computer’s voice: *“he does this,”* rather than *“I do this.”*

In Clprolf, object roles provide a different perspective.
They define **who** performs the action, and establish a **third-person view** of execution.

---

### IV.9) First-Person vs. Third-Person

The distinction can be compared to video games:

* **First-Person Shooter (FPS)** → subjective view, like traditional programming.
* **Third-Person Shooter (TPS)** → objective view, similar to Clprolf’s approach.

For example:

* Third-person view: *“the worker goes through the array twice.”*
* Translated into first-person code: *“I write a loop that goes from 0 to 1.”*

The **object role** (the *who*) combined with the **third-person perspective** (the *what*) creates a powerful algorithmic enhancement.

---

🧩 **Occasional Use of the First-Person View**

Clprolf does not exclude the *first-person* view entirely.
In certain low-level or algorithmic contexts, it can still be natural — and even necessary — to think or express code in a *subjective* way:

* when describing **precise procedural logic**,
* or when writing **short, explicit algorithmic steps**.

In those cases, the developer temporarily “enters” the worker’s point of view —
not as the author of the program, but as the **voice of the executing agent itself**.

This is still coherent with Clprolf’s philosophy:
the system remains described from the outside (third-person),
but specific *actions* may be written *as if* performed from within.

> 🌿 The third-person defines the architecture;
> the first-person expresses the action.

---


#### IV.9.b) Benefits of the Third-Person Perspective

The Clprolf framework, with its clear roles and third-person view, makes it possible to design **controlled, high-level systems**.
This approach allows programmers to model execution more objectively and coherently.

---

### IV.10) The Object Roles: A Method for Designing Our Objects

Pure object-oriented programming defines what an object is — a bundle of variables and methods — but it does not tell us **how to design our objects**.

Clprolf provides guidance for this design process.
By assigning roles such as **agent**, **worker\_agent**, or **model**, it helps us imagine how to create our classes so that the resulting design is:

* **intuitive**,
* **easy to remember**,
* and open to multiple valid interpretations depending on the developer’s perspective.

The resulting objects remain **pure OOP objects**, but now with roles that explicitly reflect their responsibility — for example, an **agent** representing a real-world entity or abstraction.

---

#### IV.10.b) Roles as Primary Responsibility

Assigning a role means choosing a **primary responsibility**, directly in line with the **Single Responsibility Principle (SRP)**.

Clprolf roles enable:

* **storytelling** and reality-inspired design,
* **compiler checks** for inheritance consistency, ensuring correctness at compilation time.

Thus, the compiler itself participates in the object design process.

---

#### IV.10.c) A Supported OOP Mindset

Clprolf maintains an **object-centric mindset** fully compatible with OOP practices and habits.

Traditional OOP has always needed external guidelines such as design principles or design patterns — proof that developers benefit from structured support when designing their classes and objects.

Clprolf object roles bring this support **directly into the language**, turning best practices into built-in guidance.

### IV.11) The Essence of the Object — Another Side of Object-Oriented Programming

In object-oriented programming, an object should be **more than just a set of data**.
Its **role** — its essence — is a fundamental aspect of OOP design.

Thus, the question of an object’s nature belongs fully to the scope of OOP.

---

#### IV.11.b) Applications and Their Goals

Every application on a computer falls into one of two categories:

* a **user-goal application**,
* or **supporting software**, such as an operating system or libraries.

In both cases, the ultimate objective of the computer is always tied to the **final application** that serves the user.

---

#### IV.11.c) The Nature of Objects

For this reason, the different kinds of objects in programming can only be understood as:

* **emulations of real-world entities or concepts**, or
* **technical code for the computer itself**.

This perspective offers a more **scientific vision** of what an application really is:
a composition of objects that model reality and objects that handle computation.

By bringing these perspectives together, Clprolf unifies all types of objects found in object-oriented programming.


### IV.12) Main Goal in Clprolf Design: Making the Hard Possible — With Ease and Fun

One of the main goals — perhaps the most important — in designing Clprolf was to make it possible to write programs that would otherwise seem **impossible** or **extremely difficult** to create.

The language focuses on making objects and class components **intuitive, direct, and even enjoyable** to work with.
Programming in Clprolf should feel almost natural, turning coding into a task that is both **manageable** and **fun**.

Beyond simplifying the act of writing code, Clprolf encourages developers to:

* discover **multiple possible solutions** to a problem,
* explore **different interpretations** of the design,
* and gain mastery by seeing problems from **several perspectives**.

The conception of applications thus becomes more **human-like**, **creative**, and **approachable**, while remaining rigorous.

### IV.13) Origin of the Language: Scientific and Practical Inspiration

Clprolf was inspired by **scientific domains** such as physics, chemistry, and weather forecasting — all of which rely heavily on simulation and modeling. **Video games** also played a role, as they are practical examples of real-time simulations. At the same time, **management IT** was always present in the background, grounding the language in everyday software needs.

From the beginning, Clprolf aimed to:

* stay rooted in **real-world applications**,
* remain **general-purpose**, with many possible use cases,
* and serve an **educational role**, making programming easier and more engaging.

At its origin, the motivation was simple: to create an **easier and better way to practice object-oriented programming**, while keeping it interesting.
This vision was always balanced with a strong determination to **integrate established paradigms and principles**, rather than reinvent what already exists.
👉 **Clprolf can thus be seen as a programming paradigm in itself, one that integrates methodology directly into the language while staying fully compatible with object-oriented programming.**

---

### IV.14) Why Java as the Underlying Language for Clprolf?

Java was chosen as the underlying language because it aligns perfectly with Clprolf’s **philosophy and mindset**.
It is powerful yet logical, and maintains a relatively **minimalistic design**.

Key reasons include:

* **The Virtual Machine**: an elegant and robust concept that fits naturally with Clprolf’s vision of programming. It keeps libraries abstract and less technical, even in system programming.
* **Annotations**: Java’s powerful annotation system was crucial for building the Clprolf framework, making it both expressive and lightweight.
* **Object-Oriented Features**: simple inheritance, well-defined interfaces, and excellent handling of concurrency and parallelism.
* **Adaptability**: Clprolf integrates seamlessly with Java, showing how natural the fit is.

While Java was the natural choice, Clprolf is not limited to it.
Other languages such as **C#** are also strong candidates, and **PHP** is well suited for web and scripting contexts.

---

### IV.15) ALIGNED WITH DOMAIN-DRIVEN DESIGN (DDD)

The Clprolf language and framework are naturally aligned with Domain-Driven Design (DDD).

According to Wikipedia, *“Domain-driven design (DDD) is a major software design approach, focusing on modeling software to match a domain according to input from that domain's experts. Under domain-driven design, the structure and language of software code (class names, class methods, class variables) should match the business domain. For example, if software processes loan applications, it might have classes like ‘loan application’ and ‘customer’, with methods such as ‘accept offer’ or ‘withdraw’.”*

Clprolf embodies this philosophy by design. Its structure inherently enforces the principle that classes and methods reflect the business domain, making DDD not an external practice but an intrinsic feature of the language.


### IV.16) CLPROLF AND MULTIPLE INTERPRETATIONS

Clprolf gives developers freedom in how they interpret and design classes. The same functionality can be modeled in different ways depending on perspective. For instance, business logic could be represented as the responsibility of a business expert — using an `agent`. Others might prefer to treat it as a technical task — using a `worker_agent`.

This flexibility allows Clprolf to accommodate different design sensibilities while keeping the system coherent.

---

### IV.17) GOD OBJECTS OR GOD-OBJECT–LIKE PREVENTION

In Clprolf, a traditional OOP class corresponds to a `indef_obj` object. This generic form can easily lead to *God objects* — classes that try to handle everything at once.
To prevent this, Clprolf provides more specific class roles, guiding developers toward clear, focused responsibilities and reducing the risk of oversized, monolithic classes.

---

### IV.18) A JUSTIFICATION FOR THE TWO MAIN DECLENSIONS — THE BASIC OBJECTS IN CLPROLF

* In Clprolf, declensions are not just labels — they define the two fundamental kinds of objects. These declensions remain fully compatible with classical OOP, since both are still OOP objects.
* Clprolf recognizes only two root declensions:
  – an **`agent`**, which simulates a real-world object,
  – a **`worker_agent`**, which simulates the computer acting as a worker.
  In traditional OOP everything is an object, but in Clprolf every object is explicitly one of these two declensions.
* Beyond pure data holders, every class must fall into one of these declensions. A `worker_agent` represents the computer as a worker (even though all workers are part of the same physical computer). An `agent` represents a real-world entity, with code that simulates its behavior. In practice, `agent` classes are often simpler to design and use, since they just reproduce recognizable real-world behaviors.
* This distinction ensures coherence and single responsibility: simulation code (business or real-world emulation) stays separate from technical or computer-specific code.
* The justification is simple: by definition, objects should represent something. Otherwise, they are not truly objects. As one AI-based tool puts it: *“In OOP, and by extension in Clprolf, objects are more than just collections of data and functions; they are representations of real-world or conceptual entities.”*
* Both declensions are grounded in the idea of **algorithms**. Whether it is an `agent` or a `worker_agent`, each role mimics a real-world reality — either the entity itself or the computer-as-worker that supports it.
* Choosing between the two is a matter of responsibility: if the job belongs to the computer, use a `worker_agent`. If it is a direct simulation of reality (e.g. a `Horse` class), use an `agent`.
* The guiding principle is to keep simulation code pure. Pure simulation is usually straightforward and closely tied to real-world logic. Non-simulation code should be isolated into `worker_agent` classes. The `nature` keyword enforces that responsibilities remain unique and consistent.
* Existing OOP classes can usually be mapped directly to one of these declensions. When a class has mixed responsibilities, Clprolf encourages identifying its main declension and making that explicit.
* While multiple interpretations are possible, Clprolf’s philosophy is not about forcing a single mindset but about **making the chosen perspective clear**.
* Clprolf also defines two categories of **pure data objects**:
  – `model` — equivalent to entities in classical OOP (no behavior, only attributes, often for persistence or database mapping).
  – `information` — raw data structures meant for use by `worker_agent` classes. These should be used sparingly, whereas `model` is common (e.g. a `Client` entity).
* Although technically allowed, `worker_agent` classes should not be used solely for calculations. Calculations that belong to the business or simulation domain must stay inside `agent` classes (for instance, physics computations inside a simulation of a physical process). Only in special cases, such as system programming or technical libraries, should a `worker_agent` directly implement calculation code.
* Finally, declensions provide a way to **check inheritance coherence**, ensuring that subclasses remain consistent with their declared responsibility.

---

### IV.19) ENSURING CONSISTENCY IN CLASS AND INTERFACE DESIGN — GROWTH THROUGH INHERITANCE

1. **Declensions enforce separation and clarity**
   Declensions ensure that classes remain well-structured, each with a distinct responsibility. The same principle applies to interfaces: assigning a declension guarantees that each interface has a clear purpose and meaning.

2. **`nature` maintains coherent inheritance**
   The `nature` keyword enforces consistency when a class inherits from another of the same declension. This applies only to classes, not interfaces.
   While a compiler cannot automatically detect all semantic mismatches, basic AI-like checks could help — for example, preventing a class `Tiger` from inheriting from `Vehicle`. In Clprolf, developers can explicitly enforce inheritance even when such a semantic error is detected, acknowledging the exception. The `nature` keyword is therefore both a safeguard and a guide for programmers, whether or not AI-like validation is used.

3. **Declensions guide growth by inheritance**
   Inheritance is a natural way for a class to grow, but it can easily blur the original design. Declensions make it possible for the compiler to apply semantic rules that preserve meaning and coherence during inheritance. These rules ensure that only consistent declensions are combined.
   The same reasoning extends to interfaces: assigning roles to them enables the compiler to validate that their inherited forms retain their intended sense.

In short, semantic checks in Clprolf — powered by declensions and `nature` — safeguard the integrity of both classes and interfaces as they evolve through inheritance.

---


### IV.20) COMPATIBILITY WITH OTHER PARADIGMS

Clprolf includes role annotations to remain accessible to common interpretations of classes and to clarify the use of `agent`.

From another perspective, `agent` and `worker_agent` can both be seen as variations of the same root concept: the `worker_agent`. An `agent` is essentially a specialized `worker_agent`, focused on simulating real-world entities. Similarly, a `model` can be viewed as a more specific form of `information`.

With this observation, Clprolf can be mapped back to paradigms that treat all classes uniformly. In effect, one could see the language as consisting only of `worker_agent` classes (and `information` for data), aligning with the simpler view of classical OOP or even procedural programming.

In summary, it is as if `agent` were derived from `worker_agent`, and `model` from `information`. This perspective provides a conceptual bridge between Clprolf and existing programming paradigms.

### IV.21) ALGOL AND CLPROLF

ALGOL (*Algorithmic Language*) was designed with a strong emphasis on algorithmic and mathematical computation. Its goal was to provide a language for expressing algorithms clearly and efficiently. **ALGOL 60** in particular was highly influential: it introduced features for structured programming and laid the foundation for many modern programming languages.

Clprolf, with its **`worker_agent`** declension (simulation of the computer as a worker), shares a similar orientation toward algorithmic programming. This declension explicitly represents the computer as an executor of algorithms, echoing ALGOL’s original ambition as an *algorithmic language*.

* **Semantic clarity**: ALGOL encouraged developers to write code that closely mirrored the problem-solving process. Clprolf continues this spirit by assigning clear semantics to classes and interfaces through declensions and genders.
* **Minimalistic approach**: ALGOL’s creators aimed to keep the language minimalistic, and Clprolf also follows this path, focusing on a limited set of declensions and concepts.


### IV.22) SIMULA AND CLPROLF

* **Simulation focus**: Both Simula and Clprolf emphasize simulation. Simula was explicitly created for simulation, while Clprolf builds on the same idea with its concepts of simulation and modeling.
* **Object-oriented programming**: Simula is often credited as one of the first object-oriented languages. Clprolf also embraces OOP, introducing **declensions** for classes and interfaces to give structure and meaning — a core principle of object-oriented design.
* **Abstraction**: Both languages encourage abstraction as a way to clarify code. Simula introduced classes and objects to model real-world entities, while Clprolf formalizes this through distinct declensions that define purpose and responsibility.
* **Real-world modeling**: Simula pioneered the idea of modeling real-world entities and their interactions. In Clprolf, the **`agent`** declension directly represents real-world objects, reinforcing this perspective.
* **Principles of simplicity**: Simula was designed to make the modeling of complex systems clear and efficient. Clprolf also follows a minimalistic philosophy, focusing on a limited set of roles and concepts to promote clarity and simplicity.

---


### IV.23) TEACHING PROGRAMMING OR JAVA TO CHILDREN

Teaching advanced programming concepts to children is challenging, especially with Java. Clprolf — or the Clprolf framework — can serve as an easier entry point to Java.

By introducing declensions such as **agent**, **human expert**, **abstraction**, or **computer as worker**, Clprolf provides intuitive metaphors that make it easier to explain complex topics. These perspectives can help make object-oriented programming more accessible, even for young learners.

---

### IV.24) NOTICE ON INHERITANCE AND CLPROLF

In object-oriented programming, inheritance is more than just copying attributes and methods. When inheritance is used solely for that purpose, it becomes **abusive inheritance**, and composition should be preferred instead — the well-known *“has-a”* relationship, versus inheritance as an *“is-a”* relationship. This is why the principle of *composition over inheritance* exists.

Clprolf secures inheritance by adding **declensions** and **semantic checks**. These ensure that inheritance carries a meaningful relationship, not just a technical one. For example, a business class cannot inherit from a computational class.

Still, role consistency is not always enough. A `Human` class could inherit from a `Heart` class — both being real-world simulations — but the relationship would remain incoherent. The `nature` keyword prevents such misuse by enforcing that inheritance only occurs between entities of the same kind.

In this sense, Clprolf strengthens OOP by embedding safeguards that reflect what a careful programmer would already apply as good practices.

At the same time, Clprolf preserves **flexibility**: developers can override these restrictions with `@Forced_inh` or `@Forced_int_inh` when practical needs demand it. This ensures that Clprolf remains as powerful as classical OOP languages, while adding semantic rigor where appropriate.

---

### IV.25) NOTICE ON SIMPLICITY AND REALITY

In Clprolf, the mindset is to stay as close as possible to **concrete reality**. This ensures that real-world use cases can always be modeled effectively.

* The `worker_agent` reminds us that, in the end, source code is compiled into low-level instructions — a technical realization of an abstract idea.
* Compatibility interfaces keep design grounded by making their intended use explicit.
* Clprolf avoids abstraction without purpose: programming is a concrete activity, and every abstraction should serve a clear goal.

Another distinctive feature of Clprolf is its focus on **reasoning**. Problems are treated as independent from the fact that they are implemented in software. In principle, the same reasoning could be done with a sheet of paper, without a computer at all.

Even `worker_agent` methods are framed as simulations of a worker — almost like a human — executing a job with specific capacities. This guarantees that Clprolf always remains simple and intuitive.

---


### IV.26)NOTICE ON MESSAGES, SMALLTALK, AND ALAN KAY’S VISION

#### 1. Differences with Smalltalk — the sender of messages

Clprolf is closer to **Simula** than to Smalltalk: objects are key, but method calls remain the natural way to express actions. Programmers intuitively *call methods* rather than *send messages*, which keeps an algorithmic mindset.

If Clprolf were message-based, the metaphor would be one of **talking to objects** rather than passing messages between them. The programmer becomes the **conductor of the orchestra**: objects are puppets, the programmer the puppeteer. Interfaces then become the vocabulary needed to talk with objects, which aligns with the notion of **versions** and **capacities**.

At runtime, the computer executes the method calls, and `agent` objects become `worker_agent` in a technical sense, echoing Smalltalk’s vision where objects themselves act as message senders.

#### 2. Algorithmic mindset vs. message passing

Clprolf insists on keeping an **algorithmic perspective**, even for `agent` classes. Saying “object A sends a message to object B” can obscure the underlying algorithm. Instead, Clprolf frames this as *the programmer writing an algorithm*, implemented through method calls.

This is why Clprolf is aligned with languages like Java, C#, and PHP — not purely message-oriented, but **algorithmically grounded**. `agent` declensions are always described through algorithms that define their behavior.

#### 3. Alignment with Alan Kay’s vision

Alan Kay, who coined the term *object-oriented programming*, described the idea as:

> *“The big idea was to use encapsulated mini-computers in software which communicated via message passing rather than direct data sharing.”*

In Clprolf, `worker_agent` declensions embody this concept: they can be seen as **mini-computers**, encapsulated and communicating with one another.

* A `worker_agent` is like one of Kay’s mini-computers.
* At runtime, the whole system of `agent` and `worker_agent` forms a **network of communicating objects**.
* The programmer remains the **ultimate sender**, orchestrating these interactions.

Thus, Clprolf bridges two perspectives:

* **Ideal vision**: a network of real-world simulations (`agent`) and computational workers (`worker_agent`).
* **Technical vision**: at runtime, everything reduces to `worker_agent`, consistent with Alan Kay’s “mini-computer” metaphor.

For example, a `Sorter` can be viewed either as an `agent` (a human expert at sorting) or as a `worker_agent` (a computer program performing the sort). In both cases, Clprolf provides a coherent interpretation, staying true to reality while remaining compatible with the historical roots of OOP.

---


### IV.27) NOTICE ON PERFORMANCE

* **No runtime overhead**: Clprolf adds semantics and clarity on top of Java without impacting runtime performance. Object roles reduce excessive inheritance and encourage best practices, but all role-related keywords are resolved at compile time. The generated executables are effectively the same as standard Java (and the same applies to the C# and PHP frameworks).

* **Design leads to performance**: Well-structured and well-understood systems are key to achieving efficiency. By guiding developers toward better architectures, Clprolf helps avoid misconceptions and makes it easier to identify optimizations. In this sense, Clprolf indirectly contributes to performance through design quality.

---

### IV.28) NOTICE ON CLPROLF AND ALGORITHMS WRITING INFLUENCE

Clprolf was created to simplify the writing and understanding of object-oriented code. Its primary goal is not algorithm design. Yet, we can observe that it sometimes **influences the way algorithms are written**, indirectly.

* Keywords such as `underst` can highlight complex or unintuitive parts of an algorithm.
* Declensions (`agent` vs. `worker_agent`) can give different perspectives on the same algorithm, enriching the way we think about the problem.

Ultimately, Clprolf influences algorithm writing by encouraging **well-designed classes and methods** — nothing more. This influence is indirect, but meaningful.

---

### IV.29) FUTURE DIRECTIONS OF CLPROLF

Like pure OOP rests on the concept of objects, Clprolf rests on **declensions**, which are intended to remain stable.

* The language may evolve with **real-world needs**, adding features only to fill genuine gaps. For example, `underst` and concurrency/parallelism aids were added later, but the **core principles have remained stable from the beginning**.
* Keyword names may be refined, but they are now considered stable.
* Clprolf aims to stay **minimalistic**, simplifying object-oriented programming — and programming in general — rather than adding complexity.
* Future frameworks may support **additional underlying languages** beyond Java, C#, and PHP.

The principles of Clprolf are simple, easy to understand, and verifiable. They are constantly compared against other perspectives to ensure coherence — as shown in the reflection on **messages in OOP**, which found a common ground between Smalltalk, Alan Kay’s vision, and Clprolf.

---

## V) Examples

### V.1) Clprolf Directory Explorer — When Breadth-First Becomes Intuitive

Everyone knows that exploring directories can quickly turn into a messy technical exercise:
loops, recursion, stacks, file filters… and code that loses all readability.

With **Clprolf**, clarity is built-in.
You don’t just write *code* — you design **agents**, **workers**, and **models** that reflect what really happens.
Let’s see how a simple *directory explorer* can become a beautifully structured program.

---

#### V.1.a) The Concept

We want to:

* explore all subdirectories of a given folder,
* in **breadth-first** order (level by level),
* assign each directory a hierarchical ID,
* and display the results cleanly.

Instead of mixing logic, display, and data handling,
Clprolf invites us to split them into **roles**.

| Component                                       | Declension      | Responsibility                 |
| ----------------------------------------------- | --------------- | ------------------------------ |
| `Launcher`                                      | `worker_agent` | Starts the exploration         |
| `DirectoryExplorerImpl`                         | `agent`        | Performs the exploration       |
| `DirectoryExplorerWorkerImpl`                   | `worker_agent` | Displays results               |
| `Directory`                                     | `model`        | Represents one directory node  |
| `DirectoryExplorer` / `DirectoryExplorerWorker` | `version_inh`  | Define contracts between roles |

---

#### V.1.b) The Launcher

The entry point is as simple as it looks.
It prepares the environment and delegates the job to the proper agent.

```clprolf

import java_interface java.nio.file.Path;
import java_class abstraction java.lang.System;
import java_class abstraction java.nio.file.Files;
@Static
import java_class agent java.nio.file.Paths;
import java_class abstraction java.nio.file.LinkOption;

public worker_agent Launcher {

    public static void main(String[] args) {
        with_compat Path path = Paths.get(args.length > 0 ? args[0] : System.getProperty("user.home"));
        try { path = path.toRealPath(LinkOption.NOFOLLOW_LINKS); } catch (Exception ignored) {}

        if (!Files.isDirectory(path)) {
            System.err.println("Not a directory: " + path);
            System.exit(1);
        }

        with_compat DirectoryExplorer explorer = new DirectoryExplorerImpl();
        explorer.breadthFirstFolders(path);
    }
}
```

It’s clear who does what:
this worker doesn’t explore — it simply *launches the agent*.

---

#### V.1.c) The Agent — `DirectoryExplorerImpl`

Here lies the real exploration logic.
The agent collaborates with a worker, manipulates a model, and manages a queue.

```clprolf

import java_interface version_inh abstraction java.util.List<E>;
import java_class abstraction java.util.ArrayList;
import java_class abstraction java.util.LinkedList;
import java_interface version_inh abstraction java.util.Queue<E>;
import java_class abstraction java.io.File;

public agent DirectoryExplorerImpl contracts DirectoryExplorer {

    private with_compat DirectoryExplorerWorker worker;

    public DirectoryExplorerImpl() {
        this.worker = new DirectoryExplorerWorkerImpl();
    }

    public void breadthFirstFolders(with_compat Path directoryPath) {
        directoryPath = directoryPath.normalize().toAbsolutePath();

        with_compat List<Directory> foldersList = new ArrayList<>();
        with_compat Queue<Directory> directoryToExplore = new LinkedList<>();

        directoryToExplore.add(new Directory(directoryPath, List.of(0)));

        while (!directoryToExplore.isEmpty()) {
            Directory current = directoryToExplore.poll();
            foldersList.add(current);

            File[] files = current.getPath().toFile().listFiles();
            if (files != null) {
                int index = 0;
                for (File file : files) {
                    if (file.isDirectory()) {
                        List<Integer> newId = new ArrayList<>(current.getHierarchicalId());
                        newId.add(index);
                        directoryToExplore.add(new Directory(file.toPath().normalize().toAbsolutePath(), newId));
                        index++;
                    }
                }
            }
        }

        worker.displayResult(foldersList);
    }
}
```

Every part is crystal clear:

* The queue defines a **breadth-first traversal**.
* Each directory receives its own **hierarchical ID**.
* The **worker** takes care of presentation.

No recursion, no confusion.

---

#### V.1.d) The Worker Agent

Responsible for showing the result, not for computing it.
Again, we separate *doing* from *showing*.

```clprolf

import java_interface version_inh abstraction java.util.List<E>;
import java_class abstraction java.lang.String;
import java_class abstraction java.lang.System;

public worker_agent DirectoryExplorerWorkerImpl contracts DirectoryExplorerWorker {

    public void displayResult(List<Directory> foldersList) {
        for (Directory dir : foldersList) {
            String display = formatId(dir.getHierarchicalId()) + " : " + dir.getPath();
            System.out.println(display);
        }
    }

    private String formatId(List<Integer> id) {
        return "(" + String.join(", ", id.stream().map(String::valueOf).toArray(String[]::new)) + ")";
    }
}
```

Simple, explicit, human-readable.

---

#### V.1.e) The Model

A `model` in Clprolf is always clear:
it represents data, and nothing more.

```clprolf

import java_interface version_inh abstraction java.util.List<E>;
import java_interface java.nio.file.Path;

public model Directory {
    private Path path;
    private List<Integer> hierarchicalId;

    public Directory(Path path, List<Integer> id) {
        this.path = path;
        this.hierarchicalId = id;
    }

    public Path getPath() { return path; }
    public List<Integer> getHierarchicalId() { return hierarchicalId; }
}
```

No logic, no side effects. Just structure.

---

#### V.1.f) The Contracts

```clprolf

public version_inh agent DirectoryExplorer {
    void breadthFirstFolders(Path directoryPath);
}


public version_inh worker_agent DirectoryExplorerWorker {
    void displayResult(List<Directory> foldersList);
}
```

Contracts make the collaboration explicit.
No hidden dependencies, no tight coupling — just clear communication.

---

#### V.1.g) Why it matters

Breadth-first exploration is only the example.
What matters here is **how naturally the architecture expresses itself**:

* The launcher launches.
* The agent explores.
* The worker displays.
* The model represents.
* The contract binds.

Clprolf doesn’t just help you code — it helps you **think**.
The structure emerges from the intention.

---

#### V.1.h) Final Thoughts

> In classical Java, you might have written a single class doing everything.
>
> In Clprolf, each role finds its natural place.
> The result is simple, explicit, and readable — even for someone who never wrote Java before.

Clprolf brings **clarity back into architecture**,
and even the smallest utilities become examples of well-designed software.

---

### V.2) Adapter Pattern in Clprolf

Design patterns are a classic way to solve recurring software design problems.
We’ll revisit the **Adapter pattern**, but written in **Clprolf** — a language that makes object-oriented roles and contracts explicit.

Even if you don’t know Clprolf yet, don’t worry:

* the **use case** is familiar,
* the **solution** is the same pattern you already know,
* and you’ll see how Clprolf makes both sides clearer.

---

#### V.2.a) The Problem

Imagine you have an existing class that implements an **old interface**, but your application now expects the **modern version** of that interface.

* You cannot change the old class (it’s legacy code, or external).
* You need a way to reuse it, but expose it through the **newer contract**.

That’s where the **Adapter** comes in.

---

#### V.2.b) The Clprolf Solution

In Clprolf, the rule is simple:

* A concrete **agent** can contract **only one** `version_inh`.
* So you **cannot make the same class both an “old” and a “modern” implementation**.
* Instead, you **create a new agent — the Adapter — which contracts the modern version, and internally uses the old one via `with_compat`.**

---

#### V.2.c) Example: Enumeration → Iterator

Old Java APIs used `Enumeration`, but modern code expects `Iterator`. We want to reuse existing `Enumeration` implementations without rewriting them.


```clprolf
// 1. Old contract (an abstraction)
public version_inh abstraction Enumeration<E> {
    boolean hasMoreElements();
    E nextElement();
}

// 2. Modern contract (an agent)
public version_inh agent Iterator<E> {
    boolean hasNext();
    E next();
}

// 3. Adapter agent: contracts the modern version
public agent EnumToIterAdapter<E> contracts Iterator<E> {
    private with_compat Enumeration<E> enumeration;

    public EnumToIterAdapter(with_compat Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public E next() {
        return enumeration.nextElement();
    }
}
```

---

#### V.2.d) Why this is clear in Clprolf

* `version_inh` makes it explicit: these are **role contracts meant to be implemented** by agents.
* `contracts` shows clearly: the Adapter **is a modern `Iterator`**.
* `with_compat` highlights the dependency on the old `Enumeration`.
* No hidden tricks: we see immediately that the Adapter is **a new agent** created for translation.

And here’s an important detail:

* **`Enumeration` is an abstraction** (a very minimal contract, part of the `agent` declension in Clprolf).
* **`Iterator` is a full agent**, representing the modern iteration model.
* So the Adapter not only bridges old to new, but also shows a **shift in philosophy**: from abstraction to agent.

---

#### V.2.e) Key takeaway

In Clprolf, the Adapter is never a “magical disguise.”
It’s simply:

> **A new agent that contracts the modern interface, and delegates to an old implementation through `with_compat`.**

This removes confusion and makes the intent crystal clear.

---

#### V.2.f) Bonus: Using the Adapter in a Demo

For completeness, here’s how a client would actually use the Adapter.
Even if the old API gives you an `Enumeration`, the Adapter lets you treat it as a modern `Iterator`:

```clprolf
public worker_agent AdapterDemo {
    public static void main(String[] args) {
        Vector<String> legacyVector = new Vector<>();
        legacyVector.add("one");
        legacyVector.add("two");
        with_compat Enumeration<String> enumeration = legacyVector.elements();

        with_compat Iterator<String> iterator = new EnumToIterAdapter<>(enumeration);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

---

### V.3) Strategy Pattern in Clprolf: Clear Roles for Swappable Behavior

Design patterns are a classic way to solve recurring problems in software design.
We’ll revisit the **Strategy pattern**—written in **Clprolf**, a language that makes object-oriented roles and contracts explicit.

Even if you don’t know Clprolf yet, don’t worry:

* the **use case** is familiar,
* the **solution** is the same pattern you already know,
* and you’ll see how Clprolf makes both sides clearer.

---

#### V.3.a) The Problem

You have a **behavior** that should be easy to **swap** (at runtime or configuration time).
Example: apply different **discount** policies without changing the checkout code.

---

#### V.3.b) The Clprolf Solution

In Clprolf:

* a strategy is modeled as a **`version_inh abstraction`** (a simple, swappable rule),
* each concrete strategy is also an **`abstraction`** that **contracts** the base one,
* the context declares its dependency with `with_compat`.

Result: the strategy’s role, implementations, and dependency are **explicit**.

---

#### V.3.c) Example: Discount strategies

We’ll define a `Discount` and two implementations:

* `NoDiscount` (does nothing)
* `PercentageDiscount` (e.g., 15% off)

Then a `Checkout` context that uses whichever discount it’s given.

#### V.3.d) Clprolf Code

```clprolf
// 1) Strategy contract (a generic rule for discounts)
public version_inh abstraction Discount {
    int apply(int price);
}

// 2) Concrete strategies
public abstraction NoDiscount contracts Discount {
    public int apply(int price) { return price; }
}

public abstraction PercentageDiscount contracts Discount {
    private int percent;

    public PercentageDiscount(int percent) { this.percent = percent; }

    public int apply(int price) {
        return price - (price * percent / 100);
    }
}

// 3) Context depending on a strategy
public agent Checkout {
    private with_compat Discount strategy;

    public Checkout(with_compat Discount strategy) {
        this.strategy = strategy;
    }

    public int total(int[] prices) {
        int sum = 0;
        for (int p : prices) sum += p;
        return strategy.apply(sum);
    }
}
```

---

#### V.3.e) Bonus: Demo with swappable discounts

```clprolf
public worker_agent StrategyDemo {
    public static void main(String[] args) {
        int[] cart = new int[] { 4000, 2000, 1500 }; // total = 7500

        // No discount
        with_compat Discount none = new NoDiscount();
        Checkout checkoutNone = new Checkout(none);
        System.out.println(checkoutNone.total(cart)); // 7500

        // 15% discount
        with_compat Discount promo15 = new PercentageDiscount(15);
        Checkout checkout15 = new Checkout(promo15);
        System.out.println(checkout15.total(cart)); // 6375
    }
}
```

---

#### V.3.f) Why this is clear in Clprolf

* `version_inh abstraction` shows immediately that a discount is a **generic, swappable rule**, not a central agent.
* `contracts` makes each concrete discount a true implementation of that rule.
* `with_compat` declares the dependency directly: the checkout expects “a discount,” no hidden wiring.
* Swapping is just supplying a different **abstraction** — the context stays untouched.

---

#### V.3.g) Key takeaway

In Clprolf, Strategy is not a trick — it’s simply:

> **Declare a rule (`abstraction`), provide implementations, and swap them with `with_compat`.**

Behavior becomes interchangeable, and the intent is visible in the syntax.

---

#### V.3.h) Innovation Note: Patterns reveal roles

In traditional OOP, Strategy is often shown as a purely technical structure.
But in reality, it already carries a **business role**: “choosing a behavior.”

👉 Clprolf makes this dimension explicit.

* Here, the role is `abstraction` → a discount is a rule, not an agent.
* In another case, a Strategy could be an `agent` (e.g., choosing a routing algorithm).
* For technical variations, it might be a `worker_agent` (like multiple DAO implementations).

**This is where Clprolf innovates:**

> Design patterns don’t just solve problems — they map naturally to roles (`agent`, `abstraction`, `worker_agent`).
> And when the role is explicit, the pattern’s intent becomes crystal clear.

---

### V.4) WeatherApp MVC — When Clprolf Meets Spring MVC Philosophy (Clprolf Framework example)

Everyone knows the **MVC pattern**.
But what if you could make it **even clearer**, more **structurally explicit**, and **compatible** with both *desktop* and *web* architectures?

That’s what **Clprolf** does —
it turns the philosophy of **clarity-oriented programming** into real, verifiable structure.

Let’s look at a simple example:
a *WeatherApp* written in Java + Clprolf annotations —
which behaves like a **Spring MVC** application,
but runs locally in Swing.

---

#### V.4.a) The Idea Behind It

In Spring MVC, a `Controller` receives a request,
calls a `Repository` or `Service`,
and returns a `View`.

In **Clprolf**, we do exactly the same —
but we **explicitly declare the roles** of each component.

| Component           | Clprolf Role                   | Description                                 |
| ------------------- | ------------------------------ | ------------------------------------------- |
| `WeatherApp`        | `@Worker_agent(Gender.STATIC)` | The system launcher (like Spring Boot main) |
| `WeatherController` | `@Agent`                       | The “brain” that coordinates the logic      |
| `WeatherRepository` | `@Worker_agent`                | Technical layer fetching data               |
| `WeatherRenderer`   | `@Worker_agent`                | The View layer (UI and user input)          |

---

#### V.4.b) The Complete Code

```java
package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent(Gender.STATIC)
public class WeatherApp {
    public static void main(String[] args) {
        WeatherController controller = new WeatherController();
    }
}
```

---

##### Controller (Agent Layer)

```java
package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Gender;

@Agent(Gender.EXPERT_COMPONENT)
public class WeatherController {
    private WeatherRepository model;
    private WeatherRenderer view;

    public WeatherController() {
        model = new WeatherRepository();
        view = new WeatherRenderer(this);
    }

    public void giveTheWeather(String location){
        model.setLocation(location);
        model.fetchWeather();
        String forecast = model.getForecast();
        view.displayForecast(forecast);
    }
}
```

This class acts like a **Spring `@Controller`**:
it receives a request (`giveTheWeather`),
calls the **repository**,
and updates the **view**.

---

##### View (Worker Layer)

```java
package org.clprolf.examples.design_patterns.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Worker_agent;
import org.clprolf.framework.java.Advice;

@Worker_agent
public class WeatherRenderer {

    private JFrame frame;
    private JTextField locationField;
    private JTextArea forecastArea;
    private WeatherController expert;

    @Agent
    @Version_inh
    private static interface WindowObserver extends @Nature ActionListener { }

    @Agent
    private class WindowObserverImpl implements @Contracts WindowObserver {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String location = getLocationInput();
            this.expert.giveTheWeather(location);
        }
    }

    public WeatherRenderer(WeatherController expert) {
        this.expert = expert;
        prepareViewObjects();
    }

    protected void prepareViewObjects() {
        frame = new JFrame("Weather Forecast");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel locationLabel = new JLabel("Enter Location:");
        locationField = new JTextField(20);
        locationField.addActionListener(new WindowObserverImpl());

        forecastArea = new JTextArea(5, 30);
        forecastArea.setEditable(false);

        panel.add(locationLabel, BorderLayout.NORTH);
        panel.add(locationField, BorderLayout.CENTER);
        panel.add(new JScrollPane(forecastArea), BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public String getLocationInput() {
        return locationField.getText();
    }

    public void displayForecast(String forecast) {
        forecastArea.setText(forecast);
    }
}
```

Here, the **view** acts like a web frontend.
It observes user input (capacity-inherited `ActionListener`)
and sends the event to the **controller agent**.

You could almost replace Swing with HTML/JavaScript
and it would behave the same way!

---

##### Repository (Technical Worker)

```java
package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Worker_agent;

@Worker_agent
class WeatherRepository {
    private String location;
    private String forecast;

    public void setLocation(String location) {
        this.location = location;
    }

    public void fetchWeather() {
        this.forecast = "Sunny with a chance of clouds";
    }

    public String getForecast() {
        return forecast;
    }
}
```

A pure worker: no intelligence, no UI — just technical work.
That’s exactly what a `Repository` or `Service` does in Spring MVC.

---

#### V.4.c) The MVC Flow

```
User (View) → WeatherRenderer (worker_agent)
             → WeatherController (agent)
             → WeatherRepository (worker_agent)
             → back to WeatherRenderer
```

The **same logical flow** as Spring MVC —
but here, everything runs locally and instantly.

---

#### V.4.d) Why It Matters

This example shows that **Clprolf integrates seamlessly** with existing patterns.
It doesn’t replace MVC, Spring, or OOP —
it simply **clarifies and strengthens** them.

In a Spring app, you’d just change the way communication happens
(HTTP + `@GetMapping` instead of direct calls) —
but your *roles*, *responsibilities*, and *architecture* remain identical.

---

#### V.4.e) Final Thoughts

Clprolf makes **architecture visible**.
You no longer guess what a class *is supposed to be*:
you *declare it* — explicitly.

> A `Controller` is an **Agent**.
> A `Repository` is a **Worker_agent**.
> A `Launcher` is a **Static Worker_agent**.
> A `View` is also a **Worker_agent** — the interface between human and machine.

In short:
Clprolf doesn’t reinvent MVC — it **makes it self-explanatory**.

---

##### V.4.f) Summary

| Traditional Role | Clprolf Equivalent             | Layer            |
| ---------------- | ------------------------------ | ---------------- |
| Controller       | `@Agent`                       | Logic / Domain   |
| Repository       | `@Worker_agent`                | Data / Technical |
| View             | `@Worker_agent`                | Presentation     |
| Launcher         | `@Worker_agent(Gender.STATIC)` | System entry     |

---

> 🌤️ *“It acts as a living interface between human and machine —
> the very essence of the worker_agent.”*

---

### V.5) Revisiting Snake in Java with Clprolf — From Clear Code to Clear Game (Clprolf Framework)

What if writing a small game could prove that architecture can be both **clean** and **alive**?
Let’s revisit the classic **Snake** game — but built with **Clprolf**,
a paradigm that turns *clarity* into a coding language.

---

#### V.5.a) From OOP to Clarity-Oriented Programming

Clprolf isn’t a framework. It’s a **language layer + methodology**
that builds **architectural meaning** into Java itself.

| Annotation      | Role                                              |
| --------------- | ------------------------------------------------- |
| `@Agent`        | Domain logic — active and autonomous components   |
| `@Worker_agent` | Technical performer (I/O, UI, OS, rendering)      |
| `@Abstraction`  | Conceptual contract or system-level interface     |
| `@Model`        | Passive structure, pure data                      |
| `@Underst`      | A “thinking” method — where reasoning matters     |
| `@Long_action`  | A time-based or continuous process                |
| `@With_compat`  | Declares a safe compatibility link between agents |

When you read Clprolf code, you see **intent**, not just syntax.

---

#### V.5.b) The Architecture of the Snake Game

The game has five layers — all explicit:

```
SnakeGameScene (Abstraction)
 ├── SnakeImpl (Agent)
 ├── FoodExpertImpl (Agent)
 ├── SnakeGameSceneRendererImpl (Worker_agent)
 ├── SnakeWindowImpl (Abstraction)
 └── SnakeGamePanelImpl (Abstraction + Swing Nature)
```

Each one knows **exactly what it should know**, and **nothing more**.

For instance, the `FoodExpert` agent handles food positions —
but knows nothing about the UI, keyboard, or rendering:

```java
@Agent(Gender.EXPERT_COMPONENT)
public class FoodExpertImpl implements @Contracts FoodExpert {
    private @With_compat SnakeGameScene scene;

    public void positionFood() {
        Random random = new Random();
        ...
        food.setType(random.nextBoolean() ? FoodType.APPLE : FoodType.ORANGE);
        foodList.add(food);
    }
}
```

Meanwhile, the **Worker Agent** handles technical events and visual updates:

```java
@Worker_agent
public class SnakeGameSceneRendererImpl implements @Contracts SnakeGameSceneRenderer {
    private @With_compat SnakeGameScene scene;

    public SnakeGameSceneRendererImpl(@With_compat SnakeGameScene scene) {
        this.scene = scene;
        EventQueue.invokeLater(this); // Executed in AWT thread
    }

    @Override
    public void run() {
        window = new SnakeWindowImpl(this); // creates and starts rendering
    }
}
```

---

#### V.5.c) Understanding the Flow of Life — The Snake Logic

The magic happens in `SnakeImpl`.
It shows how **Clprolf models living behavior**:
sliding, growing, interacting — without spaghetti code.

```java
@Underst
@Long_action
protected void continueSliding() {
    if (this.lastSlidingType == SlidingType.STOPPED) return;

    SnakeLink newHeadLink = computeHeadLink(this.links.get(0));
    checkCollisionsForNewHead(newHeadLink);

    Food foodAtNewHeadPlace = this.scene.getFoodExpert().getFoodAt(newHeadLink.x, newHeadLink.y);
    updateBodyForSliding(foodAtNewHeadPlace != null, newHeadLink);
}
```

The `@Underst` annotation reminds that the logic involves **reasoning** —
not just a trivial mechanical step.
Each call represents an *intention* (“continue sliding”, “handle food”, “grow body”).
The structure itself communicates **meaning**.

---

#### V.5.d) Rendering Without Losing the Model

The UI never controls the game directly.
The window only refreshes every 20 ms —
and triggers the next logic step **inside the paint cycle**.

```java
@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawSnakes(g);
    drawFood(g);

    // End of long actions — one physics step every few frames
    this.gameWindow.getReal().getScene().getSnake().endLongActions();
    this.gameWindow.getReal().getScene().getSnake_two().endLongActions();
}
```

So the **render loop and game loop are naturally synchronized** —
without timers, threads, or complicated scheduling.

---

#### V.5.e) Loose Coupling by Design — Not by Effort

With `@With_compat`, compatibility is both explicit and enforced:

```java
public class SnakeImpl implements @Contracts Snake {
    protected @With_compat SnakeGameScene scene;
}
```

If a component tries to depend on something it shouldn’t —
Clprolf makes it visible, conceptually and syntactically.
You see the architecture *as you read the code.*

---

#### V.5.f) What We Learn from This Example

* You can build a **complete game architecture** without losing clarity.
* **Long actions** and **reasoning methods** bring life-like modeling.
* **Workers** act as true performers, keeping the domain clean.
* **Compatibility links** replace DI frameworks and reflection.
* The **render loop** stays synchronous, transparent, and elegant.

> The result? A Snake that’s both fun and architecturally flawless.

---

## VI) Annex — Grammar and Semantic Rules

This annex gathers the **formal components** of the Clprolf specification:
the full **grammar (ANTLR4)** and the **semantic and architectural rules** (`ARCH_*`).

These rules define how the compiler interprets declensions, inheritance,
contracts, genders, concurrency annotations, and forced exceptions.
Each rule has a unique identifier for traceability and automated testing.

> 💡 *The Annex serves as a reference for both compiler developers and framework contributors.
> It ensures that every semantic behavior in Clprolf can be tested, extended, and justified.*

---

### VI.1) 🧩 **ANNEX A — GRAMMAR (ANTLR4)**

This annex contains the complete Clprolf grammar, based on Java 8 and extended with Clprolf-specific keywords and constructs.

It defines the syntax used by the compiler to recognize:

* class and interface declarations (`agent`, `worker_agent`, `abstraction`, etc.)
* declensions and genders
* inheritance keywords (`nature`, `contracts`, `extends`)
* concurrency annotations (`@Long_action`, `@One_at_a_time`, etc.)

> 📘 *The grammar is written in ANTLR4 format and serves as the single source of truth for both the Clprolf compiler and any compatible parsers.*

---

#### clprolf GRAMMAR FROM JAVA SE 8 GRAMMAR(BNF-style from Oracle Site):

normalClassDeclaration
	:	classModifier* 'class_for'? clprolfDeclension Identifier typeParameters? superclass? superinterfaces? classBody
	;
	
clprolfDeclension
	: 
	'agent'
	| 'abstraction'
	| 'simu_real_obj'
	| 'worker_agent'
	| 'comp_as_worker'
	| 'model'
	| 'information'
	| 'indef_obj'
	;
	
normalInterfaceDeclaration
	:	interfaceModifier* clprolfInterfaceDeclension clprolfDeclension? Identifier typeParameters? extendsInterfaces? interfaceBody
	;
	
clprolfInterfaceDeclension:
	'compat_interf_version'
	|
	'compat_interf_capacity'
	|
	'compat_interf'
	|
	'version_inh'
	|
	'capacity_inh'
	;

bracketSync
    : '[' syncCard ',' methodCard ']'
    ;

syncCard
    : 'o' | 'f' | 'm'
    ;

methodCard
    : 'o' | 'm'
    ;
	
oneAtATimeModifier
: 'one_at_a_time' bracketSync?
;

methodModifier
	:	annotation
	|   oneAtATimeModifier
	|	'public'
	|	'protected'
	|	'private'
	|	'abstract'
	|	'static'
	|	'final'
	|	'synchronized'
	|	'native'
	|	'strictfp'
	|	'underst'
	|	'long_action'
	|	'prevent_missing_collision'
	|	'dependent_activity'
	;


turnMonitorModifier
    : 'turn_monitor' bracketSync?
    ;

fieldModifier
	:	annotation
	|   turnMonitorModifier
	|	'public'
	|	'protected'
	|	'private'
	|	'static'
	|	'final'
	|	'transient'
	|	'volatile'
	|	'with_compat'
	|	'for_every_thread'
	;

extendsInterfaces
	:	clprolfInterfExtends interfaceTypeList
	;
	
clprolfInterfExtends
	: 'extends'
	| 'nature'
	;

superclass
	:	'nature' classType
	;

superinterfaces
	:	'contracts' interfaceTypeList
	;

importModifier
	: annotation
	;

importDeclaration
	:	singleTypeImportDeclaration
	|	singleStaticImportDeclaration
	;

singleTypeImportDeclaration
	:	importModifier* 'import' clprolfInformationForJava* typeName ';'
	;
	
clprolfInformationForJava
	:	clprolfClassInformationForJava
	|	clprolfInterfaceInformationForJava
	;
	
clprolfClassInformationForJava
	:	'java_class' clprolfDeclension?
	|	clprolfDeclension
	;
	
clprolfInterfaceInformationForJava
    : 'java_interface' (clprolfInterfaceDeclension clprolfDeclension?)?
    ;

---

### VI.2) 🧩 Annex B — Compiler Semantic and Architectural Rules

This annex gathers all formal **semantic and architectural rules** enforced (or planned) by the Clprolf compiler and framework checker.

Each rule has a unique identifier (`ARCH_*`) for:

* precise compiler error or warning messages
* automated validation
* traceability between documentation and code

> 💡 *These rules form the semantic foundation of Clprolf —
> linking syntax, logic, and architecture into a unified, verifiable structure.*

---

#### **Rule Categories**

All Clprolf semantic rules are grouped by domain.
Each prefix defines a family:

* **ARCH A** — Class structure and inheritance
* **ARCH B** — Interfaces and contracts
* **ARCH C** — Genders and statics
* **ARCH D** — Concurrency and algorithmic semantics
* **ARCH E** — Forced annotations and exceptions
* **ARCH F** — General Language Rules
* **ARCH G** — Annotations

---

#### **ARCH A — Classes**

**ARCH A1 (classes):**
Declensions must match between parent and child classes.
Synonyms are considered equivalent.

**ARCH A2 (classes):**
For class inheritance, the `nature` keyword is mandatory.

**ARCH A3 (classes):**
No technical code is allowed inside an `agent` class or a system-type `abstraction`.
System abstractions such as `Connection` or `Socket` may only appear inside `worker_agent` classes,
unless explicitly forced with `@Forc_pract_code` on the class.
No semantic control is applied to this rule.

---
##### **ARCH_A4 — Semantic equivalence for `import java_class`**

All `import java_class` declarations must follow the **same semantic rules** as Clprolf class declarations.

> This means that a Java class imported into Clprolf is treated as a true Clprolf class.
> It must declare a **declension** (`agent`, `worker_agent`, `model`, `information`, or `indef_obj`),
> and may optionally declare a **gender** (`@Expert_component`, `@Static`, etc.).

The same architectural rules that apply to Clprolf class declarations also apply here —
including inheritance consistency and gender validity.

**Valid example:**

```java
@Expert_component
import java_class agent java.util.Timer;
```

**Invalid example:**

```java
@Agent_like_advice
import java_class agent java.util.Timer;   // ❌ Advice not allowed on class imports
```

**Semantic rule summary:**

> The compiler must perform the same semantic checks as for normal class declarations,
> raising identical errors (`ARCH_G1`, `ARCH_BA7`, etc.) when violations occur.

---

##### **ARCH-A5 (Classes – Synonym Continuity in Class Inheritance)**

When a class inherits from another of the same nature,
their **synonyms** should normally remain identical.

If they differ, this may indicate:

* a **change of perspective**,
* an **error**, or
* a **nature violation**.

The compiler emits a **warning** in such cases,
but inheritance remains **allowed**.

> The developer may explicitly **force** this situation using `@Forc_inh`,
> to indicate that the change of synonym is **intentional**.

This rule ensures **semantic continuity** between parent and child classes,
while maintaining the freedom to express **deliberate conceptual shifts**.

---

#### **ARCH B — Interfaces and Usage**

**ARCH BA1 (interfaces, usage):**
The `contracts` keyword is mandatory for all implementations.

**ARCH BA2 (interfaces, usage):**
A class using `contracts` must refer to a `version` interface, not to a class

**ARCH BA3 (interfaces, usage):**
A class cannot `contracts` a `capacity`.

**ARCH BA4 (interfaces, usage):**
A class cannot `contracts` multiple `version` interfaces simultaneously.

---

**ARCH BA5 (interfaces, usage):**
When a class `contracts` a `version_inh`, it must have the **same declension and synonym** as that `version_inh`.
For a `compat_interf_version`, if a class role is defined, the implementing class must **match it exactly** —
reflecting a **stricter compatibility contract rather than a natural hierarchy**.

> 💡 *This rule ensures structural coherence between classes and their version interfaces,
> whether the relationship is hierarchical (`version_inh`) or strictly contractual (`compat_interf_version`).*

---

**ARCH BA6 — `with_compat` in Grammar (Interfaces, Usage)**

The keyword `with_compat` may appear in front of **fields**, **local variables**, and **method parameters**.
These correspond respectively to `fieldModifier`, `variableModifier`, and parameter declarations in the grammar.

This ensures that compatibility markers are part of every variable declaration syntax.

---

**ARCH BA7 — Forbidden `with_compat` Positions (Interfaces, Usage)**

`with_compat` cannot be used:

* in **method return types**, or
* in the **interface type list** of a class or interface declaration.

These positions belong to inheritance and definition contexts,
not to compatibility usage.

---

**ARCH BA8 — Completeness of `with_compat` (Interfaces, Usage)**

The compiler must verify that **every field or variable modifier**
whose `unannType` or `catchType` is a **Clprolf interface**
includes the `with_compat` keyword.

In other words, `with_compat` must be used **everywhere it is required**,
to ensure semantic completeness and explicit contract awareness.

This guarantees that all interface-based variables and parameters
are explicitly marked as compatibility views.

---

**ARCH BA9 — Supported Interface Forms for `with_compat`**

`with_compat` can be used with **all Clprolf interface forms**, including:

* `compat_interf`
* `compat_interf_version`
* `compat_interf_capacity`
* `version_inh`
* `capacity_inh`

This includes both **compatibility** and **feature interfaces**,
since all interface forms in Clprolf represent **contract-based connections**
and support **loose coupling**.
`with_compat` may also be used with **semantic Java imports**
(i.e., `import java_interface` declarations enriched with a declension).

> ✅ `with_compat Animal a;` — `version_inh` interface
> ✅ `with_compat ClpConnection c;` — `compat_interf_version` interface

**Note:**
Java interfaces imported *without semantic information* are **not recognized as Clprolf interfaces**.
They cannot be used in `with_compat` expressions,
but they may still appear in inheritance declarations when explicitly forced (e.g. `@Forc_int_inh`).

This preserves full technical interoperability while maintaining semantic safety.

---

****ARCH BA10 — Meaning of `with_compat`**

The `with_compat` keyword expresses **loose coupling** —
it clearly indicates that the variable or parameter is typed
against a **compatibility interface**,
not against a concrete class.

By using `with_compat`, developers consciously declare
that they are working with a **contract**, not an implementation.
This encourages clear boundaries and high modularity.

> Example:
>
> ```java
> with_compat Animal a;   // works with the interface, not the class
> ```

Additionally, `with_compat` only accepts **Clprolf semantic interfaces** —
those declared in Clprolf or imported via `import java_interface`.
This ensures that all referenced interfaces carry **explicit semantics**
(role, advice, version, or capacity).

> This also means that `with_compat` acts as a subtle *semantic filter*,
> guaranteeing that every compatible type belongs to the Clprolf conceptual world.

---

##### **ARCH BB — Interface Structure**

**ARCH BB1 (interfaces)**

By default, a `compat_interf_version` **cannot inherit from another `compat_interf_version`**.
Each version defines a **unique and self-contained implementation contract**.

This rule ensures that “a version remains a version” — versions do not form hierarchies by nature.

However, this restriction can be **explicitly relaxed** when using the **Features for Interface Inheritance**:

* The interface must clearly declare its role (e.g., `@Agent`, `@Worker_agent`, etc.),
* and the inheritance must use the `nature` keyword (or `@Nature` annotation).

This transforms the extension into a **semantic inheritance** rather than a simple mechanical extension, preserving meaning and consistency.

Outside of this controlled case, inheritance between versions remains forbidden,
unless explicitly forced using `@Forced_int_inh`.

> **Summary:**
>
> * ✅ Allowed: inheritance via *Features for Interface Inheritance* (role + nature explicitly defined).
> * ⚠️ Forbidden: direct version-to-version inheritance without features.
> * 🚫 Never implicit — must always be declared and justified.

---

**ARCH BB2 (interfaces):**
A `capacity` interface cannot inherit (`nature`) from a `version`.
`capacity_inh` and `compat_interf_capacity` are treated identically in all semantic checks.

**ARCH BB3 (interfaces):**
A `version` interface inheriting a `capacity` must respect the `advice` of that capacity in its declension.

**ARCH-BB4 (Interfaces – Target Declension Requirement)**

A **`version_inh`** interface **must declare** a **target declension** (such as `agent`, `worker_agent`, `model`, `information`, or `indef_obj`).
This declaration explicitly defines the **intended nature** of the classes that will implement it and ensures full semantic traceability within the inheritance hierarchy.

A **`compat_interf_version`**, on the other hand, **may declare** a target declension, but it remains **optional**.
When it does, the interface behaves as a **role-bound compatibility interface**, maintaining its compatibility purpose while aligning semantically with feature-like interfaces.

> In short:
> – `version_inh` → **target declension required**.
> – `compat_interf_version` → **target declension optional**, for compatibility or wrapper contexts.

**ARCH BB5 (interfaces):**
An interface that inherits must use `nature` if it is a `version_inh` or `capacity_inh`.
It must use `extends` if it is a `compat_interf_version` or `compat_interf_capacity`.

**ARCH BB6 (interfaces):**

**Advice annotations are applied only above capacities** — either `version_inh` or `compat_interf_capacity`.
They are *not allowed* on `version` interfaces or on classes.

**ARCH_BB7 (interfaces) — Semantic Rules for `import java_interface`**

When a **semantic import** is used with `import java_interface`,
the declaration must follow the **same semantic logic** as native Clprolf interface declarations.

This means that when a semantic layer is added,
it must remain coherent and respect Clprolf’s architectural principles.

**Possible semantic enrichments:**

* A **declension of interface** may be given (`compat_interf`, `compat_interf_version`, `version_inh`, `compat_interf_capacity`, or `capacity_inh`).
* A **class role** (`agent`, `abstraction`, `worker_agent`, etc.) may also be specified.
* An **advice** (`@Agent_like_advice`, `@Worker_like_advice`) may optionally indicate a preferred target world.

All these additions are **optional**, but if present,
they must respect the same semantic consistency rules as native declarations.

**Examples:**

```java
// Minimal import (no semantic enrichment)
import java_interface java.util.List;

// Semantic imports
import java_interface version_inh abstraction java.util.List;
@Worker_like_advice
import java_interface capacity_inh java.io.Serializable;
```

**Rule summary:**

> The compiler validates semantic imports exactly like native interface declarations,
> but non-semantic imports remain valid and unaltered.

---

💡 **Philosophy:**
Clprolf lets developers enrich Java imports semantically when needed,
without ever forcing them to do so.
It’s not about strictness — it’s about meaning clarity, when you choose to express it.

---

##### **[ARCH_BB8] — Default Role Interpretation for Neutral Capacities**

A `compat_interf_capacity` declared without advice remains neutral in its definition.
However, when it is **used by a version that declares a role** (for example `@Agent` or `@Worker_agent`),
it is **interpreted as a role-bound capacity** — agent-like by default.

This interpretation does not alter the capacity itself;
it only reflects how it is perceived and validated in a given context.

> **Summary:**
>
> * ⚪ Neutral when isolated.
> * 🟢 Interpreted as role-bound (agent-like by default) when used within a role.
> * 🧩 Context determines the semantic reading, not the declaration.

---

##### **[ARCH_BB9] — Role Declaration Requirement for Neutral Versions**

If a `compat_interf_version` without any declared declension
(`agent`, `worker_agent`, `model`, `information`, or `indef_obj`)
contracts a `compat_interf_capacity` that carries an explicit advice
(`@Agent_like_advice`, `@Worker_like_advice`, etc.),
then the compiler must raise a **semantic error**:

> “A neutral version cannot contract a role-bound capacity.
> Declare a role or remove the advice from the capacity.”

**Summary:**

* ✅ Role-declared version ↔ Roleful capacity → OK
* ⚪ Neutral version ↔ Neutral capacity → OK
* 🚫 Neutral version ↔ Roleful capacity → **Error (neutral version lacks class role)**

---


##### **[ARCH_BB10] — Semantic equivalence between role-declared compat_interf_version and features**

A `compat_interf_version` belongs by definition to the world of versions.
When it declares a class role (`agent`, `worker_agent`, `model`, `information`, or `indef_obj`),
it becomes **semantically equivalent** to a version defining *features*,
except for the possibility of using `extends`,
which reminds that it still belongs to the structural world of versions.

---

**[Addition to ARCH_BB10] — Inheritance restriction for role-declared versions**

A role-declared `compat_interf_version` **cannot** inherit (`extends`) another version,
since each role defines a closed world.

> The only exception is the explicit use of `@Forc_int_inh`,
> which authorizes inheritance between incompatible worlds.
> The `extends` clause remains syntactically allowed,
> but semantically valid only under this forced condition.

---

##### **[ARCH_BB11] — Forced inheritance allowed for features in interfaces**

The annotation `@Forc_inh` may appear in an interface definition **only when that interface defines features.**

> This usage corresponds to the specific case of version interfaces,
> where structural inheritance between worlds can be explicitly forced.
> In all other contexts, `@Forc_inh` is forbidden.

> ⚠️ A `compat_interf_version`, whether neutral or role-declared,
> **cannot use `@Forc_inh`.**
> Versions are independent entities and cannot be chained under normal circumstances.
> However, in the **exceptional case** where a `compat_interf_version` must inherit another version,
> this inheritance must be explicitly forced with `@Forc_int_inh`,
> since it represents a **conceptual** (not structural) link.

**Summary :**

* ✅ `@Forc_inh` → allowed **only** in interfaces with features (structural inheritance).
* 🚫 `@Forc_inh` → forbidden elsewhere, including in all `compat_interf_version`.
* ⚙️ `@Forc_int_inh` → required for **conceptual inheritance** between versions or capacities.

---

**ARCH-BB12 (Interfaces – Nature Consistency for Target Roles)**

A version interface that declares a **target class role** must ensure that this target role has the **same declension** as the version (or versions) it inherits from.

For example, a `version_inh agent` cannot inherit from a `version_inh worker_agent`.
Such inheritance is **forbidden**, unless explicitly forced using `@Forc_inh`.

> This rule ensures that both inheritance and class role remain aligned in nature.

---

**ARCH-BB13 (Interfaces – Advice Consistency Between Capacities)**

When a **capacity interface** inherits from another capacity interface,
each parent capacity must have the **same advice** (`@Agent_like_advice` or `@Worker_like_advice`).

> This preserves the conceptual alignment between all capacities within a hierarchy.

---

**ARCH-BB14 (Interfaces – Synonym Alignment in Inheritance)**

A version interface should normally **use the same synonym** as the versions it inherits from.

For instance:

* a `compat_interf_version` should inherit from one or several `compat_interf_version`,
* a `version_inh` should inherit from one or several `version_inh`.

If a difference occurs, it may indicate:

* a deliberate **change of perspective**,
* a **design mistake**, or
* a **nature violation**.

In such cases, the compiler issues a **warning**, not an error.
The same rule applies to capacity interfaces (`capacity_inh` vs `compat_interf_capacity`).

> What matters is preserving the same **declension**, not necessarily the same synonym.

---

### **ARCH-BB15 (Interfaces – Synonym Alignment for Target Roles)**

When a version interface declares a **target class role**,
the target role should normally keep the **same synonym** across the inheritance chain.

If a synonym change is detected, this may indicate:

* a **perspective shift**, or
* a **potential violation of nature**.

The compiler emits a **warning** in such cases,
but the inheritance remains **authorized**.

> The developer may explicitly **force** this situation using `@Forc_int_inh`,
> to indicate that the synonym change is **intentional**.

This rule ensures **semantic alignment** of target roles across version interfaces,
while preserving the freedom to express **deliberate conceptual variations**.

---

### **ARCH-BB16 (Interfaces – Advice Neutrality of Capacities)**

A `compat_interf_capacity` is **advice-neutral** by default.
It defines a **shared functional ability** between multiple version interfaces,
and carries no `@Advice` on its own.

However, when a capacity is used **together with a semantic `compat_interf_version`**,
it must declare an **appropriate advice**, consistent with the role of that version
(as usual in Clprolf’s semantic coherence rules).

> A capacity remains neutral unless it collaborates with a version interface that defines a role-based advice.

---

#### **ARCH C — Genders and Statics**

**ARCH CA1 (genders):**
Declaring a gender on a class is optional.
Genders are annotations that serve mainly as documentation.

**ARCH CA2 (genders):**
Interfaces cannot have genders — including `@Static`.

**ARCH CA3 (genders):**
No gender inheritance is checked for classes, except for `static` ones
(excluding `abstraction`, which remains neutral).

**ARCH CA5 (genders):**
`@Active_agent` is the only combinable gender.
It may only be combined with `@Static`, never with
`@Human_expert`, `@Expert_component`, `@Human_expert_static`, or `@Expert_component_static`.

**ARCH CA6 (genders):**
`@Active_agent` may only appear on `agent` declensions
(not on `simu_real_obj` nor on `abstraction`).

**ARCH CA7 (genders):**
`@Active_agent` cannot appear on a `worker_agent`.

---

##### **ARCH CB — Static Behavior**

**ARCH CB1 (genders, static):**
The three static genders (`@Static`, `@Expert_component_static`, `@Human_expert_static`)
are equivalent — for the compiler, they are all treated as `static`.

**ARCH CB2 (genders, static):**
Static classes must contain at least one static method.

**ARCH CB3 (genders, static):**
Static classes must contain **more public static methods** than non-static ones.

**ARCH CB4 (genders, static):**
A `static` class may inherit only from another `static` class,
and a non-static class may inherit only from a non-static class.
The opposite can be explicitly forced using `@Forc_inh`.

**ARCH CB5 (genders, static):**
Only the plain `@Static` gender (no expert variant) is allowed on `worker_agent` classes.

**ARCH CB6 (genders, static):**
`model` and `information` classes may contain no methods except constructors and those marked with `@Forc_pract_code`.
Such methods are considered small practical helpers, not domain logic.

---

**ARCH CB7 (genders, static):**

Declaring a **static gender** — whether `@Static`, `@Expert_component_static`, or `@Human_expert_static` — is optional.
However, when any of these genders is used, the class must fully comply with **all static rules** (`ARCH_CB1` to `ARCH_CB4`).
No compiler check enforces the presence of a static gender; it remains a semantic choice by the developer.

---

#### **ARCH D — Concurrency and Algorithmic Semantics**

**ARCH DA1:**
Warning if no `synchronized` is found in a `one_at_a_time` method (either on the method or inside a synchronized block).
Other synchronization mechanisms are not yet analyzed.

**ARCH DA2:**
Warning if a `dependent_activity` method is not marked as `one_at_a_time`.

**ARCH DA3:**
Warning if a field marked `for_every_thread` lacks the `volatile` modifier.

**ARCH DB1:**
Each `long_action` must consist of three methods:
two public (the starter and `endLongActions()`), and one non-public continuation (`continueActionName`).

**ARCH DB2:**
Warning if no boolean field annotated `@Long_action` exists for each trio of `long_action` methods.
Example: six methods → two boolean fields expected.

----

##### **ARCH-DC — Rules for the `underst` Modifier**

---

###### **ARCH-DC1 — Invalid Context for `underst`**

`underst` is only allowed in the **declension `agent`**,
including all of its **synonyms**:

* `agent`
* `abstraction`
* `simu_real_obj`

If `underst` appears anywhere else:

> **Warning:** `underst` is only allowed in `agent` (or its synonyms `abstraction` and `simu_real_obj`).

Forbidden contexts:

* `worker_agent`
* *(`model` and `information` have no methods and require no rule)*

---

###### **ARCH-DC2 — `underst` Forbidden in Compatibility Interfaces**

`underst` cannot appear in any compatibility interface.

> **Error:** `underst` is not allowed in compatibility interfaces.

---

###### **ARCH-DC3 — Class-Level Reporting**

For every class of the `agent` declension (including synonyms),
the compiler performs an *underst presence check*:

* If the class contains at least one `underst` method →
  It is included in the global *underst report*.

* If the class contains **no** `underst` methods →
  The compiler may note:
  *“This component contains only intuitive logic.”*
  (This is positive and never produces a warning.)

---

##### ARCH-DD — Advanced Synchronization Features

The following rules apply only when the optional bracket form
`one_at_a_time[X, Y]` or `turn_monitor[X, Y]` is used.
These advanced synchronization features extend (but do not replace)
the basic concurrency semantics defined in ARCH DA–DC.
They enable structural analysis, group reconstruction,
and explicit modeling of complex concurrency patterns.

---

**Bracketed Synchronization Coherence (General Rule)**

**When the bracketed form `one_at_a_time[X, Y]` or `turn_monitor[X, Y]` is used,
the system must ensure global coherence between method declarations and their associated monitors.
This rule defines the structural consistency of bracketed synchronization without mandating specific micro-cases.**

This principle guarantees that:

* bracketed methods and monitors use matching `[X,Y]` signatures,
* concurrency groups remain structurally well-formed,
* and the system preserves the intended semantics of declarative synchronization.

**The detailed checks performed by implementations may vary,
but the structural coherence of bracketed synchronization is mandatory.**

---

###### **Group Extraction Rule**

**For every method declared with `one_at_a_time[X, m] using M`,
the compiler must identify all methods in the same class that reference the same turn_monitor `M`
and are also declared using the same `[X,m]` cardinalities.
These methods form the synchronization group of monitor `M`.**

If no other method matches this pattern,
the group is incomplete and the compiler may emit an error or warning
(depending on the implementation’s strictness).

---

**Example Rule — Group Identification**

A method declared as `one_at_a_time[X, m] using M`
belongs to the synchronization group of monitor `M`.
All methods using the same monitor `M` with the same `[X,m]` cardinality
form this group.
A group `[X,m]` must contain at least two methods.

---
###### **Dependent Activity Derivation**

A `dependent_activity` is meaningful only when the involved methods participate in a multi-method synchronization group.
Therefore, every method taking part in a dependency must declare:

```
one_at_a_time[X, m]
```

Because `[X,m]` groups are structurally defined by shared turn monitors,
a compiler can infer potential `dependent_activity` relations
by observing methods that:

* use the same turn_monitor, and
* share the same `[X,m]` cardinality.

Explicit `dependent_activity` declarations simply annotate
a relationship that is already structurally valid.

---

##### ⭐ ARCH-DE — `prevent_missing_collision` Semantic Rules

---

###### **ARCH-DE1 — Presence Rule (Required in every `simu_real_obj`)**

Every `simu_real_obj` **must contain at least one method** annotated with
`prevent_missing_collision`.

If none is present:

> **Warning ARCH-DE1:** This `simu_real_obj` has no `prevent_missing_collision` method.
> A collision-handling entry point may be missing.

---

###### **ARCH-DE2 — Exclusivity Rule (Only valid inside `simu_real_obj`)**

The `prevent_missing_collision` modifier **may only be used inside `simu_real_obj` classes**.

If used elsewhere:

> **Warning ARCH-DE2:** The `prevent_missing_collision` modifier is only valid inside `simu_real_obj` classes.

---

###### ARCH-DE3 — Collision-Related Logic Rule

A method annotated with `prevent_missing_collision` is expected to contain
**at least one conditional structure** (`if`, `switch`, or equivalent),
as collision detection normally involves evaluating a condition before updating state.

If no conditional structure is detected:

> **Warning ARCH-DE3:** This `prevent_missing_collision` method contains no conditional test.
> Collision detection may be missing.

This rule is heuristic:
the compiler does not enforce collision patterns,
but warns when the method does not resemble a typical collision-checking routine.

---

#### **ARCH E — Forced Annotations and Exceptions**

These rules define how forced annotations allow exceptions to normal inheritance or role constraints,
while keeping the programmer’s intent explicit and traceable.

---

##### **ARCH EA — Forced Class Inheritance and Practical Code**

**ARCH EA1:**
`@Forc_inh` may be applied on a class or directly before the inherited type (`TYPE` or `TYPE_USE`).

**ARCH EA2:**
`@Forc_inh` allows class inheritance to be explicitly forced
—for example, an `agent` may inherit from a `worker_agent`.

**ARCH EA3:**
`@Forc_pract_code` allows small portions of worker-level code inside an `agent` class.

**ARCH EA4:**
`@Forc_pract_code` also allows methods inside `model` or `information` classes.
These are considered “practical helper” methods.

**ARCH EA5 — Forced Inheritance from External Classes**

A class inheriting from an `indef_obj` or from a **Java class**
must explicitly force this inheritance with `@Forc_inh`.

> ✅ `nature @Forc_inh java.net.Socket;`

The Clprolf compiler recognizes external Java classes
through `java_class` imports and never parses their internal structure.
This rule enforces visibility and intent when bridging domains.

---

**ARCH EA6 — Forced Contracts with External Interfaces**

A class that `contracts` either a `compat_interf`
or a **Java interface** imported via `java_interface`
must explicitly use `@Forc_int_inh`.

> ✅ `contracts @Forc_inh java.util.Comparator;`

This preserves explicitness in all external relationships,
ensuring that no implicit compatibility contract is assumed.

---

**ARCH EA7:**
`indef_obj` classes may inherit from any type of interface freely, without forcing.

---

### **ARCH-EA8 (Forcing – Synonym Warning in Class Inheritance)**

When two classes share the **same declension** but use **different synonyms**,
the compiler normally emits a **warning** to indicate a possible semantic drift.

This warning can be **explicitly forced** using the `@Forc_inh` annotation.
The annotation may be applied either at the **class declaration level**,
or directly before the **inherited type**, for greater precision.

Example in pure Clprolf:

```clprolf
public agent Car nature @Forc_inh AbstractionVehicle {
   (...)
}
```

> The use of `@Forc_inh` indicates that the synonym difference is **intentional**,
> and that the inheritance is **consciously accepted** by the developer.

This forcing rule ensures that all synonym differences remain **visible yet flexible**,
preserving both **semantic awareness** and **creative freedom** in class hierarchies.

---

##### **ARCH EB — Forced Interface Inheritance and Contracts**

**ARCH EB1:**
`@Forc_int_inh` may be applied on a class, an interface, or directly before the contracted or inherited type.
If applied on a class, it affects all its contracts; if on an interface, all its inherited types.
It can also target specific types directly inside `nature`, `extends`, or `contracts`.

**ARCH EB2:**
`@Forc_int_inh` allows a class to `contracts` multiple `version` interfaces.
In this case, it must be declared at the class level.

**ARCH EB3:**
`@Forc_int_inh` allows a class to `contracts` a `capacity` interface.

**ARCH EB4:**
`@Forc_int_inh` allows a `compat_interf_version` interface to inherit from several `version` interfaces.
No need to use it for `version_inh`, which is already allowed.
It must be declared at the interface level.

**ARCH EB5:**
`@Forc_int_inh` allows a `capacity` interface to inherit from a `version` interface.
It must be declared at the interface level.

**ARCH EB6:**
`@Forc_int_inh` allows a class to implement a `version_inh` interface that recommends another declension.

**ARCH EB7:**
A **static** class that wants to inherit from a **non-static** class, or vice versa,
must force the inheritance using `@Forc_inh`.

**ARCH EB8 — Forced Inheritance from External Interfaces**

An interface that inherits from a `compat_interf`
or from a **Java interface imported via `java_interface`**
must use `@Forc_int_inh`.

> ✅ `nature @Forc_int_inh java.util.List;`

This makes the intent explicit whenever Clprolf interfaces extend
interfaces defined outside the Clprolf semantic domain.

---

**ARCH EB9:**
`compat_interf` interfaces may inherit from any interface type without forcing.

---

> 💡 **Principle — Explicit Control Over Exceptions**
> Forced annotations never act implicitly.
> They always make the developer’s intent visible and deliberate.
> Even when forcing inheritance or mixing roles,
> the declared **declension** remains the primary semantic identity of the component.

---

**ARCH-EB10 (Interfaces – Compatibility of Target Roles in Version Inheritance)**

When a version interface declares a **target class role** and inherits from another version,
it must inherit only from a version with a **compatible target class role**,
unless explicitly forced using `@Forc_inh`.

> Note: `@Forc_inh` is used here instead of `@Forc_int_inh`,
> because this constraint applies to **class role inheritance**, not to interface inheritance itself.

---

### **ARCH-EB11 (Forcing – Synonym Warning in Interface Inheritance)**

When two **version interfaces** share the **same declension**
but use **different synonyms** (for example, `compat_interf_version` and `version_inh`),
the compiler emits a **warning** to highlight the semantic difference.

This warning can be **explicitly forced** using the `@Forc_int_inh` annotation.
The annotation may be applied either at the **interface declaration level**,
or directly before the **inherited interface**, for precise control.

Example in pure Clprolf:

```clprolf
public compat_interf_version agent Connection nature @Forc_int_inh VersionConnection {
   (...)
}
```

> The use of `@Forc_int_inh` indicates that the synonym difference is **intentional**
> and that the inheritance is **deliberately accepted** by the developer.

If the mismatch concerns **target roles** (for example, `agent` vs `worker_agent`),
the forcing must instead be performed with **`@Forc_inh`**,
as for target-role or declension errors.

This rule ensures that **synonym differences between interface declensions**
remain **visible, explicit, and controllable**,
while preserving the developer’s full **freedom of perspective**.

---

### ⚙️ **ARCH F — General Language Rules**

##### **ARCH F1 — Fully Qualified Imports**

All **Java and Clprolf types** must be fully qualified in import statements.
The wildcard character `*` is strictly forbidden.

> ✅ `import org.clprolf.framework.java.Worker_agent;`
> ❌ `import org.clprolf.framework.java.*;`

This rule guarantees clear dependency mapping and prevents ambiguous references.

---

##### **ARCH F2 — Java Types Are Not Parsed**

Java types are **never parsed** by the Clprolf compiler.
They are treated as **external entities**, independent of the internal semantic engine.
Therefore, any Java version can be used for external `.java` files.

This preserves full interoperability between Clprolf and any Java ecosystem.

---

##### **ARCH F3 — Internal Java Reference** (minor rewording)

The Clprolf compiler embeds **Java 8 syntax and semantics**
for Java code directly written inside `.clp` files.
External Java code, identified by `java_class` or `java_interface` imports,
may target any later version of Java and is not parsed.

This guarantees internal stability and external flexibility.

---

##### **ARCH F4 — Typed Java Imports**

All external Java imports must explicitly declare their nature:

```java
import java_class fully.qualified.ClassName;
import java_interface fully.qualified.InterfaceName;
```

Examples:

```java
import java_interface java.util.List;
import java_class java.util.ArrayList;
import java_interface java.awt.event.ActionListener;
```

This explicit typing clearly separates Clprolf symbols from Java entities
and ensures that the compiler never needs to guess their origin or structure.

---

##### **ARCH F5 — Mandatory Typing for Java Imports**

Every Java type used in a `.clp` file must be declared through a **typed import**
(`java_class` or `java_interface`).

If a non-typed import fails to resolve to a known Clprolf declaration,
the compiler raises an **ARCH-F5 error**:

> ❌ *“Unknown Clprolf type — use java_class or java_interface for external Java types.”*

This rule enforces a strict semantic boundary between
the Clprolf domain and the external Java domain,
while keeping interoperability transparent and safe.

---

💎 *Together, these rules (F1–F5) establish the architectural foundation
of Clprolf’s clarity: every imported entity is known, named, and declared for what it is.*

> **Clprolf does not merge with Java — it cooperates with it,
> through explicit, verifiable boundaries.**

---

##### **ARCH F6 — Semantic Imports (Extended Form)**

A Java type (`java_class` or `java_interface`) may include a **semantic declaration**
to define how it behaves inside Clprolf.
It may also be preceded by **Clprolf annotations**, such as genders or advices,
allowing the imported type to carry the same semantic richness
as a native Clprolf declaration.

From that moment, the imported element is **no longer treated as a Java entity**,
but as a **fully integrated Clprolf type**,
subject to all standard semantic and architectural rules.

---

###### **Syntax**

```java
[@ClprolfAnnotation ...]
import java_class [declension role] fully.qualified.Name;

[@ClprolfAnnotation ...]
import java_interface [declension role] fully.qualified.Name;
```

---

##### **Examples**

```java
import java_interface version_inh abstraction java.util.List;
@Expert_component
import java_class abstraction java.net.Socket;
@Active_agent
import java_class agent java.util.Timer;
```

After import, these types are recognized and handled **exactly like native Clprolf types**,
including gender and advice annotations.

| Imported type     | Declension    | Role                | Behavior                                                                 |
| ----------------- | ------------- | ------------------- | ------------------------------------------------------------------------ |
| `java.util.List`  | `version_inh` | `abstraction`       | Acts as a Clprolf abstraction; valid in `with_compat`, `contracts`, etc. |
| `java.net.Socket` | `abstraction` | `@Expert_component` | Treated as an expert technical abstraction, usable within worker_agents. |
| `java.util.Timer` | `agent`       | `@Active_agent`     | Behaves as a living agent, capable of scheduled activity.                |

---

##### **Rationale**

This rule allows developers to **map external Java types into the Clprolf ecosystem**
while preserving their semantics and architectural intent.
Each imported type becomes a **true Clprolf entity**,
participating in the same verification process as native classes and interfaces.

This mechanism effectively makes **Java libraries appear as Clprolf-native libraries**,
endowed with explicit roles, genders, and advice annotations.

> 🧠 *Clprolf does not parse Java — it interprets it.*
> Through semantic imports, external types become part of Clprolf’s living structure.

---

##### **ARCH F7 — Consistent Semantic Imports Across Compilation Units**

If a Java type (`java_class` or `java_interface`) is imported
in multiple Clprolf source files with **different declensions, roles, or annotations**,
the compiler raises an **ARCH-F7 error**.

This ensures a single, coherent semantic identity for each external type.

> ❌ Example (error):
>
> ```java
> // In FileA.clp
> @Active_agent
> import java_class agent java.util.Timer;
>
> // In FileB.clp
> import java_class worker_agent java.util.Timer;  // Error (ARCH-F7)
> ```

> *Rationale:*
> Every imported Java type must keep a unique and consistent semantic definition
> throughout the project.
> This rule guarantees architectural clarity across all source files.

---

💎 *Together, F6 and F7 make Clprolf’s integration with Java complete:
external code becomes semantically alive, unified, and verifiable.*

##### ⚖️ **F8 — Coherence of Imported Java Types**

**Rule ID:** ARCH-F8
**Name:** Coherence of Imported Java Types
**Scope:** Java Interoperability, Import Declarations

---

##### **Description**

When a `java_class` or `java_interface` is imported, its **declared kind** (class or interface) must remain consistent with the way it is used throughout the Clprolf source code.

False declarations — claiming that a Java class is an interface, or that a Java interface is a class — are detected by the compiler.

This verification applies automatically during the use of these imported types in:

* **`contracts`** clauses,
* **`nature`** inheritance declarations,
* and **`with_compat`** variable declarations.

The compiler will reject incoherent usages such as:

```java
import java_class agent java.util.List; // ❌ List is an interface in Java

public agent MyAgent contracts List;    // Detected: cannot contract a class
```

and also:

```java
import java_interface version_inh worker_agent java.util.ArrayList; // ❌ ArrayList is a class

public worker_agent MyWorker nature ArrayList; // Detected: cannot inherit from an interface
```

---

##### **Goal**

Ensure that imported Java types maintain **semantic coherence** between their Clprolf declaration and their actual role in the language.
Prevent any inconsistency in inheritance, contracts, and compatibility usage.

This rule makes false declarations detectable **before code generation**, ensuring that Clprolf remains logically sound and self-verifying.

---

##### **Summary**

> **ARCH-F8** — Imported Java types must keep a consistent declared kind (`java_class` or `java_interface`) according to their actual usage.
> Any false declaration will be detected during semantic validation (especially in `contracts`, `nature`, and `with_compat`).

---

#### ⚖️ RULES G — Annotations

---

##### **ARCH_G1 — Control of gender annotations**

Gender annotations (`@Expert_component`, `@Human_expert`, `@Static`, etc.)
may be applied **only to classes** or to **Java class imports** (`import java_class`).

> 💡 This means that any gender annotation placed on an interface or on a `java_interface` import is semantically invalid.
> The compiler must raise **ARCH_G1** if a gender annotation is found anywhere else.

**Valid examples:**

```java
@Static
public worker_agent Launcher { }

@Expert_component
import java_class agent java.util.Timer;
```

**Invalid examples:**

```java
@Static
import java_interface version_inh java.util.List;   // ❌ gender not allowed
@Human_expert
public version_inh agent Connection { }             // ❌ gender on an interface
```

---

##### **ARCH_G2 — Control of advice annotations**

Advice annotations (`@Agent_like_advice`, `@Worker_like_advice`)
may be applied **only to capacity interfaces** (`compat_interf_capacity`)
or to **Java interface imports** (`import java_interface`).

> 💡 This ensures that advice annotations are used exclusively in the context of *capacity interfaces*,
> either declared in Clprolf or imported from Java.
> The compiler must raise **ARCH_G2** if an advice annotation is found on a class or on a `java_class` import.

**Valid examples:**

```java
@Agent_like_advice
public compat_interf_capacity Eatable { }

@Worker_like_advice
import java_interface capacity_inh java.io.Serializable;
```

**Invalid examples:**

```java
@Worker_like_advice
public agent Animal { }                // ❌ advice on a class
@Agent_like_advice
import java_class agent java.util.Timer; // ❌ advice on a java_class import
```

---

**ARCH_G3** — *Control of the `@Long_action` annotation*
This annotation may be applied **only to a field** (field modifier).
Even though the annotation is technically attached to the field modifier, the compiler must still verify its proper placement.

**ARCH_G4** — *Control of the `@Forc_pract_code` annotation*
This annotation may be applied **only to classes**.

**ARCH_G5** — *Control of the `@Forc_inh` annotation*
This annotation may be applied either:

* **on a class**, or
* **just before the classType** in a class inheritance clause (`nature`).

**ARCH_G6** — *Control of the `@Forc_int_inh` annotation*
This annotation may be applied either:

* **on an interface**, or **just before an interfaceType** in an interface inheritance clause,
* **on a class**, or **just before an interfaceType** in a class contract clause (`contracts`).

**ARCH-G7 (language annotations – marker form)**

Every Clprolf language annotation is a **marker annotation** only —
it contains **no attributes, parameters, or values**.
This differs from the framework annotations, which may define attributes or configuration metadata.

> 💡 *Clprolf annotations express meaning, not configuration.*

---

##### **ARCH-G8 (language annotations – naming and imports)**

All Clprolf annotations are written **without package names**
and **require no imports**.
Only the simple name of the annotation is used.

✅ *Example – valid usage:*

```clprolf
@Expert_component
public agent Engine { }
```

❌ *Invalid usage:*

```clprolf
@org.clprolf.language.annotations.Expert_component   // forbidden
import org.clprolf.language.annotations.Expert_component;  // forbidden
```

> 💡 *Annotations belong to the language, not to its libraries.*

---

##### **ARCH-G9 (language annotations – name conflict prevention)**

Within a single compilation unit,
no imported type (Java or Clprolf) may share the same **name**
as a Clprolf annotation **used** in that unit.

✅ *Allowed:*

```clprolf
import org.me.Static;  // OK — if @Static is not used in this file
```

❌ *Error:*

```clprolf
import org.me.Static;  // ❌ Conflict
@Static
public agent Service { }
```

> 💡 *A file cannot import what the language already owns.*

---

**ARCH-G10 (language annotations – no source files)**

Clprolf language annotations **do not exist as source files**.
They are embedded in the compiler’s semantic layer
and cannot be modified, replaced, or shadowed by user code.

> 💡 *No source, no risk.*

---

##### **ARCH-G11 (language annotations – code generation)**

Language annotations are **not generated** in Java output.
They are removed during code generation once their meaning has been processed.

✅ *Example – generated Java output:*

```java
public class Engine { }
```

> 💡 *What guides design disappears after doing its job.*

---

##### **ARCH-G12 (language annotations – synonyms)**

Every Clprolf annotation has a **synonym** prefixed with `@Clp_`.
These synonyms are semantically equivalent and may be used at any time
as stylistic alternatives or to avoid conflicts.

✅ *Examples:*

```clprolf
@Clp_Static
@Clp_Expert_component
```

> 💡 *Freedom without ambiguity.*

---

##### **ARCH-G13 (language annotations – synonym import restriction)**

No imported type may begin with the prefix `Clp_`
if the corresponding Clprolf annotation is used in the same compilation unit.
This ensures that the synonym namespace remains exclusive to the language.

❌ *Invalid example:*

```clprolf
import org.me.Clp_Static;   // forbidden if @Static is used
@Static
public agent Engine { }
```

---

**ARCH-G14 (language annotations – categories and roles)**

Clprolf language annotations belong to four categories:
**Genders, Advices, Forcing, and Special.**
Each serves a distinct semantic purpose within the language.

* **Genders** refine the interpretation of agents.
  They are **always optional**, including `@Static`.
  Examples: `@Expert_component`, `@Human_expert`, `@Static`.

* **Advices** define guidance for capacity interfaces.
  The default advice is `@Agent_like_advice`.

* **Forcing** annotations exist for special cases where
  an interface or capacity must explicitly enforce a constraint.
  They are rarely required and should be used only in specific
  capacity interface scenarios.

* **Special** annotations introduce optional semantic hints,
  such as `@Long_action`, which signals a boolean property or
  extended behavior without altering structure.

> 💡 *Genders add nuance, advices define direction,
> forcing ensures precision, and special annotations mark exceptions.*

---


✅ *This annex now defines the full set of semantic and architectural rules used by the Clprolf compiler and framework checker.*
It ensures that every exception, inheritance, or structural decision in Clprolf is explicit, justified, and traceable.

---

### 🧩 VI.3) ANNEX C — RESERVED KEYWORDS


#### Keywords in Clprolf

Clprolf defines a **minimal set of 34 keywords**.
They are divided into two groups:

* **22 core keywords** (declensions, interface declensions, interoperability, method modifiers, and field modifiers), which form the backbone of the language.
* **12 annotations** (genders, advices, forcing), which are optional refinements that add perspective and specialization.

This structure makes Clprolf both **minimal and flexible**: easy to learn and memorize, yet expressive enough to capture complex system designs.

---

##### Declensions (class roles) – 8

* `agent`
* `abstraction`
* `simu_real_obj`
* `worker_agent`
* `comp_as_worker`
* `model`
* `information`
* `indef_obj`

---

##### Interface Declensions – 5

* `compat_interf_version`
* `version_inh`
* `compat_interf_capacity`
* `capacity_inh`
* `compat_interf`

---

##### Java Interoperability – 2

* `java_class` — declares that an imported type is a Java class
* `java_interface` — declares that an imported type is a Java interface

These two keywords allow semantic integration of Java types inside Clprolf import declarations and enable full verification of interoperability.

---

##### Method Modifiers – 4

* `underst`
* `one_at_a_time`
* `dependent_activity`
* `long_action`

---

##### Field Modifiers – 2

* `with_compat`
* `turn_monitor`
* `for_every_thread`

---
##### Annotations – Genders – 6

* `@Human_expert`
* `@Expert_component`
* `@Active_agent`
* `@Static`
* `@Human_expert_static`
* `@Expert_component_static`

---

##### Annotations – Advices – 2

* `@Agent_like_advice`
* `@Worker_like_advice`

---

##### Annotations – Forcing – 3

* `@Forc_pract_code`
* `@Forc_inh`
* `@Forc_int_inh`

---

##### Annotations – Special – 1

* `@Long_action`

---

✅ **Total: 34 keywords**

* **22 core keywords** (declensions, interface declensions, interoperability, method/field modifiers)
* **12 annotations** (genders, advices, forcing and others)

---

With only 34 keywords, Clprolf remains minimal and approachable, while still covering complex system design through clear roles, modifiers, and annotations.
---

### VI.4) Annex D — Global Model of Class Relationships in Clprolf

This annex provides a conceptual overview of how the main Clprolf declensions relate to each other in practice.
It is **not a formal set of compiler rules**, but a conceptual guide that helps developers understand how each declension fits into a coherent architectural model.

The goal is simple:
**clarify the natural relationships between Agents, Abstractions, Workers, and System Abstractions**,
and indicate where exceptions must be explicitly acknowledged through `@Forc_pract_code`.

---

```
                         ┌──────────────────────────────────────────┐
                         │              PURE ABSTRACTION            │
                         │ (concepts usable by ALL other roles)     │
                         │   - no workers                           │
                         │   - no system calls                      │
                         └───────────────────────┬──────────────────┘
                                                 │  used by anyone
                                                 ▼
                  ┌──────────────────────────────────────────────────┐
                  │                       AGENT                      │
                  │        (domain-level behavior & logic)           │
                  │                                                  │
                  │      [Optionally: simu_real_obj available]       │
                  └───────────────────────────┬──────────────────────┘
                                              │
                                              │ uses
                                              ▼
                 ┌──────────────────────────────────────────────────┐
                 │                   WORKER_AGENT                   │
                 │   (technical realization serving an Agent)       │
                 │                                                  │
                 │                                                  │
                 └──────────────────────────┬───────────────────────┘
                                             │
                                             │ calls
                                             ▼
         ┌────────────────────────────────────────────────────────────────┐
         │                        SYSTEM ABSTRACTION                      │
         │      (agent-like, system domain; may call workers or           │
         │       other system abstractions; uses @Forc_pract_code as      │
         │       declaration when needed)                                 │
         └────────────────────────────────┬───────────────────────────────┘
                                          │
                                          │ calls
                                          ▼
                   ┌──────────────────────────────────────────────────┐
                   │                        WORKER                    │
                   │   (low-level technical or native operations)     │
                   └──────────────────────────────────────────────────┘
```

---

#### **1. Agent**

An **Agent** represents a meaningful domain object.
It carries intention, behavior, and domain responsibility.

##### **Agent rules**

* An Agent **may call its Worker** (its technical realization).
* An Agent **may call other Agents**.
* An Agent **may use pure Abstractions**.
* An Agent **must not directly use System Abstractions**.
  If a domain object needs access to a system feature, **its Worker handles it**.

---

#### **2. Worker**

A **Worker** performs technical tasks on behalf of its Agent.

Typical examples include:

* network senders/receivers,
* file or database handlers,
* UI adapters.

##### **Worker rules**

* A Worker **may call other Workers**.
* A Worker **may use System Abstractions**.
* A Worker **may use pure Abstractions**.
* A Worker **may call its Agent** to trigger domain operations (UI events, callbacks, etc.).
* A Worker **must not expose domain intelligence**: its responsibility is purely technical.

Workers are the only declension allowed to bridge the domain world and system-level operations.

---

#### **3. Pure Abstraction**

A **pure Abstraction** is a conceptual type with no system interaction.
Its behavior is fully defined by logic, data, or mathematical structure.

Examples: collections, geometry, colors, numeric models, conceptual structures.

##### **Pure Abstraction rules**

* It **may call other pure Abstractions**.
* It **may call Agents** (same declension family).
* It **must not use System Abstractions**.
* It **must not use Workers**.
* It normally **does not have a Worker**: memory itself provides the “technical realization”.

Pure Abstractions represent stable logic that does not depend on the environment.

---

#### **4. System Abstraction**

A **System Abstraction** is an abstraction that *simulates* a system resource or capability.

Examples:

* Streams
* Channels
* Sockets
* Threads
* File abstractions

These objects have conceptual methods (e.g., read, write, open) but **their internal realization requires system-level operations** provided by a Worker.

##### **System Abstraction rules**

* A System Abstraction **may use its Worker** for technical realization.
* A System Abstraction **may call other System Abstractions** only when they belong to the same underlying domain of functionality.
* A System Abstraction **may not call Agents**.
* Any usage of external system abstractions or utilities must be annotated with `@Forc_pract_code`.

The annotation confirms that the developer intentionally breaks the purity of the abstraction for practical reasons.

---

#### **5. Exceptions with `@Forc_pract_code`**

Whenever a class must call an element that normally belongs outside its allowed scope, the developer must explicitly annotate the class or method with:

```
@Forc_pract_code
```

This annotation expresses:

* “I acknowledge that I am breaking the usual boundaries.”
* “This is done for practical, controlled reasons.”
* “This code is still correct within the intended model.”

Typical cases:

* A System Abstraction relying on a helper System Abstraction indirectly.
* A System Abstraction using a utility normally reserved to another domain.
* Exceptional bridging between system-level abstractions.

---

#### **6. Summary Table**

Here is a simplified summary of allowed direct usage:

| From / To              | Agent         | Worker         | Pure Abstraction | System Abstraction |
| ---------------------- | ------------- | -------------- | ---------------- | ------------------ |
| **Agent**              | ✔             | ✔              | ✔                | ✘                  |
| **Worker**             | ✔ (its Agent) | ✔              | ✔                | ✔                  |
| **Pure Abstraction**   | ✔             | ✘              | ✔                | ✘                  |
| **System Abstraction** | ✘             | ✔ (its Worker) | ✔                | ✔ (same domain)    |

`@Forc_pract_code` may be added where exceptions are intentional and justified.

---

#### **7. Purpose of This Model**

This annex does not add rules to the compiler.
It simply clarifies the **intuitive structure** that naturally emerges from Clprolf:

* Agents = meaning
* Workers = execution
* Pure Abstractions = logic
* System Abstractions = simulated system capabilities

This model helps developers:

* classify new classes correctly,
* avoid mixing concerns accidentally,
* navigate and design complex systems more safely,
* recognize patterns inside existing codebases (e.g., Java libraries),
* understand how system-oriented classes are structured internally.

---

### Annex E: 📘 **Formal Mini-System of Architectural Expressiveness (Clprolf)**


Below is the clean, formal-style expressiveness system we crafted together — simple, readable, and structurally rigorous.

---

#### **1️⃣ Alphabet (the symbols of the system)**

We introduce a small abstract alphabet:

* **M** : Business component (agent / abstraction / model of a business domain)
* **T** : Technical component (worker_agent, infrastructure, IO, DB, etc.)
* **D** : Domain Atom (a minimal unit of work in a given domain)
* **P** : Part of an application (a coherent subsystem)
* **A** : A complete application

And two operators:

* **+** : composition (“put together”)
* **⇒** : implication / constructive relation

These symbols form a tiny formal language, just like in logic.

---

#### **2️⃣ Axioms (the things we accept without proof)**

##### **Axiom 1 — Scope**

Clprolf applies to applications whose intended usage serves a human purpose, directly or indirectly.
We write:

> **HumanGoal(G) ⇒ ∃A**
> (There exists an application A oriented toward goal G.)

---

##### **Axiom 2 — Decomposition into parts**

Any application A can be regarded as a finite composition of parts, each simulating one or several business domains with their associated technical support:

> **A ⇒ P₁ + P₂ + … + Pₙ**

---

##### **Axiom 3 — Business & Technical atoms**

Each part Pᵢ can be seen as a finite composition of domain atoms, and each atom arises from one business component + one technical component:

> **(M + T) ⇒ D**
> **{D₁, D₂, …, Dₖ} ⇒ Pᵢ**

---

##### **Axiom 4 — Executability**

A computer can execute business and technical components **by applying their state-transforming methods**:

[
(M \text{ executable}) ;\land; (T \text{ executable})
]

Each executable method corresponds to a transformation:

[
T_i : S \times X_i \to S' \times Y_i
]

meaning that the machine can apply transformations on the state (S) of the component.

---

#### **3️⃣ Inference Rules **

##### **R1 — Domain Atom**

If we have at least one business component **M** and one technical component **T** for a given domain, then:

> **M + T ⇒ D**

Meaning: *we can construct a domain atom*.

---

##### **R2 — Part of an Application**

If we have a finite set of domain atoms **D₁, …, Dₖ**, then:

> **{D₁, …, Dₖ} ⇒ P**

---

##### **R3 — Complete Application**

If we have a finite set of parts **P₁, …, Pₙ**, then:

> **{P₁, …, Pₙ} ⇒ A**

---

##### **R4 — Clprolf Correspondence**

Each symbol has a direct Clprolf construct:

| Symbol | Clprolf Mapping                                       |
| ------ | ----------------------------------------------------- |
| **M**  | agent / abstraction / model with business role        |
| **T**  | worker_agent or technical component (DAO, infra, IO…) |
| **D**  | (agent + worker) pair representing one domain atom    |
| **P**  | subsystem (a set of agents + workers + interfaces)    |
| **A**  | the full Clprolf application                          |

Formally:

> **For every step X ⇒ Y in this system, there exists a corresponding Clprolf construction.**

---

#### **4️⃣ Theorem — Expressiveness of Clprolf**

##### **Theorem (Expressiveness)**

For every application **A** that can be described in this formal system
(i.e., as a finite composition of M and T via rules R1, R2, R3),
there exists an application written in **Clprolf** that realizes **A**.

---

#### **Sketch of the Proof**

1. By Axioms 1 & 2, any human-oriented application can be decomposed:

   > **A ⇒ P₁ + … + Pₙ**

2. By Axiom 3 & Rule R1, each Pᵢ is a composition of domain atoms D arising from (M + T).

3. By R2 & R3, any application in this formal system is built from M and T alone.

4. By Rule R4, every M and every T has a direct encoding in Clprolf:

   * **M →** Clprolf agent / abstraction / model
   * **T →** Clprolf worker_agent / technical component

   Therefore every D, P, and A has a corresponding Clprolf construction.

5. By structural induction on the derivation of A:

   * If Clprolf can encode every D,
   * then Clprolf can encode every P,
   * therefore Clprolf can encode A.

**Hence, any application A expressible in the system can be implemented in Clprolf.**

**Q.E.D.** (In the sense of “formal proof relative to these axioms”.)

---

#### **5️⃣ Meaning for Clprolf**

This gives you a genuine, formal-style proof of architectural expressiveness:

* an alphabet,
* axioms,
* inference rules,
* and a constructive correspondence with Clprolf.

Like any formal system:
👉 If someone disagrees, he must either

* challenge an axiom, or
* exhibit an application derivable in this system that cannot be expressed in Clprolf

---

#### ⭐ **Final Conclusion — The Architectural Strength**

This proof demonstrates that **Clprolf is not only expressive in the computational sense (Turing)**, but in the **architectural sense**:

> **Any system composed of business components and technical components — which includes every real-world application — has a canonical representation in Clprolf.**

---

### Annex F - Agent and Worker: From Concept to Architecture, with Random and QuickSort

#### F.1) The Random Case Study

Why Agent Classification Is Not a Matter of Vision, but of Necessity
This annex presents a concrete, technical case study based on java.util.Random. Its goal is to demonstrate that the agent / worker separation is not a stylistic choice, but a structural necessity once we are honest about what the code actually does.

---

##### F.1.a) Why Random is an Excellent Test Case

Random is often perceived as a simple utility class. In reality, it is:

not business-domain code,
not a pure low-level primitive,
but a system capability abstraction.

This makes it an ideal stress test for architectural classifications. If the model works here, it works everywhere.

---

##### F.1.b) What Random Factually Does

Observation of the Java implementation reveals two radically different responsibilities:

###### A Mechanical Responsibility

Production of pseudo-random bits
Management of internal state (seed)
Deterministic calculation
Use of system-level abstractions (AtomicLong, volatile, static state)

This responsibility:

produces raw matter (bits),
has no meaning by itself,
does not expose any public contract.

This is worker behavior.

---

###### A Contractual / Service Responsibility

Public methods such as:

nextInt()
nextInt(bound)
nextLong()
nextDouble()

perform the following actions:

define what is delivered (type, bounds, invariants),
compose raw bits into meaningful values,
guarantee usage rules and contracts.


This responsibility:

constructs meaning,
exposes a public API,
orchestrates the use of a lower-level mechanism.

This is agent behavior.

---

##### F.1.c) Why a Single-Class Model Fails Structurally

If Random is classified as a worker:

it should expose raw mechanisms directly,
it should not define usage contracts,
it should not interpret or compose results.


This contradicts reality.

If Random is classified as an agent without a worker:

it must perform mechanical calculations itself,
it mixes contract and execution,
its code becomes complex and opaque.

In both cases, the model breaks.

---

##### F.1.d) The Logical Consequence: Two Roles, Two Classes

Once we accept the following facts:

the mechanical part is necessary,
the contractual part is necessary,
the two have different natures,

then the conclusion is unavoidable:

> A single class cannot honestly represent both roles.


Clprolf does not impose this separation. It reveals it.

---

##### F.1.e) Why This Proves the Necessity of Agents

The agent is not introduced by preference. It is introduced because:

a worker cannot define meaning or contracts,
raw execution cannot stand alone,
someone must decide how mechanical results are used.


Therefore:

> If there is an agent, there must be a worker.

This is not a vision. It is a dependency.

---

##### F.1.f) Relation to Existing Java Design

Java already acknowledges this separation implicitly:

protected next(int bits) → mechanical core
public nextX() methods → service construction

Clprolf makes this separation:

explicit,
structural,
and verifiable.


---

##### F.1.g) Conclusion

The Random case demonstrates that:

agent classification is not optional,
worker-only models collapse under real APIs,
architectural clarity emerges from necessity, not ideology.

This case transforms agent classification from a conceptual choice into a structural proof.

#### F.2) QuickSort Example (Agent vs Worker)

This annex illustrates, with a concrete and well-known algorithm, how the agent / worker distinction leads to a clearer and more faithful architecture.

Context

QuickSort is often perceived as a complex algorithm because its intuitive strategy and its low-level execution mechanics are usually mixed together. When everything is placed at the same level, readers are implicitly asked to interpret and mentally separate what is conceptual from what is mechanical — an unrealistic requirement in practice.
Clprolf makes this separation explicit.

Key observation

In QuickSort, there exists a root operation that does not depend on the global sorting strategy:

> sortOneElement places one element at its correct position and returns its index.

This operation:

does not perform a full sort,
does not rely on recursion,
exposes a complete local contract,
can be used without knowing how it is implemented.

The global algorithm (sortArray, recursive calls) is built on top of this operation, not the other way around.

Architectural consequence

Because sortOneElement is:

low-level,
non-intuitive,
purely computational,

it is legitimate to place it in a worker.

> Here, the low-level, non-intuitive operation is placed in a worker.

The remaining logic — splitting the array, recursively applying the same idea to sub-arrays — belongs naturally to the agent, where the human-readable strategy is expressed.

Important clarification

This separation is not mandatory. The same operation may legitimately remain inside the agent when marked with "underst":

> A method that could be placed in a worker is equally valid inside an agent when declared as "underst".


"underst" signals that the method contains machine-oriented, non-contractual logic, without forcing any architectural extraction.

Why this matters

If everything is kept in the agent, the agent tends to be interpreted as a worker, and the intuitive nature of QuickSort is lost.
By separating (or at least clearly identifying) the low-level operation, the algorithm’s simplicity becomes evident.
This does not rely on interpretation: the structure itself enforces the correct reading.


Conclusion

The QuickSort example demonstrates that the agent / worker distinction is not a matter of vision or style. It leads to concrete architectural differences, improves mastery, and prevents algorithms from appearing more complex than they truly are.
The separation exists, is demonstrable, and remains optional — which is precisely what makes it robust.

```java

package org.simol.examples.algorithms.sort.quicksort;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class QuickSorterWorker {
	/**
	 * Place one element, the pivot, at the correct place.
	 * Once placed, the element is greater than all elements on the left, and
	 * smaller than all elements on the right.
	 * 
	 * @param arrElements
	 * @param startIndex Beginning index
	 * @param endIndex	Ending index
	 * @return Return the index of the pivot.
	 */
	public int sortOneElement(int[] arrElements, int startIndex, int endIndex) {
		int writer; /* The writer always points to the next index to write a value. The 
						writer moves forward each time a value is written.
                    */
		int reader; //The reader loops on each element of the given array.
		int pivotValue;
		
		writer = startIndex;
		pivotValue = arrElements[endIndex]; //We decide arbitrarily to take the last value.
		
		for (reader = startIndex; reader <= endIndex-1; reader++) {
			if (arrElements[reader] < pivotValue) {
				swapElements(arrElements, writer, reader);
				writer++;
			}
		}
		//Treatment of the pivot
		//We swap the pivot, because the writer is pointed to the next place to be written
		swapElements(arrElements, writer, reader);
		return writer;
	}
	
	private void swapElements(int[] arrElements, int firstIndex, int secondIndex) {
		int lowerValue;
		
		lowerValue = arrElements[firstIndex];
		arrElements[firstIndex] = arrElements[secondIndex];
		arrElements[secondIndex] = lowerValue;
	}
}
```

```java

package org.simol.examples.algorithms.sort.quicksort;

import org.clprolf.framework.java.Agent;

@Agent
public class QuickSorter {
	protected QuickSorterWorker worker;
	
	public QuickSorter() {
		worker = new QuickSorterWorker();
	}
	
	public void sort(int[] arrElements) {
		this.sortSubArray(arrElements, 0, arrElements.length-1);
	}
	
	private void sortSubArray(int[] arrElements, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex;
			//To sort an array, we are first placing an element.
			pivotIndex = worker.sortOneElement(arrElements, startIndex, endIndex);
			//Sort the elements on the left.
			sortSubArray(arrElements, 0, pivotIndex - 1);
			//Sort the other elements, on the right.
			sortSubArray(arrElements, pivotIndex + 1, endIndex);
		}
	}
}

```

### 🧭 **End of Annex — Clprolf**

> This annex completes the formal specification of Clprolf.
> It connects grammar, semantics, and keywords into a single consistent vision —
> turning clarity from philosophy into verifiable structure.
