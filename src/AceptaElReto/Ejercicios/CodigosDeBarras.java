package AceptaElReto.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class CodigosDeBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un codigo de barras");
        String codigo = sc.nextLine();

        char[] numeros = codigo.toCharArray();

        

        System.out.println(Arrays.toString(numeros));
    }
}
