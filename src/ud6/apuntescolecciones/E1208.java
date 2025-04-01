package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            int rdm = new Random().nextInt(100);
            coleccion.add(rdm);
        }

        // Ordeno
        
        Integer[] array  = new Integer[0];

    }
}
