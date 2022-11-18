package edu.umss.unidad4.ejercicios;

import java.util.Calendar;
import java.util.Date;

public class Estudiante {
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private Date fechaNacimiento;
    private String ciudad;
    private Integer primerParcial;
    private Integer segundoParcial;
    private Integer examenFinal;

    public Estudiante(String apellidoPaterno, String apellidoMaterno, String nombre, Date fechaNacimiento, String ciudad, Integer primerParcial, Integer segundoParcial, Integer examenFinal) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.examenFinal = examenFinal;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(Integer primerParcial) {
        this.primerParcial = primerParcial;
    }

    public Integer getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(Integer segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public Integer getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(Integer examenFinal) {
        this.examenFinal = examenFinal;
    }

    public Integer getPromedio() {
        return (primerParcial + segundoParcial + examenFinal) / 3;
    }

    public Integer getEdad() {
        Calendar calInicio = Calendar.getInstance();
        calInicio.setTime(fechaNacimiento); // Asignar la fecha de nacimiento al calendario

        Calendar calFin = Calendar.getInstance(); // Por defecto toma la fecha del día

        Integer anios = calFin.get(Calendar.YEAR) - calInicio.get(Calendar.YEAR);

        if (calFin.get(Calendar.MONTH) < calInicio.get(Calendar.MONTH) ||
                (calFin.get(Calendar.MONTH) == calInicio.get(Calendar.MONTH) &&
                 calFin.get(Calendar.DATE) < calInicio.get(Calendar.DATE))) {
            anios--;
        }

        return anios;
    }
}
