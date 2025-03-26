// Esto será un camping que constará de 3 valores
// a serán arboles y habrá el doble de Tiendas de campaña 

package Apuntes.EjerciciosRecuperacion;

import java.util.Random;

import ud4.ArraysUtil;

public class Camping {

    public static void main(String[] args) {
        System.out.println("Bienvenido a camping ramallosa, parcelas disponibles: ");
        System.out.println("(-) parcela con sol, (*) parcela con sombra , (^) parcela ocupada");

        char[][] c = generarParcela();
        System.out.println(contarSombras(c));

    }

    static int contarSombras(char[][] c) {

        int contador = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] == '+') {
                    contador++;
                }
            }
        }

        return contador;
    }

    static char[][] generarParcela() {
        Random rdm = new Random();
        final int FILAS = 3;
        final int COLUMNAS = 3;
        char[][] parcelas = new char[FILAS][COLUMNAS];

        // Escondo los arboles
        parcelas[rdm.nextInt(COLUMNAS)][rdm.nextInt(COLUMNAS)] = '^';

        // Marcar sombra
        for (int i = 0; i < parcelas.length; i++) {
            for (int j = 0; j < parcelas[i].length; j++) {
                if (parcelas[i][j] == '^') {

                    if (i != 0 && j != 0) {
                        parcelas[i - 1][j - 1] = '+';
                    }

                    if (i != 0 && j != parcelas[0].length - 1) {
                        parcelas[i - 1][j + 1] = '+';
                    }

                    if (i != 0) {
                        parcelas[i - 1][j] = '+';
                    }

                    if (i != parcelas.length - 1) {
                        parcelas[i + 1][j] = '+';
                    }

                    if (j != 0) {
                        parcelas[i][j - 1] = '+';
                    }

                    if (i != parcelas.length - 1 && j != 0) {
                        parcelas[i + 1][j - 1] = '+';
                    }

                    if (i != parcelas.length - 1 && j != parcelas[0].length - 1) {
                        parcelas[i + 1][j + 1] = '+';
                    }

                    if (j != parcelas[0].length - 1) {
                        parcelas[i][j + 1] = '+';
                    }

                }
            }
        }

        mostrarMatriz(parcelas);

        // ArraysUtil.mostrarMatriz(parcelas);

        return parcelas;

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