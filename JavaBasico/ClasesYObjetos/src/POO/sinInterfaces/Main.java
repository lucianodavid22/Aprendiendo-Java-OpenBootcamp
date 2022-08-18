package POO.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUDv1 empleadoCRUD = new EmpleadoCRUDv1();
        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patrick = new Empleado("Patrick", 30, 40000, true);
        Empleado robert = new Empleado("Robert", 30, 40000, true);

        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patrick);
        empleadoCRUD.save(robert);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
