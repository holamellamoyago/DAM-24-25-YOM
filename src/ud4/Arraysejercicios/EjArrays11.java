package ud4.Arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays11 {
    public static void main(String[] args) {
        char t[][] = new char[3][3];
        int turnoJugador = 1;
        boolean victoria = false;

        iniciarTablero(t);

        do {
            marcarCasilla(leerMovimiento(turnoJugador), t);
            victoria = comprobarVictoria(t, turnoJugador);
        } while (!victoria);

        System.out.println("Felicidades jugador " + turnoJugador + " has ganado!");

    }

    static boolean comprobarVictoria(char t[][], int turno) {
        boolean v = false;

        if ((t[0][0] == t[0][1] && t[0][0] == t[0][2]) || (t[1][0] == t[1][1] && t[0][0] == t[1][2])
                || (t[2][0] == t[2][1] && t[0][0] == t[2][2])) {
            v = true;
        }

        return v;
    }

    static char[][] marcarCasilla(int t[], char t2[][]) {
        t2[t[0]][t[1]] = '/';

        mostrarTablero(t2);

        return t2;
    }

    static int[] leerMovimiento(int turnoJugador) {
        Scanner sc = new Scanner(System.in);
        int fila, columna;

        System.out.println("Le toca al jugador " + turnoJugador);

        System.out.println("Fila: ");
        fila = sc.nextInt();

        System.out.println("Columna: ");
        columna = sc.nextInt();

        int t[] = { fila, columna };

        return t;

    }

    static char[][] iniciarTablero(char t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = '*';
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        return t;
    }

    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
