package ud6.ApuntesStream.E1305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class E1305 {

    public static void main(String[] args) {

        List<Double> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            double rdm = new Random().nextInt(11);
            listaNumeros.add(rdm);
        }

        listaNumeros =  transformar(listaNumeros, x -> Math.sqrt(x));
        System.out.print(listaNumeros);

        // Predicate<T> esPositivo = t -> t > t;

        // System.out.println(Arrays.toString(multiplos3));

        
    }

    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V> lista = new ArrayList<>();

        for (T e : t) {
            lista.add(f.apply(e));
        }

        return lista;
        
        // Coger el elemento X de tabla 1 , 
        // Devolver o transformar la segunda tabla

        // Obetener rainces cuadradas de los elementos de otra


    }

}
