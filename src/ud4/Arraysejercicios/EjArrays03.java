package ud4.Arraysejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjArrays03 {
        public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);
        int contadorSuma = 0;
        System.out.println(Arrays.toString(t));



        for (int i = 0; i < t.length; i++) {
            contadorSuma += t[i];
        }

        int media = contadorSuma / t.length;

        for (int i = 0; i < t.length; i++) {
            if (t[i] > media) {
                System.out.println("La nota " + t[i] + " supera la media: " + media);
            }
        }

        System.out.println("La media es: " + contadorSuma / t.length);


    }
}
