package org.clprolf.patterns.multiinh;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Nature;

@Agent
public class Engineer extends @Nature Person {
	/*
	 * Only for the main role.
	 */
    public Engineer() {
        super(null, 0);  // name and aged are managed by the "owner" person.
    }

    public Engineer(String name, int age) {
    	super(name, age);
    }
    
    public void design() {
        System.out.println(this.getName() + " is making a system.");
    }
}