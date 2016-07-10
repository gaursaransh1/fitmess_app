package com.saranshgaur.firstapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;

/**
 * Created by saransh gaur on 30-06-2016.
 */
public class AlarmReceiver extends BroadcastReceiver {
    private static final int uniqueid = 3456;
    @Override
    public void onReceive(Context context, Intent intent) {

        long when = System.currentTimeMillis();
        Intent notiinten = new Intent(context, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, notiinten, PendingIntent.FLAG_UPDATE_CURRENT);
        notiinten.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        Uri alarmsound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Notification.Builder nb = new Notification.Builder(context).setSmallIcon(R.drawable.plate).setContentTitle("Alarm Fired")
                .setContentText("Event is performing").setSound(alarmsound).setAutoCancel(true).setWhen(when).setContentIntent(pendingIntent)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000});


        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(uniqueid,nb.build());
    }
}
