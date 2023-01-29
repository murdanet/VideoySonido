package com.example.superdogapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Videos");
        toolbar.setPopupTheme(androidx.appcompat.R.style.ThemeOverlay_AppCompat_Light);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ImageButton boton1 = findViewById(R.id.btn_video1);
        ImageButton boton2 = findViewById(R.id.btn_video2);
        VideoView video1 = findViewById(R.id.videoView);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nueva_cancion);
                video1.start();
            }
        });



        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dibu);
                video1.start();
            }
        });






    }
}