package Apuntes.EjerciciosRecuperacion;

public class cuadradoDiabolico {
    public static void main(String[] args) {
        int[][] cuadradoMagicoEsoterico = {
            {16, 2, 3, 13},
            {5, 11, 10, 8},
            {9, 7, 6, 12},
            {4, 14, 15, 1}
        };

        if (esDiabolico(cuadradoMagicoEsoterico)) {
            System.out.println(calcularConstanteMagica2(cuadradoMagicoEsoterico));
            System.out.println(calcularconstanteMagica(cuadradoMagicoEsoterico));
        } else{
            System.out.println("NO");
        }
    }



    static int calcularConstanteMagica2(int[][]m){
        return (4 * calcularconstanteMagica(m)) / m.length;
    }

    static int calcularconstanteMagica(int[][] m){
        int cm = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < m[i].length; j++) {
                cm += m[i][j];
            }
        }

        return cm;
    }







    static boolean esDiabolico(int[][] m) {
        boolean esDiabolico = true;

        int comodin = 0;

        // Comprobacion de filas

        for (int i = 0; i < m.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m[i].length; j++) {
                sumaFila += m[i][j];
            }

            if (comodin != 0) {
                if (sumaFila != comodin) {
                    esDiabolico = false;
                }
            }

            comodin = sumaFila;
        }
        

        // Comprobacion de columnas
        for (int j = 0; j < m[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < m.length; i++) {
                sumaColumna += m[i][j];
            }

            if (sumaColumna != comodin) {
                esDiabolico = false;
            }
        }

        // Comprobacion diagonal
        int sumaDiagonal = 0;
        for (int i = 0; i < m.length; i++) {

            sumaDiagonal += m[i][i];

        }

        if (sumaDiagonal != comodin) {
            esDiabolico = false;
        }

        return esDiabolico;
    }
}
