package com.example.dell.saviour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Emergency_contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
