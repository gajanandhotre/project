package com.example.dell.saviour;

import android.app.Activity;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import android.telephony.SmsManager;

public class MyReceiver extends BroadcastReceiver {
    static int countPowerOff = 0;
    private Activity activity = null;

    public MyReceiver(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v("onReceive", "Power button is pressed.");

        Toast.makeText(context, "power button clicked", Toast.LENGTH_LONG)
                .show();

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            countPowerOff++;
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            if (countPowerOff % 3 == 0) {
                Log.v("onReceive", "Power button is pressed.");
//                String phoneNo = "9158335693";//The phone number you want to text
//                String sms= "successful";//The message you want to text to the phone
//
//                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
//                smsIntent.putExtra("sms_body",sms);
//                context.startActivity(smsIntent);
//
                Uri uri = Uri.parse("smsto:9158335693");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body", "please help me");
                context.startActivity(it);


            }

        }
    }
}
