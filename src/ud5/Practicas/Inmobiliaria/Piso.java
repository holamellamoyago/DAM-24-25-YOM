package ud5.Practicas.Inmobiliaria;

public class Piso extends Inmueble {

    public Piso(String nombre, int metros2, int habitaciones, int baños, int planta, int metrosTerreno) {
        super(nombre, metros2, habitaciones, baños, planta, metrosTerreno);
    }

    public Piso(String nombre, int metros2, int habitaciones, int baños, int planta) {
        super(nombre, metros2, habitaciones, baños, planta);
    }

    @Override
    public String detalle() {
        String linea1 = "Piso en " + nombre + ".\n" + metros2 + " m2, " + habitaciones + " hab, " + baños + " baños, "
                + planta + "ª planta";

        String linea2 = "\nPrecio de alquiler: " + precioAlquiler + " €\n";
        String linea3 = "Precio de Venta: " + precioVenta + " €";

        if (precioAlquiler!=0) {
            return linea1 + linea2 + linea3;
        } else{
            return linea1 + linea3;
        }
    }

    // TODO ¿Diferencia?
    // @Override
    // public void setPrecioAlquiler(int precioAlquiler) {
    // super.precioAlquiler = precioAlquiler;
    // }
}
