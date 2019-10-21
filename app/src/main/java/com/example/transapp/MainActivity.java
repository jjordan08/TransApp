package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonNinos(View view){
        Intent people = new Intent(MainActivity.this, Ninos.class);
        startActivity(people);
    }

    public void buttonAdultos(View view){
        Intent planets = new Intent(MainActivity.this, adultos.class);
        startActivity(planets);
    }

}
