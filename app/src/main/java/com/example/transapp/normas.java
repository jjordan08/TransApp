package com.example.transapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class normas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normas);
    }

    public void Principios(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO I - PRINCIPIOS.pdf");
        startActivity(intent);
    }

    public void Autoridades(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO II - AUTORIDADES.pdf");
        startActivity(intent);
    }
    public void RegistrosInformacion(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO III - REGISTROS DE INFORMACIÓN.pdf");
        startActivity(intent);
    }
    public void CentrosEnsenansa (View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO I - CENTROS DE ENSEÑANZA AUTOMOVILÍSTICA.pdf");
        startActivity(intent);
    }
    public void LicenciasConduccion(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO II - LICENCIAS DE CONDUCCIÓN.pdf");
        startActivity(intent);
    }
    public void Vehiculos(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO III - VEHÍCULOS.pdf");
        startActivity(intent);
    }
    public void LicenciasTransito(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VI - LICENCIA DE TRÁNSITO.pdf");
        startActivity(intent);
    }
    public void SegurosResponsabilidad(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO V - SEGUROS Y RESPONSABILIDAD.pdf");
        startActivity(intent);
    }
    public void Placas(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VI - PLACAS.pdf");
        startActivity(intent);
    }
    public void RegistroNacionalAutomotor(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VII - REGISTRO NACIONAL AUTOMOTOR.pdf");
        startActivity(intent);
    }
    public void RevisionTecnicomecanica(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VIII - REVISIÓN TÉCNICO MECÁNICA.pdf");
        startActivity(intent);
    }
    public void ReglasGeneralesYEducacion(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO I - REGLAS GENERALES Y EDUCACIÓN EN EL TRÁNSITO.pdf");
        startActivity(intent);
    }
    public void Peatones(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO II - PEATONES.pdf");
        startActivity(intent);
    }
    public void ConduccionVehiculos(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO III - CONDUCCIÓN DE VEHÍCULOS.pdf");
        startActivity(intent);
    }
    public void ParaElTransportePublico(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO IV - PARA EL TRANSPORTE PÚBLICO.pdf");
        startActivity(intent);
    }
    public void ciclistasMotociclistas(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO V - CICLISTAS Y MOTOCICLISTAS.pdf");
        startActivity(intent);
    }
    public void transitoDeOtrosVehiculosyAnimales(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VI - TRÁNSITO DE OTROS VEHÍCULOS Y ANIMALES.pdf");
        startActivity(intent);
    }
    public void transitoDePersonasenActividadesColectivos(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VII - TRÁNSITO DE PERSONAS EN ACTIVIDADES COLECTIVAS.pdf");
        startActivity(intent);
    }
    public void TrabajosEventualesViaPublica(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VIII - TRABAJOS EVENTUALES EN LA VÍA PÚBLICA.pdf");
        startActivity(intent);
    }
    public void ProteccionAmbiental(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO IX - PROTECCIÓN AMBIENTAL.pdf");
        startActivity(intent);
    }
    public void ClasificacionyUsoDeLasVias(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO IX - Clasificación y uso de las vías.pdf");
        startActivity(intent);
    }
    public void LimitesDeVelocidad(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO XI - Límites de Velocidad.pdf");
        startActivity(intent);
    }
    public void SenalesDeTransito(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO XII - SEÑALES DE TRÁNSITO.pdf");
        startActivity(intent);
    }
    public void ProcedimientosControl(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO XIII - PROCEDIMIENTOS DE CONTROL DE TRÁNSITO.pdf");
        startActivity(intent);
    }
    public void Sanciones(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO I - SANCIONES.pdf");
        startActivity(intent);
    }
    public void sancionesPorincumplimiento(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO II - SANCIONES POR EL INCUMPLIMIENTO DE LAS NORMAS DE TRANSITO.pdf");
        startActivity(intent);
    }
    public void competenciaNormasComportamiento(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO III - COMPETENCIA - NORMAS DE COMPORTAMIENTO.pdf");
        startActivity(intent);
    }
    public void ActuacionEnCasoImposicion(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO IV - ACTUACIÓN EN CASO DE IMPOSICIÓN DE COMPARENDO AL CONDUCTOR PARA EL TRANSPORTE PÚBLICO.pdf");
        startActivity(intent);
    }
    public void Recursos(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO V - RECURSOS.pdf");
        startActivity(intent);
    }
    public void ProdecimientoDanosaCosas(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VI - PROCEDIMIENTO EN CASO DE DAÑOS A COSAS.pdf");
        startActivity(intent);
    }
    public void ActuacionInfraccionesPenales(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VII - ACTUACIÓN EN CASO DE INFRACCIONES PENALES.pdf");
        startActivity(intent);
    }
    public void ActuacionCasoEmbriaguez(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO VIII - ACTUACIÓN EN CASO DE EMBRIAGUEZ.pdf");
        startActivity(intent);
    }
    public void SancionesEspeciales(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO IX - SANCIONES ESPECIALES.pdf");
        startActivity(intent);
    }
    public void EjecucionSancion(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO X - EJECUCIÓN DE LA SANCIÓN.pdf");
        startActivity(intent);
    }
    public void Caducidad(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO XI - CADUCIDAD.pdf");
        startActivity(intent);
    }
    public void AplicacionesDeOtros(View view) {
        Intent intent = new Intent(normas.this, textoNormas.class);
        intent.putExtra("dato00", "CAPÍTULO XII - APLICACIONES DE OTROS CÓDIGOS Y DISPOSICIONES FINALES.pdf");
        startActivity(intent);
    }

}
