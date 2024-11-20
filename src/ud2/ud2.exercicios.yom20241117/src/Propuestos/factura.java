package Propuestos;
import java.util.Scanner;

public class factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();

        System.out.println("Introduce el numero de unidades");
        int unidades = sc.nextInt();
        sc.close();

        double precioTotal = (unidades * precio * 21 /100) + unidades * precio;

        double precioConDescuento =  precioTotal - (precioTotal * 5 / 100);

        final String DESCUENTO = "El precio del articulo es: " + precioConDescuento + " Con un descuento del 5%";
        final String NORMAL = "El precio del articulo es: " + precioConDescuento;

        if (precioTotal >= 100) {
            System.out.println(DESCUENTO);
        } else{
            System.out.println(NORMAL);
        }

    }
}
