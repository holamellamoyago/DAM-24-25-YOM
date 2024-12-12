package ud3.Apuntes.EjerciciosTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("El cronometro empieza cuando pulses enter");
        sc.nextLine();
        LocalTime momentoInicio = LocalTime.now();

        System.out.println("El cronometro termina cuando pulses enter");
        sc.nextLine();
        LocalTime momentoFinal = LocalTime.now();

        Duration duracion = Duration.between(momentoInicio, momentoFinal);
        long segudosTranscurridos = duracion.toSeconds();
        long segudosTranscurridos2 = duracion.getSeconds();
        System.out.println("Pasaron " + segudosTranscurridos + " segundos"); 

        long minutosTransurridos = duracion.toMinutes();
        System.out.println(minutosTransurridos);
    }
}
