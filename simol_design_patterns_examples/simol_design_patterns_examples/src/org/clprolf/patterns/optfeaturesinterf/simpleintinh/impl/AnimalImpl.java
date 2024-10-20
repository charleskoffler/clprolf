package org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl;

import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Animal;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;


@Agent
public class AnimalImpl implements @Contracts Animal {
	public void eat(String foodName){
		System.out.println("The animal is eating " + foodName);
	}

}
