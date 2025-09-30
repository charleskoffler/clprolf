package org.simol.examples.design_patterns.mvc;

import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Simu_real_obj;

//Controller: we could imagine a real weather expert, which would be simulated by the controller.
//Example for the use of role annotations.
@Simu_real_obj(Gender.HUMAN_EXPERT)
public class WeatherExpert {
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