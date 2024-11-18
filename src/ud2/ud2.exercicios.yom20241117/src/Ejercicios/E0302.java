package Ejercicios;
import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorMayor = 0, contador = 0;
        double contadorEdad = 0;

        System.out.println("Introduce edades de alumnos, para parar -1");
        int edad = sc.nextInt();
        contador ++;
        if (edad > 17) {contadorMayor++;}

        while (edad > 0) {
            contadorEdad = edad + contadorEdad;
            double mediaEdad = contadorEdad / contador;

            System.out.printf("Media edad: %.1f",mediaEdad);
            System.err.println();
            System.out.println("Total alumnos: " + contador);
            System.out.println("Total alumnos mayores de edad: " + contadorMayor);


            edad = sc.nextInt();
            contador++;
            if (edad > 17) {contadorMayor++;}


            
        }

        sc.close();

    }
}
