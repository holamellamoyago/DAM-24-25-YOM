package ud5.PreparacionExamen.Ejercicios;

public class RecorrerMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 12, 45, 78, 23, 12 },
                { 56, 89, 14, 67, 4 },
                { 90, 34, 21, 76, 4 },
                { 11, 55, 88, 42, 4 },
                { 63, 98, 30, 74, 4 },
                { 25, 61, 79, 53, 4 },
                { 25, 61, 79, 53, 4 }
        };

        int[][] matriz2 = {
                { 12, 45, 78, 23 },
                { 56, 89, 14, 67 },
                { 90, 34, 21, 76 },
                { 11, 55, 88, 42 },
                { 63, 98, 30, 74 },
                { 25, 61, 79, 53 }
        };

        recorrerEsquinaAbajoIzquierda(matriz);
        recorrerEsquinaAbajoIzquierda(matriz2);

    }

    static void recorrerEsquinaAbajoIzquierda(int[][] m) {
        int mitadFilas = m.length / 2;
        int mitadColumnas = m[0].length / 2;

        for (int i = m.length-1; i > mitadFilas; i-- ) {
            for (int j = 0; j < mitadColumnas; j++) {
                System.out.println(m[i][j]);
            }
        }

    }



}