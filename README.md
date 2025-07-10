# Clprolf – Clear Programming Language & Framework

Clprolf is a tool designed to simplify the writing and maintenance of applications.
It adds a conceptual layer on top of object-oriented programming to help developers with object usage, algorithm design, and design principles (including design patterns).

Clprolf can be used in two forms:

   As an annotation-based framework for Java, C#, or PHP 8+

   Or as a language built on top of Java, compiling to pure Java code

It aims to preserve performance, or lose very little, and may interest developers and software architects who want to expand their programming toolbox.

Clprolf requires a taste for agent-oriented programming, the actor model, and domain-driven design (DDD).

> **Turn a class’s responsibility into a keyword.**  
> Build simulations and complex systems that *explain themselves.*

```java
// One word tells the intent:
agent OrderService {                   // business actor
    with_compat OrderRepository repo;  // explicit contract
    void checkout(Order o) { /* model Order */
        repo.save(o);
    }
}
```

Why bother?

Pain in vanilla OOP

a) A service accidentally calls a low-level helper → architectural drift
	
b) Concurrency bugs need ad-hoc synchronized
	
c) New dev spends hours mapping layers

Same code with Clprolf

a) 🚫 Compile-time error (agent cannot depend on worker_agent)

b) one_at_a_time + turn_monitor declare the intent up front

c) One glance at agent, worker_agent, model keywords tells the whole story

What is Clprolf?

   A minimal language where every class starts with a role keyword
    (agent, worker_agent, model, information, indef_obj).

   A set of modifiers for tricky realities:
    long_action (frame-based ops), one_at_a_time (critical section),
    dependent_activity (producer/consumer), underst (non-obvious algos).

   A lightweight annotation framework that brings those ideas to Java, C#, PHP—no new VM required.

Perfect fit for

   Large simulations & MAS-style games

   Scientific prototypes that model “actors” interacting

   Teaching OOP / design-pattern concepts without a 70-slide intro

Detailed guides:

[The declensions and genders](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_docu_offic_declensions.md)

[Talking in Java versus talking in Clprolf - Quicksort example](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_docu_offic_java_vs_clprolf_quicksort.md)

[Learning the class roles through Java wrappers](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_docu_offic_3_java_lib_wrappers.md)

[A clprolf design pattern example with multiple inheritance](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_4_clpr_desig_patt_mult_herit.md)

[The basics and the single inheritance of interfaces](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_5_interfaces_basics.md)

[Interface multiple inheritance in Clprolf](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_6_simu_multi_inh.md)

[Concurrency and parallelism](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_7_conc_parall.md)

[The "underst" modifier](https://github.com/charleskoffler/clprolf/tree/main/docs/official/clprolf_off_doc_8_underst.md)

[Getting started for OOP programmers](https://github.com/charleskoffler/clprolf/tree/main/docs/clprolf_oop_tutorials/clprolf_oop_getting_started.md)

[clprolf official web site](https://www.clprolf-lang.org/)

[AI Insights](https://github.com/charleskoffler/clprolf/tree/main/docs/ai_insights.md)

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

### More about Clprolf

[Insights about Clprolf - For those who already know the language](https://github.com/charleskoffler/clprolf/tree/main/docs/clprolf_insights.md)
