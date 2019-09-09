package com.example.dell.saviour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button submit1=(Button)findViewById(R.id.sub_button);
       submit1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast toast= (Toast) Toast.makeText(getBaseContext(),"Your information successfully submitted",Toast.LENGTH_SHORT);
               toast.show();
           }
       });
    }
}
