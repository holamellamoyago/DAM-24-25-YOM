package ud6.Practicas.E1208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;

public class E1208 implements Comparator<Integer> {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 20; i++) {
            int rdm = new Random().nextInt(10);
            c.add(rdm);
        }

        System.out.println(c);

        Integer[] tabla = c.toArray(new Integer[0]);

        Arrays.sort(tabla, (a, b) -> b - a);

        Collection<Integer> cOrdenadaMenorMayor = new ArrayList<>(Arrays.asList(tabla));
        System.out.println(cOrdenadaMenorMayor);

        

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }


}
