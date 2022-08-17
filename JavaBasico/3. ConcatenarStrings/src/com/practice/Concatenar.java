package com.practice;

public class Concatenar {
    public static void main(String[] args) {
        String[] array = {"Hola,", "como", "estas?"};
        System.out.println(concatenador(array));
    }
    public static String concatenador(String[] arrayDeStrings){
        String texto = "";

        for(int i = 0; i < arrayDeStrings.length; i++){
            texto += arrayDeStrings[i] + " ";
        }

        return texto;
    }
}
