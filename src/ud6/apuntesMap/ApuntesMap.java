package ud6.apuntesMap;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class ApuntesMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();

        m.put("Yago", 180);
        m.put("Eva", 160);
        m.put("Yago", 190);
        m.remove("Eva");

        System.out.println(m.toString());

        m.clear();
        System.out.println(m);

        m.put("Eva", 160);
        System.out.println(m.get("Eva"));

        System.out.println(m.containsKey("Yago"));
        System.out.println(m.containsKey("Eva"));

        System.out.println(m.containsValue(160));

        // Vistas Collectios de los mapas
        System.out.println("\n  Vistas Collectios de los mapas");
        m.put("Pepe", 170);
        Set<String> s = m.keySet();
        System.out.println(s);

        

    }
}
