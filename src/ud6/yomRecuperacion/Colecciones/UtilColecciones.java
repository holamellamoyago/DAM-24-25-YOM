package ud6.yomRecuperacion.Colecciones;

import java.util.*;

public class UtilColecciones {
    public static void main(String[] args) {
        
    }

    public static <T> Set<T> duplicados(List<T> lista){
        Set<T> duplciados = new HashSet<>();
        for (T e : lista) {
            if (lista.indexOf(e) != lista.lastIndexOf(e)) {
                duplciados.add(e);
            }
        }


        return duplciados;
    }


    public static <T> Map<T, Integer> contarElementos(Collection<T> col){
        Map<T, Integer> mapa = new TreeMap<>();

        for (T e : col) {
            if (mapa.containsKey(e)) {
                int comodin = mapa.get(e);
                mapa.put(e, comodin+1);
            } else{
                mapa.put(e, 1);
            }
        }

        return mapa;
    }
}
