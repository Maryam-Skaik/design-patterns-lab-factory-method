package Notification;

/**
 * Concrete implementation of Notification for SMS.
 * 
 * Teaching point:
 * - Each notification type encapsulates its sending behavior.
 * - Adding new notification types does not require modifying existing types.
 */
public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
