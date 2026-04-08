package Notification;

/**
 * Concrete implementation of Notification for WhatsApp messages.
 * 
 * Demonstrates how easily we can add new notification types without changing existing code.
 */
public class WhatsAppNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp: " + message);
    }
}
