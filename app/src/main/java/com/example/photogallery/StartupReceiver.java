package com.example.photogallery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class StartupReceiver extends BroadcastReceiver {

    private static final String TAG = "StartupReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Receiver broadcast intent: " + intent.getAction());

        boolean isOn = QueryPreferences.isAlarmaOn(context);
        PollService.setServiceAlarm(context, isOn);
    }
}
