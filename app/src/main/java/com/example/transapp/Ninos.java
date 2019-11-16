package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ninos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninos);
    }

    public void buttonJuego(View view){
        Intent juego = new Intent(Ninos.this, examenes.class);
        startActivity(juego);
    }

    public void buttonSenales(View view){
        Intent senales = new Intent(Ninos.this, Seleccion_Senales.class);
        startActivity(senales);
    }

    public void buttonNormas(View view){
        Intent normas = new Intent(Ninos.this, normas.class);
        startActivity(normas);
    }

    public void buttonVideos(View view){
        Intent videos = new Intent(Ninos.this, videos.class);
        startActivity(videos);
    }

}
