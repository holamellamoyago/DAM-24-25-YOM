package ud2.ejerciciosPropuestos;

// E0306. Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
// todos los números del 1 al n.

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las veces a contar");        
        int contador = sc.nextInt();
        sc.close();

        System.out.println("__________________________");

        for(int i =1; i<= contador; i++){

            System.out.println(i);
        }
    }
}
