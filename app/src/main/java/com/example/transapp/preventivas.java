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



    public void buttonuno(View view) {
        Intent intent = new Intent(preventivas.this, Senales.class);
        intent.putExtra("dato00", "0");
        intent.putExtra("dato01", "Curva no pronunciada a la izquierda");
        startActivity(intent);
    }
}
