# Multiple Inheritance with Interfaces in clprolf

## Let's take the example

Imagine an Assistant class, which should inherit from both a Teacher and Student classes. And imagine that both Teacher and Student inherit from Person. This is called the diamond inheritance problem, because Assistant inherits from two persons.
	
We can not do that in Clprolf and Java, because there is only single inheritance.
	
Clprolf proposes a specific clprolf pattern for that.
	
In Java, we can use interfaces for that case. A classical solution used is to create Teacher and Student interfaces, and implement them in the Person class.
	
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
	public class Person implements /* @Contracts (clprolf) */Teacher, Student {
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
	
We can notice some things:
	
* The inheritance is done reversed in that case. This is the person who is a teacher and a student. While we wanted a teacher and a student to be a person, we have a person who is a student and a teacher.
	
* When using an interface like for compat_interf_capacity, or compat_interf_version, the usage is intuitive, and never reversed. A ClientDAOImpl is a DAO, and not a DAO is a ClientDAOImpl. An Array is a Sortable, not a Sortable is an Array. So we can recognize the case with that observation.
	
* We don't have the "Assistant" class, or even the interface. This "incredible" class Assistant, is not mentioned, but it is finally the whole class Person.
	
* Loose coupling is enforced, even if we don't want it. At usage, we must use only the interfaces, even if we need implementations.
	
* We can, in fact, with that solution, share the same Person object, between the teacher and the student, and that is great.
	
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
	public class Person implements /* @Contracts (clprolf) */ Teacher, Student, PersonInterf { //clprolf: Person is an implementation of the two version interfaces!
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
	
Some pitfalls remains, but it looks better? No? By extending PersonInterf, the Teacher and Student interfaces are now truly Person. So it looks better like true inheritance about the "interface"(list of the methods) itself.
	
And we don't use @Compat_interf anymore, and rather precise clprolf interfaces.
	
## Inheritance with interfaces that is not really inheritance

Sometimes, we can talk about inheritance, when we meet the case of interface for giving a capacity, or indicating a version. But this is not really inheritance, unlike the previous case.
It is sometimes referred to as inheritance, but it is more of a contract, it's more about implementing an interface. Unlike full inheritance, it does not include inheriting the implementation.

### Conclusion

In Clprolf, you can use interface for multiple inheritance anyway, with the generic "@Compat_interf", or with a corrected version, with enforced compat_interf_versions. It is not a good practice in clprolf, and a solution is proposed with a specific design pattern.
