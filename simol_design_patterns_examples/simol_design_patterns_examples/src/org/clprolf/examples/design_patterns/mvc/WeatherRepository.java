package org.clprolf.examples.design_patterns.mvc;

import org.clprolf.framework.java.Worker_agent;

@Worker_agent
class WeatherRepository {
 private String location;
 private String forecast;

 public void setLocation(String location) {
     this.location = location;
 }

 public void fetchWeather() {

     this.forecast = "Sunny with a chance of clouds";
 }

 public String getForecast() {
     return forecast;
 }
}