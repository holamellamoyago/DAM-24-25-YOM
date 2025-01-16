package ud4.Arraysejercicios;

import java.util.Random;

import ud4.ArraysUtil;

public class EjArrays10 {
    public static void main(String[] args) {
        int t1[][] = new int[3][3];
        int sumaTotal = 0;

        for(int i= 0; i< t1.length; i++){
            for(int j = 0; j< t1[i].length; j++){
                int rnd = new Random().nextInt(0,11);
                t1[i][j] = rnd;
                sumaTotal+=rnd;
            }
        }
        ArraysUtil.mostrarMatriz(t1);
        System.out.println("Suma total : " + sumaTotal);
    }
}
