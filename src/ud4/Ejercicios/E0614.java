package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E0614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra original");
        String fraseOriginal = "hola";

        if (fraseOriginal != "" || fraseOriginal != null) {
            System.out.println(generarAnagrama2(fraseOriginal));
        } else{
            System.err.println("Error");
        }
    }

    static String generarAnagrama(String original){

        char anagrama[] = original.toCharArray(); 
        int nfinal = anagrama[anagrama.length-1];
        
        for(int i = 0;  i < anagrama.length; i++){

            anagrama[i] = anagrama[nfinal];
            nfinal--;
            
        }


        return anagrama.toString();
    }

    static String generarAnagrama2(String original){

        char anagrama[] = original.toCharArray(); 

        int nfinal = anagrama[anagrama.length-1];
        
        for(int i = 0;  i < anagrama.length; i++){

            anagrama[i] = anagrama[nfinal];
            nfinal--;
            
        }

        return anagrama.toString();
    }
}
