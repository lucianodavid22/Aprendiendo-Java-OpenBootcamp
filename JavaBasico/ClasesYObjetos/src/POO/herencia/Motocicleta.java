package POO.herencia;

import POO.clases.Motor;
import POO.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    // Clase Derivada, Sub Clase, Clase Hija
    boolean baul;

    public Motocicleta(){}

    public Motocicleta(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modeloVehiculo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
