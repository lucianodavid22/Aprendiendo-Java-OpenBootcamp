package JavaBasico.OpenBootcamp;

public class Main {
    public static void main(String[] args) {
        SmartPhone Iphone13 = new SmartPhone("Apple", "13 pro", "Midnight", 6.1, 8);
        SmartWatch AppleWatch = new SmartWatch("Apple", "Watch 7", "Green", true, true);

        System.out.println(Iphone13.toString());
        System.out.println(AppleWatch.toString());
    }

    public static class SmartDevice{
        String marca;
        String modelo;
        String color;

        public SmartDevice(){}

        public SmartDevice(String marca, String modelo, String color) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
        }

        @Override
        public String toString() {
            return "SmartDevice{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static class SmartPhone extends SmartDevice {
        double pulgadasPantalla;
        int ram;

        public SmartPhone(){}

        public SmartPhone(String marca, String modelo, String color, double pulgadasPantalla, int ram) {
            super(marca, modelo, color);
            this.pulgadasPantalla = pulgadasPantalla;
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "pulgadasPantalla=" + pulgadasPantalla +
                    ", ram=" + ram +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static class SmartWatch extends SmartDevice {
        boolean sumergible;
        boolean wifi;

        public SmartWatch(){}

        public SmartWatch(String marca, String modelo, String color, boolean sumergible, boolean wifi) {
            super(marca, modelo, color);
            this.sumergible = sumergible;
            this.wifi = wifi;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "sumergible=" + sumergible +
                    ", wifi=" + wifi +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
