package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class E0505 {
    static int[] rellenaPares(int longitud, int fin) {
        int l[] = new int[longitud];

        Random rdm = new Random();

        for (int i = 0; i < longitud; i++) {
            int numRandom = rdm.nextInt(2,20+1);

            while (numRandom % 2 != 0) {
                numRandom = rdm.nextInt(2,20+1);
            }

            l[i] = numRandom;

        }

        Arrays.sort(l);

        return l;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rellenaPares(20, 999)));
    }
}
