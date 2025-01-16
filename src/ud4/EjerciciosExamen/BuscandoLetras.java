package ud4.EjerciciosExamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscandoLetras {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe letras para comprobar su posicion en la ...");

        int[]posiciones = new int[0];


        do {
            char letra = sc.next().charAt(0);
            posiciones = buscarLetra(fraseAleatoria(), letra);
            System.out.println("Se encuentra en las posiciones: " + Arrays.toString(posiciones));
        } while (posiciones.length != 0);



        System.out.println("Aparece en las posiciones: ");

        
    }

    static int[] buscarLetra(String cadena, char letra){

        char[] t = cadena.toCharArray();
        int posiciones[] = new int[0];
        System.out.println(Arrays.toString(t));


        for(int i = 0; i<t.length; i++){

            if (t[i] == letra) {
                posiciones =  Arrays.copyOf(posiciones , posiciones.length+1);
                posiciones[posiciones.length-1] = i;
            }
        }


        return posiciones;

    } 

    static String fraseAleatoria() {
        String conceptos [] = {"Entorno de desarollo" , "Compilacion" , "Ejecucion" , "Código fuente", "Bytecode" , "codigo objecto", "Algoritmo", "Lenguaje de programación"};

        int rnd = new Random().nextInt(0, conceptos.length);

        return conceptos[rnd];
    }
    
}
