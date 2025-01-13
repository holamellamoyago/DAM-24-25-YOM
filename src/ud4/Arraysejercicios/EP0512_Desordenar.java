package ud4.Arraysejercicios;

import java.util.Arrays;
import java.util.Random;

import ud4.ArraysUtil;

public class EP0512_Desordenar {

    static void desordenar(Integer t[]) {
        for(int i = 0; i<t.length; i++){
            int comodin = 0;
            int aleatorio = new Random().nextInt(0,t.length);
            int aleatorio2 = new Random().nextInt(0,t.length);

            comodin = t[aleatorio];
            t[aleatorio] = t[aleatorio2];

            t[aleatorio2] = comodin;

            
            
        }
        System.out.println(Arrays.toString(t));

    }

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        desordenar(t);
    }
}
