package ud4.Ejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0507 {
    static Integer[] sinRepetidos(Integer t[]) {
        Integer p[] = new Integer[0];
        
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        System.out.println(Arrays.binarySearch(t, 3));

        for (int i = 0; i < t.length; i++) {
            if (Arrays.binarySearch(t, 3)) {
                
            }
        }

        return p;
    }

    public static void main(String[] args) {
        sinRepetidos(ArraysUtil.arrayAleatorio(10, 1, 6));

    }
}
