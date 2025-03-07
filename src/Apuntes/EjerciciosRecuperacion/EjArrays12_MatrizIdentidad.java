package Apuntes.EjerciciosRecuperacion;

public class EjArrays12_MatrizIdentidad {
    public static void main(String[] args) {
        boolean esIdentidad = true;

        int[][] matriz = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };
        int[][] matriz2 = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };

        for (int i = 0; i < matriz2.length; i++) {

            for (int j = 0; j < matriz2.length; j++) {
                if (i == j) {
                    if (matriz2[i][i] != 1) {
                        esIdentidad = !esIdentidad;
                    }
                } else {
                    if (matriz2[i][j] != 0) {
                        esIdentidad = !esIdentidad;
                    }
                }

            }
        }

        if (esIdentidad) {
            System.out.println("Sí es ");
        } else{
            System.out.println("No es");
        }
    }
}
