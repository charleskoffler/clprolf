package org.clprolf.examples.design_patterns.mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;
import org.clprolf.framework.java.Worker_agent;

import javax.swing.JPanel;
import javax.swing.JLabel;;


@Worker_agent
public class WeatherRenderer {

 private JFrame frame;
 private JTextField locationField;
 private JTextArea forecastArea;

 private WeatherController expert;	

@Agent
@Version_inh //ActionListener acts as a @Capacity_inh(Advice.FOR_AGENT_LIKE)
private static interface TextFieldObserver extends @Nature ActionListener {
	
}
 
@Agent
private class TextFieldObserverImpl implements @Contracts TextFieldObserver {
	WeatherRenderer renderer;
	
	public TextFieldObserverImpl(WeatherRenderer realiz){
		this.renderer = realiz;
	}
	
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 String location = getLocationInput();
	     this.renderer.expert.giveTheWeather(location);
	 }
}

 public WeatherRenderer(WeatherController expert) {
	 this.expert = expert;
	 prepareViewObjects();
 }
 
 protected void prepareViewObjects() {
	//prepare view objects.
     frame = new JFrame("Weather Forecast");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 200);

     JPanel panel = new JPanel(new BorderLayout());

     JLabel locationLabel = new JLabel("Enter Location:");
     locationField = new JTextField(20);
     locationField.addActionListener(new TextFieldObserverImpl(this));

     forecastArea = new JTextArea(5, 30);
     forecastArea.setEditable(false);

     panel.add(locationLabel, BorderLayout.NORTH);
     panel.add(locationField, BorderLayout.CENTER);
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
}
