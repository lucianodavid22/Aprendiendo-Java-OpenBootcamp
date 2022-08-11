public class Main {
    public static void main(String[] args) {
        Persona Luciano = new Persona();
        Luciano.setNombre("Luciano David Dorregaray");
        Luciano.setEdad(21);
        Luciano.setTelefono(1112223333);

        System.out.println("name: " + Luciano.getNombre());
        System.out.println("age: " + Luciano.getEdad());
        System.out.println("number: " + Luciano.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    // Get & Set => Nombre
    public String getNombre(){
        return this.nombre;
    };
    public void setNombre(String nombre){
        this.nombre = nombre;
    };

    // Get & Set => Edad
    public int getEdad(){
        return this.edad;
    };
    public void setEdad(int edad){
        this.edad = edad;
    };

    // Get & Set => Telefono
    public int getTelefono(){
        return this.telefono;
    };
    public void setTelefono(int telefono){
        this.telefono = telefono;
    };
}

