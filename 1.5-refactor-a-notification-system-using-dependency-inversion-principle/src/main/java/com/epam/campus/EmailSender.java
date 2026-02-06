package com.epam.campus;

public class EmailSender implements INotificationSender {

    @Override
    public boolean send(String recipient, String message) {
        if (recipient == null || recipient.isEmpty() || message == null || message.isEmpty()) {
            return false;
        }

        try {
            // Simulate sending an email
            System.out.println("Sending email to " + recipient + ": " + message);
            return true;
        } catch (Exception e) {
            System.out.println("Failed to send email: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String getType() {
        return "Email";
    }
}
