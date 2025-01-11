package ud4.Arraysejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjArrays05 {
        public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, -5, 5);
        System.out.println(Arrays.toString(t));

        int contadorPositivos = 0;
        int contador0 = 0;
        int contadorNegativos = 0;



        for (int i = 0; i < t.length; i++) {
            
            if (t[i] == 0) {
                contador0++;
            } else if(t[i] < 0){
                contadorNegativos++;
            } else if(t[i] > 0){
                contadorPositivos++;
            }
        }

        System.out.println("Contador negativos: " + contadorNegativos);
        System.out.println("Contador 0s: " + contador0);
        System.out.println("Contador positivos: " + contadorPositivos);



    }
}
