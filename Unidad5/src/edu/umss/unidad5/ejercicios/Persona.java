package edu.umss.unidad5.ejercicios;

public class Persona {
    protected String nombre;
    protected String apellido;

    public Persona() {
        System.out.println("Instanciando persona");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido);
    }
}
