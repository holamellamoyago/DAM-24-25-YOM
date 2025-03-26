package AceptaElReto.ArraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        char[][] mapa = new char[5][5];
        Random rdm = new Random();

        mapa[mapa.length / 2][mapa[0].length / 2] = '*';
        mapa[rdm.nextInt(5)][rdm.nextInt(5)] = '^';

        System.out.println("Bienvenido al Snake");

        System.out.println();
        jugar(mapa);
    }

    static boolean jugar(char[][] mapa) {
        Scanner sc = new Scanner(System.in);
        boolean muerto = false;
        int longitudSnake = 1;

        int filaSnake = buscarSnake(mapa).charAt(0);
        int columnaSnake = buscarSnake(mapa).charAt(2);

        

        do {
            mostrarMatriz(mapa);
            mapa[filaSnake][columnaSnake] = ' ';
            System.out.println("¿ A donde te quieres mover?");
            System.out.println("A , W, S, D");
            char respuesta = sc.nextLine().charAt(0);

            switch (respuesta) {
                case 'W':
                    if (filaSnake == 0) {
                        return false;
                    } else {
                        filaSnake -= 1;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                        }
                    }
                    break;
                case 'S':
                    if (filaSnake == mapa.length - 1) {
                        return false;
                    } else {
                        filaSnake += 1;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                        }
                    }
                case 'A':
                    if (columnaSnake == 0) {
                        return false;
                    } else {
                        columnaSnake -= 1;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                        }
                    }
                case 'D':
                    if (columnaSnake == mapa[columnaSnake].length - 1) {
                        return false;
                    } else {
                        columnaSnake += 1;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                        }
                    }
                default:
                    break;
            }
            mapa[filaSnake][columnaSnake] = '*';
            

        } while (!muerto);

        return muerto;
    }

    static boolean comprobarComida(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == '^') {
            return true;
        } else {
            return false;
        }
    }

    static String buscarSnake(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == '*') {
                    return (char) i + " " + (char) j;
                }
            }
        }

        return "";
    }

    static void mostrarMatriz(char[][] parcelas) {
        for (int i = 0; i < parcelas.length; i++) {
            for (int j = 0; j < parcelas[i].length; j++) {
                System.out.print("[");
                System.out.print(parcelas[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
