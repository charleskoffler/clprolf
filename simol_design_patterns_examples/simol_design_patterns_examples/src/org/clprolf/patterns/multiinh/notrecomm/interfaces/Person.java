package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;

@Compat_interf_version
public interface Person {
	//Accessors
	public int getAge();
	public void setAge(int age);
	
	public String getName();
	public void setName(String name);
	//
	public void walk();
	
}
