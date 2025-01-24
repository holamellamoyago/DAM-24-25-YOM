package ud2.EjerciciosYOM20241117.Condicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        System.out.println("Dime el año: ");
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt();
        sc.close();

        if (anho % 4 == 0) {
            if (anho % 100 == 0) {
                if (anho % 400 == 0) {
                    System.out.println("Es un año bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");

                }
            } else {
                System.out.println("Es un año bisiesto");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
