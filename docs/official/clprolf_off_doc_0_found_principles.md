# 🧱 Two Structural Principles behind Clprolf

## Prerequisites

Clprolf builds upon classical Object-Oriented Programming.

To fully follow this article, readers should already be familiar with:

* the fundamentals of OOP,
* inheritance and composition,
* common design principles such as SRP,
* the guideline “favor composition over inheritance”.

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

## Relation to SRP

The Single Responsibility Principle (SRP) states that a class should have only one reason to change.

The concept of class domain provides a structural way to think about responsibility:

If a class is organized around a single domain,
its evolution tends to follow that domain.

The two principles do not replace SRP.
They offer a way to reason about responsibility in terms of domain coherence.

---

## Relation to “Favor Composition Over Inheritance”

The common guideline “favor composition over inheritance” is widely accepted.

The second principle provides a decision criterion:

If inheritance would introduce a different class domain,
then composition is used instead.

This does not remove judgment.
It clarifies how inheritance relates to the continuity of the class domain.

---

## Closing

These two principles form the foundation of Clprolf.

They define how class roles are interpreted and how inheritance is understood within the language.

From them follow the structural distinctions and rules that Clprolf makes explicit.

---
