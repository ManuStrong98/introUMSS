import java.util.Date;

public class Persona {
    // Atributos
    private String nombre = "Juan";
    private String ciudad;
    private Date fechaNacimiento;

    // Métodos
    public Persona(String nombre, String ciudad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarDatosPersonales() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Ciudad: " + this.ciudad);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
    }
}
