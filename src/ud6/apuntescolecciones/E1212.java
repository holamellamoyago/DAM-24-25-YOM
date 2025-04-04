// package ud6.apuntescolecciones;

// import java.util.ArrayList;
// import java.util.Random;
// import java.util.Set;
// import java.util.TreeSet;

// public class E1212 {
//     public static void main(String[] args) {
//         Set<Integer> lista1 = new TreeSet<>();
//         Set<Integer> lista2 = new TreeSet<>();

//         for (int i = 0; i < 4; i++) {
//             int rdm = new Random().nextInt(10);
//             lista1.add(rdm);
//             lista2.add(rdm+1);
//         }

//         Set<Integer> union = union(lista1, lista2);

//     }

//     static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
//         Set<E> nuevoConjunto = new TreeSet<>();

//         nuevoConjunto.addAll(conjunto1);
//         nuevoConjunto.addAll(conjunto2);
        

//         return nuevoConjunto;
//     }

//     static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
//         Set<E> interseccion = new TreeSet<>(conjunto1);
//         interseccion.retainAll(conjunto2);
//         return interseccion;
//     }

//     static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2) {
//         Set<E> except = new TreeSet<>(B);
//         except.removeAll(A);
//         return except;
//     }


// }


package ud6.apuntescolecciones;

import java.util.TreeSet;

public class E1212 {

    public static void main(String[] args) {
        // TreeSet<E> conjunto = new TreeSet<>();
    }
}