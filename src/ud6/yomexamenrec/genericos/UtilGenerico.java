package ud6.yomexamenrec.genericos;

import java.util.*;
import java.util.Map.Entry;

// Yago Otero Martínez

public class UtilGenerico {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>(List.of(1,2,3,4,4));
        Collection<Integer> c2 = new ArrayList<>(List.of(1,2,3,4,4,5));

        System.out.println(contarCoincidencias(c1, c2));

        System.out.println("------------------");

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(3, "a");

        System.out.println(invertirOrden(mapa));
        
    }

    static <T> int contarCoincidencias(Collection<T> c1, Collection<T> c2){
        Set<T> elementosNoRepetidos = new TreeSet<>();

        elementosNoRepetidos.addAll(c1);
        elementosNoRepetidos.addAll(c2);


        return elementosNoRepetidos.size()-1;
    }


    static <k,v> Map<v,List<k>>  invertirOrden(Map<k,v> mapa) {

        Map<v,List<k>> nuevoMapa = new HashMap<>();

        List<Entry<k,v>> l = new ArrayList<>(mapa.entrySet());

        for (int i = 0; i < l.size(); i++) {
            // 1. Compruebo si el value esta en el mapa nuevo
            v resultado =  l.get(i).getValue();
            k key = l.get(i).getKey();

            if (nuevoMapa.containsKey(resultado)) {
                // Si lo contiene le añado la key al List
                nuevoMapa.get(resultado).add(key);
            } else{
                nuevoMapa.put(resultado, new ArrayList<>(List.of(key)));
            }
        }

        
            return nuevoMapa;
    }
}
