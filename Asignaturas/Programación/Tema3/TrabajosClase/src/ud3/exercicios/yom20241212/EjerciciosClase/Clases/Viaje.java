package ud3.EjerciciosClase.Clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Viaje {
    User usuario;
    PuntoGeografico pgOrigen;
    PuntoGeografico pgDestino;
    int numPlazas;
    String fechaHora;

    public Viaje(User usuario, PuntoGeografico pgOrigen, PuntoGeografico pgDestino, int numPlazas) {
        this.usuario = usuario;
        this.pgOrigen = pgOrigen;
        this.pgDestino = pgDestino;
        this.numPlazas = numPlazas;

        // DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime fechaActual = LocalDateTime.now();
        this.fechaHora = fechaActual.format(formatoFechaHora);
    }

    public void mostrarInformacion(){
        System.out.println(fechaHora + " - " + usuario.getUsername() + " - " + pgOrigen.gradosDecimalesLatitud()+","+pgOrigen.gradosDecimalesLongitud()+" >> "+pgDestino.gradosDecimalesLatitud()+","+pgDestino.gradosDecimalesLongitud());
    }

    public static void main(String[] args) {

        PuntoGeografico pgOrigen = new PuntoGeografico(90, 89, 30, 30, 30, 30);
        PuntoGeografico pgDestino = new PuntoGeografico(89, 88, 30, 30, 30, 30);

        User usuario = new User("holamellamoyago", "abc123.", "yagootero2003@gmail.com", true);

        Viaje v = new Viaje(usuario, pgOrigen, pgDestino, 20);

        v.mostrarInformacion();
    }

}
