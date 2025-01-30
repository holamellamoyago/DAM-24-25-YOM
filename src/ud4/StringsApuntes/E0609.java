package ud4.StringsApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabras[] = new String[0];
        System.out.println("Introduce palabras");
        
        String palabra ="";

        int num [] = {1,2,3};

        

        do {
            palabra = sc.nextLine();

            palabras = Arrays.copyOf(palabras, palabras.length+1);
            palabras[palabras.length-1] = palabra;

        } while (palabra != "fin");

    }
}
