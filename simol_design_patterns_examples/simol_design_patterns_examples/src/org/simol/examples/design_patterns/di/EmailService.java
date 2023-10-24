package org.simol.examples.design_patterns.di;

//Concrete implementation of the MessageService interface
//public simu_comp_worker EmailService contracts MessageService {
public class EmailService implements MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Sending email: " + message);
 }
}