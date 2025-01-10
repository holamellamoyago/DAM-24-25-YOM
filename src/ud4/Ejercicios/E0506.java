package ud4.Ejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0506 {
    static int numAciertos(Integer[] apuesta, Integer[] ganadora) {
        int aciertos = 0;

        for (int i : apuesta) {
            if (Arrays.binarySearch(ganadora, i) >= 0) {
                aciertos++;

            }
        }

        return aciertos;
    }


    public static void main(String[] args) {
        Integer apuesta[] = {1,2,3,4,5,6};
        Integer ganadora[] = {1,2,3,9,9,9};
        Arrays.toString(ganadora);

        System.out.println("Combinación ganadora: " + Arrays.toString(ganadora));
        System.out.println("Tú combinación: " + Arrays.toString(apuesta));

        System.out.println("Tus aciertos: " + numAciertos(apuesta, ganadora));
    }
}
