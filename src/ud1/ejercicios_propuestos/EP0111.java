package ud1.ejercicios_propuestos;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad");
        final double baseImponible = sc.nextDouble();
        System.out.println("¿Que IVA se le aplica?");
        final double iva = sc.nextDouble();

        final double operacion = (baseImponible * iva / 100) + baseImponible;

        System.out.println("El resultado es: " + operacion);

        sc.close();


    }
}
