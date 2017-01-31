package com.example.rndroid.sticky_reciever_eg5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class MyStickyReceiver extends BroadcastReceiver {
        public MyStickyReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {

            Toast.makeText(context, "This is Sticky Receiver", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyStickyReceiver stickyReceiver = new MyStickyReceiver();
        IntentFilter i = new IntentFilter();
        i.addAction("STICKY_TEST");
        registerReceiver(stickyReceiver,i);
    }
}
