package ud6.Practicas.E1206;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 10; i++) {
            int rdm = new Random().nextInt(11);
            c.add(rdm);
        }

        System.out.println(c);

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
        }

        System.out.println(c);
    }
}
