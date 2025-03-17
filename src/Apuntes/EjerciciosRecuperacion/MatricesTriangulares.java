package Apuntes.EjerciciosRecuperacion;

public class MatricesTriangulares {
    public static void main(String[] args) {
        int[][] m = {
            {1, 0, 0, 0},
            {2, 3, 0, 0},
            {4, 5, 6, 0},
            {7, 8, 9, 10}
        };

        int[][] m2 = {
            {1, 2, 3, 4},
            {0, 5, 6, 7},
            {0, 0, 8, 9},
            {0, 0, 0, 10}
        };

        int[][] m3 = {
            {1, 0, 0, 0},
            {0, 5, 0, 0},
            {0, 0, 8, 0},
            {0, 0, 0, 10}
        };

        int[][] m4 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        if (esTriangularSuperior(m)) {
            System.out.println("Es triangular superior");
        } else{
            System.out.println("No lo es");
        }
        if (esTriangularInferior(m2)) {
            System.out.println("Es triangular inferior");
        } else{
            System.out.println("No lo es");
        }
        if (esTriangularDoble(m3)) {
            System.out.println("Es triangular doble");
        } else{
            System.out.println("No lo es");
        }

        if (esTriangularDoble(m)) {
            System.out.println("Es triangular superior");
        } else{
            System.out.println("No lo es");
        }

        
    }

    public static Boolean esTriangularSuperior(int[][] t){
        boolean esSuperior = true;

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = i+1; j < t[i].length; j++) {
                if (t[i][j] != 0 ) {
                    esSuperior = false;
                }
            }
        }

        return esSuperior;



    }
    public static Boolean esTriangularInferior(int[][] t){
        boolean esInferior = true;

        if (t.length != t[0].length) {
            return false;
        }


        for (int i = 0; i < t.length; i++) {
            if (i!=0) {
                for (int j = 0; j < i ; j++) {
                    
                    if (t[i][j] != 0) {
                        esInferior = false;
                    }
                }
            }
        }

        return esInferior;


    }

    public static Boolean esTriangularDoble(int[][] t){
        boolean esDoble = true;

        if (t.length != t[0].length) {
            return false;
        }


        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (j != i) {
                    if (t[i][j] != 0) {
                        esDoble = false;
                    }
                }
            }
        }

        return esDoble;


    }
}


