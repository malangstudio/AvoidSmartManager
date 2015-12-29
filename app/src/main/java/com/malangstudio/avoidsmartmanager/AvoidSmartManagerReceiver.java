package com.malangstudio.avoidsmartmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Chiung Choi on 2015-12-20.
 */
public class AvoidSmartManagerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_BOOT_COMPLETED || intent.getAction() == Intent.ACTION_POWER_CONNECTED || intent.getAction() == Intent.ACTION_POWER_DISCONNECTED) {
            Intent serviceIntent = new Intent(context, AvoidSmartManagerActivity.class);
            serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(serviceIntent);
        }
    }
}
