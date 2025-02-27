package ud5.Practicas.Inmobiliaria;

public abstract class Inmueble {
    String nombre;
    int metros2,habitaciones,baños,planta,metrosTerreno, precioAlquiler, precioVenta;


    public Inmueble(String nombre, int metros2, int habitaciones, int baños, int planta, int metrosTerreno) {
        this.nombre = nombre;
        this.metros2 = metros2;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.planta = planta;
        this.metrosTerreno = metrosTerreno;

        this.precioAlquiler = 0;

    }

    

    // public Inmueble(String nombre, int metros2, int habitaciones, int baños, int planta, int metrosTerreno,
    //         int precioAlquiler) {
    //     this.nombre = nombre;
    //     this.metros2 = metros2;
    //     this.habitaciones = habitaciones;
    //     this.baños = baños;
    //     this.planta = planta;
    //     this.metrosTerreno = 0;
    //     this.precioAlquiler = 0;
    // }

    public Inmueble(String nombre, int metros2, int habitaciones, int baños, int planta){
        this(nombre, metros2, habitaciones, baños, planta, 0);
    }

    
    


    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }



    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }



    public abstract String detalle();



    @Override
    public String toString() {
        return "Inmueble en " + nombre + " (" + metros2 + " m2), " + habitaciones + " hab)";
    }

    


    

    

}
