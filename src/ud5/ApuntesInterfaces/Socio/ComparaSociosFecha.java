package ud5.ApuntesInterfaces.Socio;

import java.util.Comparator;

public class ComparaSociosFecha implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;
        
        return s1.fecha.compareTo(s2.fecha);
    }
    
}
