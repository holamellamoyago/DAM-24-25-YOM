package ud6.Practicas.E1204;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Collection<Integer> c = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 5; i++) {
            int rdm = new Random().nextInt(11);
            c.add(rdm);
        }

        System.out.println(c);

        System.out.println();

        System.out.println("Valores pares: ");
        for (Integer e : c) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
        }

        Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
            
        }

        System.err.println();
        System.out.println("Sin multiplos de 3 ");
        System.out.println(c);
    }
}
