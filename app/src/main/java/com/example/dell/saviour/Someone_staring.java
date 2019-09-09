package com.example.dell.saviour;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Someone_staring extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_someone_staring);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button capture=(Button)findViewById(R.id.button_capture);
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                int CAMERA_PIC_REQUEST = 1;//firstly define this
//                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
//                startActivityForResult(photo, CAMERA_PIC_REQUEST);
                dispatchTakePictureIntent();

            }
        });
        Button submit=(Button)findViewById(R.id.button_submit);
        submit.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                Toast toast= (Toast) Toast.makeText(getBaseContext(),"Your complaint successfully register",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        ImageView criminal=(ImageView)findViewById(R.id.criminal);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            criminal.setImageBitmap(imageBitmap);
        }
    }
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
