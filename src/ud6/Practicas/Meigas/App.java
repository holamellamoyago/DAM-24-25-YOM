package ud6.Practicas.Meigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.event.ListSelectionEvent;

public class App {
    public static void main(String[] args) {
        String[] ingredientes1 = { "auga de río encantada", "pétalos de rosa silvestre", "fume de lareira" };
        Feitizo f1 = new Feitizo("Maldición de la programaciçon", new String[] { "Ordenadores" }, 3);
        Feitizo[] feitizos = new Feitizo[] { f1 };

        Meiga m1 = new Meiga("Marçia", 100, Feitizo.crearFeitizosExemplo());
        Meiga m2 = new Meiga("Oscar", 50, feitizos);

        // System.out.println("Ingredientes unicos: ");
        // System.out.println(ingredientesUnicos(new Meiga[]{m1,m2}));

        // Sugerir un nuevo hechizo a aprtir de un ingreidente que no tenga en sus
        // favoritos
        System.out.println("Hechizo recomendado: ");
        System.out.println(listadoFeitizos(ingredientes1));

    }

    static Set<String> ingredientesUnicos(Meiga[] meigas) {
        Set<String> listaIngredientesUnicos = new TreeSet<>();

        for (int i = 0; i < meigas.length; i++) {
            Iterator<Feitizo> it = meigas[i].feitizosFavoritos.iterator();
            while (it.hasNext()) {

                listaIngredientesUnicos.addAll(it.next().ingredientes);

            }
        }

        return listaIngredientesUnicos;
    }

    static List<Feitizo> listadoFeitizos(String[] ingredientes) {

        // Iterator it = listaFeitizos.iterator();
        List<Feitizo> listaFeitizosDisponible = new ArrayList<>();
        List<Feitizo> listaFeitizos = Arrays.asList(Feitizo.crearFeitizosExemplo());

        for (int i = 0; i < ingredientes.length; i++) {
            Feitizo feitizo = listaFeitizos.get(i);
            if (feitizo.ingredientes.containsAll(Arrays.asList(ingredientes))) {
                listaFeitizosDisponible.add(feitizo);
            }
        }

        return listaFeitizosDisponible;

    }

    static Ingrediente listarIngredientes(Meiga[] m) {
        Map<String, Integer> mapa = new TreeMap<>();
        int contaodr = 0;

        for (Meiga e : m) {
            for (Feitizo f : e.feitizosFavoritos) {
                for (String i : f.ingredientes) {
                    if (mapa.containsKey(i)) {
                        mapa.compute(i, (a, b) -> b++);
                    } else {
                        mapa.put(i, 1);
                    }
                    mapa.put(i, contaodr++);
                }
            }
        }

    }

    // static Feitizo recomendarFeitizo(Meiga m ){

    // }

}
