package ud6.Practicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T> {
    Collection<T> lista = new TreeSet<>();

    boolean add(T elemento){
        if (lista.add(elemento)) {
            return true;
        } else{
            return false;
        }
    }

    Set<T> premiados (int numPremiados){

        Set<T> listaGanadora = new TreeSet<>();

        if (numPremiados > lista.size()) {
            throw new ArithmeticException("No hay tanta cosa");
        }

        for (int i = 0; i < numPremiados; i++) {
            int rdm = new Random().nextInt(lista.size());

  
            Iterator<T> it = lista.iterator();

            listaGanadora.add(lis);
        }

        return listaGanadora;
    }

    public static void main(String[] args) {
        Sorteo<Integer> sorteoLista = new Sorteo<>();

        sorteoLista.add(2);

        System.out.println(sorteoLista.premiados(1));

        
    }


}
