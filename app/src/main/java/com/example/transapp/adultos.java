package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adultos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adultos);
    }

    public void buttonAtras(View view){
        Intent atras = new Intent(adultos.this, MainActivity.class);
        startActivity(atras);
    }

    public void buttonsenales(View view){
        Intent atras = new Intent(adultos.this, Seleccion_Senales.class);
        startActivity(atras);
    }
}
