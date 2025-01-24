package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre -99999 y 99999");
        int numero = Math.abs(sc.nextInt());
        sc.close();

        // 9 > 99 > 999 > 9999 > 99999
        if (numero > 9999) {
            System.out.println("Tiene 5 cifras");
        } else if (numero > 999) {
            System.out.println("Tiene 4 cifras");
        } else if (numero > 99) {
            System.out.println("Tiene 3 cifras");
        } else if (numero > 9) {
            System.out.println("tiene 2 cifras");
        } else {
            System.out.println("Tiene 1 cifra");
        }
    }
}
