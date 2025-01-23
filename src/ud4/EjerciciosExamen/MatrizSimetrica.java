package ud4.EjerciciosExamen;

import java.util.Arrays;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int m[][] = {
                { 2, 6, 7, 4 },
                { 6, 9, 2, 6 },
                { 7, 7, 9, 7 },
                { 4, 6, 7, 7 },
        };
        int superiorDerecha[] = new int[0];

        for (int i = 0; i < m.length; i++) {
            if (i == 0) {

                for (int j = 0; j < m[i].length; j++) {
                    superiorDerecha = Arrays.copyOf(superiorDerecha, superiorDerecha.length + 1);
                    superiorDerecha[superiorDerecha.length - 1] = m[i][j];
                }
            } else {
                for (int t = 0; t < 1; t++) {
                    superiorDerecha = Arrays.copyOf(superiorDerecha, superiorDerecha.length + 1);
                    superiorDerecha[superiorDerecha.length - 1] = m[i][m[i].length - 1];
                }
            }

        }

        int inferiorIzquierda [] = new int[0];

        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<1; j++){
                inferiorIzquierda = Arrays.copyOf(inferiorIzquierda, inferiorIzquierda.length+1);
                inferiorIzquierda[inferiorIzquierda.length-1] = m[i][j];
            }

            if (i == m.length-1) {
                for(int l = 1; l< m[i].length; l++){
                    inferiorIzquierda = Arrays.copyOf(inferiorIzquierda, inferiorIzquierda.length+1);
                    inferiorIzquierda[inferiorIzquierda.length-1] = m[i][l];
                }
            }

        }


        if (Arrays.equals(inferiorIzquierda, superiorDerecha)) {
            System.out.println("La matriz es símetrica");
        } else{
            System.out.println("No es simetrica");
        }

        System.out.println(Arrays.toString(superiorDerecha));
        System.out.println(Arrays.toString(inferiorIzquierda));
    }
}
