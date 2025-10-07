package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Version_inh;

@Agent
@Version_inh
public interface Person {
	//Accessors
	public int getAge();
	public void setAge(int age);
	
	public String getName();
	public void setName(String name);
	//
	public void walk();
	
}
