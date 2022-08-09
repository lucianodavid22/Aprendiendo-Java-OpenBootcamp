public class Main {
    public static void main(String[] args) {
        System.out.println(suma(15, 5, 2));

        Coche auto = new Coche();
        auto.ponerPuertas();

        System.out.println(auto.puertas);
    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }
}

class Coche {
    public int puertas = 4;

    public void ponerPuertas(){
        this.puertas++;
    }
}

