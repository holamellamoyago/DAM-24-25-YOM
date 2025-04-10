package ud6.Practicas;

import java.util.Map;
import java.util.TreeMap;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new TreeMap<>();

        diccionario.put("Coño", "Coño morenote");

        System.out.println(diccionario);
    }
}
