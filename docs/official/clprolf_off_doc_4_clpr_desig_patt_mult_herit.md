# A CLPROLF DESIGN PATTERN EXAMPLE WITH MULTIPLE INHERITANCE

## The problem

In clprolf, as with other languages, we can create design patterns. Some problems have not trivial solutions, as for the diamond problem.
In Java, multiple inheritance is not allowed, nor in clprolf. Some people use, in Java, interfaces as a "simulated multiple inheritance".
It does not exist, in clprolf, where interfaces are only for compatibility, and either for capacity or version.
In c++, if we have a Student class, and a Teacher class, both child of Person, and if we add an Assistant class which inherit from Student and Teacher, we have the diamond problem.
In our clprolf pattern, in that case, we propose to keep the Teacher or Student classes, but not to have the Assistant class. We first choose the main role between them, then we'll have a clone of the same person for the second role.

## The clprolf perspective

So in clprolf, we want here a design pattern for that, while staying in the language principles.
For example, imagine we have to create classes for a Person, and each Person could have multiple jobs. A agent has only one nature, with "@Nature", it is a Person.
But we want also to the person to be able and free to act as another role temporarily, or in private life. So this person would be truly a teacher during this time, or a student, and beneficit from polymorphism if wanted.
The obtained system is near from multiple inheritance, but the persons only have a main nature. All derived class is a specialized agent, able to do a work, and this having method and properties for this work, like "learn()".

## Here's how it works in use

First, we create an agent, as the main agent, an Engineer. Then we create a student agent, and add it to Pierre, to make Pierre having another job. We also add a Teacher Person agent.
If we have to call a method of an object that has a Teacher parameter, we can pass the secondary agent of Pierre if we want. So it's quite like ubiquity. But the three instances are for the same Person.
So the properties are shared.

## A clprolf design pattern

We obtain a clprolf design pattern for multiple inheritance handling. It is close to multiple inheritance, because we have multiple Person objects, for a sole main person.
And perhaps it goes further, because roles can be added that were not foreseen. It is a pure clprolf design pattern, obtained using clprolf principles.

## The shared properties

We have to maintain the properties shared between clones. In case of properties modifications, the clones information whould remain coherent. So this is why we put an internal class handling that.

## Total source code

```java
package org.clprolf.patterns.multiinh;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Agent;

@Agent
public abstract class Person {
    //
	// We have to do that work, for allowing sharing the properties between clones,
	// and especially permit automatic synchronization of datas!.
    protected class PersonProperties {
        private String name;
        private int age;

        public PersonProperties(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

        /* The person can have only one main role.  */
    private Person principalRole; // Le rôle principal
    
    // internal properties accessed only via accessors.
    private PersonProperties sharedProperties;
    
    public void setSharedProperties(PersonProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}

	//Not for clones!
    private List<Person> agents;

    // Getters and setters, as usual.
    public String getName() {
        return sharedProperties.getName();
    }

    public int getAge() {
        return sharedProperties.getAge();
    }
    
    public void setName(String name) {
        sharedProperties.setName(name);
    }

    public void setAge(int age) {
        sharedProperties.setAge(age);
    }
    
    public Person getPrincipalRole() {
        return principalRole;
    }
    
    /*
     * Only for the main role.
     */
    public Person(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
        
        this.principalRole = this;  // The main role is defined as the self person.
        
        // Instanciation of the collection only for the main person.
        
       this.agents = new ArrayList<>();
        
    }
    
    // Adding an agent as a new role, but being also a person
    public void addAgent(Person agent) {
        agent.setSharedProperties(this.sharedProperties); // Use of the same shared properties.
        if (agents != null) {
            agents.add(agent);
        }
    }

    // Use of the main agent, and of the collection if not empty.
    // This method is not allowed for secondary agents.
    public void useRoles() {
    	// Utiliser le rôle principal (this)
    	System.out.println("Using the main role");
        if (this instanceof Teacher) {
            ((Teacher) this).teach();
        } else if (this instanceof Student) {
            ((Student) this).learn();
        }
        else if (this instanceof Engineer) {
            ((Engineer) this).design();
        }

        if (agents != null && !agents.isEmpty()) {
        	System.out.println("Using the secondary roles");
            // Using secondary agents.
            for (Person agent : agents) {
                if (agent instanceof Teacher) {
                    ((Teacher) agent).teach();
                } else if (agent instanceof Student) {
                    ((Student) agent).learn();
                }
                else if (this instanceof Engineer) {
                    ((Engineer) this).design();
                }
            }
            System.out.println("End of work!");
        } else {
            System.out.println(getName() + " doesn't have secondary agents to use");
        }
    }

    // All persons know walking!
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}
```

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;

@Agent
public class Teacher extends @Nature Person {
	/*
	 * Only for the main role.
	 */
	public Teacher(String name, int age) {
    	super(name, age);
    }
	
    public Teacher() {
        super(null, 0);  // name and aged are managed by the "owner" person.
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching.");
    }
}
```

```java
package org.clprolf.patterns.multiinh;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;

@Agent
public class Student extends @Nature Person {
	/*
	 * Only for the main role.
	 */
	public Student(String name, int age) {
    	super(name, age);
    }
	 
    public Student() {
        super(null, 0);  // name and aged are managed by the "owner" person.
    }

    public void learn() {
        System.out.println(this.getName() + " is learning.");
    }
}
```

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
	Pierre is walking.*/
    public static void main(String[] args) {
        // Pierre is first an engineer.
    	Engineer pierre = new Engineer("Pierre", 30);

        // Adding a teacher role, but making a new "clone" agent at the same time.
        Teacher pierreTeacher = new Teacher();
        pierre.addAgent(pierreTeacher);

        // Making a new agent.
        Student pierreStudent = new Student();
        // Adding a student role.
        pierre.addAgent(pierreStudent);

        // Using the roles.
        pierre.useRoles();
        
        // or
        pierreTeacher.setAge(42);
        
        pierreTeacher.teach();
        
        pierreStudent.learn();
        
        //Pierre is still an engineer as main occupation!
        pierre.design();
        
     // Ensures that pierreTeacher's update has been reported on pierreStudent
        System.out.println("Age of pierreStudent: " + pierreStudent.getAge());
        
        // Pierre is walking. He exists even without doing a job!
        pierre.walk();
    }
}

```
