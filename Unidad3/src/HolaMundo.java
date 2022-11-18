import java.util.Date;

public class HolaMundo {
    // Método principal
    // Ejercicio: Crear una clase Ejercicio1
    // - Crear método principal
    // En el método principal
    // Definir dos variables double: base y altura
    // Mostrar en pantalla el área del rectángulo
    // 9:35

    /**
     * Método principal de la clase HolaMundo
     * @param args
     */
    public static void main(String[] args) {
        String holaMundo = "Hola mundo";
        System.out.println(holaMundo);

        int a;
        a = 15;

        int b = 20;
        int c = a + b;
        System.out.println(c);

        double x = 3.1416;
        float y = 3.1416f;

        System.out.println("La variable x es " + x);
        System.out.println("La variable y es " + y);

        Persona juan = new Persona("Juan Perez", "Cochabamba", new Date());
        juan.mostrarDatosPersonales();


        Cuaderno torre = new Cuaderno("Negro", "Torre", 50);
        torre.mostrarDatos();

        System.out.println(torre);
    }
}
