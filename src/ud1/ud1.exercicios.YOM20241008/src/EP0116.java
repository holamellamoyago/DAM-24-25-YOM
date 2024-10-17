
/**
 * EP0116
 */
import java.util.Scanner;
import java.util.Locale;

public class EP0116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double medida1, medida2, medida3, metrosAmilimetros, centimetosAmilimetros, milimetrosTotal;

        System.out.println("Ingresa la primera medida en minimetros , porfavor");
        medida1 = sc.nextDouble();

        System.out.println("Ingresa la segunda medida en centrimetos , porfavor");
        medida2 = sc.nextDouble();

        System.out.println("Ingresa la tercera medida en milimetros , porfavor");
        medida3 = sc.nextDouble();
        sc.close();

        metrosAmilimetros = medida3 / 1000;
        centimetosAmilimetros = medida2 / 100;

        milimetrosTotal = medida1 + metrosAmilimetros + centimetosAmilimetros;
        double centimetrosTotal = milimetrosTotal * 100;

        System.out.println("La suma total en centimetros es de: " + centimetrosTotal + "cm");

    }

}