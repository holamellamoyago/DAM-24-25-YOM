package ud5.yomexamen;
// Yago Otero Martínez
import java.util.Comparator;

public class ComparatorAlfabetico implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;

        // String so1 = c1.toString();
        // String so2 = c2.toString();

        return c1.so.compareTo(c2.so);
    }

}
