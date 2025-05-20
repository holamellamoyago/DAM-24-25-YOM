package ud6.yomRecuperacion.Competicion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AppCompeticion {

    public static void main(String[] args) {
        Alquimista a1 = new Alquimista("Eva", "Sombramística");
        Alquimista a2 = new Alquimista("Noel", "Estrellabrava");

        Pocion p1 = new Pocion("Furia", Arrays.asList("polvo", "humo"), 4);
        Pocion p2 = new Pocion("Curación", Arrays.asList("agua", "hierba"), 2);
        Pocion p3 = new Pocion("Invisibilidad", Arrays.asList("luz", "aire"), 3);

        a1.añadirPocion(p1);
        a1.añadirPocion(p2);
        a1.añadirIngrediente("polvo", 1);
        a1.añadirIngrediente("humo", 1);
        a1.añadirIngrediente("agua", 1);
        a1.añadirIngrediente("hierba", 1);

        a2.añadirPocion(p2);
        a2.añadirPocion(p3);
        a2.añadirIngrediente("luz", 1);
        a2.añadirIngrediente("aire", 1);
        a2.añadirIngrediente("agua", 1);
        a2.añadirIngrediente("hierba", 1);

        Map<Alquimista,Integer> puntuaciones = new TreeMap<>();
        if (a1.recetasFavoritas.size() > a2.recetasFavoritas.size()) {
            puntuaciones.put(a1, a1.prepararPociones2());
            puntuaciones.put(a2, a2.prepararPociones2());
        } else{
            puntuaciones.put(a2, a1.prepararPociones2());
            puntuaciones.put(a1, a2.prepararPociones2());
        }

        System.out.println("Resultados por puntuación descendente: ");
        
        // Para hacerlo convertire un map en una lista donde así
        // podre ordenarlo . 

        List<Map.Entry<Alquimista,Integer>> puntuacionesOrdenadas = new ArrayList<>(puntuaciones.entrySet());
        puntuacionesOrdenadas.sort((a,b) -> b.getValue() - a.getValue());

        System.out.println(puntuacionesOrdenadas);





    }
}