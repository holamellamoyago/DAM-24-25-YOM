package yomexamen;
import java.util.Scanner;

/**
 * 
 *  Yago Otero Martinez
 * 
 * compraConjunta - 
 * 
 * Tres amig@s deciden juntar el dinero en efectivo que llevan encima para
 * comprar un
 * artículo para compartir (por ejemplo, una pelota, un libro, un disco, etc.).
 * Haz un programa
 * que permita introducir el precio del artículo (en euros) y el dinero que
 * aporta cada amig@ y
 * que informe si el dinero aportado es suficiente o no para adquirir el
 * artítulo.
 * Si el dinero no es suficiente el programa informará de cuánto falta, y si
 * sobra, se indicará el
 * importe del dinero sobrante que guardará como bote para futuras compras
 * conjuntas.
 * 
 */
public class compraConjunta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dineroAmigo1 , dineroAmigo2, dineroAmigo3;

        System.out.println("¿Cuanto cuesta el articulo a comprar?");
        double precioArticulo = sc.nextDouble();

        System.out.println("Cuanto aporta el primer amigo?");
        dineroAmigo1 = sc.nextDouble();

        System.out.println("Cuanto aporta el segundo amigo?");
        dineroAmigo2 = sc.nextDouble();

        System.out.println("Cuanto aporta el tercer amigo?");
        dineroAmigo3 = sc.nextDouble();

        sc.close();

        double dineroTotal = dineroAmigo1 + dineroAmigo2 + dineroAmigo3;
        double dineroSobranteFaltante = dineroTotal % precioArticulo;

        // Aquí lo que hice fue declarar 3 strings para simplificar el resultado de abajo , para no hacer una cadena de condicionales muy extensa . 

        String siComprar = "Se puede comprar pero sobran " + dineroSobranteFaltante;
        String igualComprar = "Se puede comprar pero sobran ";
        String noComprar = "No se puede comprar por qué faltan " + (precioArticulo - dineroSobranteFaltante) + "euros";


        String resultado = dineroTotal > precioArticulo ? siComprar : dineroTotal == precioArticulo ? igualComprar : noComprar;

        System.out.println(resultado);






    }
}