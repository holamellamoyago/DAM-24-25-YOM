package ud5.PreparacionExamen.Inmobiliaria;

public abstract class Inmueble implements Comparable{
    String calle; 
    int metrosConstruidos, habitaciones, banhos;
    int precioAlquiler, precioVenta;

    public Inmueble(String calle, int metrosConstruidos, int habitaciones, int banhos) {
        this.calle = calle;
        this.metrosConstruidos = metrosConstruidos;
        this.habitaciones = habitaciones;
        this.banhos = banhos;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioCompra) {
        this.precioVenta = precioCompra;
    }

    abstract String detalle();

    @Override
    public String toString() {
        return "Inmueble en Calle " + calle + "( " + metrosConstruidos + " m2, "
                + habitaciones + " hab)";
    }

    static void mostrarInmuebles(Inmueble[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].toString());
        }
    }

    @Override
    public int compareTo(Object o) {
        Inmueble i = (Inmueble)o;
        int res = this.calle.compareTo(i.calle);
        return res;
    }

    



    

    

    

}
