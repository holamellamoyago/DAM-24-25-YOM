package ud2.EjerciciosYOM20241117.Propuestos;
import java.util.Scanner;


public class E0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero decimal");
        double numero = sc.nextDouble();
        sc.close();

        if (numero < -0.5 || numero > 0.5) {
            System.out.println("El numero esta mas cerca de -1 o 1");
        } else{
            System.out.println("El numero es casi-cero");
        }
    }
}
