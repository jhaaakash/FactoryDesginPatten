package serviceImpl;

import service.Notification;
import dto.NotificationModel;

public class EMailNotification implements Notification {

    @Override
    public void sendNotification(NotificationModel notif) {
        System.out.println("E-Mail Notification is going out\n" +
                notif +
                "\n");

    }

}
