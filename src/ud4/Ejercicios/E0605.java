package ud4.Ejercicios;

import java.util.Scanner;

public class E0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        String fraseInvertida = invertirCadena(frase);
        System.out.println(fraseInvertida);

        if (frase.equals(fraseInvertida)) {
            System.out.println("Es palíndromos");
        } else{ 
            System.out.println("No lo es");
        }
    }


    static String invertirCadena(String frase){
        String fraseInvertida = "";
        for(int i = frase.length() -1; i>=0; i--){
            fraseInvertida += frase.charAt(i);

        }

        retrun fraseInvertida;
    }



    private static boolean esPalindromo(String frase){
        return frase.equalsIgnoreCase(invertirSinEspacios(frase))        
    }

    static String invertr
}
