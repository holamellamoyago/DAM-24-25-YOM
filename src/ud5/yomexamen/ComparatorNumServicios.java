package ud5.yomexamen;
// Yago Otero Martínez
import java.util.Comparator;

public class ComparatorNumServicios implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Servidor sv1 = (Servidor) o1;
        Servidor sv2 = (Servidor) o2;

        int res = sv1.servicios.length - sv2.servicios.length;

        return res;

    }

}
