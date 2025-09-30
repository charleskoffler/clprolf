package org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Nature;
import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Dog;

@Agent
public class DogImpl extends @Nature AnimalImpl implements @Contracts Dog {
	public void bark(int duration){
		System.out.println("The dog is barking for " + duration + "s");
	}
}
