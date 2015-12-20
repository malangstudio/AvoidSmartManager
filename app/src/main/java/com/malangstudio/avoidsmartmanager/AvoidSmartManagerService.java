package com.malangstudio.avoidsmartmanager;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Created by Chiung Choi on 2015-12-20.
 */
public class AvoidSmartManagerService extends Service {
    private static final int FOREGROUND_NOTIFICATION_ID = 0x1818;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("chiung.choi", "onCreate");
        startForeground(FOREGROUND_NOTIFICATION_ID, getNotification());

        stopSelf();
    }

    private Notification getNotification() {
        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Avoid SmartManager")
                .setOngoing(true).build();

        return notification;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("chiung.choi", "onDestroy");
        stopForeground(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
