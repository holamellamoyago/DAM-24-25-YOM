package ud2.ejerciciosPropuestos;
import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de año");
        int anho = sc.nextInt();
        boolean esBisiesto;
        sc.close();

        if (anho % 4 == 0) {
            if (anho % 100 == 0) {
                if (anho % 400 == 0) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }

        if (esBisiesto) {
            System.out.println("El año " + anho + " es bisiesto.");
        } else {
            System.out.println("El año " + anho + " no es bisiesto.");
        }
    }
}
