package org.clprolf.examples.design_patterns.di;

import org.clprolf.framework.java.Worker_agent;
import org.clprolf.framework.java.With_compat;


@Worker_agent
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