package ud7.yomexamen.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// Yago Otero Martínez

public class LogApache {
    public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<>();
        ArrayList<String> ips = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("bacharelato_access.log"))) {
            String linea = in.readLine();

            while (linea != null) {

                contarIPS(linea, ips);

                texto.add(linea);
                linea = in.readLine();
            }

            System.out.println("1. Numero total de accesos al servidor: " + texto.size());

            System.out.println("2. Numero de accesos errorneos: " + numerosErroneos(texto));

            System.out.println(
                    "\n3. Listado de las distintas direcciones IP registradas en el fichero y el número de veces" + //
                            "que aparece cada una, ordenadas de mayor a menor número de repeticiones.");

            mostrarIPSordenadas(ips);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void contarIPS(String linea, List<String> ips) {

        String ip = "";
        int contador = 0;
        Character c = linea.charAt(contador);
        while (c != '-') {
            contador++;
            ip += c;
            c = linea.charAt(contador);
        }
        ips.add(ip);

        // if (mapa.containsValue(ip)) {
        // int comodin = mapa.;
        // mapa.put(ip, comodin + 1);
        // } else {
        // mapa.put(ip, 1);
        // }
        // // System.out.println(ips);

    }

    public static void mostrarIPSordenadas(List<String> ips) {
        Map<String, Integer> mapa = new HashMap<>();

        for (String ip : ips) {
            if (mapa.containsKey(ip)) {
                int comodin = mapa.get(ip);
                mapa.put(ip, comodin + 1);
            } else {
                mapa.put(ip, 1);
            }

        }

        // System.out.println(ips);

        List<Entry<String, Integer>> mapaOrdenado = new ArrayList<>(mapa.entrySet());

        mapaOrdenado.sort((a, b) -> b.getValue() - a.getValue());

        for (Entry<String, Integer> entry : mapaOrdenado) {
            System.out.println("IP: " + entry.getKey() + ", " + entry.getValue() + " veces");
        }

    }

    public static int numerosErroneos(List<String> texto) {
        int contador = 0;

        for (String string : texto) {
            if (string.contains("404")) {
                contador++;
            }
        }

        return contador;

    }

}
