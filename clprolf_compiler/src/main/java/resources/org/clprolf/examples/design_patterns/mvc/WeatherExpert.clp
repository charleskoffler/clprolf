package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.language.annotations.Human_expert;

//Controller: we could imagine a real weather expert, which would be simulated by the controller.
//The human_expert annotation is optional
@Human_expert
public agent WeatherExpert {
    private WeatherModel model;
    private WeatherRealiz view;

    public WeatherExpert() {
    	model = new WeatherModel();
        view = new WeatherRealiz(this);
    }

    public void giveTheWeather(){
	String location = view.getLocationInput();
        model.setLocation(location);
        model.fetchWeather();
        String forecast = model.getForecast();
        view.displayForecast(forecast);
    }
}