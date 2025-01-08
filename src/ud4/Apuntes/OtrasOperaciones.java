package ud4.Apuntes;

import java.util.Random;

public class OtrasOperaciones {
    static void buscar(int t[], int clave) {
        int contadorPosicion = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contadorPosicion++;
            }
        }

        System.out.println("Se repitio " + contadorPosicion + " veces");
    }

    static int[] generarLista(int n) {
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Random().nextInt(-9, 9+1);
        }

        return t;
    }

    public static void main(String[] args) {

        int l[]= generarLista(200);

        buscar(l, 9);
        

    }
}
