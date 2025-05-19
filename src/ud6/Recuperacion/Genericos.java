package ud6.Recuperacion;

import java.util.*;

import ud1.ejercicios_parejas.recetaCompotaParejas;

public class Genericos {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 1, 2, 3, 4);

        System.out.println(repetidos(l));

        System.out.println("_____________________");

        System.out.println(filtrarMayores(l, 3, (a,b) -> a - b));

    }

    static <T> List<T> repetidos(List<T> lista) {
        List<T> listaSalida = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            int contador = 0;
            T valor = lista.get(i);

            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).equals(valor)) {
                    contador++;
                }
            }

            if (contador < 2) {
                listaSalida.add(valor);
            }

        }

        return listaSalida;
    }


    static <T> Collection<T> filtrarMayores(Collection<T> c , T elemento, Comparator<T> comp){
        Collection<T> collectionDevolver = new ArrayList<>();

        for (T e : c) {
            if (comp.compare(e, elemento) >= 0 ) {
                collectionDevolver.add(e);
            }
        }

        return collectionDevolver;
    }

    static <T> Collection<T> elementosUnicos(Collection<T> c){
        Set<T> l = new TreeSet<>();

        l.addAll(c);

        return l;

    }

    
    static <T> Collection<T> elementosUnicos(List<T> c){
        Set<T> l = new TreeSet<>();

        l.addAll(c);
        
        return l;

    }

    //static <R> List<R> filtrarYTransformar(List<T> l)

    static <T> Collection<T> combinar(Collection<T> c , Collection<T> d){
        Set<T> lNuevo = new TreeSet<>();

        lNuevo.addAll(c);
        lNuevo.addAll(d);

        return lNuevo;


    }
}
