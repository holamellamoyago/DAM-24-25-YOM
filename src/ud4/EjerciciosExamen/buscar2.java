package ud4.EjerciciosExamen;

import java.util.Arrays;

import ud4.ArraysUtil;

public class buscar2 {
    public static void main(String[] args) {

        int[][] m = ArraysUtil.generarMatrizAleatorio_09(4, 4);

        ArraysUtil.mostrarMatriz(m);

        System.out.println(Arrays.toString(buscarFilaMayorSuma(m)));

    }

    static int[] buscarFilaMayorSuma(int[][] m) {
        int sumaMaxima = 0;
        int filaMaxima = 0;

        if (m == null) {
            return null;
        }

        if (m.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {

            }

            if (i == 0 || suma > sumaMaxima) {
                sumaMaxima = suma;
                filaMaxima = i;
            } else {
                sumaMaxima = suma;
                filaMaxima = i;
            }
        }

        return m[filaMaxima];
    }
}
