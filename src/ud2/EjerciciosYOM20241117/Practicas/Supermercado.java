package ud2.EjerciciosYOM20241117.Practicas;

import java.util.Scanner;

public class Supermercado {

    private static double pedirProductos() {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0, contadorProductos = 0;
        double precio = 0, precioTotal = 0;

        do {
            if (contadorProductos >= 1) {
                System.out.println("Precio?");
            } else {
                System.out.println(" Bienvenido .... Pasa el articulo ... precio?");

            }

            precio = sc.nextDouble();

            if (precio == 0) {
                break;
            }

            System.out.println("Cantidad?");
            cantidad = sc.nextInt();

            precioTotal = precioTotal + precio * cantidad;
            contadorProductos++;

            System.out.printf("El precio con todo es: %.2f", precioTotal);
            System.out.println();
            System.err.println("Si quieres terminar de añadir productos pulsa 0");

        } while (precio != 0);

        return precioTotal;
    }

    private static double devolverDinero(double dineroEntregado, double costeTotal) {
        double dineroDevuelto = 0;
        int contadorBillete50 = 0, contadorBillete20 = 0, contadorBillete10 = 0, contadorBillete5 = 0,
                contadorMoneda2 = 0, contadorMoneda1 = 0;

        if (costeTotal == 0) {
            System.out.println("Listo todo el dinero a devolver");
        } else if (costeTotal >= 50) {
            System.out.println("Se le devuelve uno de 50");
            devolverDinero(dineroEntregado, costeTotal - 50);

        } else if (costeTotal >= 20) {
            System.out.println("Se le devuelve uno de 20");
            devolverDinero(dineroEntregado, costeTotal - 20);

        } else if (costeTotal >= 10) {
            System.out.println("Se le devuelve uno de 10");
            devolverDinero(dineroEntregado, costeTotal - 10);

        } else if (costeTotal >= 5) {
            System.out.println("Se le devuelve uno de 5");
            devolverDinero(dineroEntregado, costeTotal - 5);

        }

        return dineroEntregado;

    }

    private static void pasarelaPago(double costeTotal) {
        Scanner sc = new Scanner(System.in);
        int formatoPago = 0;
        double dineroEntregado = 0;

       

        System.out.println("Como te gustaría pagar , efectivo (1) o tarjeta(2)?");
        formatoPago = sc.nextInt();

        switch (formatoPago) {
            case 1:
                System.out.println("¿Cuanto dinero entregas?");
                dineroEntregado = sc.nextInt();

                double dineroAPagar = dineroEntregado - costeTotal;

                devolverDinero(dineroEntregado, dineroAPagar);
                System.out.println("Gracias por su compra , tenga un buen día! ");

                break;

            case 2:
                System.out.println("Tarjeta");

            default:
                System.out.println("Error con el metodo de pago seleccionado");
        }
    }

    public static void main(String[] args) {

        double costeTotal = pedirProductos();

        pasarelaPago(costeTotal);

    }
}
