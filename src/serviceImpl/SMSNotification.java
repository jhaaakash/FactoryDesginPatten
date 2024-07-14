package serviceImpl;

import dto.NotificationModel;
import service.Notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(NotificationModel notif) {
        System.out.println("SMS Notification is going out\n" +
                notif +
                "\n");

    }
}
