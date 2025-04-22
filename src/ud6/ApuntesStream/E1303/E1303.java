package ud6.ApuntesStream.E1303;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ud6.apuntescolecciones.Cliente;

public class E1303 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Yago", 24);

        Saludo<String> saludoString;

        saludoString = new Saludo<String>() {
            @Override
            public String saludar(String str) {
                return "Hola " + str;
            }
        };

        saludoString = (str) -> {
            return "Hola " + str;
        };

        Saludo<Cliente> saludoCliente = (t) -> {
            return "Buenos días + " + t.getNombre();
        };

        saludoString.saludar("Pepe");
        saludoCliente.saludar(new Cliente("María"));

        String[] tString = { "Pepe", "María", "Marcos" };
        List<String> saludos = saludar(saludoString, tString);
        System.out.println(saludos);
        System.out.println("===========");

        Cliente[] clientes = { new Cliente("Pepe", 12), new Cliente("María", 46) };

        List<String> saludosClientes = saludar((t) -> "Que pasa, " + t.getNombre(), clientes);
        System.out.println(saludosClientes);

        System.out.println("============");
        Comparator<Cliente> compaEdad = new Comparator<Cliente>() {

            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getEdad() - o2.getEdad();
            }

        };

        System.out.println(max(clientes, compaEdad));

    }

    static <T> List<String> saludar(Saludo<T> s, T[] t) {
        List<String> saludos = new ArrayList<>();
        for (T e : t) {
            saludos.add(s.saludar(e));
        }

        return saludos;
    }

    static <T> T max(T[] t, Comparator<T> c) {

        T comodin = t[0];

        for (int i = 0; i < t.length; i++) {

            if (i != t.length - 1) {
                if (c.compare(t[i], t[i + 1]) > 1) {
                    comodin = t[i];
                }
            }

        }

        return comodin;
    }
}
