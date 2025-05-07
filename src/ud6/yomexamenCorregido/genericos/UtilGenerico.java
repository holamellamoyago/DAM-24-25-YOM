package ud6.yomexamenCorregido.genericos;
import java.util.*;

public class UtilGenerico {
    public static <T> List<T> repetidos(List<T> lista){
        List<T> soloRepetidos = new ArrayList<>();
        
        for (T e : lista) {
            // Si está reptido lo añado al resultado
            if (lista.indexOf(e) != lista.lastIndexOf(e)) {
                soloRepetidos.add(e);
            }
        }
        
        return soloRepetidos;
    }

    public static <T> Collection<T> filtrarMayores(Collection<T> coleccion , T valor , Comparator<T> comp){
        Collection<T> res = new ArrayList<>();

        for (T e : coleccion) {
            if (comp.compare(e, valor) >= 0) {
                res.add(e);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        Integer[] t = {1,2,3,3,4,5,5,6};
        System.out.println(repetidos(Arrays.asList(t)));


        System.out.println(filtrarMayores(Arrays.asList(t), 4, (a,b) -> a-b));
    }
}
