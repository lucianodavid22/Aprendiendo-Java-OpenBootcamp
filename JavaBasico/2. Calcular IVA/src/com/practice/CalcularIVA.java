package com.practice;

public class CalcularIVA {
    public static void main(String[] args) {
        System.out.println("el resultado de agregarle IVA a 81.81 es: " + calculo(81.82));
    }
    static double calculo(double precio){
        return precio * 1.21;
    }
}
