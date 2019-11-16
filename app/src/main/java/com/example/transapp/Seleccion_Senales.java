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
        Intent intent = new Intent(Seleccion_Senales.this, preventivas.class);
        startActivity(intent);
    }
    public void buttonReglamentarias(View view){
        Intent intent = new Intent(Seleccion_Senales.this, reglamentarias.class);
        startActivity(intent);
    }
    public void buttonInformativas(View view){
        Intent intent = new Intent(Seleccion_Senales.this, informativas.class);
        startActivity(intent);
    }
    public void buttonPiso(View view){
        Intent intent = new Intent(Seleccion_Senales.this, piso.class);
        startActivity(intent);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(Seleccion_Senales.this, Ninos.class);
        startActivity(intent);
    }
}
