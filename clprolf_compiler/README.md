### Clprolf Compiler

*2023/10/16 — Author: Charles Koffler — MIT License*
[https://github.com/charleskoffler/clprolf](https://github.com/charleskoffler/clprolf)

---

#### Overview

* Command-line **Clprolf compiler**, based on **ANTLR4**.
* Accepts `.clp` source files (Clprolf code).
* Generates equivalent `.java` files, which can then be compiled with `javac`.
* Compatible with Java 8 syntax (grammar based on [ANTLR4 Java 8 grammar](https://github.com/antlr/grammars-v4/tree/master/java/java8)).

---

#### Usage

To run the compiler:

```bash
mvn exec:java -Dexec.args="org/clprolf/examples/concurrency/DonkeyForLongAction.clp"
```

Or use the batch file (Windows):

```bash
clprolfCompiler.bat MyFile.clp
```

For Linux and other OS, you can use the Java command inside the batch file.

Source placement:

* Put `.clp` files in `target/classes`, or in `src/main/java/resources` if you run `mvn resources:resources`.
* Example:

  ```bash
  clprolfCompiler Car.clp
  ```

  This will generate `Car.java` in the same directory.

---

#### Source Editing

* Clprolf sources (`.clp`) can be opened in Eclipse (choose *Open with Java Editor*), Notepad++ (*Language → Java*), or similar editors.
* Generated Java code can be formatted in Eclipse (*Right-click → Source → Format*).

---

#### Maven Project

* Project: `org.clprolf.compiler`
* Purpose: generate the ANTLR4 Clprolf grammar compiler.
* Key custom files:

  * `ClprolfCompiler`
  * `ClprolfJava8CustomListener`
* Grammar files:

  * `src/main/antlr4/org/clprolf/compiler/ClprolfJava8Lexer.g4`
  * `src/main/antlr4/org/clprolf/compiler/ClprolfJava8Parser.g4`

To regenerate the parser:

```bash
mvn antlr4:antlr4
```

To compile generated sources (not handled by `mvn compile`):

```bash
compileGeneratedSources.bat   # Windows
# or use the javac command inside for Linux/other OS
```

Then you can run:

```bash
mvn compile
```

---

#### Compiler Behavior

* Parses **Clprolf code** (`.clp` sources) and included **Java code** (Java 8).
* Stops at the first syntax error (Clprolf or Java).
* Currently, **no semantic analysis** is performed (for either Clprolf or Java).

If parsing succeeds, the compiler generates Java code.
You then run `javac` on the generated Java to produce executable bytecode.

---
