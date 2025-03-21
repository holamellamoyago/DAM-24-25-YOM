package ud6.ApuntesGenericos;

import java.util.Arrays;

import ud5.ApuntesHerencia.Persona;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null)
                cont++;
        return cont;
    }

    // Implementar un método genérico estático que realice la
    // inserción de un objeto al final de una tabla, ambos del mismo tipo genérico,
    // que se pasan
    // como parámetros. Devuelve una nueva tabla con el resultado de la inserción.

    public static <U> U[] add(U e, U[] t) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;

        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {
        boolean bandera = false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {

                if (t[i].equals(e)) {
                    bandera = true;
                }
            }

        }
        return bandera;

    }

    public static <U> boolean buscar2(U e, U[] t) {
        boolean bandera = false;
        for (U u : t) {
            if (u != null) {
                if (u.equals(e)) {
                    bandera = true;
                }
            }
        }
        return bandera;

    }



    public static <U> U[] concatenar(U[] t1, U[] t2) {
        for (int i = 0; i < t2.length; i++) {
            t1 = Arrays.copyOf(t1, t1.length + 1);
            t1[t1.length - 1] = t2[i];

        }
        return t1;
    }

    public static <U,V> Object[] concatenarObjectos(U[] t1, U[] t2){
        Object[]  l = new Object[0];
        for (int i = 0; i < t1.length; i++) {
            l = Arrays.copyOf(l, l.length+1);
            l[l.length-1] = t1[i];
        }

        for (int i = 0; i < t2.length; i++) {
            if (t2[i] !=null) {
                l = Arrays.copyOf(l, l.length+1);
                l[l.length-1] = t2[i].toString();
            }
        }

        return l;
    }

    public static void main(String[] args) {
        Integer[] numeros = { 3, 5, 8, null, 2, null };
        Persona[] personas = { new Persona("Pepe"), null, new Persona("María") };

        System.out.println(numeroDeNulos(numeros));
        System.out.println(numeroDeNulos(personas));

        numeros = add(7, numeros);
        System.out.println(Arrays.toString(numeros));
        personas = add(new Persona("Juancho"), personas);
        System.out.println(Arrays.toString(personas));

        System.out.println("Hay un 8 en números? " + buscar(8, numeros));
        System.out.println("Hay un 6 en números? " + buscar(6, numeros));

        System.out.println("Está Pepe? " + buscar(new Persona("Pepe"), personas));

        Integer[] numeros2 = { 23, 45, 78, 23 };
        Integer[] masNumeros = concatenar(numeros, numeros2);
        System.out.println(Arrays.toString(masNumeros));
        System.out.println();

        System.out.println(Arrays.toString(concatenarObjectos(numeros, personas)));
    }
}