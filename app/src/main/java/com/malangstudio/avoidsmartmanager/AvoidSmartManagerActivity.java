package com.malangstudio.avoidsmartmanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by god on 15. 12. 29..
 */
public class AvoidSmartManagerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "AvoidSmartManagerActivity onCreate", Toast.LENGTH_LONG).show();

        finish();

        Log.d("chiung.choi", "AvoidSmartManagerActivity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
