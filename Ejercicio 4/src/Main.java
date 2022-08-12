public class Main {
    public static void main(String[] args) {
        Cliente lucho = new Cliente();
        lucho.nombre = "Luciano";
        lucho.edad = 21;
        lucho.telefono = 1112223333;
        lucho.credito = 22;
        System.out.println("clase cliente: " + lucho.nombre);
        System.out.println("clase cliente: " + lucho.edad);
        System.out.println("clase cliente: " + lucho.telefono);
        System.out.println("clase cliente: " + lucho.credito);

        Trabajador luciano = new Trabajador();
        luciano.nombre = "David";
        luciano.edad = 21;
        luciano.telefono = 1113332222;
        luciano.salario = 1500;
        System.out.println("clase trabajador: " + luciano.nombre);
        System.out.println("clase trabajador: " + luciano.edad);
        System.out.println("clase trabajador: " + luciano.telefono);
        System.out.println("clase trabajador: " + luciano.salario);
    }
}

class Persona {
    public String nombre;
    public int edad;
    public int telefono;
}

class Cliente extends Persona {
    public int credito;
}

class Trabajador extends Persona {
    public int salario;
}

