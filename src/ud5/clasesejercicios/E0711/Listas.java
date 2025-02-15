package ud5.clasesejercicios.E0711;

import java.util.Arrays;

public class Listas {
    Integer l[];

    public Listas() {
        l = new Integer[0];
    }

    public int numeroElementos() {
        return l.length;
    }

    public boolean insertarNumeroFinal(int n) {
        l = Arrays.copyOf(l, l.length + 1);

        l[l.length - 1] = n;

        return true;
    }

    public boolean insertarNumeroPrincipio(int n) {

        Integer l2[] = new Integer[l.length + 1];
        l2[0] = n;

        int comodin = l[l.length - 1];

        for (int i = 1; i < l.length; i++) {
            l2[i] = l[i - 1];
        }

        l2[l2.length - 1] = comodin;

        l = l2;

        return true;
    }

    public boolean insertarNumeroIndicice(int n, int indice) {
        l[indice] = n;

        return true;
    }


    public boolean insertarLista(Integer[] listaNueva) {

        int contador = 0;
        l = Arrays.copyOf(l, l.length+listaNueva.length-1);

        for (int i = l.length-1; i < l.length-1 + listaNueva.length-1; i++) {
            l[i] = listaNueva[contador];
            contador++;
        }

        return true;
    }

    // 7.
    public void eliminarNumero(int indice){
        l[indice] = null;
    }

    // 8.
    public int obetenerNumero(int indice){
        return l[indice];
    }

    // 9.
    public Integer buscarNumero(Integer numero){
        int posicion = -1;

        for (int i = 0; i < l.length; i++) {
            if (l[i] == numero) {
                posicion = i;
            }
        }

        return posicion;
    }

    

    @Override
    public String toString() {
        return "Lista" + Arrays.toString(l) + "";
    }

}
