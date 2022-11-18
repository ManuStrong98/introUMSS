package edu.umss.unidad5.ejercicios.excepciones;

public class PrincipalExcepciones {
    public static void main(String[] args) {
        OperacionesAritmeticas ops = new OperacionesAritmeticas();

        try {
            System.out.println("La division es " + ops.division(3, 0));
            System.out.println("La suma es " + ops.suma(-1, 5));
        } catch (ExcepcionAritmetica ex) {
            System.out.println("Se reportó la excepción " + ex.getMessage());
        } catch (FueraDeRangoException e) {
            e.printStackTrace();
        } finally { // Siempre se ejecuta
            System.out.println("Se ha ejecutado el bloque finally");
        }

        //ops.division(3, 0);

        System.out.println("Finalización del método principal.");
    }
}
