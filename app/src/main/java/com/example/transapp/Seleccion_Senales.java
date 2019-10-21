package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Seleccion_Senales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion__senales);
    }

    public void buttonPreventivas(View view){
        Intent planets = new Intent(Seleccion_Senales.this, preventivas.class);
        startActivity(planets);
    }
    public void buttonReglamentarias(View view){
        Intent planets = new Intent(Seleccion_Senales.this, adultos.class);
        startActivity(planets);
    }
    public void buttonInformativas(View view){
        Intent planets = new Intent(Seleccion_Senales.this, adultos.class);
        startActivity(planets);
    }
    public void buttonTransitorias(View view){
        Intent planets = new Intent(Seleccion_Senales.this, adultos.class);
        startActivity(planets);
    }
    public void buttonDePiso(View view){
        Intent planets = new Intent(Seleccion_Senales.this, adultos.class);
        startActivity(planets);
    }
    public void buttonRegresar(View view){
        Intent planets = new Intent(Seleccion_Senales.this, adultos.class);
        startActivity(planets);
    }
}
