package ud6.yomexamen.festivalmeigas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

// Yago Otero Martínez

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());
        Map<Integer, Meiga> puntuaciones = new TreeMap<>();

        // TODO: Ordena as Meigas de menor a maior número de feitizos
        List<Meiga> meigasOrdenadas = new ArrayList<>(List.of(meigasExemplo));
        meigasOrdenadas.sort((a, b) -> a.getFeitizos().size() - b.getFeitizos().size());

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");


            puntuaciones.put(puntos, meiga);

        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        for (int i = 0; i < puntuaciones.size(); i++) {
            Meiga m = puntuaciones.get(i);

            List<Integer> listaPuntuaciones = new  ArrayList<>();
            listaPuntuaciones.addAll(puntuaciones.keySet());
            


            String fr1 = m.getNome() + ": " + m.getAlcume() + " : " + listaPuntuaciones.get(i);
            System.out.println(fr1);
        }
        // TODO: Engade o código que necesites...

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
