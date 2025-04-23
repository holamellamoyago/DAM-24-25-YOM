package ud6.ApuntesStream.E1304;

import java.util.*;
import java.util.function.Predicate;

import ud6.apuntescolecciones.Cliente;

public class E1304 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new Random().nextInt(101);
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("Filtrando...");
        // Predicate<T> esPositivo = t -> t > t;

        Integer[] multiplos3 = filtrar(numeros, n-> n % 3 == 0);
        // System.out.println(Arrays.toString(multiplos3));

        List<Integer> listaNumeros = List.of(numeros);
        List<Integer> lista3 = filtrar(listaNumeros, x -> x % 3 == 0);
        System.out.println(lista3);

        System.out.println("Clientes");
        List<Cliente> clientes = Cliente.clientesDeEjemplo();
        System.out.println(clientes);

        System.out.println("Clientes mayores de edad: ");
    }
    
    

    static <T> T[] filtrar(T[] t, Predicate<T> p){
        // Instanciar tabla nueva
        // List<T> tabla = new ArrayList<>();
        T[] tn = Arrays.copyOf(t, 0);

        // Recorrer tabla original
        for (T o : t) {
            // Si el elemento cumple el predicado añadir a tabla nueva
            if (p.test(o)) {
                tn = Arrays.copyOf(tn, tn.length+1);
                tn[tn.length-1] = o;
            }
        }

        //Devolbver tabla nueva
        return tn;

    }

    static <T> List<T> filtrar(List<T> t, Predicate<T> p){
        // Instanciar tabla nueva
        List<T> tn = new ArrayList<>();
        

        // Recorrer tabla original
        for (T individual : t) {
            // Si el elemento cumple el predicado añadir a tabla nueva
            if (p.test(individual)) {
                tn.add(individual);
            }
        }

        //Devolbver tabla nueva
        return tn;

    }
}
