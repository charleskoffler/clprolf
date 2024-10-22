package org.clprolf.offdoc.examples.interfaces;

import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

import clprolf.wrappers.java.lang.ClpComparable;

/**
 * Result: Comparaison between carOne and carTwo: -1
 * @author
 *
 */
@Worker_agent
public class Launcher {
	
	public static void main(String[] args){
		//comparableObj is an agent-like component, with the capacity ClpComparable.
		@With_compat ClpComparable<Car> comparableObj = new CarClass("Renault Clio 4", 2015);
		Car carTwo = new CarClass("Ford Mustang", 1967);

		System.out.println("Comparaison between carOne and carTwo: " + comparableObj.compareTo(carTwo) );
	}

}

