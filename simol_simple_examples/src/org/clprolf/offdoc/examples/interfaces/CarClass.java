package org.clprolf.offdoc.examples.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;

@Agent
public class CarClass implements @Contracts Car {
	private int year;
	private String name;
	
	public CarClass(String name, int year) {
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
		if (this.year < otherCar.getYear()) return 1; //older
		else if (this.year > otherCar.getYear()) return -1; //younger
		else return 0; //The same age
	}
}