# Attempts of Multiple Inheritance with Interfaces in Clprolf

## Let's take the example

Imagine an `Assistant` class, which should inherit from both `Teacher` and `Student`.
Now imagine that both `Teacher` and `Student` inherit from `Person`.
This situation is called the **diamond inheritance problem**, because `Assistant` would end up inheriting from two `Person` classes.

In Clprolf (as in Java), this is not possible with classes, because inheritance is single.
So let’s see how we can approach this with interfaces.

---

## Using Generic Interfaces

In Java, one common solution is to define `Teacher` and `Student` as interfaces, then implement them in a `PersonImpl` class.

```java
@Compat_interf
public interface Teacher {
    void teach();
}

@Compat_interf
public interface Student {
    void learn();
}

@Agent
public class PersonImpl implements @Contracts Teacher, Student {
    private int age;
    private String name;

    public void teach() { }
    public void learn() { }
    public void walk() { }
}
```

### Observations

* The inheritance direction is **reversed**: instead of saying “a teacher is a person,”
  we now say “a person is a teacher and a student.”

* With `compat_interf_capacity` or `compat_interf_version`, usage is more natural and not reversed.
  (For example: a `ClientDAOImpl` *is* a DAO, an `Array` *is* a Sortable.)

* The “Assistant” class is missing — the role is absorbed by `PersonImpl`.

* **Loose coupling** is enforced everywhere: objects must always be handled through interfaces, even when we wanted direct implementations.

* One advantage: the same `PersonImpl` object can be shared between the `Teacher` and `Student` roles.

* However, `Teacher` and `Student` are not really `Person` objects, since they don’t inherit from `Person`. To fix this, they should extend a `PersonInterf`.

---

## Corrected Example with Version Interfaces

```java
@Forced_int_inh
@Compat_interf_version
public interface Teacher extends PersonInterf {
    void teach();
}

@Forced_int_inh
@Compat_interf_version
public interface Student extends PersonInterf {
    void learn();
}

@Compat_interf_version
public interface PersonInterf {
    void walk();
}

@Agent
public class PersonImpl implements @Contracts Teacher, Student, PersonInterf {
    private int age;
    private String name;

    public void teach() { }
    public void learn() { }
    public void walk() { }
}
```

Now, `Teacher` and `Student` are truly `Person` objects, since they extend `PersonInterf`.
This makes the inheritance more faithful to its intended meaning, and avoids the generic `compat_interf`.

---

## A Clprolf Attempt for True Multiple Inheritance

We can refine the model by introducing an `Assistant` interface that extends both `Teacher` and `Student`.
Here, the interface hierarchy mirrors what we would have designed with classes:

* `Person` is the root,
* `Teacher` and `Student` extend `Person`,
* `Assistant` extends both `Teacher` and `Student`.

The reversed inheritance disappears, because we can now define a concrete `AssistantClass` implementing the `Assistant` version interface.

```java
@Forced_int_inh
@Compat_interf_version
public interface Assistant extends Teacher, Student { }

@Compat_interf_version
public interface Person {
    int getAge();
    void setAge(int age);
    String getName();
    void setName(String name);
    void walk();
}

@Forced_int_inh
@Compat_interf_version
public interface Student extends Person {
    void learn();
}

@Forced_int_inh
@Compat_interf_version
public interface Teacher extends Person {
    void teach();
}

@Agent
public class AssistantClass extends @Nature PersonClass implements @Contracts Assistant {
    public AssistantClass(String name, int age) {
        super.setAge(age);
        super.setName(name);
    }

    public void teach() { System.out.println("I'm teaching!"); }
    public void learn() { System.out.println("I'm learning"); }
}

@Agent
public class PersonClass implements @Contracts Person {
    private int age;
    private String name;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void walk() { System.out.println("I'm walking!"); }
}
```

---

## Same Solution with Code Reuse

We can also allow `TeacherClass` and `StudentClass` to exist independently, while composing them inside `AssistantClass`.

This requires:

* A `PersonClass` that contains shared state,
* `TeacherClass` and `StudentClass` that delegate to the shared state,
* `AssistantClass` combining both.

This way, `AssistantClass` reuses existing implementations, and polymorphism still works for `Person`, `Teacher`, and `Student`.

```java
@Agent
public class AssistantClass implements @Contracts Assistant, Teacher, Student {
    protected TeacherClass teacher;
    protected StudentClass student;
    protected PersonClass person;

    public AssistantClass(String name, int age) {
        this.teacher = new TeacherClass(name, age);
        this.student = new StudentClass(teacher);
        this.person = (PersonClass) this.teacher;
    }

    public void teach() { teacher.teach(); }
    public void learn() { student.learn(); }

    public int getAge() { return person.getAge(); }
    public void setAge(int age) { person.setAge(age); }
    public String getName() { return person.getName(); }
    public void setName(String name) { person.setName(name); }
    public void walk() { person.walk(); }
}
```

---

## Using Clprolf Features for Interface Inheritance

Clprolf provides additional features that make interfaces behave more like abstract classes:

* `@Version_inh` and `@Capacity_inh` replace `@Compat_interf_version` and `@Compat_interf_capacity`.
* `@Nature` replaces `extends` in interface hierarchies.
* Interface roles must match exactly in implementations (e.g. `@Agent` must correspond to `@Agent`).
* `@Forced_inh` (instead of `@Forced_int_inh`) can be used to enforce coherence.

Example with the `Assistant` case:

```java
@Agent
@Version_inh
public interface Assistant extends @Nature Teacher, Student { }

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
@Forced_inh
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

## Another Example: The Mule

To illustrate further, let’s model a **Mule**, which inherits from both `Donkey` and `Horse`.

```java
public version_inh agent Mule nature Donkey, Horse {
    void carryHeavyLoad();
}

public version_inh agent Donkey nature Animal {
    void longRun(int distance);
}

public version_inh agent Horse nature Animal {
    void fastRun(int distance);
}

public version_inh agent Animal {
    String getName();
    int getAge();
    void sleep();
}
```

The implementations follow the same principle:

* Each interface has its class,
* `MuleClass` uses composition (donkey + horse + animal),
* Shared state is maintained in `AnimalClass`.

---

## The SharedState Mechanism

When multiple roles (like `Teacher`, `Student`, `Person`) coexist in the same object, we need a way to **synchronize their data**.
Otherwise, each role would have its own copy of fields such as `name` or `age`, and consistency would be lost.

We can solve this by using an **inner state object**, shared between all roles.
This `SharedState` (here called `PersonState`) centralizes the properties, and each role accesses them through delegation.

### Example: PersonClass with SharedState

```java
@Agent
public class PersonClass {
    // The shared state
	@Abstraction
    protected class PersonState {
        private String name;
        private int age;

        public PersonState(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    private PersonState sharedState;

    public void setSharedState(PersonState sharedState) {
        this.sharedState = sharedState;
    }

    public PersonState getSharedState() {
        return this.sharedState;
    }

    // Delegation to shared state
    public String getName() { return sharedState.getName(); }
    public void setName(String name) { sharedState.setName(name); }
    public int getAge() { return sharedState.getAge(); }
    public void setAge(int age) { sharedState.setAge(age); }

    // Constructor
    public PersonClass(String name, int age) {
        this.sharedState = new PersonState(name, age);
    }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}
```

### Usage in TeacherClass and StudentClass

Both `TeacherClass` and `StudentClass` receive a **reference to the same shared state**, ensuring data consistency.

```java
@Agent
public class TeacherClass extends @Nature PersonClass implements @Contracts Teacher {
    public TeacherClass(String name, int age) {
        super(name, age);
    }

    // Constructor to reuse the shared state from another role
    public TeacherClass(PersonClass personTwin) {
        super(null, 0); // enforced by Java
        this.setSharedState(personTwin.getSharedState());
    }

    public void teach() {
        System.out.println(getName() + " is teaching.");
    }
}
```

The same approach is used in `StudentClass`.

---

✅ With this mechanism, all roles of an `Assistant` (`Teacher`, `Student`, `Person`) share the **same values** for `name` and `age`.

---
