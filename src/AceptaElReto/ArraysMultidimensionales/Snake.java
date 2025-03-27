package AceptaElReto.ArraysMultidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        char[][] mapa = new char[5][5];
        Random rdm = new Random();

        mapa = rellenarEspacios(mapa);
        mapa[mapa.length / 2][mapa[0].length / 2] = '*';
        mapa[rdm.nextInt(5)][rdm.nextInt(5)] = '^';

        System.out.println("Bienvenido al Snake");

        System.out.println();
        jugar(mapa);
    }

    static boolean jugar(char[][] mapa) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        boolean muerto = false;
        int longitudSnake = 1;
        CasillaSnake[] repeticiones = new CasillaSnake[0];

        int filaSnake = buscarSnake(mapa).charAt(0);
        int columnaSnake = buscarSnake(mapa).charAt(2);

        int filaSnakeAnterior = filaSnake;
        int columnaAnteriorSnake = columnaSnake;

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
                        columnaAnteriorSnake = columnaSnake;
                        filaSnake = filaSnakeAnterior;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                            repeticiones = Arrays.copyOf(repeticiones, repeticiones.length + 1);
                            repeticiones[repeticiones.length - 1] = new CasillaSnake(filaSnake, columnaSnake,
                                    longitudSnake);
                        }
                    }
                    break;
                case 'S':
                    if (filaSnake == mapa.length - 1) {
                        return false;
                    } else {
                        columnaAnteriorSnake = columnaSnake;
                        filaSnake = filaSnakeAnterior;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                            repeticiones = Arrays.copyOf(repeticiones, repeticiones.length + 1);
                            repeticiones[repeticiones.length - 1] = new CasillaSnake(filaSnake, columnaSnake,
                            longitudSnake);
                        }
                        filaSnake += 1;
                    }
                    break;
                case 'A':
                    if (columnaSnake == 0) {
                        return false;
                    } else {
                        columnaSnake -= 1;
                        columnaAnteriorSnake = columnaSnake;
                        filaSnake = filaSnakeAnterior;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                            repeticiones = Arrays.copyOf(repeticiones, repeticiones.length + 1);
                            repeticiones[repeticiones.length - 1] = new CasillaSnake(filaSnake, columnaSnake,
                                    longitudSnake);
                        }

                    }
                    break;
                case 'D':
                    if (columnaSnake == mapa[columnaSnake].length - 1) {
                        return false;
                    } else {

                        columnaSnake += 1;
                        columnaAnteriorSnake = columnaSnake;
                        filaSnake = filaSnakeAnterior;
                        if (comprobarComida(mapa, filaSnake, columnaSnake)) {
                            longitudSnake++;
                            repeticiones = Arrays.copyOf(repeticiones, repeticiones.length + 1);
                            repeticiones[repeticiones.length - 1] = new CasillaSnake(filaSnakeAnterior,
                                    columnaAnteriorSnake,
                                    longitudSnake);

                            mapa[rdm.nextInt(5)][rdm.nextInt(5)] = '^';

                        }

                    }
                default:
                    break;
            }

            mapa = rellenarRepeticiones(mapa, repeticiones);

            mapa[filaSnake][columnaSnake] = '*';
            restarRepeticiones(mapa, repeticiones);

        } while (!muerto);

        return muerto;
    }

    static char[][] restarRepeticiones(char[][] mapa, CasillaSnake[] repeticiones) {
        for (int i = 0; i < repeticiones.length; i++) {
            repeticiones[i].repeticiones--;
        }

        return mapa;
    }

    static char[][] rellenarRepeticiones(char[][] mapa, CasillaSnake[] repeticiones) {
        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i].repeticiones > 0) {
                CasillaSnake csilla = repeticiones[i];
                mapa[csilla.fila][csilla.columna] = '*';
            } else {
                CasillaSnake csilla = repeticiones[i];
                mapa[csilla.fila][csilla.columna] = ' ';

            }
        }

        return mapa;
    }

    static boolean comprobarComida(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == '^') {
            return true;
        } else {
            return false;
        }
    }

    static char[][] rellenarEspacios(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = ' ';
            }
        }

        return mapa;
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
