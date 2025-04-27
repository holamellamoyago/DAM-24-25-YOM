package AceptaElReto;

import ud4.ArraysUtil;

public class GotasAgua {
    public static void main(String[] args) {
        int[] n = new int[] { 2, 7, 3, 5, 1, 0, 5 };
        final int ALTURAMAX = calcularAlturaMax(n);

        Character[][] mapa = new Character[ALTURAMAX][n.length];

        int contador = 0;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                mapa[i][j] = ' ';
            }
        }

        for (int j = 0; j < mapa[0].length; j++) {
            for (int i = ALTURAMAX - n[j]; i < mapa.length; i++) {
                mapa[i][j] = 'X';
            }
        }

        ArraysUtil.mostrarMatriz(mapa);

        for (int j = 0; j < mapa[0].length; j++) {
            for (int i = 0; i < mapa.length; i++) {
                if (j != n.length - 1 && j != 0) {
                    int alturaActual = n[j];
                    int alturaSiguiente = n[j + 1];
                    int alturaAnterior = n[j - 1];
                    int alturaParaRellenar = 0;

                    if (alturaActual < alturaAnterior && alturaActual < alturaSiguiente) {
                        if (alturaSiguiente > alturaAnterior) {
                            alturaParaRellenar = alturaAnterior;
                        } else {
                            alturaParaRellenar = alturaSiguiente;
                        }
                    }


                    for (int j2 = 0; j2 < mapa[0].length; j2++) {
                        for (int i2 = ALTURAMAX - alturaParaRellenar ; i2 < i2-ALTURAMAX; i2++) {
                            mapa[i2][j2] = '0';
                        }
                    }



                }
            }
        }

        System.out.println("");
        ArraysUtil.mostrarMatriz(mapa);
    }

    static int calcularAlturaMax(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;
    }
}
