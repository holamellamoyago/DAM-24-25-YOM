package ud4.Ejercicios;

import java.util.Random;

public class E0501 {

    public static void main(String[] args) {
        int[] t = arrayAleatorio(10,1,100)    ;
                System.out.println("La suma es " + sumar(t));
            }

    public static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int t[] = new int[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndInicio, rndFin+1);

        }

        return t;
    }

    public static int sumar(int l[]){
        int suma = 0;

        for (int i : l) {
            suma +=i;

        }

        return suma;
    }
}
