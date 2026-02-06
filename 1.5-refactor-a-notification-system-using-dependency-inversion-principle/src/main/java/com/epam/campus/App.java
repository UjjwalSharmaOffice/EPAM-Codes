package com.epam.campus;

public class App {
    public static void main(String[] args) {
        // Create concrete implementations
        INotificationSender emailSender = new EmailSender();
        INotificationSender smsSender = new SmsSender();

        // NotificationService depends on the abstraction (INotificationSender)
        // This follows the Dependency Inversion Principle
        NotificationService emailNotificationService = new NotificationService(emailSender);
        NotificationService smsNotificationService = new NotificationService(smsSender);

        // Send email notification
        System.out.println(emailNotificationService.getSenderInfo());
        emailNotificationService.sendNotification("user@example.com", "Hello via Email!");

        System.out.println();

        // Send SMS notification
        System.out.println(smsNotificationService.getSenderInfo());
        smsNotificationService.sendNotification("+1234567890", "Hello via SMS!");
    }
}
