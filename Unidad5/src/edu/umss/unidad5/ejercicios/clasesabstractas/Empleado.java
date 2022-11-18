package edu.umss.unidad5.ejercicios.clasesabstractas;

public class Empleado extends AbstractPersona {
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre +
                           ", Apellido paterno: " + this.apellidoPaterno +
                           ", Apellido materno: " + this.apellidoMaterno);
    }
}
