package ud5.PreparacionExamen.Inmobiliaria;

import java.util.Comparator;

public class ComparatorMetros implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Inmueble in1 = (Inmueble) o1;
        Inmueble in2 = (Inmueble) o2;

        int res = in1.metrosConstruidos - in2.metrosConstruidos;

        if (res == 0) {
            res = in1.calle.compareTo(in2.calle);
        }

        return res;
    }
    
}
