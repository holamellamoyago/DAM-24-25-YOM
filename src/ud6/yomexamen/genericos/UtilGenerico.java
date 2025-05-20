package ud6.yomexamen.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UtilGenerico<T> {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 1, 2, 2, 2, 3, 3, 3, 4));

        System.out.println(repetidos(lista));
    }

    static <T> List<T> repetidos(List<T> lista) {

        for (int i = 0; i < lista.size(); i++) {
            int contador = 0;

            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).equals(lista.get(i))) {
                    contador++;
                }
            }

            if (contador == 2) {
                Iterator<T> it = lista.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(lista.get(i))) {
                        it.remove();
                    }

                }
            }

        }

        return lista;
    }

    Collection<T> filtrarMayores(Collection<T> c, T e, Comparator<T> com) {
        Collection<T> collecion = new ArrayList<>();

        for (int i = 0; i < c.size(); i++) {
            List<T> l = new ArrayList<>();
            l.addAll(c);

            com.compare(, e) 
            
        }

        return collecion;
    }

}
