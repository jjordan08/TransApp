package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class textoNormas extends AppCompatActivity {

    public String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_normas);
        recibirDatos();
        montarPdf();

    }

            public void recibirDatos() {
            Bundle extras = getIntent().getExtras();
            nombre = extras.getString("dato00");
        }

        public void montarPdf(){
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(nombre).load();

    }
}
