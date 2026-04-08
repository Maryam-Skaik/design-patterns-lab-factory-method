package Notification;

public class WhatsAppNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}
