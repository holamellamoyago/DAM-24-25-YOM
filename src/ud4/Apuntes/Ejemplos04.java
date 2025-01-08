package ud4.Apuntes;

import java.util.Arrays;
import java.util.Random;

public class Ejemplos04 {

        private static int[] arrayAleatorio(int n) {
        int t [] = new int[n];

        Random rnd = new Random();

        for(int i = 0; i<n; i++){
            t[i] = rnd.nextInt(-9,9);
            
        }

        return t;
        
    }
    public static void main(String[] args) {
        int t [] =  new int[100];

        Arrays.fill(t, 7);
        Arrays.fill(t, 50, 60 , 5);
         System.out.println(Arrays.toString(t));

        int suma = 0;
         for(int numero : t){
            suma += numero;
            numero =1;
        }
        System.out.println("Sumar : "+ suma);



    }
}
