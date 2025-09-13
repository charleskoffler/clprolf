---

# Interfaces in Clprolf — Complete Overview

## 1. General Principles

In Clprolf, an **interface is always a contract**.
This applies both to **versions** (different implementations of the same concept) and to **capacities** (common abilities across versions).

* Language keywords:

  * `compat_interf_version`
  * `compat_interf_capacity`

* Framework annotations:

  * `@Compat_interf_version`
  * `@Compat_interf_capacity`

---

## 2. Compatibility Interfaces

An interface in Clprolf is called a **compatibility interface**.
Its purpose is to guarantee that an object is *compatible* with a certain contract.

When we declare a variable of an interface type, we are not binding it to a specific class — only to the **compatibility** defined by that interface.

---

### `with_compat`

Whenever a variable, parameter, or field uses an interface type, it must be preceded by `with_compat` (or `@With_compat` in the framework).
This marks the point of **loose coupling**.

Exception: method return types do not require `with_compat`.

```java
@With_compat UserDAO dao;
```

---

### `contracts`

The Java keyword `implements` is replaced by `contracts`.
A class lists all the contracts (interfaces) it fulfills.
In the framework, use `@Contracts`.

```java
public class UserDAOImpl implements @Contracts UserDAO {
    public User getUser(int id) { /* … */ }
}
```

---

## 3. Capacity Interfaces

A **capacity interface** describes an ability (an “-able” trait), such as `Comparable`.
It extends other interfaces but cannot be implemented directly by a class.
This prevents confusion between versions and capacities.

* Every capacity must declare an **advice**:

  * **Agent-like** (default)
  * **Worker-like**

* In the framework:

  ```java
  @Compat_interf_capacity(Advice.FOR_AGENT_LIKE)
  public interface ClpComparable<T> {
      int compareTo(T other);
  }
  ```

* In the language:
  `@Agent_like_advice` or `@Worker_like_advice`

A version interface that extends a capacity must also declare a **class role** consistent with the advice.

Example: a `Car` interface extending `ClpComparable<Car>` and a `CarClass` that contracts it.

---

## 4. Version Interfaces

A **version interface** defines the abstraction for multiple concrete implementations.
It corresponds to the usual case of loose coupling in Java.

* Declared with `compat_interf_version` (or `@Compat_interf_version`).
* Classes implementing it provide **different versions** of the same concept.
* Example: various implementations of a database connection.

```java
@Compat_interf_version
public interface ClpConnection extends Connection {
    void close() throws SQLException;
}

@Abstraction
public class MyAwesomeDatabaseConnection implements @Contracts ClpConnection {
    public void close() throws SQLException { /* … */ }
}
```

---

## 5. Generic `compat_interf`

The keyword `compat_interf` is a **generic fallback**.
It defines an interface without a declared role.
Not recommended, but sometimes useful.

```java
public compat_interf MyMysteriousInterface {
    void myStrangeJob(String param);
}
```

---

## 6. Inheritance Rules and `@Forced_int_inh`

Clprolf enforces simple and intuitive rules:

* A **version interface** cannot extend another version interface.
* Any interface may extend one or more **capacity interfaces**.
* A class may only contract **one version interface** at a time.
* A class cannot contract a capacity interface directly.

Violations can be bypassed explicitly with `@Forced_int_inh`, which forces interface inheritance (on a class, an interface, or a specific contract type).

---

## 7. Features for Interface Inheritance

Clprolf also provides **optional features** to treat interfaces as if they were abstract classes:

* Use `nature` instead of `extends`.
* Declare the class role on the interface (e.g. `agent`).
* Implementation classes must use **exactly the same role**, not just a synonym.
* Special keywords:

  * `version_inh`
  * `capacity_inh`

This makes interfaces behave like full abstract hierarchies, enabling **strong loose coupling** in collaborative projects.

### Example (language)

```java
public version_inh agent Animal {
    void eat(String foodName);
}

public version_inh agent Dog nature Animal {
    void bark(int duration);
}

public agent AnimalImpl contracts Animal { … }
public agent DogImpl nature AnimalImpl contracts Dog { … }
```

### Example (framework)

```java
@Agent
@Version_inh
public interface Animal {
    void eat(String foodName);
}

@Agent
@Version_inh
public interface Dog extends @Nature Animal {
    void bark(int duration);
}
```

---

## 8. Conclusion

Interfaces in Clprolf are always about **compatibility**:

* **Version interfaces** unify multiple implementations of the same abstraction.
* **Capacity interfaces** provide cross-cutting abilities, with clear advice.
* **Inheritance features** allow interfaces to mimic class hierarchies, but only when explicitly needed.

This approach keeps design **clear, consistent, and role-driven**, while preserving loose coupling.

---
