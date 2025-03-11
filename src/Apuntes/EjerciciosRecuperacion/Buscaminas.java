package Apuntes.EjerciciosRecuperacion;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        final int NFILAS = 5;
        final int NCOLUMNAS = 5;

        boolean[][] tablero = new boolean[NFILAS][NCOLUMNAS];
        tablero = esconderBombas(tablero);

        mostrarTableroBombas(tablero);

        char[][] tableroLimpio = generarTableroLimpio(NFILAS, NCOLUMNAS);

        // mostrarTableroBombas(tablero);
        System.out.println("Bienvenido al buscaminas");

        comenzarPartida(tablero, tableroLimpio);

    }

    static boolean comenzarPartida(boolean[][] t, char[][]t2) {
        Scanner sc = new Scanner(System.in);

        int bombasEncontradas = 0;
        mostrarTableroLimpio(t2);
        do {

            System.out.println("Selecciona la fila a atacar");
            int fila = sc.nextInt();

            System.out.println("Selecciona columna a atacar");
            int columna = sc.nextInt();

            if (comprobarBomba(t, fila, columna)) {
                System.out.println("Perdiste");
            } else {
                System.out.println("No hay bomba");
                t2 = comprobarBombasCercanas(t2, t, fila, columna);
                mostrarTableroLimpio(t2);

                
            }

            

        } while (bombasEncontradas != 2);

        return false; // TODO Corregir
    }

    static char[][] comprobarBombasCercanas(char[][] t, boolean[][] t2, int nFila, int nColumna) {

        // comprobamos verticalmente
        if (nFila != 0) {
            if (t2[nFila - 1][nColumna] == true) {
                t[nFila - 1][nColumna] = '1';
            }
        }

        if (nFila != t.length) {
            if (t2[nFila + 1][nColumna] == true) {
                t[nFila + 1][nColumna] = '1';
            }
        }

        // comprobamos horizontalmente
        if (nColumna != 0) {
            if (t2[nFila][nColumna - 1] == true) {
                t[nFila][nColumna - 1] = '1';
            }
        }

        if (nFila != t.length) {
            if (t2[nFila][nColumna + 1] == true) {
                t[nFila][nColumna + 1] = '1';
            }
        }

        // comprobamos esquina superior izq
        if (nFila != 0 && nColumna != 0) {
            if (t2[nFila - 1][nColumna - 1] == true) {
                t[nFila - 1][nColumna - 1] = '1';
            }
        }

        // comprobamos esquina superior derecha
        if (nFila != 0 && nColumna != t.length) {
            if (t2[nFila - 1][nColumna + 1] == true) {
                t[nFila - 1][nColumna + 1] = '1';
            }
        }

        // comprobamos esquina inferior derecha
        if (nFila != t.length && nColumna != t.length) {
            if (t2[nFila + 1][nColumna + 1] == true) {
                t[nFila + 1][nColumna + 1] = '1';
            }
        }

        // comprobamos esquina inferior izq
        if (nFila != t.length && nColumna != 0) {
            if (t2[nFila + 1][nColumna - 1] == true) {
                t[nFila + 1][nColumna - 1] = '1';
            }
        }

        return t;
    }

    static boolean comprobarBomba(boolean[][] t, int nFila, int ncolumna) {
        if (t[nFila][ncolumna] == true) {
            return true;
        } else {
            return false;
        }
    }

    static void mostrarTableroLimpio(char[][] t) {
        for (int i = 0; i < t[0].length; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();

        for (int i = 0; i < t.length; i++) {

            System.out.print(i + ":");

            for (int j = 0; j < t[i].length; j++) {
                System.out.print("\t" + t[i][j]);
            }

            System.err.println();
        }
    }

    static void mostrarTableroBombas(boolean[][] t) {
        for (int i = 0; i < t[0].length; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();

        for (int i = 0; i < t.length; i++) {

            System.out.print(i + ":");

            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] ? "\t*" : "\t1");
            }

            System.err.println();
        }
    }

    static boolean[][] esconderBombas(boolean[][] t) {
        int numBombas = 2;

        do {
            int filaRdm = new Random().nextInt(0, t.length);
            int columnaRdm = new Random().nextInt(0, t[0].length);

            t[filaRdm][columnaRdm] = true;
            numBombas--;
        } while (numBombas > 0);

        return t;
    }

    static char[][] generarTableroLimpio(int nFilas, int nColumnas) {

        char[][] tableroLimpio = new char[nFilas][nColumnas];

        for (int i = 0; i < tableroLimpio.length; i++) {
            for (int j = 0; j < tableroLimpio[i].length; j++) {
                tableroLimpio[i][j] = '-';
            }
        }

        return tableroLimpio;
    }

}
