package org.simol.examples.design_patterns.di;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_comp_worker;

//Another concrete implementation of the MessageService interface
//public simu_comp_as_worker SMSService contracts MessageService
@Simu_comp_as_worker
public class SMSService implements @Contracts MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Sending SMS: " + message);
 }
}
