package ud4.EjerciciosExamen;

import java.util.Arrays;

import ud4.ArraysUtil;

public class SumaMatrices {
    public static void main(String[] args) {
        int m[][] = ArraysUtil.generarMatrizAleatorio_09(2, 2);

        // System.out.println(ArraysUtil.mostrarMatriz(m));

        System.out.println("Suma: ");
        ArraysUtil.mostrarMatriz(m);

        for(int i = m.length; i> m.length; i++){
            for(int j = 0; j< m[i].length; j++){

                int sumando2;

                int sumando1 = m[i][j];
                

                if (i+1 >= m.length) {
                    sumando2 = m[i][j];
                } else{
                    sumando2 = m[i+1][j];
                }

                


                System.out.println(sumando1 + sumando2);
            }
        }
        
        
    }
}
