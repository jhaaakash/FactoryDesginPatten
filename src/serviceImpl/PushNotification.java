package serviceImpl;

import service.Notification;
import dto.NotificationModel;

public class PushNotification implements Notification {

    @Override
    public void sendNotification(NotificationModel notif) {
        System.out.println("Push Notification is going out\n" +
                notif +
                "\n");

    }

}