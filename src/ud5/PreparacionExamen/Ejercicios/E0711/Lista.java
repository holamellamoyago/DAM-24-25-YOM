package ud5.PreparacionExamen.Ejercicios.E0711;

import java.util.Arrays;

import ud1.ejercicio_examen.numerosOrdenados;

public class Lista {
    Integer[] lista;

    public Lista() {
        this.lista = new Integer[0];
    }

    int obtenerNumeroElementos(){
        return lista.length;
    }

    Integer[] insertarNumeroAlFinal(int n){
        lista = Arrays.copyOf(lista, lista.length+1);

        lista[lista.length-1] = n;

        return lista;
    }

    Integer[] insertarNumeroAlPrincipio(int n){
        lista = Arrays.copyOf(lista, lista.length+1);
        int comodin;

        for (int i = 0; i < lista.length; i++) {
            comodin = lista[i+1];

        }
    }
    
}
