package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class examenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examenes);
    }

    public void buttonQuiz(View view){
        Intent juego = new Intent(examenes.this, quiz.class);
        startActivity(juego);
    }

    public void buttonTrueFalse(View view){
        Intent juego = new Intent(examenes.this, trueFalse.class);
        startActivity(juego);
    }

    public void buttonAtras(View view){
        Intent juego = new Intent(examenes.this, Ninos.class);
        startActivity(juego);
    }
}
