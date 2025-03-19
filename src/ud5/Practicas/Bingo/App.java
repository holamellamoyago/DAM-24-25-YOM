package ud5.Practicas.Bingo;

import java.util.Scanner;

import ud4.ArraysUtil;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al bingo");

        System.out.println("\n¿Cuántos jugadores jugarán la partida?");
        int numJugadores = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        Jugador[] jugadores = new Jugador[numJugadores];
        jugadores = registrarJugadores(jugadores, sc);

        sc.close();
    }

    static Jugador[] registrarJugadores(Jugador[] jugadores, Scanner sc) {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Dime el nombre del jugador " + (i + 1));
            String nombre = "mARIA"; // Captura correctamente el nombre

            System.out.println("¿Cuántos cartones te gustarían?");
            int numero = 2;
            jugadores[i] = new Jugador(nombre, 2);

            sc.nextLine(); // Consumir el salto de línea después de nextInt()

            for (int j = 0; j < numero; j++) {
                ArraysUtil.mostrarMatriz(jugadores[i].cartones[j].numeros);
            }
            
            System.out.println("\n SIGUIENE-------------");
        }

        System.out.println("\nTodos los jugadores registrados");
        return jugadores;
    }
}
