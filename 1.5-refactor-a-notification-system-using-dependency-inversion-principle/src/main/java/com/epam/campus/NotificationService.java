package com.epam.campus;

public class NotificationService {
    private final INotificationSender notificationSender;

    public NotificationService(INotificationSender notificationSender) {
        if (notificationSender == null) {
            throw new IllegalArgumentException("NotificationSender cannot be null");
        }
        this.notificationSender = notificationSender;
    }

    public boolean sendNotification(String recipient, String message) {
        return notificationSender.send(recipient, message);
    }

    public String getSenderInfo() {
        return "Using " + notificationSender.getType() + " notification sender";
    }
}
