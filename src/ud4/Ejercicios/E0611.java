package ud4.Ejercicios;

import java.util.Scanner;

public class E0611 {
    public static void main(String[] args) {
        char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para codificar: ");
        String frase = sc.nextLine();

        String frasecodificada2 = codifica(conjunto1, conjunto2, frase);
        System.out.println(frasecodificada2);

    }


    static public String codifica(char[] conjunto1, char[] conjunto2, String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 0; i < conjunto1.length; i++) {
            palabra = palabra.replace(conjunto1[i], conjunto2[i]);
        }
        return palabra;
    }


}
