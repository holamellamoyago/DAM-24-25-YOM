package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Añade un numero, " + i + 1 + "/10");

            n[i] = sc.nextInt();
        }

        int sumaTotal = 0;

        for (int i = 0; i < n.length; i++) {
            sumaTotal += n[i];
        }

        System.out.println("La media es: " + sumaTotal / n.length);
    }
}
