package ud6.Practicas.E1213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T> {
    Collection<T> lista = new TreeSet<>();

    boolean add(T elemento) {
        if (lista.add(elemento)) {
            return true;
        } else {
            return false;
        }
    }

    Set<T> premiados(int numPremiados) {

        Set<T> listaGanadora = new TreeSet<>();
        int contador = 0;

        if (numPremiados > lista.size()) {
            throw new ArithmeticException("No hay tanta cosa");
        }

        ArrayList<T> listaConvertida = new ArrayList<>(lista);

        for (int i = listaGanadora.size(); i < numPremiados; i++) {
            int rdm = new Random().nextInt(listaConvertida.size());
            listaGanadora.add(listaConvertida.get(rdm));
        }



        return listaGanadora;
    }

    public static void main(String[] args) {
        Sorteo<Integer> sorteoLista = new Sorteo<>();

        sorteoLista.add(2);
        sorteoLista.add(3);
        sorteoLista.add(26);

        System.out.println(sorteoLista.premiados(1));

    }

}
