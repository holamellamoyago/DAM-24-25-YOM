package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;

        Double [] puntuaciones = new Double[NUM];

        System.out.println("Introduce las puntuaciones de los " + NUM + " programadores");

        for(int i = 0; i<NUM;i++){
            puntuaciones[i] = sc.nextDouble();

        }

        Arrays.sort(puntuaciones, Collections.reverseOrder());
        System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuaciones));


        System.out.println("Introduce las puntuaciones de los programadores de exhibicion. ntroduce -1 para terminar");
        Double nota = sc.nextDouble();// NOTA

        while (nota != -1) { // Proceso de lectura anticipada
            // Proceso : añadir ordenado
            Double tAux[] = new Double[puntuaciones.length +1];

            int posicion = Arrays.binarySearch(puntuaciones, nota, Collections.reverseOrder());

            if (posicion < 0 ) {
                posicion = -posicion -1;
            }

            System.arraycopy(puntuaciones, 0, tAux, 0, posicion);
            tAux[posicion] = nota;

            System.arraycopy(puntuaciones, posicion, tAux, posicion +1 , puntuaciones.length - posicion);
            puntuaciones = tAux;

            nota = sc.nextDouble();
        }


        System.out.println("Puntuaciones finales: " + Arrays.toString(puntuaciones));
    }
    
}
