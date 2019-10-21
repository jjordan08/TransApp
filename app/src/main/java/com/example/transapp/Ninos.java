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

    public void buttonAtras(View view){
        Intent atras = new Intent(Ninos.this, MainActivity.class);
        startActivity(atras);
    }

    public void buttonSenales(View view){
        Intent atras = new Intent(Ninos.this, Seleccion_Senales.class);
        startActivity(atras);
    }

}
