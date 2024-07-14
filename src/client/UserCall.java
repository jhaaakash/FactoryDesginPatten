package client;

import EnumPackage.NotificationType;
import Factory.NotificationFactory;
import dto.NotificationModel;
import service.Notification;

public class UserCall {
    public static void main(String[] args) {
        NotificationModel smsNotif =
                new NotificationModel("1234567895",
                        "1234567899",
                        "Hey There!");
        Notification smsNotification =
                new NotificationFactory()
                        .createNotification(NotificationType.SMS);

        NotificationModel emailNotif =
                new NotificationModel(
                        "to.test@gmail.com",
                        "from.test@gmail.com",
                        "Hey There!");
        Notification emailNotification =
                new NotificationFactory()
                        .createNotification(NotificationType.EMAIL);

        NotificationModel pushNotif =
                new NotificationModel("VPA12345",
                        "VPA90585749",
                        "Hey There!");
        Notification pushNotification =
                new NotificationFactory()
                        .createNotification(NotificationType.PUSH);

        smsNotification.sendNotification(smsNotif);
        emailNotification.sendNotification(emailNotif);
        pushNotification.sendNotification(pushNotif);
    }
}