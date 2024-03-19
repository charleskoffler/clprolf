package org.simol.examples.design_patterns.mvc;

import org.simol.simolframework.java.Simu_comp_as_worker;

//Model: WeatherModel stores the weather data
//A computer job for dealing with databases, and so on.
//public simu_comp_as_worker WeatherModel
@Simu_comp_as_worker
class WeatherModel {
 private String location;
 private String forecast;

 public void setLocation(String location) {
     this.location = location;
 }

 public void fetchWeather() {
     // Simulate fetching weather data from an external API
     // In a real application, you would make an API request here
     // For simplicity, we'll just set a hardcoded forecast.
     this.forecast = "Sunny with a chance of clouds";
 }

 public String getForecast() {
     return forecast;
 }
}