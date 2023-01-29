package com.example.superdogapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView portada;
    ImageButton rojo_sonido;
    ImageButton verde_video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Yo quise hacer mi toolbar personalizado, esto lo aprendí en clases con Abel Susin.
        //Aqui basicamente la asocio, la instancio, le pongo titulo y le añado ciertos iconos desde el codigo.
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Superdog");
        setSupportActionBar(toolbar);





        //Asocio los botones
        portada = findViewById(R.id.superdog);
        rojo_sonido=findViewById(R.id.btn_rojo_sonido);
        verde_video=findViewById(R.id.boton_verde_video);


        //Metodo para que al clicar en la portada te lleve al albúm completo en youtube
        portada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String youtubelink ="https://www.youtube.com/watch?v=p8fho0Nvgy8";
                Intent i = new Intent (Intent.ACTION_VIEW);
                i.setData(Uri.parse(youtubelink));
                startActivity(i);

            }
        });

       //Metodos para que al clicar en  los botones me lleve a las otras actividades
       rojo_sonido.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i2= new Intent(MainActivity.this,Sonido.class);
               startActivity(i2);
           }
       });

       verde_video.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i3 = new Intent (MainActivity.this,Video.class);
               startActivity(i3);
           }
       });




    }


}