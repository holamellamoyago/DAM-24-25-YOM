package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class E0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta número: ");
        double n1 = sc.nextDouble();
        sc.close();

        if (n1 == 0) {
            System.out.println("Numero no es , por qué es 0");
        } else if ((n1 < 1 && n1 > -1)) {
            System.out.println("Numero casi-cero");
        } else {
            System.out.println("No considerado");
        }

    }
}
