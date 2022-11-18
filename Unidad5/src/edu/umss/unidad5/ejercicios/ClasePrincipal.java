package edu.umss.unidad5.ejercicios;

import edu.umss.unidad5.ejercicios.clasesabstractas.Empleado;

import java.math.BigDecimal;

public class ClasePrincipal {
    public static void main(String[] args) {
        /*Estudiante roberto = new Estudiante("Roberto", "Flores", 3, 20102132);
        System.out.println("Nombre: " + roberto.getNombre() + " Apellido: " +
                            roberto.getApellido() + " Semestre: " + roberto.getSemestre() +
                            " " + roberto.getCodigoSIS());

        roberto.mostrarDatos();

        Estudiante alberto = new Estudiante();
        alberto.setNombre("Alberto");
        System.out.println(alberto.getNombre());

        Docente juan = new Docente("Juan", "Perez", 5, new BigDecimal("3000.50"));
        System.out.println("Nombre: " + juan.getNombre() + ", Apellido: " + juan.getApellido() +
                           ", Antiguedad: " + juan.getAntiguedad() + ", Salario: " + juan.getSalario());

        juan.mostrarDatos();*/

        Docente juan = new Docente("101", args[0], args[1], Integer.parseInt(args[2]), new BigDecimal(args[3]));
        juan.mostrarDatos();
        System.out.println(juan);

        Docente juan2 = new Docente("101", args[0], args[1], Integer.parseInt(args[2]), new BigDecimal(args[3]));

        if (juan.equals(juan2)) {  // equals compara el contenido de los objetos
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }

        Empleado emp = new Empleado("Jorge", "Gomez", "Lopez");
        emp.mostrarDatos();

        Estudiante estudiante1 = new Estudiante("Marco", "Gomez", 1, 1011);
        Estudiante estudiante2 = new Estudiante("Marco", "Gomez", 1, 1011);

        if (estudiante1.equals(estudiante2)) {
            System.out.println("Los estudiantes son iguales");
        }
    }
}
