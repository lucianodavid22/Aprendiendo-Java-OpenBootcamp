package POO.clases;

public class Vehiculo {
    // Clase base, Super Clase, Clase Padre
    // ATRIBUTOS
    protected String fabricante;
    protected String modeloVehiculo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // CONSTRUCTORES
    public Vehiculo(){}

    public Vehiculo(String fabricante, String modeloVehiculo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, int year) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
        this.year = year;
    }

    // METODOS

    public void acelerar(int cantidad){
        this.speed += cantidad;
    }

}
