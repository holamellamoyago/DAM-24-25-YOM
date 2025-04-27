package ud6.Practicas.FestivalMeigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Meiga {
    // Atributos
    String nome;
    String alcume;
    Set<Feitizo> listaFeitizos;
    Map<String, Integer> inventario;

    // Constructores

    public Meiga(String nome, String alcume, Set<Feitizo> listaFeitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
        this.listaFeitizos = listaFeitizos;
        this.inventario = inventario;
    }

    public Meiga(String nome, String alcume, Collection<Feitizo> listaFeitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcume = alcume;
        this.listaFeitizos = new TreeSet<>(listaFeitizos);
        this.inventario = inventario;
    }

    public Meiga(String nome, String alcume) {
        this(nome, alcume, new TreeSet<>(), new TreeMap<>());
    }

    // Métodos
    // TODO probar
    public boolean lanzarFeitizo(Feitizo f) {
        for (String e : f.ingredientes) {
            if (inventario.containsKey(e) && inventario.get(e) > 0) {
                int comodin = inventario.get(e);
                inventario.put(e, comodin - 1);

                System.out.println(nome + " lanzó " + f.nome);
            } else {
                System.out.println(nome + " fallo en el hechizo por falta de ingredientes");
                return false;
            }
        }

        return true;
    }

    public static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizos) {
        Collection<Feitizo> feitizosDevolver = new ArrayList<>();
        List<Feitizo> copiaFeitizos = new ArrayList<>(feitizos);

        int totalFeitizosDevolver = new Random().nextInt(feitizos.size() + 1);

        for (int i = 0; i < totalFeitizosDevolver; i++) {
            int feitizoRandom = new Random().nextInt(copiaFeitizos.size());

            feitizosDevolver.add(copiaFeitizos.get(feitizoRandom));
            copiaFeitizos.remove(feitizoRandom);
        }

        return feitizosDevolver;
    }

    public static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientes, int cantIngrediente){
        Map<String,Integer> ingredienteDevolver = new TreeMap<>();
        List<String> copiaIngredientes = new ArrayList<>(ingredientes);


        int totalIngredientesDevolver = new Random().nextInt(ingredientes.size()+1);

        
        for (int i = 0; i < totalIngredientesDevolver; i++) {
            int feitizoRandom = new Random().nextInt(copiaIngredientes.size());

            // ingredienteDevolver.add(copiaIngredientes.get(feitizoRandom));
            int cantidad = new Random().nextInt(cantIngrediente+1);

            ingredienteDevolver.put(copiaIngredientes.get(feitizoRandom), cantidad);
            copiaIngredientes.remove(feitizoRandom);
        }


        return ingredienteDevolver;
    }

    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();

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

}
