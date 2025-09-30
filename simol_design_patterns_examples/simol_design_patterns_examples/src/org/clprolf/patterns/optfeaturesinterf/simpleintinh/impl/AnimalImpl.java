package org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Animal;


@Agent
public class AnimalImpl implements @Contracts Animal {
	public void eat(String foodName){
		System.out.println("The animal is eating " + foodName);
	}

}
