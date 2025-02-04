package ud4.Ejercicios;

import ud4.ArraysUtil;

public class E0518 {
    public static void main(String[] args) {
        int m[][] = ArraysUtil.generarMatrizAleatorio_09(3, 3);

        int m2[][] = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 },

        };

        ArraysUtil.mostrarMatriz(m2);
        comprobarEsMagica(m2);

        System.out.println("__________________________________________");

        ArraysUtil.mostrarMatriz(m);
        comprobarEsMagica(m);
        

    }

    static boolean comprobarEsMagica(int[][] m) {
        int sumaAnterior = 0;
        int sumaTotal = 0;
        boolean esMagica = true;

        // Filas

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumaTotal += m[i][j];

                if (i == 0) {
                    sumaAnterior = sumaTotal;
                }
            }

            if (sumaAnterior != sumaTotal) {
                esMagica = false;
            } else {
                sumaTotal = 0;
            }
        }

        // Ahora compruebo por columnas

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                sumaTotal += m[j][i];

                if (i == 0) {
                    sumaAnterior = sumaTotal;
                }
            }

            if (sumaAnterior != sumaTotal) {
                esMagica = false;
            } else {
                sumaTotal = 0;
            }
        }

        if (esMagica) {
            System.out.println("Las matriz es mágica");
        } else {
            System.out.println("No son las mismas");
        }

        return esMagica;
    }
}
