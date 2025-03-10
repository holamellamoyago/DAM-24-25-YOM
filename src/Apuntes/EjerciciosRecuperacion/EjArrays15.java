package Apuntes.EjerciciosRecuperacion;

public class EjArrays15 {
    public static void main(String[] args) {
        int[][] matriz2 = {
                { 1, 0 },
                { 0, 1 },
                { 0, 0 }
        };

        int[][] matriz = {
                { 1, 1 },
                { 0, 1 },
                { 0, 1, 1 }
        };

        System.out.println(sumarMatrices(matriz2, matriz));



    }

    static int sumarMatrices(int[][]m, int[][]m2){
        int sumaTotal = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumaTotal += m[i][j];
            }
        }

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                sumaTotal += m2[i][j];
            }
        }

        return sumaTotal;
    }
}
