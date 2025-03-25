package ud5.PreparacionExamen.Inmobiliaria;

public class Piso extends Inmueble {
    int planta;

    public Piso(String calle, int metrosCuadrados, int habitaciones, int banhos, int planta) {
        super(calle, metrosCuadrados, habitaciones, banhos);
        this.planta = planta;
    }

    @Override
    String detalle() {
        String linea1 = "\nPiso en " + calle;
        String linea2 = "\n" + metrosConstruidos + " m2, " + habitaciones + " hab, " + banhos
                + " baños, " + planta + " planta";
        String linea3= "\nPrecio de Alquiler: " + precioAlquiler + " euros";
        return linea1 + linea2 + linea3;
    }
}
