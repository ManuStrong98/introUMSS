package edu.umss.unidad5.ejercicios;

public class Estudiante extends Persona {
    private Integer semestre;
    private Integer codigoSIS;

    public Estudiante() {
        System.out.println("Instanciando estudiante");
    }

    public Estudiante(String nombre, String apellido, Integer semestre, Integer codigoSIS) {
        super(nombre, apellido);
        this.semestre = semestre;
        this.codigoSIS = codigoSIS;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCodigoSIS() {
        return codigoSIS;
    }

    public void setCodigoSIS(Integer codigoSIS) {
        this.codigoSIS = codigoSIS;
    }

    @Override
    public void mostrarDatos() {  // Sobrescritura de mostrarDatos de Persona
        System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido +
                           ", Semestre: " + this.semestre + ", Codigo SIS: " + this.codigoSIS);
    }

    /**
     * Ejercicio
     * Sobrescribir el metodo equals
     * para Estudiante de tal manera de comparar el codigoSIS
     * Crear dos instancias de Estudiante con codigoSIS igual
     * y realizar la comparación
     * 8:45
     */

    @Override
    public boolean equals(Object obj) {
        Estudiante estudiante = (Estudiante) obj;

        return estudiante.codigoSIS.equals(this.codigoSIS) &&
                estudiante.nombre.equals(this.nombre) &&
                estudiante.apellido.equals(this.apellido) &&
                estudiante.semestre.equals(this.semestre);
    }
}
