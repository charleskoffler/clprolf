package org.clprolf.patterns.multiinh.notrecomm.impl;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Nature;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Assistant;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;

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
