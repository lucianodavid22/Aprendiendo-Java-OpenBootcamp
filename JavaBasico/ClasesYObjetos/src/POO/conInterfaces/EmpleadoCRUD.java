package POO.conInterfaces;

import POO.sinInterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    // Se declaran los metodos sin cuerpo
    // el cuerpo de las funciones se arma en las clases donde se implemente la interfaz
    // Hay que implementar todos los metodos
    void save(Empleado empleado);
    List<Empleado> findAll();
    void delete(Empleado empleado);
}
