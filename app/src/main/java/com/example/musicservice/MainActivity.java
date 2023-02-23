package com.example.musicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnstart,btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.idbtnstart);
        btnstop = findViewById(R.id.idbtnstop);

            Log.e("tag","--------start activity----------");
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("tag","--------Play----------");
                startService(new Intent(MainActivity.this,MusicPlayer.class));
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("tag","--------pause----------");
                stopService(new Intent(MainActivity.this,MusicPlayer.class));
            }
        });
    }
}