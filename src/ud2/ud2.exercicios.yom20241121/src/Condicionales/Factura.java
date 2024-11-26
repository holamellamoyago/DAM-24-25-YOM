package Condicionales;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int IMPUESTO = 21;
        final int DESCUENTO = 5;

        System.out.println("Introduce el precio del articulo");
        double precio = sc.nextDouble();

        System.out.println("Que cantidad?");
        int cantidad = sc.nextInt();
        sc.close();

        int total = ((int) precio * cantidad) * IMPUESTO / 100 + (int) precio * cantidad;

        if (total > 100) {
            int tDescuento = total - total * DESCUENTO / 100;
            System.out.println("El precio incluye una rebaja del 5: " + tDescuento);
        } else {
            System.out.println(total);

        }

    }
}
