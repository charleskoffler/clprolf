# Clprolf — Clear Programming Language & Framework

> **A methodology turned into a language.**
> Good OOP becomes natural, not accidental.

Clprolf adds a **conceptual layer** on top of Java/C#/PHP:
roles, contracts, and design rules are **first-class keywords**.
You model systems with **agents, worker agents, versions, and capacities**, while the compiler enforces clarity.

---

### 🚀 Why Clprolf?

* **Safer architecture**: compile-time errors prevent invalid dependencies
* **Clear concurrency**: intent expressed with `one_at_a_time`, `turn_monitor`, etc.
* **Readable design**: class roles (`agent`, `worker_agent`, `model`) explain themselves

---

### 📝 Quick Example

```java
agent OrderService {
    with_compat OrderRepository repo;
    void checkout(Order o) { repo.save(o); }
}
```

* In plain OOP: architecture drifts, concurrency bugs, endless onboarding.
* With Clprolf: contracts explicit, roles clear, design rules enforced.

---

### ✨ Key Ideas

* Role-based classes: `agent`, `worker_agent`, `model`, `information`, `indef_obj`
* Modifiers for real-world complexity: `long_action`, `one_at_a_time`, `dependent_activity`
* Works two ways:

  * **Framework** (annotations for Java, C#, PHP 8+)
  * **Language** (compiles into pure Java)

---

### 🎯 Perfect For

* Large simulations & multi-agent systems
* Scientific prototypes with interacting “actors”
* Teaching OOP/design patterns with minimal overhead

---

👉 With Clprolf, your code doesn’t just run — **it explains itself.**

---

## 📚 Documentation — Learn, Understand, and Master Clprolf

Explore the complete documentation set, from foundational concepts to advanced insights.
Each document is designed to make Clprolf progressively clearer — conceptually, semantically, and philosophically.

---

### 🧠 Main Documentation

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

* [**Insights About Clprolf — For Experienced and Thoughtful Readers**](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_insights.md)
  A reflective document revealing the language’s design philosophy and conceptual depth.

* [**AI Insights**](https://github.com/charleskoffler/clprolf/tree/main/docs/ai_insights.md)
  A collection of genuine AI feedback and reflections that accompanied Clprolf’s evolution.

* [🌐 **Official Website**](https://www.clprolf-lang.org/)
  The central hub for Clprolf resources, news, and releases.

---

### 🔬 Extended Documentation

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