package ud6.ApuntesStream.E1301;

import java.util.ArrayList;
import java.util.List;

import ud6.apuntescolecciones.Cliente;

public class E1301 {
    public static void main(String[] args) {
        Cliente c = new Cliente("39511342x", "Yago", "11/02/2003", 3);
        
        Saludo<String> saludoString;

        saludoString = new Saludo<String>() {
            @Override
            public String saludar(String str) {
                return "Hola " + str;
            }
        };

        saludoString = (str) -> {return "Hola " + str;};

        Saludo<Cliente> saludoCliente = (t) -> {return "Buenos días + " + t.getNombre();};

        saludoString.saludar("Pepe");
        saludoCliente.saludar(new Cliente("María"));

        String[] tString = {"Pepe", "María", "Marcos"};
        List<String> saludos = saludar(saludoString, tString);
        System.out.println(saludos);
        System.out.println("===========");

        Cliente[] clientes = {new Cliente("Pepe"), new Cliente("María")};

        List<String> saludosClientes  = saludar((t) -> "Que pasa, " + t.getNombre(), clientes);
        System.out.println(saludosClientes);

    }

    static <T> List<String> saludar(Saludo<T> s, T[] t) {
        List<String> saludos = new ArrayList<>();
        for (T e : t) {
            saludos.add(s.saludar(e));
        }

        return saludos;
    }
}
