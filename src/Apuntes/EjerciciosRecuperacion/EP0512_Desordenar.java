package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[] t = {1,2,3,4,5,6,7,8,9,0};
        desordenar(t);
    }   

    static void desordenar(int t[]){

        System.out.println("Antes de desordenar: ");
        System.out.println(Arrays.toString(t));

        for (int i = 0; i < 99; i++) {
            int comodin = 0;
            int rdm = new Random().nextInt(t.length);
            int rdm2 = new Random().nextInt(t.length);

            comodin = t[rdm];
            t[rdm] = t[rdm2];
            t[rdm2] = comodin;
        
        }

        System.out.println("Después");
        System.out.println(Arrays.toString(t));
    }
}
