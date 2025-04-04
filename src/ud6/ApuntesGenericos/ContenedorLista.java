package ud6.ApuntesGenericos;

import java.util.Arrays;
import java.util.Comparator;

import ud6.ApuntesGenericos.Ejercicios.Pila;

public class ContenedorLista<T> implements Pila<T>, Cola<T>, Cola2<T> {
    public T[] objetos;

    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        for (int i = objetos.length - 1; i > 0; i--) {
            objetos[i] = objetos[i - 1];
        }
        objetos[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[0];
            for (int i = 0; i < objetos.length - 1; i++)
                objetos[i] = objetos[i + 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return valor;
    }

    T extraerDelFinal() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[objetos.length - 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        }
        return valor;
    }

    void ordenar() {
        /*
         * Generará una excepción si T no es Comparable
         * "T cannot be cast to class java.lang.Comparable"
         * Se puede arreglar indicando que T debe implementar Comparable
         * "T extends Comparable"
         */
        Arrays.sort(objetos);
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;

        for (U u : tabla) {
            if (u == null) {
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlPrincipio(4);
        System.out.println(lista);
        lista.ordenar();
        System.out.println(lista);
        System.out.println(lista.extraerDelPrincipio());
        System.out.println(lista);
        System.out.println(lista.extraerDelFinal());

        Pila<Integer> pila = lista;
        pila.apilar(5);
        System.out.println(pila.desapilar());

        Cola<Integer> cola = lista;
        cola.encolar(5); // 2, 3, 5
        System.out.println(cola.desencolar()); // Saco el 2, Quedan 3, 5


        Cola2<Integer> cola2 = lista;
        cola2.acoplar(3);

        System.out.println(cola);
        cola.encolar(99);
        lista.ordenar();
        System.out.println(lista);

        // 31-03
        System.out.println("\n31-03");
        lista.apilar(null);
        System.out.println(numeroDeNulos(lista.objetos));

        /*
         * ContenedorLista<Persona> listaP = new ContenedorLista<>(new Persona[0]);
         * listaP.insertarAlFinal(new Persona("Pepe"));
         * listaP.insertarAlFinal(new Persona("Maria"));
         * listaP.insertarAlFinal(new Persona("Lola"));
         * System.out.println(listaP);
         * 
         * listaP.ordenar();
         * 
         * System.out.println(listaP);
         */

        /*
         * ContenedorLista<Personaje> p = new ContenedorLista<>(new Personaje[0]);
         * p.insertarAlFinal(new Personaje("Pepe"));
         * p.insertarAlFinal(new Personaje("Maria"));
         * p.ordenar();
         */

    }

    @Override
    public void apilar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }

    @Override
    public void encolar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }

    T get(int indice) {
        return objetos[indice];
    }

    void ordenar(Comparator<T> c) {
        Arrays.sort(objetos, c.reversed());
    }

    @Override
    public T[] acoplar(T e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acoplar'");
    }

    @Override
    public T[] desAcoplar(T e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desAcoplar'");
    }

}
