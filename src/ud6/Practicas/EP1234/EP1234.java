package ud6.Practicas.EP1234;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EP1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Integer>> registros = new TreeMap<>();

    }

    static void anhadirRegistros(Map<String, List<Integer>> mapa, String dia, int registro) {

        if (mapa.containsKey(dia)) {
            mapa.get(dia).add(registro);
        } else {
            mapa.put(dia, new ArrayList<Integer>(List.of(registro)));
        }
    }
}
