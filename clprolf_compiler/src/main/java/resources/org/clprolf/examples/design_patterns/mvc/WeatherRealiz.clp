package org.clprolf.examples.design_patterns.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;;

//View: WeatherRealiz displays the weather information
//WeatherRealiz realizes the simulation of the human expert(for example), the controller, on a computer.
//Here, it's only display and inputs.
//
public worker_agent WeatherRealiz {

 private JFrame frame;
 private JTextField locationField;
 private JTextArea forecastArea;
 //Just for react to GUI events, and ask to the expert!
 private WeatherExpert expert;	

 // It should be part of the graphicalComponent, by an inheritance.

 public simu_real_world_obj TextFieldFetchListener contracts ActionListener {
	WeatherRealiz realiz;
	
	public TextFieldFetchListener(WeatherRealiz realiz){
		this.realiz = realiz;
	}

     @Override
     public void actionPerformed(ActionEvent e) {
         this.realiz.expert.giveTheWeather();
     }
 }

 public WeatherRealiz(WeatherExpert expert) {
	 this.expert = expert;
	 
	 //instantiate the simu_real_world_obj JFrame
     frame = new JFrame("Weather Forecast");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 200);

     JPanel panel = new JPanel(new BorderLayout());

     JLabel locationLabel = new JLabel("Enter Location:");
     locationField = new JTextField(20);
     this.addFetchListener(new TextFieldFetchListener(this));

     JButton fetchButton = new JButton("Fetch Weather");
     forecastArea = new JTextArea(5, 30);
     forecastArea.setEditable(false);

     panel.add(locationLabel, BorderLayout.NORTH);
     panel.add(locationField, BorderLayout.CENTER);
     panel.add(fetchButton, BorderLayout.SOUTH);
     panel.add(new JScrollPane(forecastArea), BorderLayout.SOUTH);

     frame.getContentPane().add(panel);

     frame.setVisible(true);
 }

 public String getLocationInput() {
     return locationField.getText();
 }

 public void displayForecast(String forecast) {
     forecastArea.setText(forecast);
 }

 public void addFetchListener(ActionListener listener) {
     locationField.addActionListener(listener);
 }
}

