package ud4.Apuntes;

import java.util.Arrays;

public class Ejemplos08_Matrices {

    public static void main(String[] args) {
        int[][] matriz;

        
        int matriz2[][] = {
            
            { 0, 1, 2, 4 },
            { 5, 8, 2, 1, 4 }
            
        };
        int matriz3[][] = {
            
            { 0, 1, 2, 4 },
            { 5, 8, 2, 1, 4 }

        };
        
        System.out.println("matriz2 == matriz3 ? " + (matriz2 == matriz3));
        System.out.println("Arrays.equals(matriz2, matriz3) ? " + Arrays.equals(matriz2, matriz3));
        System.out.println("Arrays.deepEquals(matriz2, matriz3) ? " + Arrays.deepEquals(matriz2, matriz3));
        
        
        // matriz = new int[23][8]; // Filas(23) y columnas(8)
        matriz = generarMatrizAleatorio_09(23, 8);

        for (int i = 0; i < matriz.length; i++) { // Tamaño de las filas
            for (int j = 0; j < matriz[i].length; j++) { // Tam columnas
                // Se coge la primera fila , se rellna y pasa a la siguiente
                matriz[i][j] = (int) (Math.random() * 9) + 1; // Primero van las columnas
            }
        }

        // Leer
        // mostrarMatriz(matriz);
        mostrarMatriz(matriz);



        // System.out.println(Arrays.deepToString(matriz));

    }

    static void mostrarMatriz( int [][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.err.println();
        }
    }

    static int [][] generarMatrizAleatorio_09(int numFilas , int numColumnas){

        int m [][] = new int[numFilas][numColumnas];


        for (int i = 0; i < m.length; i++) { // Tamaño de las filas
            for (int j = 0; j < m[i].length; j++) { // Tam columnas
                // Se coge la primera fila , se rellna y pasa a la siguiente
                m[i][j] = (int) (Math.random() * 9) + 1; // Primero van las columnas
            }
        }

        return m;
    }
}
