package Apuntes.EjerciciosRecuperacion;

import java.util.Scanner;

import ud4.ArraysUtil;

public class EjArrays11 {
    public static void main(String[] args) {
        int turno = 1;
        boolean partidaTerminada = false;

        char[][] tablero = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };

        System.out.println("Empieza el juego");
        System.out.println("Turno del jugador " + turno);

        do {
            marcarPunto(tablero, turno);
            partidaTerminada = comprobarPartida(tablero);

            if (comprobarPartida(tablero)) {
                System.out.println("El jugador " + turno + " gano la partida");
            }
            
            ArraysUtil.mostrarMatriz(tablero);
            
            if (turno == 1) {
                turno = 2;
            } else{
                turno = 1;
            }
        } while (!partidaTerminada);

    }

    static char[][] marcarPunto(char[][] tablero, int turno) {
        Scanner sc = new Scanner(System.in);
        int fila, columna = 0;

        System.out.println("Donde te gustaría marcar? (Fila)");
        fila = sc.nextInt();
        System.out.println("Donde te gustaría marcar? (Columna)");
        columna = sc.nextInt();

        if (tablero[fila][columna] != '*' || tablero[fila][columna] != '^') {
            System.out.println("Fila marcada");

            if (turno == 1) {
                tablero[fila][columna] = '*';
            } else {
                tablero[fila][columna] = '^';
            }
        }

        return tablero;
    }

    static boolean comprobarPartida(char[][] tablero) {

        // comprobacion filas
        if (tablero[0][1] == tablero[0][2] && tablero[0][0] == tablero[0][1]) {
            return true;
        }

        if (tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2]) {
            return true;
        }

        if (tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]) {
            return true;
        }

        // Compribación culumnas
        if (tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]) {
            return true;
        }

        if (tablero[0][1] == tablero[1][1] && tablero[1][0] == tablero[2][1]) {
            return true;
        }

        if (tablero[0][2] == tablero[1][2] && tablero[0][0] == tablero[2][2]) {
            return true;
        }

        // Diagonal

        if (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true;
        }

        if (tablero[2][0] == tablero[1][1] && tablero[2][0] == tablero[0][2]) {
            return true;
        }

        return false;
    }
}
