package ud4.StringsApuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0610 {
    public static void main(String[] args) {
        esPalindromo("abba");
    }

    public static Boolean esPalindromo(String str) {
        str = ArraysUtil.quitarEspacios(str);
        int contadorFinal = str.length() - 1;

        char c[] = str.toCharArray();
        char c2[] = new char[c.length];

        for (int i = 0; i < str.length(); i++) {

            c2[i] = c[contadorFinal];

            contadorFinal--;

        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(c2));

        if (Arrays.equals(c, c2)) {
            System.out.println("Son palindromas");
        } else{
            System.out.println("No son palindromas");
        }

        return false;
    }
}
