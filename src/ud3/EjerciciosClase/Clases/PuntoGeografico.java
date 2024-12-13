package ud3.EjerciciosClase.Clases;

public class PuntoGeografico {
    int gradosLatitud, gradosLongitud, minutosLatitud, minutosLongitud, segundosLatitud, segundosLongitud;

    public PuntoGeografico(int gradosLatitud, int gradosLongitud, int minutosLatitud, int minutosLongitud,
            int segundosLatitud, int segundosLongitud) {

        if (gradosLatitud > 90 || gradosLongitud > 90) {
            throw new IllegalArgumentException("Error al introducir los grados");

        } else {
            if (minutosLatitud > 59 || minutosLongitud > 59 || segundosLatitud > 59 || segundosLongitud > 59) {

                throw new IllegalArgumentException("Error al introducir los minutos y segundos");

            } else {
                this.gradosLatitud = gradosLatitud;
                this.gradosLongitud = gradosLongitud;
                this.minutosLatitud = minutosLatitud;
                this.minutosLongitud = minutosLongitud;
                this.segundosLatitud = segundosLatitud;
                this.segundosLongitud = segundosLongitud;
            }

        }
    }

    public PuntoGeografico() {
        this(51, 0, 28, 0, 38, 0);
    }

    public double gradosDecimalesLatitud(){
        return gradosLatitud + (minutosLatitud / 60.0) + (segundosLatitud / 3600.0);

    }

    public double gradosDecimalesLongitud(){
        return gradosLongitud + (minutosLongitud / 60.0) + (segundosLongitud / 3600.0);
    }

    public void mostrarGradosDecimales() {
        System.out.println("Los grados decimales de la longitud son: " + gradosDecimalesLongitud());
        System.out.println("Los grados decimales de la latitud son: " + gradosDecimalesLatitud());
    }

    public String urlGoogleMaps(){
        return "https://www.google.es/maps/@" + gradosDecimalesLatitud() +","+gradosDecimalesLongitud();
    }
    
   public String urlOpenStreetMaps(){
        return "https://www.openstreetmap.org/#map=14/" + gradosDecimalesLatitud() +"/" + +gradosDecimalesLongitud();
   }
    






    public static void main(String[] args) {
        PuntoGeografico pg = new PuntoGeografico(90, 60, 33, 33, 33, 33);
        PuntoGeografico pg2 = new PuntoGeografico();

        pg2.mostrarGradosDecimales();
        System.out.println(pg2.urlGoogleMaps());
        System.out.println(pg2.urlOpenStreetMaps());
    }

}
