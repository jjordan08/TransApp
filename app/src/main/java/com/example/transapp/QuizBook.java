package com.example.transapp;


public class QuizBook {

    public static String[] questions = new String [] {
            "Todos los ocupantes del vehículo deben usar el cinturón de seguridad.", //1
            "El Soat se puede portar en el celular o en cualquier dispositivo móvil.",//2
            "Está prohibido manejar con gafas de sol.",//3
            "Está prohibido conducir mientras se habla con audífonos manos libres.",//4
            "Una cerveza no marca en la prueba de alcoholemia.",//5
            "El extintor debe ser de 5 libras y debe estar en el interior de la cabina del carro.",//6
            "En la silla del copiloto sólo se puede sentar alguien mayor de 10 años.",//7
            "Si lo para un guarda y no tiene los documentos de su vehículo, tiene 20 minutos para conseguirlos",//8
    };


    public static boolean[] answers = new boolean[]{
            true,//1
            true, //2
            false, //3
            false, //4
            false, //5
            false, //6
            true, //7
            false //8
    };
}