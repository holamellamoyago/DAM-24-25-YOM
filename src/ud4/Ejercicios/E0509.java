package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;

        Double[] puntuaciones = new Double[NUM];

        System.out.println("Introduce las puntuaciones de los " + NUM + " programadores");

        for (int i = 0; i < NUM; i++) {
            puntuaciones[i] = sc.nextDouble();
        }

        Arrays.sort(puntuaciones, Collections.reverseOrder());
        System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuaciones));

        System.out.println("Introduce las puntuaciones de los programadores de exhibicion. Introduce -1 para terminar");
        Double nota = sc.nextDouble();

        while (nota != -1) {
            Double tAux[] = new Double[puntuaciones.length + 1];
            System.arraycopy(puntuaciones, 0, tAux, 0, puntuaciones.length);
            tAux[puntuaciones.length] = nota;
            puntuaciones = tAux;
            Arrays.sort(puntuaciones, Collections.reverseOrder());
            System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuaciones));
            nota = sc.nextDouble();
        }
    }
}
