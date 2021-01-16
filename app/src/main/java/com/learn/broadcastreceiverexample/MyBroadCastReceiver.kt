package com.learn.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class MyBroadCastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent?.action)) {
            Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show()
        }
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent?.action)) {
            Toast.makeText(context, "Connectivity Changed", Toast.LENGTH_LONG).show()
        }

    }
}