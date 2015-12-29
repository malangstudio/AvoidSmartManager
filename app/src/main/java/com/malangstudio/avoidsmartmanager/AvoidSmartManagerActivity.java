package com.malangstudio.avoidsmartmanager;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by god on 15. 12. 29..
 */
public class AvoidSmartManagerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
