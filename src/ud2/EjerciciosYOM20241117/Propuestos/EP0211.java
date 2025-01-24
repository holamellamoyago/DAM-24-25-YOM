package Propuestos;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9999");
        String numero = sc.nextLine() + "0000";

        char n1 = numero.charAt(0);
        char n2 = numero.charAt(1);
        char n3 = numero.charAt(2);
        char n4 = numero.charAt(3);

        switch (numero.length()) {
            case 5:
                System.out.println("No es capicua");
                break;
            case 6:
                if (n1 == n2) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No lo es");
                }
                break;
            case 7:
                if (n1 == n3) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No lo es");
                }
                break;
            case 8:
                if (n1 == n4 && n2 == n3) {
                    System.out.println("El númro es capicua");
                } else {
                    System.out.println("No lo es");
                }
                break;

            default:
                break;
        }
        sc.close();
    }
}
