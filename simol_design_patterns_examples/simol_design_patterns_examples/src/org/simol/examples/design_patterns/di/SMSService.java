package org.simol.examples.design_patterns.di;

//Another concrete implementation of the MessageService interface
//public simu_alfoc SMSService contracts MessageService
public class SMSService implements MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Sending SMS: " + message);
 }
}
