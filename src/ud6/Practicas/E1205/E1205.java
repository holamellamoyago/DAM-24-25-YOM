package ud6.Practicas.E1205;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.TreeSet;

public class E1205 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 100; i++) {
            int rdm = new Random().nextInt(11);
            c.add(rdm);
        }

        System.out.println(c);

        System.out.println("Sin repetidos");
        Collection<Integer> sinRepetidos = new TreeSet<>(c);
        System.out.println(sinRepetidos);
    }
}
