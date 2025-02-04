package ud4.ExamenesGPT;

import java.util.Arrays;

import ud4.ArraysUtil;

// 1. Manipulación de Arrays (20 puntos)
// La empresa almacena los pesos de los paquetes en un array de enteros. Necesitan un programa que:

// Genere un array de 50 paquetes con pesos aleatorios entre 1 y 100 kg.

// Calcule y muestre el peso promedio de los paquetes.

// Determine cuántos paquetes pesan más que el promedio.

// Devuelva un nuevo array solo con los paquetes que pesan por encima del promedio.

public class Manipulacion {
    public static void main(String[] args) {
        Integer[] a = ArraysUtil.arrayAleatorio(50, 1, 100);
        
        System.out.println(Arrays.toString(a));

        calcularPromedioPaquetes(a);

        paquesSuperiorPromedio(a);

    }

    static int calcularPromedioPaquetes(Integer[] a){
        int sumaTotal = 0;

        for (int i = 0; i < a.length; i++) {
            sumaTotal += a[i]; 
        }

        return sumaTotal/a.length;
    }

    static Integer[] paquesSuperiorPromedio(Integer[] a){
        Integer[] superiores = new Integer[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > calcularPromedioPaquetes(a)) {
                superiores =  Arrays.copyOf(superiores, superiores.length+1);
                superiores[superiores.length-1] = a[i];
            }
        }

        return superiores;
    }
}
