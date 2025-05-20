package ud6.yomRecuperacion.Competicion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Alquimista implements Comparable<Alquimista> {
    String nombre, apodo;
    Set<Pocion> recetasFavoritas;
    Map<String, Integer> inventarioIngredientes;

    public Alquimista(String nombre, String apodo, Set<Pocion> recetasFavoritas,
            Map<String, Integer> inventarioIngredientes) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.recetasFavoritas = recetasFavoritas;
        this.inventarioIngredientes = inventarioIngredientes;
    }

    public Alquimista(String nombre, String apodo) {
        this(nombre, apodo, new TreeSet<>(), new TreeMap<>());
    }

    public void añadirPocion(Pocion p) {
        recetasFavoritas.add(p);
    }

    public void añadirIngrediente(String n, Integer c) {
        inventarioIngredientes.put(n, c);
    }

    @Override
    public String toString() {
        String str1 = nombre + ",  " + apodo;

        Set<String> ingredientesOrdenadoos = new TreeSet<>();
        ingredientesOrdenadoos.addAll(inventarioIngredientes.keySet());

        Set<Pocion> pocionesFavoritasOrdenadas = new TreeSet<>();
        pocionesFavoritasOrdenadas.addAll(recetasFavoritas);

        return str1 + "\n" + pocionesFavoritasOrdenadas + "\n" + ingredientesOrdenadoos;

    }

    Comparator<Pocion> compPotenciaDesc = new Comparator<Pocion>() {

        @Override
        public int compare(Pocion o1, Pocion o2) {
            return o2.getNivelPotencia() - o1.getNivelPotencia();
        }

    };

    public int prepararPociones() {
        List<Pocion> recetasFavoritasDesc = new ArrayList<>();
        recetasFavoritasDesc.addAll(recetasFavoritas);
        recetasFavoritasDesc.sort(compPotenciaDesc);

        int totalPotencia = 0;

        for (Pocion e : recetasFavoritasDesc) {
            for (int i = 0; i < e.getIngredientes().size(); i++) {
                if (inventarioIngredientes.containsKey(e.getIngredientes().get(i))) {
                    int comodin = inventarioIngredientes.get(e.getIngredientes().get(i)) - 1;

                    if (comodin <= 0) {
                        inventarioIngredientes.remove(e.getNombre());
                    } else {
                        inventarioIngredientes.put(e.getNombre(), comodin);
                    }

                    totalPotencia += e.getNivelPotencia();

                    System.out.println("Se prepara la receta " + e.getNombre());
                } else {
                    System.out.println("No hay ingredientes suficientes para: " + e.getNombre());
                }
            }
        }

        return totalPotencia;
    }

    public int prepararPociones2() {
        List<Pocion> recetasFavoritasDesc = new ArrayList<>();
        recetasFavoritasDesc.addAll(recetasFavoritas);
        recetasFavoritasDesc.sort(compPotenciaDesc);

        int totalPotencia = 0;

        // 1. Recorro y cojo la primera receta favorita
        for (Pocion e : recetasFavoritasDesc) {
            // 2. Miro que ingredientes necesita
            List<String> ingredientesNecesarios = e.getIngredientes();
            List<String> ingredientesDisponibles = new ArrayList<>();
            ingredientesDisponibles.addAll(inventarioIngredientes.keySet());

            // 3. Miro si cada ingrediente esta en mi inventario
            if (ingredientesDisponibles.containsAll(ingredientesNecesarios)) {
                System.out.println("Si que tiene para la receta: " + e.getNombre());
                // 4. Ahora que sabe que si tiene los ingredientes sumo la potencia de cada uno
                // y los resto del mapa del inventario
                for (int i = 0; i < ingredientesNecesarios.size(); i++) {
                    // 4.1 como la cantidad de values restantes de cada ingrediente necesario
                    // Esto es así porqué yo no quiero coger un i (numero), quiro coger un
                    // ingrediente para quitarlo.

                    int comodin = inventarioIngredientes.get(ingredientesNecesarios.get(i));

                    if (comodin <= 0) {
                        inventarioIngredientes.remove(ingredientesNecesarios.get(i));
                    } else {
                        inventarioIngredientes.put(ingredientesNecesarios.get(i), comodin);
                    }
                }
            } else {
                System.out.println("No hay ingredientes suficientes para: " + e.getNombre());
            }

            totalPotencia += e.getNivelPotencia();
        }

        return totalPotencia;
    }

    public static void main(String[] args) {
        Alquimista a = new Alquimista("Luna", "Estelar");
        a.añadirPocion(new Pocion("Curación", Arrays.asList("hierba", "agua"), 2));
        a.añadirPocion(new Pocion("Explosión", Arrays.asList("polvo", "humo"), 4));
        a.añadirIngrediente("hierba", 1);
        a.añadirIngrediente("agua", 1);
        a.añadirIngrediente("polvo", 1);

        System.out.println(a);
        int puntos = a.prepararPociones2();
        System.out.println("Puntuación: " + puntos);
        System.out.println(a);
    }

    @Override
    public int compareTo(Alquimista o) {
        return nombre.compareTo(o.nombre);
    }

}
