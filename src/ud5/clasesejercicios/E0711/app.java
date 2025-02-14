package ud5.clasesejercicios.E0711;

public class app {
    public static void main(String[] args) {
        Listas lista = new Listas();
        Listas lista2 = new Listas();

        Integer[] lista3 = {9,8};


        lista.insertarNumeroFinal(3);
        lista.insertarNumeroFinal(5);
        lista.insertarNumeroPrincipio(2);
        lista.insertarNumeroIndicice(33, 1 );

        lista2.insertarNumeroFinal(9);
        lista2.insertarNumeroFinal(8);

        lista.insertarLista(lista3);

        System.out.println(lista);
    }
}
