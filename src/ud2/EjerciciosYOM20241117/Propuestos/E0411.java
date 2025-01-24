package ud2.EjerciciosYOM20241117.Propuestos;

import java.util.Scanner;


public class E0411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Comparar(a, b));
    }

    static int Comparar(int a, int b) {

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a >= b) {
            int c = a - b;

            while (c == 1) {
                int sobrante = ud2.EjerciciosYOM20241117.funciones.Util.esPar(c) ? c / 2 : c / 3;
                return sobrante;
            }

            return 99;
        } else{
            return 98;
        }

        // 1. Tengo que calculr si es multiplo de 2 o 3

    }
}