package ud4.EjerciciosExamen;
import java.util.Arrays;

public class ArraysEstadisticas {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // int p[] = {1,2,3,6,0,7,7};

        // Proceso y salida
        // System.err.println(mediana(p));

        
        
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);

    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }

    static int moda(int[] numeros){
        
        Arrays.sort(numeros);

        int moda = numeros[0];
        int maxRepeticiones = 1;
        int repeticiones = 1;
        int nActual= numeros[0];


        for(int i = 1; i<numeros.length; i++){
            if (numeros[i]  == nActual) {
                repeticiones++;

                if (repeticiones > maxRepeticiones) {
                    moda = nActual;
                    maxRepeticiones = repeticiones;
                } else if(repeticiones == maxRepeticiones){
                    moda = -1;
                }
            } else{

                nActual = numeros[i];
                repeticiones = 1;
            }
        }

        



        return moda;


    } 



    static double mediana(int[] numeros) {
        Arrays.sort(numeros);

        if (numeros.length % 2  != 0) {
            int n = numeros[numeros.length/2];

            return n;
        } else{
            int n1 = numeros.length/2;
            int n2 = numeros.length/2+1;

            return (numeros[n1] + numeros[n2]) / 2;
        }

    }

    static int minimo(int[] l) {
        int m = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] < m) {
                m = l[i];
            }
        }
        return m;
    }

    static int maximo(int[] l){
        int m = 0;

        for(int i = 0; i<l.length; i++){
            if (l[i] > m) {
                m = l[i];
            }
        }

        return m;
    }

    static int suma(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }
}
