package ud4.StringsApuntes;

import java.util.Arrays;
import java.util.Scanner;

import ud4.ArraysUtil;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabras[] = new String[0];
        System.out.println("Introduce palabras");

        String palabra = sc.nextLine();
        String palabrasUnidas = "";

        while (!palabra.equals("fin")) {

            palabra = ArraysUtil.quitarEspacios(palabra);
            

            palabrasUnidas += palabra + " ";

            palabra = sc.nextLine();

        }

        System.out.println(palabrasUnidas);

    }
}
