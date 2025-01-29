package ud4.StringsApuntes;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos frases separados por ENTER");
        String frase1 = sc.nextLine();
        String frase2 = sc.nextLine();

        if (frase1.length() == frase2.length()) {
            System.out.println("Las frases miden lo mismo");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La frase 1 es más larga que la 2");
        } else {
            System.out.println("La frase 2 es la mas larga");
        }
    }
}
