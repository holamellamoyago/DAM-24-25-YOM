package Ejercicios;

import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Juego de adivinar un numero, introduce cual crees que es");
        int numeroIntroducido = sc.nextInt();
        int numRandom = (int) (Math.random() * 100) + 1;
        System.out.println(numRandom);

        while (numeroIntroducido != -1 && numRandom != numeroIntroducido) {

            if (numeroIntroducido > numRandom) {
                System.out.println("Es mas pequeño ...");
                numeroIntroducido = sc.nextInt();

            } else {
                System.out.println("Es mayor....");
                numeroIntroducido = sc.nextInt();
            }
        }

        if (numeroIntroducido == numRandom) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Te has rendido");
        }

        sc.close();
        


    }

}
