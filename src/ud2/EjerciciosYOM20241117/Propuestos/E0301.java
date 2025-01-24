package ud2.EjerciciosYOM20241117.Propuestos;

// Diseñar un programa que muestre, para cada número introducido por teclado, si
// es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
// introducido sea 0.

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero");
        n = sc.nextInt();

        while (n != 0) {
            String par = n % 2 == 0 ? "Es par" : "Es impar";
            String positivo = n > 0 ? "Numero positivo" : "Numero negativo";
            double cuadrado = Math.pow(n, 2);

            System.out.println(par);
            System.out.println(positivo);
            System.out.println("Su cuadrado es: " + cuadrado);

            n = sc.nextInt();
            
        }
        sc.close();
        
    }
}
