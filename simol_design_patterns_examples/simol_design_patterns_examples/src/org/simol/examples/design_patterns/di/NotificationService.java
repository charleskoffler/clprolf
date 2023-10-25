package org.simol.examples.design_patterns.di;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

//A class that depends on a messaging service and uses dependency injection
//NotificationService could be a simulation of a notification human worker.
//public simu_real_world_obj NotificationService
@Simu_real_world_obj
public class NotificationService {
 private final @With_compat MessageService messageService; //Loose coupling is seen immediately.

 // Constructor-based dependency injection
 //We prefere asking instanciation from outdoor, to keep loose coupling in the entirely class!
 public NotificationService(@With_compat MessageService messageService) {
     this.messageService = messageService;
 }

 public void sendNotification(String message) {
     messageService.sendMessage(message);
 }
}