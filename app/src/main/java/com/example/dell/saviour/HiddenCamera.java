package com.example.dell.saviour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HiddenCamera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_camera);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button=(Button)findViewById(R.id.detect_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCamera();
            }
        });
    }
    public  void startCamera(){
        int CAMERA_PIC_REQUEST = 1;//firstly define this
                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(photo, CAMERA_PIC_REQUEST);
    }
}
