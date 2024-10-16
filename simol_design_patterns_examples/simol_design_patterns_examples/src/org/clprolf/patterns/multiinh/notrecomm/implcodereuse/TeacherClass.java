package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Nature;

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
