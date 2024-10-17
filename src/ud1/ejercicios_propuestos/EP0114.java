package ud1.ejercicios_propuestos;

import java.util.Scanner;

// EP0114. Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.


public class EP0114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.println("Introduce las horas a convertir");
        int horas =  sc.nextInt();
        System.out.println("Introduce los minutos a convertir");
        int minutos =  sc.nextInt();

        int horasAsegundos = horas * 3600;
        int minutosAsegundos = minutos * 60;

        System.out.println("El total de segundos es: " + horasAsegundos+ minutosAsegundos);

        sc.close();



    }
}