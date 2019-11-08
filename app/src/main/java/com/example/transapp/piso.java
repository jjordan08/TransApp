package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class piso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piso);
    }

    public void buttonUno(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "30");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDos(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "31");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonTres(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "32");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCuatro(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "33");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCinco(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "34");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonSeis(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "35");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
    public void buttonSiete(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "36");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonOcho(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "37");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonNueve(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "38");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDiez(View view) {
        Intent intent = new Intent(piso.this, Senales.class);
        intent.putExtra("dato00", "39");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);

        //v0.2
    }
}
