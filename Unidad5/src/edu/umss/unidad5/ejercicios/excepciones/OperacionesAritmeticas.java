package edu.umss.unidad5.ejercicios.excepciones;

public class OperacionesAritmeticas {
    public int division(int a, int b) throws ExcepcionAritmetica { // El programa llamador es responsable de controlar la excepción
        int resultado = 0;

        if (b == 0) {
            throw new DivisionCero("Estas dividiendo por cero");
        }

        resultado = a / b;
        return resultado;
    }

    public int suma(int a, int b) throws FueraDeRangoException {
        // Si a o b son menores a cero
        // lanzar la excepcion FueraDeRangoException
        // Con los mensajes "a fuera de rango", "b fuera de rango"
        // En el programa llamador, controlar esta excepción
        // 10:35

        if (a < 0) {
            throw new FueraDeRangoException("a fuera de rango");
        }

        if (b < 0) {
            throw new FueraDeRangoException("b fuera de rango");
        }

        return a + b;
    }
}
