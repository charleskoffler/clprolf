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