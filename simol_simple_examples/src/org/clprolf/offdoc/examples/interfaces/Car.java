package org.clprolf.offdoc.examples.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

import clprolf.wrappers.java.lang.ClpComparable;

@Agent
public class Car implements @Contracts ClpComparable<Car> {
	private int year;
	private String name;
	
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	/**
	 * We wanted an old car to be superior to a young car.
	 */
	public int compareTo(Car otherCar){
		if (this.year < otherCar.year) return 1; //older
		else if (this.year > otherCar.year) return -1; //younger
		else return 0; //The same age
	}
}