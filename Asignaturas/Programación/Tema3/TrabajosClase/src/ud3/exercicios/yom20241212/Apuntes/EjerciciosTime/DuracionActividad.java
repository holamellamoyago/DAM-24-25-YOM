package ud3.Apuntes.EjerciciosTime;

import java.time.Duration;
import java.time.LocalTime;

public class DuracionActividad {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(14, 0);
        LocalTime horafinal = LocalTime.of(19, 0);
        Duration duracion = Duration.between(horaInicio, horafinal);
        Duration duracionMinutos = Duration.ofMinutes(600);

        System.out.println(duracion);
        System.out.println(duracionMinutos);

    }
}
