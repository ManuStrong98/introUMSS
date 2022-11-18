public class Cuaderno {
    private String color;
    private String marca;
    private int nroHojas;

    public Cuaderno(String color, String marca, int nroHojas) {
        this.color = color;
        this.marca = marca;
        this.nroHojas = nroHojas;
    }

    public void escribir() {
        System.out.println("Escribiendo en el cuaderno");
    }

    public void mostrarDatos() {
        System.out.println("Color: " + this.color);
        System.out.println("Marca: " + this.marca);
        System.out.println("Numero de hojas: " + this.nroHojas);
    }

    public String toString() {
        return this.color + " " + this.marca + " " + this.nroHojas;
    }
}
