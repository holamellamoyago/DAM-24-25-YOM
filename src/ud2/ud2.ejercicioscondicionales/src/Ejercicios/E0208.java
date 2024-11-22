package Ejercicios;

import java.util.Scanner;

public class E0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double discriminante;

        System.out.println("Inserta el valor de a");
        a = sc.nextInt();
        System.out.println("Inserta el valor de b");
        b = sc.nextInt();
        System.out.println("Inserta el valor de c");
        c = sc.nextInt();
        sc.close();


        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No tiene solución");
        } else { 
            double resultadoPositivo = -b + Math.sqrt(discriminante / (2 * a));
            double resultadoNegativo = -b - Math.sqrt(discriminante / (2 * a));
    
            System.out.println("Tiene dos resultados : ");
            System.out.println("Positiva: " + resultadoPositivo + "Negativo: " + resultadoNegativo);
        }





    }
}
