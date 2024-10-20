package org.clprolf.patterns.optfeaturesinterf.simpleintinh;

import org.clprolf.patterns.optfeaturesinterf.simpleintinh.impl.DogImpl;
import org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces.Dog;

import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

/**
 * The free impl dog: 
	The dog is barking for 100s
	The animal is eating meat
	The dog impl: 
	The dog is barking for 100s
	The animal is eating meat
 *
 * @author Charles Koffler
 *
 */
@Worker_agent
public class Launcher {
	public static void main(String[] args) {
		//We can either use a dog with or without direct implementation
		@With_compat Dog myFreeImplDog = new DogImpl();
		DogImpl myImplDog = new DogImpl();
		
		System.out.println("The free impl dog: ");
		myFreeImplDog.bark(100);
		myFreeImplDog.eat("meat");
		
		System.out.println("The dog impl: ");
		myImplDog.bark(100);
		myImplDog.eat("meat");
	}
}
