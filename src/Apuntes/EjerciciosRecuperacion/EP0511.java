package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EP0511 {
    public static void main(String[] args) {
        
        int[] a = {1,2,2,2,2,3,4,5};
        int[][] m = {
            {1,2,2,2,2,3,4,5},
            {1,2,2,2,2,3,4,5}
        };

        System.out.println(Arrays.toString(buscarTodos(a, 2)));

    }

    static int[] buscarTodos(int t[], int clave){
        int[]a = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                a = Arrays.copyOf(a, a.length+1);
                a[a.length-1] = i;
            }
        }

        return a;
    }
}
