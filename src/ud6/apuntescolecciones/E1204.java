package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        Collection<Integer> collecionInteger = l;

        

        int nAnadir = 0;

        do {
            System.out.println("Que número te gustaría añadir?");
            nAnadir = sc.nextInt();

            if (nAnadir >= 0) {
                l = anadirNumero(l, nAnadir);
            }

        } while (nAnadir != -1);

        for (Integer integer : l) {
            System.out.println(integer);
        }


        mostrarPares(l);

        Iterator<Integer> it = collecionInteger.iterator();

        while (it.hasNext()) {
            nAnadir = it.next();

            if (nAnadir % 3 == 0) {
                it.remove();
            }
        }

        mostrar(collecionInteger);
        

        
    }

    static ArrayList<Integer> anadirNumero(ArrayList<Integer> l, int n){
        l.add(n);

        return l;
    }

    static void mostrar(Collection<Integer> l){
        for (Integer integer : l) {
            System.out.println(integer);
        }
    }

    static void mostrarPares(ArrayList<Integer> l){
        System.out.println("\n Sin múltiplos de 3");
        for (Integer integer : l) {
            if (integer %2 == 0) {
                System.out.println(integer);
            }
        }
    }
}
