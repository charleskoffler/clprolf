package org.simol.examples.design_patterns.di;

//public simu_alfoc Main
public class Main {
  public static void main(String[] args) {
      // Create instances of messaging services
      /*with_compat*/MessageService emailService = new EmailService();
      /*with_compat*/MessageService smsService = new SMSService();

      // Inject the email service and send a notification
      NotificationService emailNotification = new NotificationService(emailService);
      emailNotification.sendNotification("Hello, this is an email notification.");

      // Inject the SMS service and send a notification
      NotificationService smsNotification = new NotificationService(smsService);
      smsNotification.sendNotification("Hello, this is an SMS notification.");
  }
}