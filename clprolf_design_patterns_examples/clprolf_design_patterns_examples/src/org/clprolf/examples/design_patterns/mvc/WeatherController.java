package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Agent;

@Agent(Gender.EXPERT_COMPONENT)
public class WeatherController {
    private WeatherRepository model;
    private WeatherRenderer view;

    public WeatherController() {
    	model = new WeatherRepository();
        view = new WeatherRenderer(this);
    }

    public void giveTheWeather(String location){
        model.setLocation(location);
        model.fetchWeather();
        String forecast = model.getForecast();
        view.displayForecast(forecast);
    }
}