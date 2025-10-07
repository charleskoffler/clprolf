package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent(Gender.STATIC)
public class WeatherApp {

	public static void main(String[] args) {
        WeatherController controller = new WeatherController();
	}

}
