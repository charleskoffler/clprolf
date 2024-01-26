package org.simol.examples.design_patterns.di;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_comp_worker;

//Concrete implementation of the MessageService interface
//public simu_comp_worker EmailService contracts MessageService {
@Simu_comp_worker
public class EmailService implements @Contracts MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Sending email: " + message);
 }
}