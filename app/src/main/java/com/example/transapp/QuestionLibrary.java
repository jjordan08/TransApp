package com.example.transapp;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Para virar en una esquina hay que encender las luces direccionales:",
            "¿Cuál es la separación mínima entre dos vehículos que circulan uno detrás del otro a 30 kilómetros por hora?",
            "En las mismas circunstancias anteriores, pero, con ambos autos marchando a 30 a 60 kms/h, ¿cuál es la distancia mínima que debe existir entre los dos coches?",
            "¿En qué momento se deben encender las luces de un vehículo?",
            "En una glorieta ¿qué vehículo tiene la prioridad en la vía?",
            "¿En qué circunstancias es permitido seguir la marcha de una ambulancia en emergencia?",
            "En vías de dos o más carriles el izquierdo se debe utilizar:",
            "¿Cuál es la velocidad máxima permitida en vías de doble calzada?",
            "En vías de una sola calzada se puede transitar como máximo a:",
            "¿Por cuánto tiempo se le suspende la licencia a un conductor con tercer grado de alcoholemia?"


    };


    private String mChoices [][] = {
            {"30 metros antes", "25 metros antes", "15 metros antes"},
            {"6 metros", "8 metros", "10 metros"},
            {"15 metros", "20 metros", "30 metros"},
            {"Cuando Obscurece del todo","A las 7pm","A las 6pm"},
            {"El que está circulando en la glorieta.","El que llega por la vía principal.","El que primero se meta."},
            {"Cuando el tráfico lo permite.","Cuando la ambulancia lleva a un familiar o allegado.","Ninguna."},
            {"En todo momento.","Solo para adelantar vehículos lentos.","A bajas velocidades."},
            {"90 kms/h","120 kms/h","150 kms/h"},
            {"80 kms/h","90 kms/h","100 kms/h"},
            {"5 Años","7 años","10 años"}
    };



    private String mCorrectAnswers[] = {"30 metros antes", "10 metros", "20 metros", "A las 6pm","El que está circulando en la glorieta.",
                                        "Ninguna.","Solo para adelantar vehículos lentos.","120 kms/h","90 kms/h","10 años"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}