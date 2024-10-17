# Multiple Inheritance with Interfaces in clprolf

## Let's take the example

Imagine an Assistant class, which should inherit from both a Teacher and Student classes. And imagine that both Teacher and Student inherit from Person. This is called the diamond inheritance problem, because Assistant inherits from two persons.
	
We can not do that in Clprolf and Java, because there is only single inheritance.
	
Clprolf proposes a specific clprolf pattern for that.
	
In Java, we can use interfaces for that case. A classical solution used is to create Teacher and Student interfaces, and implement them in the PersonImpl class.
	
So for that, this is not directly possible in clprolf, except if you use the generic "compat_interf" keyword. But it should not be used.
	
```Java
	@Compat_interf //If we use Clprolf
	public interface Teacher {
		void teach();
	}
	
	@Compat_interf //If we use Clprolf
	public interface Student {
		void learn();
	}
	
	@Agent //If clprolf
	public class PersonImpl implements /* @Contracts (clprolf) */Teacher, Student {
		private int age;
		private String name;
		
		//For Teacher
		public void teach(){
		}
		//For Student
		public void learn(){
		}
		//Members of PersonImpl
		//(...)
		
		public void walk(){
		}
	}
```
	
We can notice some things:
	
* The inheritance is done reversed in that case. This is the person who is a teacher and a student. While we wanted a teacher and a student to be a person, we have a person who is a student and a teacher.
	
* When using an interface like for compat_interf_capacity, or compat_interf_version, the usage is intuitive, and never reversed. A ClientDAOImpl is a DAO, and not a DAO is a ClientDAOImpl. An Array is a Sortable, not a Sortable is an Array. So we can recognize the case with that observation.
	
* We don't have the "Assistant" class, or even the interface. This "incredible" class Assistant, is not mentioned, but it is finally the whole class Person.
	
* Loose coupling is enforced, even if we don't want it. At usage, we must use only the interfaces, even if we need implementations.
	
* We can, in fact, with that solution, share the same PersonImpl object, between the teacher and the student, and that is great.
	
* The teacher and the student are not really a person, because we inherit only of the implementation, and not of the interface of Person. So the Teacher and Student interfaces should extend a Person interface. So the user of the Teacher could access the Person methods.
	
Corrected example:
	
```Java
	@Forced_int_inh // If we use Clprolf! We enforce because a version should not inherit from another version.
	@Compat_interf_version //
	public interface Teacher extends PersonInterf {
		void teach();
	}
	
	@Forced_int_inh // If we use Clprolf! We enforce because a version should not inherit from another version.
	@Compat_interf_version //
	public interface Student extends PersonInterf {
		void learn();
	}
	
	@Compat_interf_version //For clprolf
	public interface PersonInterf {
		public void walk();
		//(...)
	}
	
	@Agent //If clprolf
	public class PersonImpl implements /* @Contracts (clprolf) */ Teacher, Student, PersonInterf { //clprolf: PersonImpl is an implementation of the two version interfaces!
		private int age;
		private String name;
		
		//For Teacher
		public void teach(){
		}
		//For Student
		public void learn(){
		}
		//Members of Person
		//(...)
		
		public void walk(){
		}
	}
```
	
Some pitfalls remains, but it looks better? No? By extending PersonInterf, the Teacher and Student interfaces are now truly persons. So it looks better like true inheritance about the "interface"(list of the methods) itself.
	
And we don't use @Compat_interf anymore, and rather precise clprolf interfaces.
	
### A (not recommended) clprolf design pattern for true multiple inheritance with Interfaces

Let's push the concept further, and imagine a implementation-less world. So we think objects only about their interfaces, but the rest remains the same.
And there are loose coupling, so we can put an implementation, or another.
In our pattern, the interface hierarchy is the same as if we was using classes. We add an Assistant interface, extending Teacher and Student. So, thanks to interface extension, also called the interface inheritance, we can arrive in the implementation-less world.
The Teacher and The Student extend the Person interface, and the Assistant only extends Teacher and Student.
So the reversed inheritance in the class doesn't exist anymore, because we now use a class AssistantClass. This class is a version of the implementation, for the Assistant @Compat_interf_version.
It remains a problem: code reuse, but we improved the system by using a true and separated Person class.

```Java

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

//The implementation-less world: the interfaces hierarchy is ideal and intuitive.

@Forced_int_inh // We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Compat_interf_version
public interface Assistant extends Teacher, Student {
	
}

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;

@Compat_interf_version
public interface Person {
	//Accessors
	public int getAge();
	public void setAge(int age);
	
	public String getName();
	public void setName(String name);
	//
	public void walk();
	
}

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

@Forced_int_inh
@Compat_interf_version //
public interface Student extends Person {
	void learn();
}

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

@Forced_int_inh// We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Compat_interf_version
public interface Teacher extends Person {
	void teach();
}

package org.clprolf.patterns.multiinh.notrecomm.impl;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Assistant;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Nature;

/* AssistantClass is just a version of implementation, for the compat_interf_version Assistant.
So we only implement Assistant! PersonClass is inherited. */
@Agent
public class AssistantClass extends @Nature PersonClass implements @Contracts Assistant {
	
	public AssistantClass(String name, int age){
		super.setAge(age);
		super.setName(name);
	}
	
	//For Teacher
	public void teach(){
		System.out.println("I'm teaching!");
	}
	
	//For Student
	public void learn(){
		System.out.println("I'm learning");
	}

}

package org.clprolf.patterns.multiinh.notrecomm.impl;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Person;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

/*  The PersonClass now contain only true members of the pure PersonClass.
It is an implementation of the compat_interf_version Person interface. */
@Agent
public class PersonClass implements @Contracts Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Members of Person
	
	public void walk(){
		System.out.println("I'm walking! ");
	}
}

package org.clprolf.patterns.multiinh.notrecomm;

import org.clprolf.patterns.multiinh.notrecomm.impl.AssistantClass;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Person;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

/**
 * The not recommended functional clprolf design pattern, for multiple inheritance
 * with interfaces.
 * 
 * @author Charles Koffler
 * 
 */
@Worker_agent
public class Launcher {
/* Execution output:
I'm walking! 
I'm learning
I'm teaching!
Test of Person polymorphism
The person John is going to walk: 
I'm walking! 
Test of Student polymorphism
The student John is going to learn: 
I'm learning
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
I'm teaching!
End of test */
	
    public static void main(String[] args) {
        AssistantClass john = new AssistantClass("John", 36);
        john.walk();
        john.learn();
        john.teach();
        Launcher.testPerson(john);
        Launcher.testStudent(john);
        Launcher.testTeacher(john);
    }
    
    public static void testPerson(@With_compat Person person) {
    	System.out.println("Test of Person polymorphism");
    	System.out.println("The person " + person.getName() + " is going to walk: ");
    	person.walk();
    }
    
    public static void testStudent(@With_compat Student student) {
    	System.out.println("Test of Student polymorphism");
    	System.out.println("The student "+student.getName() + " is going to learn: ");
    	student.learn();
    	System.out.println("End of test");
    }
    
    public static void testTeacher(@With_compat Teacher teacher) {
    	System.out.println("Test of Teacher polymorphism");
    	System.out.println("The teacher "+teacher.getName() + " is going to teach: ");
    	teacher.teach();
    	System.out.println("End of test");
    }
}
	
```

Conclusion:
It is not recommended because multiple inheritance is not allowed in clprolf, and because we enforced the rules of inheritance of the compatibility interfaces.
The question is now is it great to have objects which have many natures? It seems that beyond the philosophical question, it adds complexity to the design.
Indeed, sometimes it would become hard to tell if the inheritance is a composed object, or an inheritance. 
	
### The not recommended clprolf design pattern with code reuse

We can improve our design pattern to allow code reuse of the implementations. For example, the StudentClass and the TeachClass could be instanciated and live without the AssistantClass.
To achieve this, we can use the same mechanism as the recommended clprolf design pattern, with an inner class in the Person class. It adds complexities so I don't put the code here.
The Assistant class would have two composition objects, for TeacherClass and StudentClass. And those objects would have shared properties for their person part.
All this can be done only be changing the implementation package of the not recommended pattern.

Here is the source code, just for the changing classes:

```java

package org.clprolf.patterns.multiinh.notrecomm;

import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.AssistantClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.TeacherClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.StudentClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.PersonClass;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Person;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

/**
 * The not recommended functional clprolf design pattern, for multiple inheritance
 * with interfaces, and code reuse.
 * 
 * @author Charles Koffler
 * 20241015
 */
@Worker_agent
public class LauncherCodeReuse {
/* Execution output:
*** TEST OF AN ASSISTANT ***
John is walking.
John is learning.
John is teaching.
Test of Person polymorphism
The person John is going to walk: 
John is walking.
Test of Student polymorphism
The student John is going to learn: 
John is learning.
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
John is teaching.
End of test
*** TEST OF A TRUE TEACHER ***
Test of Person polymorphism
The person Angela is going to walk: 
Angela is walking.
Test of Teacher polymorphism
The teacher Angela is going to teach: 
Angela is teaching.
End of test
*** TEST OF A TRUE STUDENT ***
Test of Person polymorphism
The person Mary is going to walk: 
Mary is walking.
Test of Student polymorphism
The student Mary is going to learn: 
Mary is learning.
End of test
*** NEW TEST WITH THE ASSISTANT ***
John is walking.
John is learning.
John is teaching.
Test of Person polymorphism
The person John is going to walk: 
John is walking.
Test of Student polymorphism
The student John is going to learn: 
John is learning.
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
John is teaching.
End of test

 */
	
    public static void main(String[] args) {
    	System.out.println("*** TEST OF AN ASSISTANT ***");
        AssistantClass john = new AssistantClass("John", 36);
        john.walk();
        john.learn();
        john.teach();
        LauncherCodeReuse.testPerson(john);
        LauncherCodeReuse.testStudent(john);
        LauncherCodeReuse.testTeacher(john);
        //
        System.out.println("*** TEST OF A TRUE TEACHER ***");
        TeacherClass trueTeacherAngela = new TeacherClass("Angela", 54);
        LauncherCodeReuse.testPerson(trueTeacherAngela);
        LauncherCodeReuse.testTeacher(trueTeacherAngela);
        //
        System.out.println("*** TEST OF A TRUE STUDENT ***");
        StudentClass trueStudentMary = new StudentClass("Mary", 21);
        LauncherCodeReuse.testPerson(trueStudentMary);
        LauncherCodeReuse.testStudent(trueStudentMary);
        //
        System.out.println("*** NEW TEST WITH THE ASSISTANT ***");
        john.walk();
        john.learn();
        john.teach();
        LauncherCodeReuse.testPerson(john);
        LauncherCodeReuse.testStudent(john);
        LauncherCodeReuse.testTeacher(john);
    }
    
    public static void testPerson(@With_compat Person person) {
    	System.out.println("Test of Person polymorphism");
    	System.out.println("The person " + person.getName() + " is going to walk: ");
    	person.walk();
    }
    
    public static void testStudent(@With_compat Student student) {
    	System.out.println("Test of Student polymorphism");
    	System.out.println("The student "+student.getName() + " is going to learn: ");
    	student.learn();
    	System.out.println("End of test");
    }
    
    public static void testTeacher(@With_compat Teacher teacher) {
    	System.out.println("Test of Teacher polymorphism");
    	System.out.println("The teacher "+teacher.getName() + " is going to teach: ");
    	teacher.teach();
    	System.out.println("End of test");
    }
}

```

```java

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Assistant;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;


@Agent
public class AssistantClass implements @Contracts Assistant, Teacher, Student {
	protected TeacherClass teacher;
	protected StudentClass student;
	protected PersonClass person;
	
	public AssistantClass(String name, int age){
		//We are choosing the teacher as the first twin, but it could be the student!
		this.teacher = new TeacherClass(name, age);
		this.student = new StudentClass(teacher); //Passing the teacher to the student, for the person part of the teacher.
		this.person = (PersonClass)this.teacher;
	}
	
	//For Teacher
	public void teach(){
		this.teacher.teach();
	}
	
	//For Student
	public void learn(){
		this.student.learn();
	}

	//For person
	public int getAge() {
		return this.person.getAge();
	}
	public void setAge(int age) {
		this.person.setAge(age);
	}
	
	public String getName() {
		return this.person.getName();
	}
	public void setName(String name) {
		this.person.setName(name);
	}
	//
	public void walk() {
		this.person.walk();
	}
}

```

```Java

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Agent;

@Agent //This class do not need to be abstract.
public class PersonClass {
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

    // internal properties accessed only via accessors.
    private PersonProperties sharedProperties;
    
    public void setSharedProperties(PersonProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}
    
    public PersonProperties getSharedProperties() {
		return this.sharedProperties;
	}

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
    
    /*
     * Only for the main role.
     */
    public PersonClass(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
        
    }
    
    // All persons know walking!
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}

```

```Java

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.simol.simolframework.java.Contracts;

public class StudentClass extends @Nature PersonClass implements @Contracts Student {
	//For usage without AssistantClass, or for giving the first role!
	public StudentClass(String name, int age) {
    	super(name, age);
    }
	
    public StudentClass(PersonClass personTwin) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(personTwin.getSharedProperties());
    }
    
    public void learn() {
        System.out.println(this.getName() + " is learning.");
    }
}


```

```java

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Contracts;

@Agent
public class TeacherClass extends @Nature PersonClass implements @Contracts Teacher {
	
	//For usage without AssistantClass, or for giving the first role!
	public TeacherClass(String name, int age) {
    	super(name, age);
    }
	
    public TeacherClass(PersonClass personTwin) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(personTwin.getSharedProperties());
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching.");
    }
}


```

### Inheritance with interfaces that is not really inheritance

Capacity and versioning interfaces are particuliar interfaces, that do not need code reuse of the implementation. So it is rather contracts. We can call them inheritance, but it is rather capacity inheritance, or version inheritance.
So we can stay in the implementation-less world, even in these cases, if we prefer.

### The (optional) clprolf annotations and features for the inheritance by interfaces fans

There is some optional features, for those who prefer talking about inheritance, for the interfaces, and aims to prefer the implementation-less world. So here, interfaces are viewed quite like classes without implementations.

When a with_compat occured, it is quite like we would have change the API of the class used by the object, and replaced it by the wanted implemented interface. So the object becomes now in a new hierarchy, the hierarchy of the interface. And here is the implemented-less world, where we forget the implementation classes.
In all this hierarchy, it could also have capacity and version inheritances. So we can optionaly add, in the case of a usage of interface for this pure interface world, @Agent (or all class roles allowed) above an interface declaration. And the class implementing this version interface should have exactly the same class role, for coherence. The compiler will check this: not an equivalent role, but exactly the same role(here @Agent, and not @Simu_real_obj, for example).
The @Compat_interf_version would have an equivalent @Version_inh, and @Compat_interf_capacity = @Capacity_inh, especially for this vision. No class role can be write for a @Capacity_inh.

The class roles used on the interfaces will be checked exactly the same way except that it will be in the hierarchy of the interface. @Forced_inh, and not @Forced_int_inh, has to be written to enforce the roles coherence rules.
@Nature is allowed for the "extends" of an interface, even in case of multiple inheritance. So for the interfaces, we can have multiple natures, but the meaning of nature is still there. An agent-like role have to keep his nature(s) by extending interfaces with an equivalent role, and this is the same with the worker-agent-like interface roles. All the capacity interfaces are accepted for inheritance, because there can not have roles.
It is not recommended to have multiple natures, but allowed for the interfaces.

When a role annotation is present on an interface, like @Agent, for example, the "@Version_inh"(nor @Compat_interf_version) is not mandatory.
When a class role is present on an interface, and extends an interface with a marked class role too, the enforcing of inheritance @Forced_int_inh is not mandatory.
But in the language, the syntax is 'version_inh agent(or another class role) Teacher (...)".

Conclusion: we can use the class roles for the interfaces, if we prefer talking about inheritance for interfaces. And it exists @Version_inh and @Capacity_inh too. But this is optional is clprolf, and multiple inheritance (except for capacity inheritance) is not recommended.

The previous example, with the optional annotations:

```java

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

//The implementation-less world: the interfaces hierarchy is ideal and intuitive

@Agent //Optional for the interfaces!
@Forced_int_inh // We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Version_inh
public interface Assistant extends @Nature Teacher, Student { //@Nature is optional. When used, Teacher and Student has to be exactly of the same role.
	
}

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Version_inh;

@Agent
@Version_inh
public interface Person {
	//Accessors
	public int getAge();
	public void setAge(int age);
	
	public String getName();
	public void setName(String name);
	//
	public void walk();
	
}

package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

@Agent
@Forced_int_inh
@Version_inh
public interface Student extends @Nature Person {  //Nature is optional for the interfaces.
	void learn();
}


package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

@Agent
@Forced_int_inh// We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Version_inh
public interface Teacher extends @Nature Person { //Nature is optional for the interfaces.
	void teach();
}

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Assistant;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;


@Agent //If class role on the interface Teacher, here we have exactly the same role.
public class AssistantClass implements @Contracts Assistant, Teacher, Student {
	protected TeacherClass teacher;
	protected StudentClass student;
	protected PersonClass person;
	
	public AssistantClass(String name, int age){
		//We are choosing the teacher as the first twin, but it could be the student!
		this.teacher = new TeacherClass(name, age);
		this.student = new StudentClass(teacher); //Passing the teacher to the student, for the person part of the teacher.
		this.person = (PersonClass)this.teacher;
	}
	
	//For Teacher
	public void teach(){
		this.teacher.teach();
	}
	
	//For Student
	public void learn(){
		this.student.learn();
	}

	//For person
	public int getAge() {
		return this.person.getAge();
	}
	public void setAge(int age) {
		this.person.setAge(age);
	}
	
	public String getName() {
		return this.person.getName();
	}
	public void setName(String name) {
		this.person.setName(name);
	}
	//
	public void walk() {
		this.person.walk();
	}
}

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Agent;

@Agent //This class do not need to be abstract.
public class PersonClass {
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

    // internal properties accessed only via accessors.
    private PersonProperties sharedProperties;
    
    public void setSharedProperties(PersonProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}
    
    public PersonProperties getSharedProperties() {
		return this.sharedProperties;
	}

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
    
    /*
     * Only for the main role.
     */
    public PersonClass(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
        
    }
    
    // All persons know walking!
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

@Agent
public class StudentClass extends @Nature PersonClass implements @Contracts Student {
	//For usage without AssistantClass, or for giving the first role!
	public StudentClass(String name, int age) {
    	super(name, age);
    }
	
    public StudentClass(PersonClass personTwin) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(personTwin.getSharedProperties());
    }
    
    public void learn() {
        System.out.println(this.getName() + " is learning.");
    }
}

package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

@Agent //If class role on the interface Teacher, here we have exactly the same role.
public class TeacherClass extends @Nature PersonClass implements @Contracts Teacher {
	
	//For usage without AssistantClass, or for giving the first role!
	public TeacherClass(String name, int age) {
    	super(name, age);
    }
	
    public TeacherClass(PersonClass personTwin) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(personTwin.getSharedProperties());
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching.");
    }
}

```

### Another example in clprolf language, of interface inheritance with optional features

Imagine we want use multiple inheritance for an hybrid animal, a mule.

First, we create the interfaces, as if it were our classes! So we are using class roles. The inheritances are true inheritances, in the hierarchical sense.

```Java

// The coherence of interface inheritance are checked, about the class roles! Mule can not extends a worker_agent interface, for example.
public version_inh agent Mule nature Donkey, Horse {
	public void carryHeavyLoad();
}


public version_inh agent Donkey nature Animal {
	//The donkey has endurance
	public void longRun(int distance);

}

public version_inh agent Horse nature Animal {
	public void fastRun(int distance);
}

public version_inh agent Animal {
	public String getName();
	public int getAge();
}
```

Now we have to write the implementations. There is a class for each agent, even in multiple inheritance.

The Mule class, as "inheriting" from the Mule interface, has to add wrappers for Donkey, Horse, and even Animal. Mule class don't have any inheritance. MuleClass uses composition too, and keep an instance of a horse and a donkey. It also uses a Animal object, found in the horse or the donkey.

The Donkey and Horse classes are as usual, inheriting from AnimalClass. They have two constructors, one taking directly a MuleClass, to obtain the sharedProperties.

The Animal class will have its properties shared (thanks to an inner class), with two constructors at least. A classical constructor, and a constructor for accepting a properties shared object.

So the implementations are quite intuitive, and we can instanciate true horses or donkeys.

```java

public agent MuleClass implements contracts Mule {
	protected DonkeyClass donkey;
	protected HorseClass horse;
	protected AnimalClass animal;
	
	public MuleClass(String name, int age){
		this.donkey = new DonkeyClass(name, age);
		this.horse = new HorseClass(Donkey); 
		this.animal = (AnimalClass)this.Donkey;
	}
	
	//For Donkey
	public void longRun(){
		this.donkey.longRun();
	}
	
	//For Horse
	public void fastRun(){
		this.horse.fastRun();
	}

	//For Animal
	public int getAge() {
		return this.animal.getAge();
	}

	public void setAge(int age) {
		this.animal.setAge(age);
	}
	
	public String getName() {
		return this.animal.getName();
	}
	public void setName(String name) {
		this.animal.setName(name);
	}
	public void sleep {
		this.animal.sleep();
	}
	//
	public void carryHeavyLoad() {
		//(…)
	}
}

public agent AnimalClass {
        protected class AnimalProperties {
        	private String name;
        	private int age;

        	public AnimalProperties(String name, int age) {
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

    private AnimalProperties sharedProperties;
    
    public void setSharedProperties(AnimalProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}
    
    public AnimalProperties getSharedProperties() {
		return this.sharedProperties;
	}

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
    
    public AnimalClass(String name, int age) {
        this.sharedProperties = new AnimalProperties(name, age);
        
    }
    
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }
}


public agent HorseClass extends nature AnimalClass contracts Horse {
	public HorseClass(String name, int age) {
    	super(name, age);
    }
	
    public HorseClass(MuleClass theMule) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(theMule.donkey.getSharedProperties());
    }
    
    public void fastRun() {
        System.out.println(this.getName() + " fast running.");
    }
}


public agent DonkeyClass nature AnimalClass contracts Donkey {
	public DonkeyClass(String name, int age) {
    	super(name, age);
    }
	// It is better to pass a mule, for security reasons, to be sure to create a donkey from a mule, and not from an individual horse.
    public DonkeyClass(MuleClass theMule) {
        super(null, 0);  // enforced by Java.
        this.setSharedProperties(MuleClass.horse.getSharedProperties());
    }

    public void longRun() {
        System.out.println(this.getName() + " is longRuning.");
    }
}

```
Conclusion: we have true inheritance, not simulated, with enforced loose coupling, and we achieve this in an intuitive way for the interfaces. The implementations remains quite easy and coherent to write. 

## Conclusion

In Clprolf, you can use interface for multiple inheritance anyway, with the generic "@Compat_interf", or with a corrected version, with enforced compat_interf_versions. It is not a good practice in clprolf, and a solution is proposed with a specific design pattern to obtain this without multiple interface inheritance.
Another Clprolf design pattern, not recommended but correct, is possible, to allow multiple inheritance with interfaces, is improved. It does the job with or without the code reuse problem.
Interfaces can be used for the implemented-less world in all the cases, even while talking about capacity or version inheritance.
There is a way to use inheritance for interfaces directly in the language, but this is optional. The class roles are allowed above interfaces, except capacity inheritances. And there is capacity_inh and version_inh equivalent keywords to classical interface roles.
Multiple inheritance, except for capacities, is still not recommended in clprolf, even with that option.
