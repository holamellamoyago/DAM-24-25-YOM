package ud5.Practicas.Inmobiliaria;

import java.util.Comparator;

public class ComparableMetrosCuadrados implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Inmueble m1 = (Inmueble) o1;
        Inmueble m2 = (Inmueble) o2;
        return m1.metros2 - m2.metros2;
    }
    
}
