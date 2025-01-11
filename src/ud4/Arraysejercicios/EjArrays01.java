package ud4.Arraysejercicios;
import java.util.Arrays;

import ud4.ArraysUtil;

// Calcular la media de una serie de números que se leen por teclado.

public class EjArrays01 {

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(3, 1, 8);
        int contador = 0;
        System.out.println(Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {
            contador += t[i];
        }

        System.out.println("La media es: " + contador / t.length);


    }
}