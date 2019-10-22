package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class informativas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informativas);
    }

    public void buttonUno(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "20");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDos(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "21");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonTres(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "22");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCuatro(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "23");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCinco(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "24");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonSeis(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "25");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
    public void buttonSiete(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "26");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonOcho(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "27");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonNueve(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "28");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDiez(View view) {
        Intent intent = new Intent(informativas.this, Senales.class);
        intent.putExtra("dato00", "29");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
}
