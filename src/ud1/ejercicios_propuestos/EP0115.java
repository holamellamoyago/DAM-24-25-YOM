package ud1.ejercicios_propuestos;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el número de segundos
        System.out.print("Introduce el número de segundos: ");
        int totalSeconds = scanner.nextInt();

        // Calcular las horas, minutos y segundos
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Mostrar el resultado
        System.out.printf("%d segundos son %d horas, %d minutos y %d segundos.%n", totalSeconds, hours, minutes, seconds);

        // Cerrar el scanner
        scanner.close();
    }
}