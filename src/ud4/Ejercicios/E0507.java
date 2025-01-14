package ud4.Ejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0507 {
    static Integer[] sinRepetidos(Integer t[]) {
        Integer p[] = new Integer[0];
        int contadorp = 0;

        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    
        
        
        
        for (int i = 0; i < t.length; i++) {
            int posicion = Arrays.binarySearch(p, t[i]);
            if (posicion < 0 ) {
                p =  Arrays.copyOf(p, p.length+1);
                p[contadorp] = t[i];
                Arrays.toString(p);
                contadorp++;
            }

        }

        return p;
    }

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 6);

         t = sinRepetidos(t);

        System.out.println(Arrays.toString(t));
    }
}
