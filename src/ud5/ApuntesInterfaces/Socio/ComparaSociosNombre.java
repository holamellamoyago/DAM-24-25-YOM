package ud5.ApuntesInterfaces.Socio;

import java.util.Comparator;

public class ComparaSociosNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        
        return socio1.nombre.compareTo(socio2.nombre) ;
    }
    
}
