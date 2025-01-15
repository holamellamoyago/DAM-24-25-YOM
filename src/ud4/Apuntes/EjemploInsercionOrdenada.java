package ud4.Apuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjemploInsercionOrdenada {

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);

        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        int valor = 11;

        System.out.println(Arrays.toString(insertarOrdenado(t, valor)));

    }

    static public Integer[] insertarOrdenado(Integer[] t, int num) {

        Integer resultado[] = new Integer[t.length + 1];

        Integer posicion = Arrays.binarySearch(t, num);

        if (posicion < 0) {
            posicion = -posicion - 1;
        }

        System.arraycopy(t, 0, resultado, 0, posicion); // Aqí copia las posiciones pero empezando desde el 0, después 
        resultado[posicion] = num;

        System.arraycopy(t, posicion, resultado, posicion+1, t.length - posicion);

        return resultado;
    }

}
