package com.example.dell.saviour;

import android.content.Intent;
import android.content.IntentFilter;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        MyReceiver mReceiver = new MyReceiver (this);
        registerReceiver(mReceiver, filter);

        ImageView someone=(ImageView)findViewById(R.id.someone);
        someone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent someone_intent=new Intent(MainActivity.this,Someone_staring.class);
                startActivity(someone_intent);
            }
        });
        ImageView sos=(ImageView)findViewById(R.id.sos);
        sos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sos_Int=new Intent(MainActivity.this,SOS.class);
                startActivity(sos_Int);
            }
        });
        ImageView login=(ImageView)findViewById(R.id.login_id);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_page=new Intent(MainActivity.this,SignIn.class);
                startActivity(login_page);
            }
        });

        ImageView hidden=(ImageView)findViewById(R.id.hidden_cam);
        hidden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HiddenCamera.class);
                startActivity(intent);
            }
        });

        ImageView place=(ImageView)findViewById(R.id.place_safe);
       place.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent place_s=new Intent(MainActivity.this,PlaceSafeOrNot.class);
               startActivity(place_s);
           }
       });
    }
}
