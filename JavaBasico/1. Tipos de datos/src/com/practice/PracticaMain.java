package com.practice;

public class PracticaMain {
    public static void main(String[] args) {
        // Booleanos

        boolean verdadero = true;
        boolean falso = false;

        // Texto

        String nombre = "Luciano";
        char letra = 'a';

        // Numeros enteros

        byte enteroByte = 126;   // Memoria 1 byte, Rango de -128 a 127
        short enteroShort = 32000; // Memoria 2 byte, Rango de -32.768 a 32.767
        int enteroInt = 1000000;     // Memoria 4 byte, Rango de -2,147,483,648 a 2,147,483,647
        long enteroLong = 222222222;   // Memoria 8 byte, Rango de 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

        // Numeros con decimales
        // Precision => float tiene 6-7 digitos decimales y double 16-16 digitos decimales
        float decimalFloat = 2.2f;
        double decimalDouble = 22.22d;

        System.out.println("boolean verdadero: " + verdadero);
        System.out.println("boolean falso: " + falso);
        System.out.println("texto string: " + nombre);
        System.out.println("texto caracter: " + letra);
        System.out.println("entero byte: " + enteroByte);
        System.out.println("entero short: " + enteroShort);
        System.out.println("entero int: " + enteroInt);
        System.out.println("entero long: " + enteroLong);
        System.out.println("decimal float: " + decimalFloat);
        System.out.println("decimal double: " + decimalDouble);
    }
}
