package ud6.Practicas.EP1215;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EP1215<T> {
    List<T> listaNumerica = new ArrayList<>();

    public static void main(String[] args) {

        EP1215<Integer> a = new EP1215<>();

        a.listaNumerica.add(2);
        a.listaNumerica.add(3);
        a.listaNumerica.add(2);

        System.out.println(a.listaNumerica);
        System.out.println();
        // System.out.println(sinRepeticiones(a.listaNumerica));
        
        
    }

    List<T> sinRepeticiones(List<T> l){
        Iterator<T> it = l.iterator();
        
        while (it.hasNext()) {
            it.next();
            for (T t : l) {
                if (it.equals(t)) {
                    it.remove();
                }
            }
        }

        return l;
    }
}
