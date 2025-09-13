# Using Clprolf for Complex Object-Oriented Designs

Object-oriented designs can quickly become **complex and difficult to master — or even to remember**.
We are going to see this with a classic example: the **diamond problem** of multiple inheritance.

Clprolf helps here by enforcing clarity:

* each agent has one main role,
* additional roles can be added as secondary agents,
* and shared properties remain synchronized.

The solution may still be complex — but it is **structured, explicit, and maintainable**.
Instead of ad-hoc tricks, Clprolf provides a natural way to face the difficulty head-on and arrive at a clean design.

---

## The Problem

In C++, if we have a `Student` class and a `Teacher` class, both children of `Person`, and if we add an `Assistant` class inheriting from both, we face the **diamond problem**.
C++ provides a technical fix with the `virtual` keyword, which ensures that the common parts of the inheritance are shared.

In Clprolf, we approach it differently.
Instead of creating an `Assistant` class, we keep the `Teacher` or `Student` class as the main role, and then create a **clone of the same person** for the second role.
This way, each role remains clear and consistent, while still representing the same underlying person.

---

## The Clprolf Perspective

In Clprolf, an `@Agent` has only one nature (`@Nature Person`).
But we also want the person to be able and free to act as another role temporarily, or in private life.
So this person can be truly a teacher during this time, or a student, and benefit from polymorphism if needed.

The obtained system is close to multiple inheritance, but each person only has a main nature.
All derived classes are specialized agents, able to do a job, with methods and properties for that job (like `learn()`).

---

## Here's How It Works in Use

First, we create an agent with a main role, e.g. an `Engineer`.
Then we create a `Student` agent, and add it to Pierre, making him also a student.
We also add a `Teacher` agent.

If we need to call a method of an object that has a `Teacher` parameter, we can pass Pierre’s secondary agent.
It is almost like ubiquity — but all three instances represent the same person, with shared properties.

---

## A Clprolf Solution

We obtain a practical Clprolf solution for handling multiple inheritance.
It is close to multiple inheritance, because we have multiple `Person` objects for one main person.
But it goes further: roles can be added even if they were not foreseen.

This is a **pure Clprolf solution**, obtained by applying Clprolf principles.

---

## The Shared state

We must maintain the state shared between clones.
In case of property modifications, the information remains coherent across all roles.
That’s why we introduce an internal class to handle synchronization.

---


## Total source code

---

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Worker_agent;

@Worker_agent
public class Launcher {
/*
    Using the main role
    Pierre is making a system.
    Using the secondary roles
    Pierre is teaching.
    Pierre is learning.
    End of work!
    Pierre is teaching.
    Pierre is learning.
    Pierre is making a system.
    Age of pierreStudent: 42
    Pierre is walking.
*/
    public static void main(String[] args) {
        // Pierre is first an engineer (primary role).
        Engineer pierre = new Engineer("Pierre", 30);

        // Add a Teacher role (secondary clone).
        Teacher pierreTeacher = new Teacher();
        pierre.addAgent(pierreTeacher);

        // Add a Student role (secondary clone).
        Student pierreStudent = new Student();
        pierre.addAgent(pierreStudent);

        // Use roles (primary + secondary).
        pierre.useRoles();

        // Update through a secondary role:
        pierreTeacher.setAge(42);

        pierreTeacher.teach();
        pierreStudent.learn();

        // Pierre is still an engineer as primary occupation!
        pierre.design();

        // Ensure teacher's update is reflected on student
        System.out.println("Age of pierreStudent: " + pierreStudent.getAge());

        // Common ability
        pierre.walk();

        // From any clone, you can access the primary role (the "parent"):
        System.out.println("Primary role name from teacher: " + pierreTeacher.getPrimaryRole().getName());
    }
}
```

---

```java
package org.clprolf.patterns.multiinh;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Worker_agent;

@Agent
public abstract class Person {
    //
    // Shared, synthetic attributes container for all clones of the same person.
    @Abstraction // Abstraction because it models the shared state of a person
    protected class SharedState {
        private String name;
        private int age;

        public SharedState(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    /* A person has exactly one primary role (the main instance). */
    private Person primaryRole;

    // Shared state across all roles/clones.
    private SharedState sharedState;

    // Only the primary role manages the list of secondary roles.
    private List<Person> agents;

    // ===== Wiring & accessors =====

    protected void setSharedState(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    public String getName()            { return sharedState.getName(); }
    public int    getAge()             { return sharedState.getAge(); }
    public void   setName(String name) { sharedState.setName(name); }
    public void   setAge(int age)      { sharedState.setAge(age); }

    public Person getPrimaryRole()     { return primaryRole; }

    // ===== Constructors =====

    /** Primary role constructor. */
    public Person(String name, int age) {
        this.sharedState = new SharedState(name, age);
        this.primaryRole = this;           // the main instance is self
        this.agents      = new ArrayList<>();
    }

    /** Secondary role constructor (clone). Will be wired by addAgent(). */
    public Person() {
        this.sharedState = null;           // set later by addAgent()
        this.primaryRole = null;           // set later by addAgent()
        this.agents      = null;           // clones don't manage sub-roles
    }

    // ===== Roles management (primary only) =====

    /** Add a new role (clone) and wire it to the same shared state & primary role. */
    public void addAgent(Person agent) {
        if (this.agents == null) {
            throw new IllegalStateException("Secondary roles cannot add agents.");
        }
        agent.setSharedState(this.sharedState);
        agent.primaryRole = this;          // point to the parent (primary role)
        this.agents.add(agent);
    }

    // ===== Demo helpers =====

    /** Execute the role behavior of this instance, then secondary roles if any (primary only). */
    public void useRoles() {
        if (this.agents == null) {
            throw new IllegalStateException("useRoles() is only available on the primary role.");
        }
        System.out.println("Using the main role");
        performRole();

        if (!agents.isEmpty()) {
            System.out.println("Using the secondary roles");
            for (Person agent : agents) {
                agent.performRole();
            }
            System.out.println("End of work!");
        } else {
            System.out.println(getName() + " doesn't have secondary agents to use");
        }
    }

    /** Polymorphic hook: each subclass implements its own behavior. */
    protected abstract void performRole();

    /** Common ability. */
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}
```

---

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;

@Agent
public class Teacher extends @Nature Person {
    /** Primary role constructor. */
    public Teacher(String name, int age) {
        super(name, age);
    }

    /** Secondary role constructor. */
    public Teacher() {
        super();
    }

    @Override
    protected void performRole() {
        teach();
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching.");
    }
}
```

---

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;

@Agent
public class Student extends @Nature Person {
    /** Primary role constructor. */
    public Student(String name, int age) {
        super(name, age);
    }

    /** Secondary role constructor. */
    public Student() {
        super();
    }

    @Override
    protected void performRole() {
        learn();
    }

    public void learn() {
        System.out.println(this.getName() + " is learning.");
    }
}
```

---

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;

@Agent
public class Engineer extends @Nature Person {
    /** Primary role constructor. */
    public Engineer(String name, int age) {
        super(name, age);
    }

    /** Secondary role constructor. */
    public Engineer() {
        super();
    }

    @Override
    protected void performRole() {
        design();
    }

    public void design() {
        System.out.println(this.getName() + " is making a system.");
    }
}
```

---

### The Assistant Example in Code

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Worker_agent;

@Worker_agent
public class LauncherAssistantExample {

    public static void main(String[] args) {
        // The Assistant is primarily a Teacher
        Teacher assistant = new Teacher("Alice", 28);

        // But she is also a Student → we add a secondary Student role
        Student assistantStudent = new Student();
        assistant.addAgent(assistantStudent);

        // Using the roles
        System.out.println("--- Assistant in action ---");

        // Primary role
        assistant.teach();

        // Secondary role
        assistantStudent.learn();

        // Shared state
        System.out.println("Assistant's age from Student role: " + assistantStudent.getAge());

        // Common behavior
        assistant.walk();
    }
}
```

### Output

```
--- Assistant in action ---
Alice is teaching.
Alice is learning.
Assistant's age from Student role: 28
Alice is walking.
```

---

✨ With this pattern:

* No need for a separate `Assistant` class.
* Roles remain well-separated but synchronized.
* The design stays **clear, explicit, and maintainable**.

---


## Conclusion

This example proves that object-oriented designs can be tough — but with Clprolf, the complexity stays under control.
The language doesn’t make problems disappear; it makes them solvable in a clean and reliable way.

---
