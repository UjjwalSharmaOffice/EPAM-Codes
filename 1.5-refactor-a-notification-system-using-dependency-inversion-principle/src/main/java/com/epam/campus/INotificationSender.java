package com.epam.campus;

public interface INotificationSender {
    boolean send(String recipient, String message);

    String getType();
}
