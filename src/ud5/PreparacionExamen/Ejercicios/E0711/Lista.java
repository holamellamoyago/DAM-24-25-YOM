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


        for (int i = lista.length-1; i > 0; i--) {
            lista[i] = lista[i-1];
            
        }
        
        lista[0] = n;

        return lista;
    }

    int buscarElemento(int n){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == n) {
                return i;
            }
        }

        return -1;
        
    }

    Integer[] insertarNumeroIndice(int n, int i){
        lista[i] = n;

        return lista;
    }

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.insertarNumeroAlFinal(2);
        System.out.println(Arrays.toString(lista.insertarNumeroAlFinal(3)));

        System.out.println(Arrays.toString(lista.insertarNumeroAlPrincipio(1)));
        System.out.println(Arrays.toString(lista.insertarNumeroAlPrincipio(2)));

        System.out.println(lista.buscarElemento(7));
    }
    
}
