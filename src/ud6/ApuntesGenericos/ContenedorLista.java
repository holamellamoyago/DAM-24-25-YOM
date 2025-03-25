package ud6.ApuntesGenericos;

import java.util.Arrays;

public class ContenedorLista<T> {
    T[] objetos;

    public ContenedorLista(T[] t) {
        this.objetos = t;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length+1);
        System.arraycopy(objetos, 0, objetos, 1, 0);
        objetos[0] = nuevo;
    }


    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);

        objetos[objetos.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        return null;
    }

    T extraerDelFinal() {
        return null;
    };

    void ordenar() {
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>( new Integer[0]);
        lista.insertarAlFinal(1);
        lista.toString();
    }

    

}
