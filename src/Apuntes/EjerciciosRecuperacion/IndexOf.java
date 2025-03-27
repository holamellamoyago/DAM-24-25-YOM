package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;

public class IndexOf {
    public static void main(String[] args) {
        String frase= "Hola Yago";
        int[] repeticiones = new int[0]; 


        int index = 0;

        for (int i = 0; i < frase.length(); i++) {
                int posicion =  frase.indexOf('a', index);

                if (posicion > 0) {
                    index++;
                    repeticiones = Arrays.copyOf(repeticiones, repeticiones.length+1);

                    repeticiones[repeticiones.length-1] = posicion;
                }

        }

        System.out.println(Arrays.toString(repeticiones));
    }
}
