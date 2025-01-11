package ud4.Arraysejercicios;
import java.util.Arrays;

import ud4.ArraysUtil;

// Leer 10 números enteros por teclado y guardarlos en un array. Calcula y muestra la media de los números que estén en las posiciones pares del array.


public class EjArrays02 {

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 8);
        int contadorSuma = 0;
        int contadorPares = 0;
        System.out.println(Arrays.toString(t));



        for (int i = 0; i < t.length; i++) {

            if (i%2 == 0) {
                contadorSuma += t[i];
                contadorPares++;
            
            }
        }

        System.out.println("La media es: " + contadorSuma / contadorPares);


    }
}