package Factory;

import EnumPackage.NotificationType;
import service.Notification;
import serviceImpl.EMailNotification;
import serviceImpl.PushNotification;
import serviceImpl.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(NotificationType type) {
        Notification notification;
        switch(type) {
            case EMAIL:
                notification = new EMailNotification();
                break;
            case PUSH:
                notification = new PushNotification();
                break;
            case SMS:
            default:
                notification = new SMSNotification();
                break;
        }
        return notification;
    }
}