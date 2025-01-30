package ud4.Ejercicios;

import java.util.Scanner;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabras separadas por ENTER para componer una frase, fin para terminar: ");

        String frase= "";
        String palabra = sc.nextLine();

        while (!palabra.toUpperCase().equals("FIN")) {
            frase += palabra + " ";

            palabra = sc.nextLine();
        }

        frase = frase.stripTrailing();

        System.out.println(frase);


    }
}
