package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Version_inh;

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
