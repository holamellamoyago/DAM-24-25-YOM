package ud4.Arraysejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjArrays06 {
    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, -10, 10);

        int sumadorPositivos = 0;
        int contadorPositivos = 0;
        int sumadorNegativos = 0;
        int contadorNegativos = 0;

        System.out.println(Arrays.toString(t));

        for(int i = 0; i<t.length; i++){
            if (t[i] >= 0) {
                sumadorPositivos+=t[i];
                contadorPositivos++;
            } else{
                sumadorNegativos+=t[i];
                contadorNegativos++;
            }
        }

        System.out.println("La media de los negativos es: " + sumadorNegativos / contadorNegativos);
        System.out.println("La media de los posi es: " + sumadorPositivos / contadorPositivos);
    }
}
