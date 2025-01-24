package ud2.ejerciciosBucles.Ejercicios;
import java.util.Scanner;
public class E0301 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero, para parar 0");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else { 
                System.out.println("No es par");
            }

            if (numero >= 0) {
                System.out.println("Es positivo");
            } else { 
                System.out.println("Es negativo");
            }

            System.out.println(Math.pow(numero, 2));
            numero = sc.nextInt();
            sc.close();

        }
    }
}