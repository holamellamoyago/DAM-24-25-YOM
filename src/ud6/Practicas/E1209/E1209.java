package ud6.Practicas.E1209;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class E1209 {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 20; i++) {
            int rdm = new Random().nextInt(11);
            c.add(rdm);
        }

        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) % 2 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
