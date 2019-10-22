package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class preventivas extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preventivas);

    }

    public void buttonUno(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "0");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDos(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "1");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonTres(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "2");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCuatro(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "3");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonCinco(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "4");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonSeis(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "5");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
    public void buttonSiete(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "6");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonOcho(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "7");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonNueve(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "8");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }

    public void buttonDiez(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "9");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
}
