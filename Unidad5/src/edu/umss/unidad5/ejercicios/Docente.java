package edu.umss.unidad5.ejercicios;

import java.math.BigDecimal;

public class Docente extends Persona {
    private String registroDocente;
    private Integer antiguedad;
    private BigDecimal salario;

    public Docente() {
        System.out.println("Instanciando docente");
    }

    public Docente(String registroDocente, String nombre, String apellido, Integer antiguedad, BigDecimal salario) {
        super(nombre, apellido);
        this.registroDocente = registroDocente;
        this.antiguedad = antiguedad;
        this.salario = salario;
    }

    public String getRegistroDocente() {
        return registroDocente;
    }

    public void setRegistroDocente(String registroDocente) {
        this.registroDocente = registroDocente;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /**
     * Ejercicio
     * Sobrescribir el metodo mostrarDatos de tal modo que además
     * de nombre y apellido muestre el salario y la antiguedad
     * 10:05
     */

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido +
                           ", Antiguedad: " + this.antiguedad + ", Salario: " + this.salario);
    }

    @Override
    public String toString() {
        return "Llamando toString. Nombre: " + this.nombre + ", Apellido: " + this.apellido +
                ", Antiguedad: " + this.antiguedad + ", Salario: " + this.salario;
    }

    @Override
    public boolean equals(Object obj) {
        Docente docente = (Docente) obj;
        return this.registroDocente.equals(docente.registroDocente);
    }
}
