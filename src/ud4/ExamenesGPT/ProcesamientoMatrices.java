package ud4.ExamenesGPT;

import ud4.ArraysUtil;

// La empresa tiene una matriz de 5x5 que representa las rutas entre distintos almacenes. Cada celda contiene un número entero que indica la distancia en kilómetros entre dos almacenes. Se requiere:

// Generar una matriz aleatoria con valores entre 10 y 500 km.

// Encontrar la ruta más corta entre dos almacenes cualesquiera.

// Determinar si la matriz es simétrica (es decir, si la distancia de A a B es igual a la de B a A).

public class ProcesamientoMatrices {
    public static void main(String[] args) {
        Integer[][] m = {
                ArraysUtil.arrayAleatorio(5, 10, 500),
                ArraysUtil.arrayAleatorio(5, 10, 500),
                ArraysUtil.arrayAleatorio(5, 10, 500),
                ArraysUtil.arrayAleatorio(5, 10, 500),

        };

        mostrarMatriz(m);

        buscarrutaCorta(m);

    }

    static void buscarrutaCorta(Integer[][] m) {

        int filaCorta = 0;
        int columnaCorta = 0;
        int distanciaMasCorta = 999999;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {

                if (m[i][j] > m[i][j + 1]) {

                    if (m[i][j] - m[i][j + 1] < distanciaMasCorta) {
                        filaCorta = i;
                        columnaCorta = j;

                        distanciaMasCorta = m[i][j] - m[i][j + 1];

                    }
                }

            }

        }

        System.out.println("La distancia ams corta entre almacenes está en la fila: " + filaCorta + " y en la columna: "
                + columnaCorta + " con una distancia de " + distanciaMasCorta);
    }

    public static void mostrarMatriz(Integer[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.err.println();
        }
    }

}
