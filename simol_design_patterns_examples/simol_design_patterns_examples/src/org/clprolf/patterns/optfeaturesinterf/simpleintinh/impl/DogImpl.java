package org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl;

import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Dog;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Nature;

@Agent
public class DogImpl extends @Nature AnimalImpl implements @Contracts Dog {
	public void bark(int duration){
		System.out.println("The dog is barking for " + duration + "s");
	}
}
