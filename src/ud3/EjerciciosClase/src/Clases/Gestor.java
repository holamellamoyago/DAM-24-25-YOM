package Clases;

public class Gestor {
    public String nombre;
    String telefono;
    double importeMax;

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = 10000;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + "\n" + "Telefono: " + this.telefono + "\n" + "ImporteMax: "
                + this.importeMax);
    }

    public static void main(String[] args) {
        Gestor g = new Gestor("Pedro", "123456789");

        g.mostrarInformacion();
    }

}
