package com.epam.campus;

public class SmsSender implements INotificationSender {

    @Override
    public boolean send(String recipient, String message) {
        if (recipient == null || recipient.isEmpty() || message == null || message.isEmpty()) {
            return false;
        }

        try {
            // Simulate sending an SMS
            System.out.println("Sending SMS to " + recipient + ": " + message);
            return true;
        } catch (Exception e) {
            System.out.println("Failed to send SMS: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String getType() {
        return "SMS";
    }
}
