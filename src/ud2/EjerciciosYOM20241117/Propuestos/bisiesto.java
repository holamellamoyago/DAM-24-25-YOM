package ud2.EjerciciosYOM20241117.Propuestos;
import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de año");
        int anho = sc.nextInt();
        boolean esBisiesto;
        sc.close();

        // String bisiesto = año % 4 == 0  ? SiEs : NoEs;
        // String bisiestoSecular = año % 100 == 0 ? SiEs : NoEs;
        // String bisiesto4Secular = año % 400 == 0 ?SiEs : NoEs;

        // if (año >= 100) {
        //     if (año >= 400) {
        //         System.out.println("El año: " + año + " "+ bisiesto4Secular);
                
        //     } else{
        //         System.out.println( "El año: " + año + " " + bisiestoSecular);
        //     }

        // } else{
        //     System.out.println( "El año: " + año + " " + bisiesto);
        // }

        boolean div4 = anho  % 4 == 0;
        boolean div100 = anho  % 100 == 0;
        boolean div400 = anho  % 400 == 0;

        if (div400 || div4 &&  !div100) {
            esBisiesto = true;
        } else{
            esBisiesto = false;
        }

        System.out.println(esBisiesto);

    }
}
