package ud4.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class E0615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1: Introduce una palabra");
        
        String palabra;

        do {
            palabra = sc.nextLine();
        } while (palabra.isEmpty());

        char letras[] = palabra.toCharArray();


        // Generar anagrama

        for (int i = 0; i < letras.length; i++) {
            Random rnd = new Random();
            int pos = rnd.nextInt(letras.length);

            char letra = letras[pos];
            letras[pos] = letras[i];
            letras[i] = letra;
        }

        String anagrama =  String.valueOf(letras);
        System.out.println("Anagrama: " + anagrama);

        String palabra2;
        final int MAX_INTENTOS = 3;
        int intentos = 0;


        do {
            System.out.println("Jugador 2: adivina la paabra original, te quedan: "+ (MAX_INTENTOS - intentos) + " intentos");
            palabra2 = sc.nextLine();

            intentos++;

            int coincidencias = contarCaracteresIguales(palabra, palabra2);

            System.out.println("Coinciden coincidentes en el mismo lugar: " + coincidencias);
            
        } while (!palabra.equalsIgnoreCase(palabra2) && intentos<MAX_INTENTOS);


        if (!palabra.equalsIgnoreCase(palabra2) && intentos<MAX_INTENTOS) {
            System.out.println("Acertaste");
        } else{
            System.out.println("Agotaste tus 3 intentos");
        }
        


    }

    private static int  contarCaracteresIguales(String p1, String p2){
        int coincidencias = 0;
        int repeticiones = p1.length() > p2.length() ? p1.length() : p2.length();

        for (int i = 0; i < repeticiones; i++) {
            if (p1.charAt(i) == p2.charAt(i)) {
                coincidencias++;
            }
        }
        

        return coincidencias;
    }
}
