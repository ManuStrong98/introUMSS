package edu.umss.ejerciciosadicionales.excepciones;

public class OperacionesAritmeticas {
    public int suma(int a, int b) throws FueraDeRangoException {
        if (a < 0) {
            throw new FueraDeRangoException("Valor de a fuera de rango");
        }

        if (b < 0) {
            throw new FueraDeRangoException("Valor de b fuera de rango");
        }

        return a + b;
    }

    public int division(int a, int b) throws DivisionCeroException {
        if (b == 0) {
            throw new DivisionCeroException("Estas dividiendo por cero");
        }
        return a / b;
    }
}
