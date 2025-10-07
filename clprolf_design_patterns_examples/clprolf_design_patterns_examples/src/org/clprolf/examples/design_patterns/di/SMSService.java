package org.clprolf.examples.design_patterns.di;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Worker_agent;

//Another concrete implementation of the MessageService interface

@Worker_agent
public class SMSService implements @Contracts MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Sending SMS: " + message);
 }
}
