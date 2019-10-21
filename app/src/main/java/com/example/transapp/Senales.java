package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Senales extends AppCompatActivity {

    public int[] imagenes = {R.drawable.uno /*[pos0 = 1.1]*/, R.drawable.dos /*[pos0 = 1.1]*/, R.drawable.tres /*[pos0 = 1.1]*/, R.drawable.cuatro/*[pos0 = 1.1]*/,
            R.drawable.cinco /*[pos0 = 1.1]*/, R.drawable.seis /*[pos0 = 1.1]*/, R.drawable.siete /*[pos0 = 1.1]*/, R.drawable.ocho /*[pos0 = 1.1]*/,
            R.drawable.nueve /*[pos0 = 1.1]*/};

    public int imagenNum;
    public String d1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senales);

        recibirDatos();
        cambiarImagen();
        cambiarTextos();
    }

    public void recibirDatos() {
        Bundle extras = getIntent().getExtras();
        imagenNum = Integer.parseInt(extras.getString("dato00"));
        d1 = extras.getString("dato01");
    }

    public void cambiarImagen() {
        ImageView imagen = (ImageView) findViewById(R.id.imagen);
        imagen.setImageResource(imagenes[imagenNum]);
    }

    public void cambiarTextos() {

        TextView txtSaludo = (TextView) findViewById(R.id.descripcion);
        txtSaludo.setText("" + d1);
    }

    public void buttonRegresar(View view){
        Intent intent = new Intent(Senales.this,preventivas.class);
        startActivity(intent);
    }
}
