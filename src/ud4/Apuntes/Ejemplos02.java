package ud4.Apuntes;

import java.util.Random;

public class Ejemplos02 {
    public static void main(String[] args) {
        final int NUM = 100;
        int edad []; // Declaración Variable
        Random rdm = new Random();

        edad = new int[NUM]; // 5 son los espacios que se reservan, crear instancia

        for(int i = 0; i<NUM; i++){
            edad[i] = rdm.nextInt(18,41);

        }

        long suma = 0;
        for (int i = 0; i<NUM; i++){
            suma += edad[i];
            System.out.println(suma);
        }

        double media = suma / NUM; 
        System.out.println("Media edad : " + media);
        

        System.out.println("La edad de la persona 2 es " + edad[2]);

    }
}
