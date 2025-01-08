
package ud4.Apuntes;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        

        leerNumeros(numeros);
    

        // Procesar datos
        int sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0, contCeros = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                contPos++;
                sumaPos += numeros[i];
            } else if (numeros[i] < 0) {
                contNeg++;
                sumaNeg += numeros[i];
            } else {
                contCeros++;
            }
        }

        System.out.println("Media de números positivos: " + sumaPos / contPos); // Sin decimales
        System.out.println("Media de números negativos: " + sumaNeg / contNeg); // Sin decimales
        System.out.println("Numero de ceros: " + contCeros);

    }

    private static void leerNumeros(int[] numeros) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe " + numeros.length + " números");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

    }

}