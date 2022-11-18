package edu.umss.ejerciciosadicionales.excepciones;

public class PrincipalExcepciones {
    public static void main(String[] args) throws FueraDeRangoException {
        OperacionesAritmeticas ops = new OperacionesAritmeticas();

        /*try {
            ops.division(3, 1);
            ops.suma(-1, -2);
        } catch (DivisionCeroException e) {
            System.out.println(e.getMessage());
        } catch (FueraDeRangoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ejecutando el bloque finally");
        }*/

        ops.suma(-1, -2);

        System.out.println("El programa ha finalizado exitosamente");
    }
}
