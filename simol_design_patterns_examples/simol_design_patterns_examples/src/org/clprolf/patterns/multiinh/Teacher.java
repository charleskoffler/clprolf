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