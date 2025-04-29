package ud6.Practicas.E1303;

import java.util.Comparator;
import java.util.List;

public class E1303<Y> {
    public static void main(String[] args) {
        System.out.println(max(List.of(1,2,3,4,5,6,7,8,99), (a,b) -> -a.compareTo(b)));

    }

    static <Y> Y max(List<Y> lista, Comparator<Y> c) {
        Y max = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (i != lista.size() - 1) {
                if (c.compare(lista.get(i), lista.get(i + 1)) == 1) {
                    max = lista.get(i + 1);
                }
            }
        }

        return max;

    }
}
