package com.hakim.eye;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.app.Notification;
import android.os.Bundle;

public class EyeNotificationService extends NotificationListenerService {

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {

        if (!sbn.getPackageName().equals("com.whatsapp")) return;

        Notification notification = sbn.getNotification();
        Bundle extras = notification.extras;

        String title = extras.getString(Notification.EXTRA_TITLE);
        String text = extras.getString(Notification.EXTRA_TEXT);

        HakimBridge.save(title, text);
    }
}
