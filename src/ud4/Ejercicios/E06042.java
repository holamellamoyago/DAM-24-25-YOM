package ud4.Ejercicios;

import java.util.Scanner;

public class E06042 {
    public static void main(String[] args) {
        int contadorEspacios = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isSpaceChar(frase.charAt(i))) {
                contadorEspacios++;
            }
        }

        System.out.println("Hay " + contadorEspacios + " espacios");
    }
}
