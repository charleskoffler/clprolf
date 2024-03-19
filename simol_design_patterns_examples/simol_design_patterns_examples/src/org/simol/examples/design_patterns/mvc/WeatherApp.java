package org.simol.examples.design_patterns.mvc;

import org.simol.simolframework.java.Simu_comp_worker;


/* 2023/10/23 A simol example of MVC design pattern implementation, from a MVC example in the text file. */

// Just an app launcher.
//public simu_comp_as_worker WeatherApp
@Simu_comp_as_worker
public class WeatherApp {

	public static void main(String[] args) {
		//Just the simulation to instanciate, and it will displayed too, by the MeteoRealiz.
        WeatherExpert controller = new WeatherExpert();
	}

}
