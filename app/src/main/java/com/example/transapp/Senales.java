package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Senales extends AppCompatActivity {

    public int[] imagenes = {R.drawable.puno /*[pos0 = 1.1]*/, R.drawable.pdos /*[pos1 = 1.1]*/, R.drawable.ptres /*[pos2 = 1.1]*/,
            R.drawable.pcuatro/*[pos3 = 1.1]*/,R.drawable.pcinco /*[pos4 = 1.1]*/, R.drawable.pseis /*[pos5 = 1.1]*/, R.drawable.psiete /*[pos6 = 1.1]*/,
            R.drawable.pocho /*[pos7 = 1.1]*/, R.drawable.pnueve /*[pos8 = 1.1]*/,R.drawable.pdiez /*[pos9 = 1.1]*/, R.drawable.runo /*[pos10 = 1.1]*/,
            R.drawable.rdos /*[pos11 = 1.1]*/,  R.drawable.rtres /*[pos12 = 1.1]*/, R.drawable.rcuatro/*[pos13 = 1.1]*/,
            R.drawable.rcinco /*[pos14 = 1.1]*/, R.drawable.rseis /*[pos15 = 1.1]*/, R.drawable.rsiete /*[pos16 = 1.1]*/, R.drawable.rocho /*[pos17 = 1.1]*/,
            R.drawable.rnueve /*[pos18 = 1.1]*/,R.drawable.rdiez /*[pos19 = 1.1]*/,R.drawable.iuno /*[pos20 = 1.1]*/, R.drawable.idos /*[pos21 = 1.1]*/,
            R.drawable.itres /*[pos22 = 1.1]*/, R.drawable.icuatro/*[pos23 = 1.1]*/, R.drawable.icinco /*[pos24 = 1.1]*/, R.drawable.iseis /*[pos25 = 1.1]*/,
            R.drawable.isiete /*[pos26 = 1.1]*/, R.drawable.iocho /*[pos27 = 1.1]*/, R.drawable.inueve /*[pos28 = 1.1]*/,R.drawable.idiez /*[pos29 = 1.1]*/,
            R.drawable.piuno /*[pos30 = 1.1]*/, R.drawable.pidos /*[pos31 = 1.1]*/, R.drawable.pitres /*[pos32 = 1.1]*/, R.drawable.picuatro/*[pos33 = 1.1]*/,
            R.drawable.picinco /*[pos34 = 1.1]*/, R.drawable.piseis /*[pos35 = 1.1]*/, R.drawable.pisiete /*[pos36 = 1.1]*/, R.drawable.piocho /*[pos37 = 1.1]*/,
            R.drawable.pinueve /*[pos38]*/, R.drawable.pidiez /*[pos39]*/};

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
