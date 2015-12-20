package com.malangstudio.avoidsmartmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Chiung Choi on 2015-12-20.
 */
public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // 반복 코드 짜기 귀찮으니 부팅 시, 전원 연결/해제 시 처리
        if(intent.getAction() == Intent.ACTION_BOOT_COMPLETED || intent.getAction() == Intent.ACTION_POWER_CONNECTED || intent.getAction() == Intent.ACTION_POWER_DISCONNECTED) {
            Intent serviceIntent = new Intent(context, AvoidSmartManagerService.class);
            context.startService(serviceIntent);
        }
    }
}
