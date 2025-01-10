package ud4.Ejercicios;
import java.util.Arrays;
import java.util.Random;

import ud4.ArraysUtil;

public class EP0512_Desordenar {

    static void desordenar(Integer t[]){

        Arrays.sort(t);
        System.out.println("Lista original: " + Arrays.toString(t));

        


        for(int i = 0; i<t.length; i++){
            Random rnd = new Random();
            int posicionAleatoria = rnd.nextInt(0 , t.length);

                int comodin = t[i];
                t[i] = t[posicionAleatoria];
                t[posicionAleatoria] = comodin;
            


        }

        System.out.println("Lista final: " + Arrays.toString(t));
    }


    public static void main(String[] args) {
        Integer t [] = ArraysUtil.arrayAleatorio(6, 1, 7);

        desordenar(t);
    }
}
