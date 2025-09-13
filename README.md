---

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

Detailed guides:

[Explaining Declensions](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_1_declensions.md)

[TALKING IN JAVA VERSUS TALKING IN CLPROLF – EXAMPLE](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_2_talking_java_vs_clprolf_quicksort.md)

[LEARNING THE CLASS ROLES THROUGH JAVA WRAPPERS](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_3_java_lib_wrappers.md)

[Interfaces in Clprolf — Complete Overview](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_4_interfaces.md)

[Concurrency and Parallelism Aids in Clprolf](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_5_conc_parall.md)

[The `underst` Method Modifier](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_6_underst.md)

[Insights About Clprolf — For Experienced Readers](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_insights.md)

[AI Insights](https://github.com/charleskoffler/clprolf/tree/main/docs/ai_insights.md)

[clprolf official web site](https://www.clprolf-lang.org/)

## Sources

### clprolf compiler

[clprolf compiler directory](https://github.com/charleskoffler/clprolf/tree/main/simol_compiler)

### clprolf frameworks

[clprolf Java framework](https://github.com/charleskoffler/clprolf/tree/main/simol_compiler/src/main/java/org/simol/simolframework/java)

[clprolf C# framework](https://github.com/charleskoffler/clprolf/tree/main/simol_framework/SimolCsharpFramework)

[clprolf PHP framework](https://github.com/charleskoffler/clprolf/tree/main/simol_framework/simol_php_framework)

### Source examples

[clprolf wrappers for Java Standard Libraries](https://github.com/charleskoffler/clprolf/tree/main/wrappers)

[clprolf simple examples](https://github.com/charleskoffler/clprolf/tree/main/simol_simple_examples)

[clprolf algorithms examples](https://github.com/charleskoffler/clprolf/tree/main/simol_algorithms_examples)

[clprolf design patterns examples](https://github.com/charleskoffler/clprolf/tree/main/simol_design_patterns_examples)

[clprolf games examples](https://github.com/charleskoffler/clprolf/tree/main/simol_games_examples)
