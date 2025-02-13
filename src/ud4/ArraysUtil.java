package ud4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtil {

    /**
     * Genera y devuelve un array de n números aleatorios entre -9 y 9, incluyendo el 0.
     * @param n
     * @return
     */
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; // Asigna un número entre -9 y 9
        }

        return t;
    }

    /**
     * Genera y devuelve un array de n números aleatorios entre un número de inicio y uno de fin.
     * @param n
     * @param rndInicio
     * @param rndFin
     * @return
     */
    public static Integer[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        Integer[] t = new Integer[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio; 
        }

        return t;        
    }
    
    /**
     * Rellena una tabla con números enteros leídos de teclado.
     * @param t
     */
    public static void leerNumeros(int[] t) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }    

    /**
     * Crea y devuelve una tabla ordenada de la longitud especificada rellena con números pares aleatorios en el rango desde 2 hasta el valor de fin inclusive.
     * @param longitud
     * @param fin
     * @return
     */
    static public int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];

        for(int i = 0; i < t.length; i++) {
            Random rnd = new Random();
            do
                t[i] = rnd.nextInt(2, fin + 1);
            while (t[i] % 2 != 0);
        }

        Arrays.sort(t);

        return t;
    }


    /**
     * Cuenta las apariciones de un número (clave) en un array de enteros
     * @param t
     * @param clave
     * @return
     */
    public static int contar(int t[], int clave) {
        int contar = 0;

        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                contar++;

        return contar;
    } 

    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscar(int t[], int clave) {
        for(int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    }

    /**
     * Suma los elementos de un array de enteros
     * @param t
     * @return
     */
    public static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    public static Integer maximo(int t[]) {
        if (t == null || t.length == 0)
            return null;

        Integer maximo = t[0];

        for(int i = 1; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];

        return maximo;
    }

    public static Integer[] ordenarAlReves(Integer t[]){
        Arrays.sort(t, Collections.reverseOrder());
        
        return t;
    }

    static public  int [][] generarMatrizAleatorio_09(int numFilas , int numColumnas){

        int m [][] = new int[numFilas][numColumnas];


        for (int i = 0; i < m.length; i++) { // Tamaño de las filas
            for (int j = 0; j < m[i].length; j++) { // Tam columnas
                // Se coge la primera fila , se rellna y pasa a la siguiente
                m[i][j] = (int) (Math.random() * 9) + 1; // Primero van las columnas
            }
        }

        return m;
    }

    public static void mostrarMatriz( int [][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static String quitarEspacios(String frase){

        // frase = frase.replace(" ", ""); \\s Todo \\ttabulacion \\saltoLinea \\retorno de carro
        frase = frase.replaceAll("\\s", "");

        return frase;
    }

    public static String sinVocales(String cad) {
        String fraseDevolver = "";
        String vocales = "aeiouÁÉÍÚÚ";
        char a [] = vocales.toCharArray();
        
        for(int i = 0; i<cad.length(); i++){
           int pos = Arrays.binarySearch(a, cad.charAt(i));

            if (pos < 0) {
                fraseDevolver+= cad.charAt(i);
            }

        }

        
        return fraseDevolver;
    }




}
