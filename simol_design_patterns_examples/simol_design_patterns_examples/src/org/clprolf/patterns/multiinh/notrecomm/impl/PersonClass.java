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