package POO.clases;

import POO.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        // Clases y Objetos
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        Vehiculo FordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        FordMondeo.acelerar(50);

        // Herencia
        Motocicleta KawasakiNinja = new Motocicleta();
        KawasakiNinja.fabricante = "Kawasaki";

        // Clases abstractas: no se pueden instanciar, solo se instancian las clases hijas.
    }
}
