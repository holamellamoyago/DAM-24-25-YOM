package ud6.ApuntesGenericos2;

import java.util.Comparator;

public class ComparatorNombres implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
    
}
