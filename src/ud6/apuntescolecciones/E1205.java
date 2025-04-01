package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class E1205 {
    public static void main(String[] args) {
        Collection<Integer> coleecion = new ArrayList<Integer>();
        
        for (int i = 0; i <= 100; i++) {
            int rdm = new Random().nextInt(11);
            
            coleecion.add(rdm);
        }
        
        System.out.println("Con repetidos");
        System.out.println(coleecion);
        
        Collection<Integer> coleecionSinRepetidos = new HashSet<>();

        for (Integer integer : coleecion) {
            coleecionSinRepetidos.add(integer);
        }

        

        System.out.println(coleecionSinRepetidos);

        
    }
}
