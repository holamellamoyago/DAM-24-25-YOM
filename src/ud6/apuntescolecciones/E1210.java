package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import ud5.PreparacionExamen.InstanceOf.number;

public class E1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int rdm = new Random().nextInt(1,11);
        }

        Set<Integer> sinRepetidos = new TreeSet<>();
        sinRepetidos.addAll(lista);

        Set<Integer> elementosRepetidos = new TreeSet<>();
        for (Integer integer : elementosRepetidos) {
            if (lista.indexOf(integer) != lista.indexOf(integer)) {
                elementosRepetidos.add(integer);
            }
        }

        
    }

}
