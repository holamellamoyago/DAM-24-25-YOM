package ud6.ApuntesGenericos2.Ejercicios;

import java.util.Arrays;

import ud6.ApuntesGenericos2.Cliente;


public class E1201_MetodosGenericos {

    public static <U> U[] add(U e, U[] t){
        t = Arrays.copyOf(t, t.length+1);
        t[t.length-1] = e;

        return t;
    }

    public static <U> boolean buscar(U e, U[] t){
        for (int i = 0; i < t.length; i++) {
            if (t[i].equals(e)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Cliente c1 = new Cliente("PAco");
        Integer i1 = 1;

        Cliente[] clientes = {c1, new Cliente("Ernestio")};

        clientes = add(new Cliente("Yago"), clientes);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println(buscar(new Cliente("Yago"), clientes));




    }
}
