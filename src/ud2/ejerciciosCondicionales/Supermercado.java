// 1. Para calcular el importe total que debe pagar cada cliente el programa solicitará
// introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y
// la cantidad de unidades del mismo, expresado como un número entero.
// 2. El programa deberá controlar los posibles errores o excepciones en la entrada de
// datos por teclado, informando al usuario y permitiendo repetir la entrada.
// 3. La condición para finalizar la introducción de productos queda a criterio del
// programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.
// 4. Una vez terminado de introducir los productos, el programa mostrará el importe total
// de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con
// tarjeta” o “en efectivo”.
// 5. Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de
// ese cliente.
// 6. Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe
// pagado por el cliente y se calculará el cambio a devover, desglosando dicha
// cantidad en billetes y monedas de € y de 1 céntimos de euro.
// 7. Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir
// el proceso para un nuevo cliente.

package ud2.ejerciciosCondicionales;

import java.util.Scanner;

public class Supermercado {

    public static double pedirProductos(int n){
        Scanner sc = new Scanner(System.in);
        double cantidad, precio = 1;
        


        do {
            System.out.println("Introduce el precio del producto: ");
            precio = sc.nextDouble();
    
            // if (precio == 0) {
            //     return;
            // }
    
            System.out.println("Cuantas unidades de ese producto fueron?");
            cantidad = sc.nextInt();
    
            System.out.println("Siguiente producto , para ir al pago introduce 0.");
    
            double precioTotal = n + precio * cantidad;
    
            // contarProductos(precioTotal); 
            return 0;
        } while (precio == 0);

    }

    // public static double contarProductos(double n) {
    //     Scanner sc = new Scanner(System.in);
    //     double cantidad, precio = 1;

    //     System.out.println("Total: " );


    // }

    public static void main(String[] args) {
        
        pedirProductos(0);

        // double precioSumado = contarProductos(0);
        // System.out.println(precioSumado);
        // precioSumado = contarProductos(precioSumado);
        // System.out.println(precioSumado);

        // System.out.println("Como te gustaría pagar, efectivo (1) o tarjeta?");

    }
}






// public class Supermercado {

//     public static double pedirProductos(int n){
        

//     }

//     public static double contarProductos(double n) {
//         Scanner sc = new Scanner(System.in);
//         double cantidad, precio = 1;

//         do {
//             System.out.println("Introduce el precio del producto: ");
//             precio = sc.nextDouble();

//             // if (precio == 0) {
//             //     return;
//             // }

//             System.out.println("Cuantas unidades de ese producto fueron?");
//             cantidad = sc.nextInt();

//             System.out.println("Siguiente producto , para ir al pago introduce 0.");

//             double precioTotal = n + precio * cantidad;
//             System.out.println("Total: " + precioTotal);
            

//             return contarProductos(precioTotal);

//             // System.out.printf("Total hasta ahora: %2f", precioTotal);

//         } while (precio != 0);

//     }

//     public static void main(String[] args) {
        
//         contarProductos(0);

//         // double precioSumado = contarProductos(0);
//         // System.out.println(precioSumado);
//         // precioSumado = contarProductos(precioSumado);
//         // System.out.println(precioSumado);

//         // System.out.println("Como te gustaría pagar, efectivo (1) o tarjeta?");

//     }
// }
