package ud5.PreparacionExamen.Inmobiliaria;

public class Casa extends Inmueble {
    int metrosTerreno;

    public Casa(String calle, int metrosConstruidos, int habitaciones, int banhos, int metrosTerreno) {
        super(calle, metrosConstruidos, habitaciones, banhos);
        this.metrosTerreno = metrosTerreno;
    }

    @Override
    String detalle() {
        String linea1 = "\n Casa en " + calle;
        String linea2 = "\n" + metrosConstruidos + " m2, " + habitaciones + " hab, " + banhos
                + " baños, con terreno de " + metrosTerreno + " m2";
        String linea3= "\nPrecio de Venta: " + precioVenta + " euros";
        return linea1 + linea2 + linea3;
    }

}
