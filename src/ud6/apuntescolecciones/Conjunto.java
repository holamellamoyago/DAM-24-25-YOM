package ud6.apuntescolecciones;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto<E> {
    TreeSet<E> conjunto;

    public Conjunto(TreeSet<E> conjunto) {
        this.conjunto = conjunto;
    }

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
        TreeSet<E> conjuntoTotal = new TreeSet<>(conjunto1);
        conjuntoTotal.addAll(conjunto2);
        return conjuntoTotal;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        TreeSet<E> conjunto = new TreeSet<>(conjunto1);
        
        conjunto.retainAll(conjunto2);

        return conjunto;
    }

    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2){
        TreeSet<E> conjunto = new TreeSet<>(conjunto1);
        conjunto.removeAll(conjunto2) ;

        return conjunto;
    }

    public static void main(String[] args) {
        TreeSet<Integer> conjunto1 = new TreeSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        
        TreeSet<Integer> conjunto2 = new TreeSet<>();
        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(5);

        System.out.println(interseccion(conjunto1, conjunto2));

    }


}
