package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Nature;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;

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
