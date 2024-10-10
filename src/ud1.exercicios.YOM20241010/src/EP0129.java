
/**
 * EP0129
 */

import java.util.Scanner;

public class EP0129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        sc.close();

        int resto = numero % 7;

        int valorAñadir = resto == 0 ?  0 :  7- resto ;

        if (valorAñadir == 0) {
            System.out.println("Ya es multiplo");
        } else {
            System.out.println("Deberas sumarle una cantidad de: " + valorAñadir + " para que sea multiplo de 7");
        }


    }
}