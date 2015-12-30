package com.malangstudio.avoidsmartmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/**
 * Created by Chiung Choi on 2015-12-20.
 */
public class AvoidSmartManagerReceiver extends BroadcastReceiver {
    private final static String SMART_MANAGER_PACKAGE_NAME = "com.samsung.android.sm";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_BOOT_COMPLETED || intent.getAction() == Intent.ACTION_POWER_CONNECTED || intent.getAction() == Intent.ACTION_POWER_DISCONNECTED) {
            boolean isSmartManagerExist = false;

            try {
                context.getPackageManager().getPackageInfo(SMART_MANAGER_PACKAGE_NAME, PackageManager.GET_META_DATA);
                isSmartManagerExist = true;
            } catch (PackageManager.NameNotFoundException e) {
            }

            if(isSmartManagerExist) {
                Intent serviceIntent = new Intent(context, AvoidSmartManagerActivity.class);
                serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(serviceIntent);
            }
        }
    }
}
