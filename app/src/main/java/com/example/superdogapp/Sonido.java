package com.example.superdogapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;

public class Sonido extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    boolean isPlaying = false;
    boolean isPlaying2 =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonido);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sonido");
        toolbar.setPopupTheme(androidx.appcompat.R.style.ThemeOverlay_AppCompat_Light);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        ImageButton cancion1 = findViewById(R.id.btn_cancion1);
        ImageButton cancion2 = findViewById(R.id.btn_cancion2);
        mediaPlayer = MediaPlayer.create(this, R.raw.lofilq);

        mediaPlayer2 = MediaPlayer.create(this, R.raw.arabic_nokia);
        cancion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying2) {
                    mediaPlayer.pause();
                    isPlaying2 = false;
                    cancion1.setImageResource(R.drawable.ic_baseline_music_note_24);
                } else {
                    mediaPlayer.start();
                    isPlaying2 = true;
                    cancion1.setImageResource(R.drawable.ic_baseline_pause_24);
                }
            }
        });
        cancion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying2) {
                    mediaPlayer2.pause();
                    isPlaying2 = false;
                    cancion2.setImageResource(R.drawable.ic_baseline_music_note_24);
                } else {
                    mediaPlayer2.start();
                    isPlaying2 = true;
                    cancion2.setImageResource(R.drawable.ic_baseline_pause_24);
                }
            }
        });







    }
}
