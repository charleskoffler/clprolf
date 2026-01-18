### Clprolf Compiler

*2023/10/16 — Author: Charles Koffler — MIT License*
[https://github.com/charleskoffler/clprolf](https://github.com/charleskoffler/clprolf)

---

#### Overview

* Command-line **Clprolf compiler**, based on **ANTLR4**.
* Accepts `.clp` source files (Clprolf code).
* Generates a `.java` file next to each `.clp` source file, in the same directory.
* Compatible with Java 8 syntax (grammar based on the
  [ANTLR4 Java 8 grammar](https://github.com/antlr/grammars-v4/tree/master/java/java8)).

---

#### Usage

To run the compiler (**the JAR can be used standalone**):

```bash
java -jar clprolfcompiler-5.3.jar "clprolfsources/org/clprolf/compiler/semantic/tests/SemanticTests.clp"
```

Or, using Maven:

```bash
mvn exec:java \
  -Dexec.mainClass="org.clprolf.compiler.workers.impl.Main" \
  -Dexec.args="target/classes/org/clprolf/compiler/semantic/tests/SemanticTests.clp"
```

---

#### Source Editing

* Clprolf source files (`.clp`) can be opened in Eclipse (choose *Open With → Java Editor*), Notepad++ (*Language → Java*), or any similar editor.
* Generated Java code can be formatted in Eclipse (*Right-click → Source → Format*).

---

#### Maven Project

* Project: `org.clprolf.compiler`
* Purpose: generate and build the ANTLR4-based Clprolf compiler.
* Key package: `org.clprolf.compiler`

**Grammar files:**

* `src/main/antlr4/org/clprolf/compiler/ClprolfJava8Lexer.g4`
* `src/main/antlr4/org/clprolf/compiler/ClprolfJava8Parser.g4`

To regenerate the parser:

```bash
mvn antlr4:antlr4
```

To compile the generated sources and the Clprolf compiler:

```bash
mvn compile
```

Or, to regenerate the parser and compile everything:

```bash
mvn clean package
```

---

#### Compiler Behavior

* Parses **Clprolf code** (`.clp` files) as well as embedded **Java code** (Java 8).
* Stops at the first syntax error (Clprolf or Java).

If parsing succeeds, the compiler generates Java source code.

---
