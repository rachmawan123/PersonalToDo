package com.example.personaltodo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReminderReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String todoTitle = intent.getStringExtra("todoTitle");
        Toast.makeText(context, "Reminder: " + todoTitle, Toast.LENGTH_LONG).show();
    }
}
