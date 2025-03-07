package Apuntes.EjerciciosRecuperacion;

public class EjArrays14 {
    public static void main(String[] args) {
        int[][] matriz2 = {
                { 1, 0 },
                { 0, 1 },
                { 0, 0 }
        };

        System.out.println(esTranspuesta(matriz2));


    }

    static boolean esTranspuesta(int[][] m){

        boolean esTraspuesta = true;
        int comodin = m[0][0];

        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[i].length; j++) {
        //         if (m[i][j] != m[j][i]) {
        //             esTraspuesta = !esTraspuesta;
        //         }
        //     }
        // }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][j] != comodin) {
                    esTraspuesta = !esTraspuesta;
                }
            }
        }

        return esTraspuesta;
    }
}
