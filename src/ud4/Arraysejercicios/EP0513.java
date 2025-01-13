package ud4.Arraysejercicios;

import java.util.Arrays;
import java.util.Random;

import ud4.ArraysUtil;

public class EP0513{

    static void desordenar(Integer t[]) {

        // Aquí creo la nueva tabla
         Integer f[] = Arrays.copyOf(t, t.length);


        for(int i = 0; i<f.length; i++){
            int comodin = 0;
            int aleatorio = new Random().nextInt(0,f.length);
            int aleatorio2 = new Random().nextInt(0,f.length);

            comodin = f[aleatorio];
            f[aleatorio] = f[aleatorio2];

            f[aleatorio2] = comodin;

            
            
        }
        System.out.println(Arrays.toString(f));

    }

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        desordenar(t);
    }
}
