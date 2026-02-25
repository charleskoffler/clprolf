# Clprolf — Clear Programming Language & Framework

> **A structured approach to object-oriented programming.**
> Roles and responsibilities become explicit.

> Clprolf is a **structured object-oriented language and framework** that adds a conceptual layer on top of Java/C#/PHP.

> Roles, contracts, and structural rules are **first-class language elements**.
You model systems with **agents, worker agents, versions, and capacities**, while the compiler enforces clarity.

> **If you clone the repository and find value in the project, please consider giving it a ⭐.**

---

### Scope and Positioning

Clprolf is not intended as a mainstream replacement for Java or other general-purpose languages.

It is designed for:

* educational contexts focused on architectural clarity,
* complex systems,
* simulation and MAS-like applications,
* systems requiring strong predictability and structural discipline.

Clprolf introduces explicit structural constraints through predefined roles and natures.
These constraints are intentional and form part of the language’s philosophy.

Developers who prefer unrestricted class modeling and complete architectural freedom may find traditional object-oriented languages more suitable.

Clprolf is intended for contexts where early architectural control and long-term coherence are primary objectives.

---

### 🚀 Why Clprolf?

* **Safer architecture**: compile-time errors prevent invalid dependencies
* **Clear concurrency**: intent expressed with `one_at_a_time`, `turn_monitor`, etc.
* **Readable design**: class roles (`agent`, `worker_agent`, `model`) explain themselves

---

### 📝 Quick Example

```java
public class_for agent OrderService {
    with_compat OrderRepository repo;
    void checkout(Order o) { repo.save(o); }
}
```

> In plain OOP: architectural intent often remains implicit.
> With Clprolf: contracts explicit, roles clear, design rules enforced.
---

### ✨ Key Ideas

* Role-based classes: `agent`, `worker_agent`, `model`, `information`, `indef_obj`
* Modifiers for real-world complexity: `long_action`, `one_at_a_time`, `dependent_activity`
* Works two ways:

  * **Framework** (annotations for Java, C#, PHP 8+)
  * **Language** (compiles into pure Java)

---

### 🎯 Perfect For

* Teaching OOP and architectural thinking through structural guarantees
* Large simulations & multi-agent systems
* Scientific prototypes with interacting “actors”

---

👉 With Clprolf, your code doesn’t just run — **it explains itself.**

---

## Foundational Principles of Clprolf

Clprolf is based on two core principles:

1. A class is either technical or organized around a well-defined class domain.
2. Inheritance must preserve the class domain; if it does not, composition is used instead.

These principles define how Clprolf structures components and relationships.

---

The class domain is the central subject around which a class is organized.
It defines what the class fundamentally represents and what it is responsible for.

For example:

* A `File` class has a class domain related to file handling.
* A `Random` class has a class domain related to random generation.
* A `Connection` class has a class domain related to connection management.
* A `PdfGenerator` class has a class domain related to PDF generation.

A technical class, by contrast, does not represent a conceptual domain.
It provides technical support (e.g., logging, parsing, low-level utilities).

---

## 📚 Documentation — Official Clprolf Materials

Explore the complete set of official Clprolf documents.
From the **Language Reference Manual** to focused thematic guides and conceptual insights, each resource is designed to help you understand and master the language with clarity and precision.

---

### 🧭 Start Here

* 🚀 [**Getting Started with Clprolf**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_getting_started.md)
  A practical introduction showing how Clprolf makes architectural intent explicit — with real examples and enforced structural rules.

---

### 🧠 Main Documentation

* 📘 [**Clprolf Language Reference Manual**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_language_reference_manual.md)
  The complete, authoritative specification of the Clprolf language.
  Includes roles, declensions, inheritance, semantics, frameworks, examples, and annexes.
  
* [**AI Technical Review**](https://github.com/charleskoffler/clprolf/tree/main/docs/ai_technical_review.md)  
  A detailed AI technical review offering analysis and architectural perspective on the language’s design.

* [**Design Principles in Clprolf**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_0_found_principles.md)  
  Introduces the two foundational principles and the notion of class domain that structure the Clprolf language.

* [**Explaining Declensions**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_1_declensions.md)
  Understand the five declensions (`agent`, `worker_agent`, `model`, `information`, `indef_obj`) and how they shape your system’s architecture.

* [**Talking in Java vs. Talking in Clprolf — Example**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_2_talking_java_vs_clprolf_quicksort.md)
  Compare a traditional Java implementation with its Clprolf equivalent — featuring *QuickSort* and conceptual clarity.

* [**Learning the Class Roles Through Java Wrappers**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_3_java_lib_wrappers.md)
  Discover how standard Java libraries inspired Clprolf’s role-based wrappers (now partly replaced by `import java_class`).

* [**Interfaces in Clprolf — Complete Overview**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_4_interfaces.md)
  Deep dive into `compat_interf_version`, `compat_interf_capacity`, and interface inheritance features.

* [**Concurrency and Parallelism Aids in Clprolf**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_5_conc_parall.md)
  Learn about method and attribute modifiers such as `one_at_a_time`, `turn_monitor`, and `dependent_activity`.

* [**The `underst` Method Modifier**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_6_underst.md)
  Explore the `underst` keyword — marking non-trivial algorithms or methods requiring computer “understanding”.

* [🌐 **Official Website**](https://www.clprolf-lang.org/)
  The central hub for Clprolf resources, news, and releases.

---

## ⚙️ Clprolf Compiler and Frameworks

Clprolf comes with both a full compiler and lightweight annotation-based frameworks, allowing you to use the language concepts directly in Java, C#, or PHP.

---

### 🧩 Clprolf Compiler

* [**Clprolf Compiler Directory**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_compiler)
  The official compiler of the Clprolf language — built in Java 8 using ANTLR grammar.
  It translates `.clp` source files into pure Java, enforcing semantic rules and role coherence.

---

### 🧱 Clprolf Frameworks

Framework versions let developers use Clprolf concepts as annotations inside host languages.
They bring the same clarity and role enforcement — without leaving your familiar environment.

* [☕ **Clprolf Java Framework**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_compiler/src/main/java/org/clprolf/framework/java)
  Implemented directly within the compiler module — supports all annotations such as `@Agent`, `@Worker_agent`, and concurrency modifiers.

* [🧩 **Clprolf C# Framework**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_framework/ClprolfCsharpFramework)
  A full C# adaptation of the Clprolf annotations and structural rules.

* [🌐 **Clprolf PHP Framework**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_framework/simol_php_framework)
  Lightweight framework compatible with PHP 8+, bringing agents and workers to web environments.

---

## 🔬 Extended Documentation

* [**Using Clprolf for Complex Object-Oriented Designs**](https://github.com/charleskoffler/clprolf/tree/main/docs/extended/clprolf_advanced_doc_1_exempl_assistant.md)
  Practical and advanced examples showing how Clprolf simplifies large-scale OOP architectures.

* [**Attempts of Multiple Inheritance with Interfaces in Clprolf**](https://github.com/charleskoffler/clprolf/tree/main/docs/extended/clprolf_advanced_doc_2_attempts_multi_inh_with_interf.md)
  Exploration of interface multiple inheritance patterns — not recommended, but educational.

---

## 🧩 Source Examples — Explore the Language in Action

Discover how Clprolf comes to life through concrete examples — from simple demonstrations to full applications and design patterns.
Each directory showcases a different facet of the language: clarity, structure, and algorithmic expressiveness.

* [🎮 **Clprolf Game Examples**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_games_examples)
  Real-time and interactive simulations illustrating agent–worker collaboration.

* [🧩 **Clprolf in Action — Sample Applications**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_app_examples)
  Complete applications showing how roles and contracts interact in real-world use cases.

* [🧠 **Core Language Examples**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_examples)
  Focused examples demonstrating Clprolf’s core syntax, roles, and design rules.

* [🏗️ **Design Pattern Examples**](https://github.com/charleskoffler/clprolf/tree/main/clprolf_design_patterns_examples)
  Implementations of classic design patterns rewritten with Clprolf’s roles and semantic clarity.

* [⚙️ **Algorithm Examples**](https://github.com/charleskoffler/clprolf/tree/main/simol_algorithms_examples)
  Classic algorithm implementations — such as *QuickSort* or *Insertion Sort* — expressed with Clprolf’s method modifiers and clarity principles.

* [🌱 **Introductory & Simple Examples**](https://github.com/charleskoffler/clprolf/tree/main/simol_simple_examples)
  Minimal and beginner-friendly examples to start learning the Clprolf way.

* [🧱 **Wrappers for Java Standard Libraries**](https://github.com/charleskoffler/clprolf/tree/main/wrappers)
  Legacy Java compatibility wrappers, maintained for historical reference — now replaced by `import java_class` and `import java_interface`.

---