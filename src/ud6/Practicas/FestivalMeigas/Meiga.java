package ud6.Practicas.FestivalMeigas;

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
    int alcumeMax;
    Set<Feitizo> listaFeitizos;
    Map<String, Integer> inventario;

    // Constructores

    public Meiga(String nome, int alcumeMax, Set<Feitizo> listaFeitizos, Map<String, Integer> inventario) {
        this.nome = nome;
        this.alcumeMax = alcumeMax;
        this.listaFeitizos = listaFeitizos;
        this.inventario = inventario;
    }

    public Meiga(String nome, int alcumeMax){
        this(nome, alcumeMax, new TreeSet<>(), new TreeMap<>());
    }
    


    // Métodos



    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();
    
        String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
        String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};
    
        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);
    
            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }


}
