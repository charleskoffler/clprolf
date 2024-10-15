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
public class AssistantClass extends @Nature PersonClass implements @Contracts Assistant { //clprolf: we prefer repeating "@Contracts Teacher, Student" for clarity
	
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
	
## Inheritance with interfaces that is not really inheritance

Sometimes, we can talk about inheritance, when we meet the case of interface for giving a capacity, or indicating a version. But this is not really inheritance, unlike the previous case.
It is sometimes referred to as inheritance, but it is more of a contract, it's more about implementing an interface. Unlike full inheritance, it does not include inheriting the implementation.

### Conclusion

In Clprolf, you can use interface for multiple inheritance anyway, with the generic "@Compat_interf", or with a corrected version, with enforced compat_interf_versions. It is not a good practice in clprolf, and a solution is proposed with a specific design pattern to obtain this without multiple interface inheritance.
Another Clprolf design pattern, not recommended but correct, is possible, to allow multiple inheritance with interfaces, is improved but still has the code reuse problem.
