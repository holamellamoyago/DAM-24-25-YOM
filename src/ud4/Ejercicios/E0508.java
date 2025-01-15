package ud4.Ejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0508 {
    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);
        Integer pares[] = new Integer[0];
        int contadorPares  = 0;
        int contadorImPares  = 0;
        Integer impares[] = new Integer[0];


        for(int i = 0 ; i<t.length; i++){
            if (t[i] % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length+1);
                pares[pares.length-1] = i;
            } else{
                impares = Arrays.copyOf(impares, impares.length+1);
                impares[impares.length-1] = i;
            }
            
        }
        Arrays.sort(pares);
        Arrays.sort(impares);
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
