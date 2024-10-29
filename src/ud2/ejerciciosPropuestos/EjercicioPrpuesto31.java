
package ud2.ejerciciosPropuestos;

/**
 * EjercicioPrpuesto31
 * Diseña una aplicaicon que muestre la edad maxima y minima de un grupo de alumnos. El usuario introducirá y termina´ra escribieneod -1
 */
import java.util.Scanner;
public class EjercicioPrpuesto31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador,edad;

        System.out.println("Introduce las edades de tus amigos");
        edad = sc.nextInt();
        

        while (edad != -1) {
            System.out.println("Edad amigo1: " + edad );
            edad = sc.nextInt();
        }
    }
}