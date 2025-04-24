package ud6.Practicas.Meigas;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new TreeMap<>();

        mapa.put("a", 2);
        mapa.put("b", 8);
        mapa.put("<", 3);
        mapa.put("c", 1);

        List<Integer> l = new ArrayList<>(mapa.values());
        l.sort((o1, o2) -> o2 - o1);

        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }

        System.out.println(Arrays.toString(a));
    }
}
