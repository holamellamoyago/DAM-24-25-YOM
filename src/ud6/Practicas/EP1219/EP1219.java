package ud6.Practicas.EP1219;

import java.util.*;

public class EP1219 {
    public static void main(String[] args) {
        String s = "Hola mundo Hola";

        List<String> l = new ArrayList<>(Arrays.asList(s.split(" ")));
        


        Map<String, Integer> contador = new TreeMap<>();

        for (String e : l) {
            if (contador.containsKey(e)) {
                int comoding = contador.get(e);
                contador.put(e, comoding+1);
            } else{
                contador.put(e, 1);
            }
        }

        System.out.println("Palabras repetidas: ");
        List<String> noRepetidos = new ArrayList<>();
        for (String e : contador.keySet()) {
            if (contador.get(e) > 1 ) {
                System.out.println(e);
            } else{
                noRepetidos.add(e);
            }
        }

        System.out.println("Palabras NO repetidas: ");
        System.out.println(noRepetidos);
        

        // System.out.println(l);
    }
}
