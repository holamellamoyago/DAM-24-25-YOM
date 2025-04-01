package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;

public class E1208 {
    public static <T> void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int rdm = new Random().nextInt(100);
            coleccion.add(rdm);
        }

        // Ordeno
        Integer[] a = coleccion.toArray(new Integer[0]);
        Arrays.sort(a);
        System.out.println("DE MENOR A MAYOR");
        System.out.println(Arrays.toString(a));

        System.out.println("DE MAYOR A MENOR");
        Arrays.sort(a, Comparator.reverseOrder());
        coleccion = new ArrayList<>(Arrays.asList(a));
        System.out.println(coleccion.toString());
        
        

    }
}
