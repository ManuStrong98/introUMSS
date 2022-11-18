package edu.umss.unidad5.ejercicios.clasesabstractas;

abstract public class AbstractPersona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;

    public AbstractPersona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    abstract void mostrarDatos();
}
