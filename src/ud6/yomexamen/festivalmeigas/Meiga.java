package ud6.yomexamen.festivalmeigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Yago Otero Martínez

public class Meiga implements Comparable<Meiga> {
    // Atributos
    private String nome;
    private String alcume;
    private List<Feitizo> feitizos;
    private Map<String, Integer> inventario;

    // Constructores
    public Meiga(String nome, String alcume, Collection<Feitizo> feitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
        this.feitizos = new ArrayList<Feitizo>(feitizos);
        this.inventario = inventario;
    }

    

    public String getAlcume() {
        return alcume;
    }



    public Map<String, Integer> getInventario() {
        return inventario;
    }



    public String getNome() {
        return nome;
    }



    @Override
    public String toString() {

        feitizos.sort((a, b) -> a.getDificultade() - b.getDificultade());

        Collection<String> inventarioSet = new TreeSet<>();
        inventarioSet.addAll(inventario.keySet());

        String f1 = nome + " (" + alcume + ")\n";
        String f2 = "Feitizos: " + feitizos;
        String f3 = "\n" + inventarioSet.toString();

        return f1 + f2 + f3;
    }

    // EXEMPLO DE USO
    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        String[] nomes = { "Uxía", "Lúa", "Iria", "Noa" };
        String[] alcumes = { "A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema" };

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para
            // asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada
            // un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

    

    public List<Feitizo> getFeitizos() {
        return feitizos;
    }

    static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizos) {
        // Gentea un sublista aleatoria de Feitizo
        List<Feitizo> feitizosRnd = new ArrayList<>(feitizos);
        Collections.shuffle(feitizosRnd);
        // Selecciona un número aleatorio de feitizos entre 1 e o tamaño da lista
        int numFeitizos = new Random().nextInt(feitizosRnd.size()) + 1;
        // Crea unha sublista con ese número de feitizos aleatorios
        List<Feitizo> subFeitizos = feitizosRnd.subList(0, numFeitizos);
        // Retorna a sublista como un Collection<Feitizo>
        return new ArrayList<>(subFeitizos);
    }

    static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientes, int i) {
        // Gentea un mapa aleatorio de ingredientes e cantidades
        Map<String, Integer> inventario = new java.util.HashMap<>();
        List<String> ingredientesRnd = new ArrayList<>(ingredientes);
        Collections.shuffle(ingredientesRnd);
        // Selecciona un número aleatorio de ingredientes entre 1 e o tamaño da lista
        int numIngredientes = new Random().nextInt(ingredientesRnd.size()) + 1;
        // Crea un mapa con ese número de ingredientes aleatorios e cantidades entre 1 e
        // 5
        for (int j = 0; j < numIngredientes; j++) {
            String ingrediente = ingredientesRnd.get(j);
            int cantidade = new Random().nextInt(5) + 1;
            inventario.put(ingrediente, cantidade);
        }
        return inventario;
    }

    public static void main(String[] args) {
        System.out.println("\nMEIGAS DE EXEMPLO:");
        System.out.println("====================\n");
        // Crear un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());
        Arrays.sort(meigasExemplo);
        // Mostrar as meigas de exemplo
        for (Meiga meiga : meigasExemplo) {
            System.out.println(meiga);
            System.out.println();
        }

        // Lanzar feitizos de exemplo
        System.out.println(meigasExemplo[0].alcume + " lanzando feitizos de exemplo:");
        meigasExemplo[0].lanzarFeitizos();
    }

    @Override
    public int compareTo(Meiga o) {
        return alcume.compareTo(o.alcume);
    }

    int lanzarFeitizos() {
        int suma = 0;

        feitizos.sort((a, b) -> -a.getDificultade().compareTo(b.getDificultade()));
        System.out.println(feitizos);

        // I es el recorrido de los hechizos
        // J recorro los ingredientes de cada hechizo
        // Compruebo que haya los suficientes ingredientes , si los hay lo sumo y resto
        // una unidad

        for (int i = 0; i < feitizos.size(); i++) {
            boolean lanzado = false;
            List<String> ingredientesIndividual = new ArrayList<>();
            ingredientesIndividual.addAll(feitizos.get(i).ingredientes);
            for (int j = 0; j < ingredientesIndividual.size(); j++) {
                if (inventario.containsKey(ingredientesIndividual.get(j))
                        && inventario.get(ingredientesIndividual.get(j)) > 0) {
                    // Si que lo tiene en el inventario
                    // Si qu está y hay unidades
                    // Se lanza el hechizo
                    int comodin = inventario.get(ingredientesIndividual.get(j));

                    suma += feitizos.get(i).getDificultade();
                    inventario.put(ingredientesIndividual.get(j), comodin - 1);

                    if (inventario.get(ingredientesIndividual.get(j)) <= 0) {
                        inventario.remove(ingredientesIndividual.get(j));
                    }

                    lanzado = true;

                } else {

                }

            }

            if (lanzado) {
                System.out.println("-> Lanzado o feitizo: " + feitizos.get(i));

            } else {
                System.out.println("-X non ten ingredientes suficientes para lanzar o feitizo: " + feitizos.get(i));
            }

        }

        return suma;
    }

    // Segundo

    // public boolean lanzarFeitizo(Feitizo f) {
    // for (String e : f.ingredientes) {
    // if (inventario.containsKey(e) && inventario.get(e) > 0) {
    // int comodin = inventario.get(e);
    // inventario.put(e, comodin - 1);

    // System.out.println(nome + " lanzó " + f.nome);
    // } else {
    // System.out.println(nome + " fallo en el hechizo por falta de ingredientes");
    // return false;
    // }
    // }

    // return true;
    // }

}
