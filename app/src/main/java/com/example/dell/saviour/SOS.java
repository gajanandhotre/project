package com.example.dell.saviour;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emergency_con=new Intent(SOS.this,Emergency_contact.class);
                startActivity(emergency_con);
                Snackbar.make(view, "Add 5 contact", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        TextView textView1=(TextView)findViewById(R.id.help_text1);
        TextView textView2=(TextView)findViewById(R.id.help_text2);
        TextView textView3=(TextView)findViewById(R.id.help_text3);
        textView1.setText(R.string.help_text1);
        textView2.setText(R.string.help_text2);
        textView3.setText(R.string.help_text3);
    }



}