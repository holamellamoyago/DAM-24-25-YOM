package ud6.yomExamenRecuperacion.genericos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class UtilGenerico {
    public static void main(String[] args) {
        
    }

    public static <T> List<T> repetidos(List<T> l){
        List<T> soloSiRepetidos = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
                
        }

        for (T e : l) {
            if (l.indexOf(e) != l.lastIndexOf(e)) {
                soloSiRepetidos.add(e)   ;
            }
        }

        return soloSiRepetidos;

    }

   



}
