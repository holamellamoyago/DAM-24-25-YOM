package ud5.PreparacionExamen.InstanceOf;

import java.util.Comparator;

public class ComparatorDesc implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return -((Integer)o1) - ((Integer)o2);
        
    }

    
}