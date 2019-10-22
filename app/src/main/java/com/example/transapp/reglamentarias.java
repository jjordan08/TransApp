package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class reglamentarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamentarias);
    }

    public void buttonUno(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "10");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDos(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", 11);
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonTres(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "12");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCuatro(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "13");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCinco(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "14");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonSeis(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "15");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
    public void buttonSiete(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "16");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonOcho(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "17");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonNueve(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "18");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDiez(View view) {
        Intent intent = new Intent(reglamentarias.this, Senales.class);
        intent.putExtra("dato00", "19");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
}
