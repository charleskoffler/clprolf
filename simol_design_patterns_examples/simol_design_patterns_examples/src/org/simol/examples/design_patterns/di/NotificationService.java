package org.simol.examples.design_patterns.di;

//A class that depends on a messaging service and uses dependency injection
//NotificationService could be a simulation of a notification human worker.
//public simu_real_world_obj NotificationService
public class NotificationService {
 private final /*with_contract*/ MessageService messageService; //Loose coupling is seen immediately.

 // Constructor-based dependency injection
 //We prefere asking instanciation from outdoor, to keep loose coupling in the entirely class!
 public NotificationService(/*with_compat*/ MessageService messageService) {
     this.messageService = messageService;
 }

 public void sendNotification(String message) {
     messageService.sendMessage(message);
 }
}