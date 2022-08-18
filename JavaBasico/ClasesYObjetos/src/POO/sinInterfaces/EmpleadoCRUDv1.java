package POO.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDv1 {
    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
