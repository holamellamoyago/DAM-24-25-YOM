package ud4.yomexamenrec;

// Yago Otero Martínez

import java.util.Arrays;

public class Suma {
    public static void main(String[] args) {
        int[] numeros = { 22, 72, 44, 92, 34, 66, 1 };
        int[] numeros2 = { 1, 2 };

        System.out.println(Arrays.toString(sumas(numeros)));
        // System.out.println(sumarValoresImpares(numeros2));

    }

    static int[] sumas(int t[]) {
        if (t == null) {
            return null;
        }

        int[] array3Valores = new int[3];
        array3Valores[0] = sumarValoresArray(t);
        array3Valores[1] = sumarValoresArrayPares(t);
        array3Valores[2] = sumarValoresImpares(t);


        return array3Valores;
    }

    static int sumarValoresArray(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }

        return total;
    }

    static int sumarValoresArrayPares(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                total += numeros[i];

            }
        }

        return total;
    }

    static int sumarValoresImpares(int[] numeros){
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 != 0) {
                total += numeros[i];
            }
        }

        return total;
    }



}
