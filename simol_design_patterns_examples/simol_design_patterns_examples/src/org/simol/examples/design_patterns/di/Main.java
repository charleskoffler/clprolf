package org.simol.examples.design_patterns.di;

import org.simol.simolframework.java.Simu_comp_worker;
import org.simol.simolframework.java.With_compat;

//public simu_comp_worker Main
@Simu_comp_worker
public class Main {

  public static void main(String[] args) {
      // Create instances of messaging services
      @With_compat MessageService emailService = new EmailService();
      @With_compat MessageService smsService = new SMSService();

      // Inject the email service and send a notification
      NotificationService emailNotification = new NotificationService(emailService);
      emailNotification.sendNotification("Hello, this is an email notification.");

      // Inject the SMS service and send a notification
      NotificationService smsNotification = new NotificationService(smsService);
      smsNotification.sendNotification("Hello, this is an SMS notification.");
  }
}