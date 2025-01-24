package ud1.YOM20241015;

/**
 * multiplo7
 */

 import java.util.Scanner;

public class multiplo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = sc.nextInt();

        sc.close();

        System.out.println("Multiplo de 7? " + (numero % 7 == 0));

        System.out.println("Para que sea multiplo de 7 tienes que sumarle: " + (7 - numero % 7));

        String salida = numero % 7 == 0 ? "No hay que sumarle nada" : "para que sea un multiplo hay que sumarle: " + (7- numero % 7);

        System.out.println(salida);
    }
}