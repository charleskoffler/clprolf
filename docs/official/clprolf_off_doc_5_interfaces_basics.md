# THE INTERFACES IN CLPROLF - THE BASICS AND THE SINGLE INHERITANCE OF INTERFACES

## THE BASICS

In Clprolf, interfaces are pure contracts, even for a capacity, or for versioning.
The keywords "compat_interf_version", and "compat_interf_capacity" replace "interface" of Java.
In the framework, we put @Compat_interf_version, or @Compat_interf_capacity above an interface definition.

### Compatibility interface

An Clprolf interface is called a compatiblity interface, to emphasize that it aims to ensure a compatibility.
So when we declare a variable of an interface type, we are asking an object compatible with this interface.

### "With_compat"

Each time we use an interface type, just before the name of the type, we have to add "with_compat" (with compatibility), or "@With_compat" annotation.
In this example, dao is a variable containing an object of a class compatible with the UserDAO interface. This highlights the places of loose coupling.
The sole place where not to write "with_compat" is for a return type of a method.

```java

@With_compat UserDAO dao;

```

### "Contracts"

In Clprolf, "implements" is replaced by "contracts" (plural of contract). Thus, when implementing an interface, we have to write the list of the fulfilled contracts.
The annotation "@Contracts" is used in the framework.

public class UserDAOImpl implements @Contracts UserDAO {

	//methods from UserDAO
	
	public User getUser(int id){
		//(…)
	}
	//(…)

}

### Capacity interface

This kind of interface is quite current, because there are many of this in Java. It is simply an "able"-like interface, which brings a capacity.
"Comparable" is a typical example of capacity, ensuring that a class implementing this is comparable. A class will generally implementing Comparable<thisClass>, and will be able to compare two elements of its own class. In the example below, the Car class has the capacity of compare cars.

Let's imagine a Clprolf wrapper for java.lang.Comparable:

```java

package clprolf.wrappers.java.lang;

import org.simol.simolframework.java.Compat_interf_capacity;

@Compat_interf_capacity
public interface ClpComparable<T> {
          public int compareTo(T o);
}

package org.clprolf.offdoc.examples.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

import clprolf.wrappers.java.lang.ClpComparable;

@Agent
public class Car implements @Contracts ClpComparable<Car> {
	private int year;
	private String name;
	
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	/**
	 * We wanted an old car to be superior to a young car.
	 */
	public int compareTo(Car otherCar){
		if (this.year < otherCar.year) return 1; //older
		else if (this.year > otherCar.year) return -1; //younger
		else return 0; //The same age
	}
}

import org.simol.simolframework.java.Worker_agent;

import clprolf.wrappers.java.lang.ClpComparable;

/**
 * Result: Comparaison between carOne and carTwo: -1
 * @author
 *
 */
@Worker_agent
public class Launcher {
	
	public static void main(String[] args){
		@With_compat ClpComparable<Car> comparableObj = new Car("Renault Clio 4", 2015);
		Car carTwo = new Car("Ford Mustang", 1967);

		System.out.println("Comparaison between carOne and carTwo: " + comparableObj.compareTo(carTwo) );
	}

}


```

### Version interface

The other kind of interfaces is the version interfaces. It is marked with the "compat_interf_version" keyword, replacing "interface". It is also indicated with "@Compat_interf_version" above an interface of the Java framework.
These interfaces are current in Java, and we always manipulate them without knowing it. It is typically used for loose coupling.
It defines a common interface of all versions of a unique object. All classes in contract with this interface will be a different implementation of the same object.
All version interface could have a class role, but indicate it is optional. We will see this later in the optional features for interface inheritance.
So if we are defining a version interface for a Stream, each StreamImplAuthorOne class, or StreamImplAuthorTwo, will be an implementation of the same Stream abstraction.

Let's take a example with java.sql.Connection:


```java

package clprolf.wrappers.java.sql;

import java.sql.Connection;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

/**
 * In clprolf, it's an interface to obtain different implementation versions of it!
 * The obtained implementing class, is only there to give a version of this.
 * 
 *
 */
@Forced_int_inh // We can not inherit from Java interfaces naturally. And we could not inherit from another compat_interf_version!
public @Compat_interf_version interface ClpConnection extends Connection {
	public void close() throws SQLException;
	//(…)
}


package me.awesomedatabase;

import clprolf.wrappers.java.sql.ClpConnection;

/**
Our version, for the AwesomeDatabase, of the ClpConnection interface!
**/
@Abstraction
public class MyAwesomeDatabaseConnection implements @Contracts ClpConnection {
//(…)
	public void close() throws SQLException {
		//(…)
	}
}


```

### The generic compat_interf

"compat_interf" is generic, and only for the language. Indeed, the framework already has the "interface" generic keyword of Java.
It means "compatibility interface", and it useful in case of an interface definition without role. It is not recommended to use it, but it adds flexibility.

```Java

public compat_interf MyMysteriousInterface {
	void myStrangeJob(String param);

}


```

### The interface inheritance rules - @Forced_int_inh

There are semantic rules for interface inheritance, or for the contracts of a class, to ensure role coherence between class and interfaces.

A version interface can't extend another version interface, to remain simple about the version meaning.
Any kind of interfaces can extend one or many capacity interfaces, because it's only capacity growing.

A class can only implement one version compatibility interface, because it can be only one implementation at a time. But it can be under contract with much capacity interfaces.

These rules are intuitive, and will be checked by the compiler or the semantic checker of the framework.
 
@Forced_int_inh annotation means "forced interface inheritance", and we can annotate with this in the language or framework.
It can be above an interface, or a class. 
Or we can be more precise on the target: it is just before a contract type of the "contracts" part. Or it can be before a type name of the "extends" part of an interface definition.
It allows to bypass the compiler checks.
