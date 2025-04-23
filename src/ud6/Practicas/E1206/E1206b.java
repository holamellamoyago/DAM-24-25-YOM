package ud6.Practicas.E1206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1206b {
    public static void main(String[] args) {
        Collection<Integer> nPositivos = new ArrayList<>();
        Collection<Integer> nNegativos = new ArrayList<>();

        System.out.println("Numero.. ");
        for (int i = 0; i < 10; i++) {
            int rdm = new Random().nextInt(-100, 101);
            if (rdm > 0) {
                nPositivos.add(rdm);
            } else {
                nNegativos.add(rdm);
            }
        }

        System.out.println("Numeros posiiitov");
        System.out.println(nPositivos);
        System.out.println();
        System.out.println("_Negativios:");
        System.out.println(nNegativos);

        System.out.print("Suma: ");

        int suma = 0;

        for (Integer e : nNegativos) {
            suma += e;
        }

        for (Integer e : nPositivos) {
            suma += e;
        }

        System.out.print(" " + suma);

        Integer[] listaP = nPositivos.toArray(new Integer[0]);
        System.out.println();
        Collection<Integer> nuevaL = new ArrayList<>(Arrays.asList(listaP));
        System.out.println("Listya P ");
        System.out.println(nuevaL);
    }
}
