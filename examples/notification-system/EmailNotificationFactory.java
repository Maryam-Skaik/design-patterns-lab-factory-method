package Notification;

/**
 * Concrete Factory for creating EmailNotification.
 * 
 * Teaching point:
 * - Each factory handles one type of notification.
 * - Adding new notification types only requires creating a new factory class.
 */
public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
