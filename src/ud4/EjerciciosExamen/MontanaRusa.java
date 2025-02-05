package ud4.EjerciciosExamen;

import java.util.Arrays;
import java.util.Scanner;

public class MontanaRusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce las alturas de las montaña");

        int altura = sc.nextInt();
        int [] alturas = new int[0];

        while (altura!= -1) {
            alturas = Arrays.copyOf(alturas, alturas.length+1);
            alturas[alturas.length-1] = altura; 

            altura = sc.nextInt();
        }

        System.out.println(contarPicos(alturas));
        

    }



    static int contarPicos(int[] alturas){
        int totalPicos = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (i == 0) {
                if (alturas[i] > alturas[i+1]) {
                    totalPicos++;
                }
            } else if (alturas[i] == alturas.length) {
                if (alturas[i] > alturas[i-1] && alturas[i] > alturas[0]) {
                    totalPicos++;
                }
            } else{
                if (alturas[i] > alturas[i-1] && alturas[i] > alturas[i+1]) {
                    totalPicos++;
                }
            }


        }


        return totalPicos;
    }
}
