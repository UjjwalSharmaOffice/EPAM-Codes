package com.epam.campus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the notification system demonstrating Dependency Inversion Principle.
 */
public class AppTest {

    /**
     * Test that EmailSender successfully sends a notification.
     */
    @Test
    public void testEmailSenderSendsNotification() {
        INotificationSender emailSender = new EmailSender();
        assertTrue(emailSender.send("test@example.com", "Test message"));
    }

    /**
     * Test that EmailSender returns correct type.
     */
    @Test
    public void testEmailSenderType() {
        INotificationSender emailSender = new EmailSender();
        assertEquals("Email", emailSender.getType());
    }

    /**
     * Test that EmailSender returns false for null recipient.
     */
    @Test
    public void testEmailSenderWithNullRecipient() {
        INotificationSender emailSender = new EmailSender();
        assertFalse(emailSender.send(null, "Test message"));
    }

    /**
     * Test that EmailSender returns false for empty recipient.
     */
    @Test
    public void testEmailSenderWithEmptyRecipient() {
        INotificationSender emailSender = new EmailSender();
        assertFalse(emailSender.send("", "Test message"));
    }

    /**
     * Test that EmailSender returns false for null message.
     */
    @Test
    public void testEmailSenderWithNullMessage() {
        INotificationSender emailSender = new EmailSender();
        assertFalse(emailSender.send("test@example.com", null));
    }

    /**
     * Test that EmailSender returns false for empty message.
     */
    @Test
    public void testEmailSenderWithEmptyMessage() {
        INotificationSender emailSender = new EmailSender();
        assertFalse(emailSender.send("test@example.com", ""));
    }

    /**
     * Test that SmsSender successfully sends a notification.
     */
    @Test
    public void testSmsSenderSendsNotification() {
        INotificationSender smsSender = new SmsSender();
        assertTrue(smsSender.send("+1234567890", "Test SMS"));
    }

    /**
     * Test that SmsSender returns correct type.
     */
    @Test
    public void testSmsSenderType() {
        INotificationSender smsSender = new SmsSender();
        assertEquals("SMS", smsSender.getType());
    }

    /**
     * Test that SmsSender returns false for null recipient.
     */
    @Test
    public void testSmsSenderWithNullRecipient() {
        INotificationSender smsSender = new SmsSender();
        assertFalse(smsSender.send(null, "Test message"));
    }

    /**
     * Test that SmsSender returns false for empty recipient.
     */
    @Test
    public void testSmsSenderWithEmptyRecipient() {
        INotificationSender smsSender = new SmsSender();
        assertFalse(smsSender.send("", "Test message"));
    }

    /**
     * Test that NotificationService works with EmailSender.
     */
    @Test
    public void testNotificationServiceWithEmailSender() {
        INotificationSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);
        assertTrue(service.sendNotification("test@example.com", "Hello"));
    }

    /**
     * Test that NotificationService works with SmsSender.
     */
    @Test
    public void testNotificationServiceWithSmsSender() {
        INotificationSender smsSender = new SmsSender();
        NotificationService service = new NotificationService(smsSender);
        assertTrue(service.sendNotification("+1234567890", "Hello"));
    }

    /**
     * Test that NotificationService throws exception for null sender.
     */
    @Test
    public void testNotificationServiceWithNullSender() {
        assertThrows(IllegalArgumentException.class, () -> {
            new NotificationService(null);
        });
    }

    /**
     * Test that NotificationService getSenderInfo returns correct information.
     */
    @Test
    public void testNotificationServiceGetSenderInfo() {
        INotificationSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);
        assertEquals("Using Email notification sender", service.getSenderInfo());
    }

    /**
     * Test that NotificationService can be switched to a different sender.
     */
    @Test
    public void testNotificationServiceSwitchingSenders() {
        INotificationSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);
        assertEquals("Using Email notification sender", service.getSenderInfo());

        // Create a new service with SMS sender
        INotificationSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        assertEquals("Using SMS notification sender", smsService.getSenderInfo());
    }

    /**
     * Test Dependency Inversion Principle: high-level module depends on abstraction.
     * This test verifies that NotificationService can work with any INotificationSender implementation.
     */
    @Test
    public void testDependencyInversionPrinciple() {
        // Create a mock implementation to test the principle
        INotificationSender mockSender = new INotificationSender() {
            @Override
            public boolean send(String recipient, String message) {
                return true;
            }

            @Override
            public String getType() {
                return "Mock";
            }
        };

        // NotificationService should work seamlessly with any INotificationSender
        NotificationService service = new NotificationService(mockSender);
        assertTrue(service.sendNotification("test", "message"));
        assertEquals("Using Mock notification sender", service.getSenderInfo());
    }
}

