package ud6.Practicas.FestivalMeigas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ud6.Practicas.Meigas.Ingrediente;

public class Feitizo implements Comparable<Feitizo> {
    // Atributos
    protected String nome;
    Set<String> ingredientes;
    private Integer dificultade;

    // Constructores
    public Feitizo(String nome, String[] ingredientes, Integer dificultade) {
        this.nome = nome;
        // this.ingredientes = Arrays.asList(ingredientes);
        this.ingredientes = Set.of(ingredientes);
        this.dificultade = dificultade;
    }

    

    @Override
    public String toString() {
        return "Feitizo [nome=" + nome + "]";
    }



    // Otros métodos
    public static void main(String[] args) {
        Feitizo[] feitizos = crearFeitizosExemplo();
        System.out.println(ingredientesUnicos(List.of(feitizos)));

        String[] ingredientes = { "auga de río encantada", "pétalos de rosa silvestre", "fume de lareira",
                "auga do mar", "salicornia", "berberechos místicos", "po de estrela fugaz", "cinza de bidueiro" };

        System.out.println(feitizosPosibles(Set.of(ingredientes), List.of(crearFeitizosExemplo())));

    }

    public static Feitizo[] crearFeitizosExemplo() {
        String[] ingredientes1 = { "auga de río encantada", "pétalos de rosa silvestre", "fume de lareira" };
        String[] ingredientes2 = { "auga do mar", "salicornia", "berberechos místicos" };
        String[] ingredientes3 = { "raíz de toxo", "auga bendita", "po de estrela fugaz" };
        String[] ingredientes4 = { "auga de río encantada", "raíz de toxo", "pel de serpe" };
        String[] ingredientes5 = { "auga do mar", "po de estrela fugaz", "cinza de bidueiro" };
        String[] ingredientes6 = { "auga bendita", "pétalos de rosa silvestre", "brétema das fragas" };

        Feitizo f1 = new Feitizo("Encantamento da Chuvia Mansa", ingredientes1, 3);
        Feitizo f2 = new Feitizo("Invocación Mariña", ingredientes2, 4);
        Feitizo f3 = new Feitizo("Luz do Luar", ingredientes3, 2);
        Feitizo f4 = new Feitizo("Garda da Fraga", ingredientes4, 3);
        Feitizo f5 = new Feitizo("Respiro Oceánico", ingredientes5, 4);
        Feitizo f6 = new Feitizo("Bendición Floral", ingredientes6, 2);

        return new Feitizo[] { f1, f2, f3, f4, f5, f6 };
    }

    public static Collection<String> ingredientesUnicos(Collection<Feitizo> feitizos) {
        Set<String> ingredientesUnicos = new TreeSet<>();
        for (Feitizo feitizo : feitizos) {
            ingredientesUnicos.addAll(feitizo.ingredientes);
        }
        return ingredientesUnicos;
    }

    public boolean addIngrediente(String ingrediente) {
        return ingredientes.add(ingrediente) ? true  :false;
    }

    public boolean removeIngrediente(String ingrediente) {
        return ingredientes.remove(ingrediente) ? true: false;
    }

    public boolean cambiarIngrediente(String ingredienteViejo, String ingredienteNuevo) {
        Iterator<String> it = ingredientes.iterator();

        while (it.hasNext()) {
            if (it.next().equals(ingredienteViejo)) {
                it.remove();
                ingredientes.add(ingredienteNuevo);
                return true;
            }
        }

        return false;

    }

    public static List<Feitizo> feitizosUsanIngrediente(String ingrediente, Collection<Feitizo> feitizos) {
        List<Feitizo> feitizosUsando = new ArrayList<>();

        for (Feitizo e : feitizos) {
            Iterator<String> it = e.ingredientes.iterator();
            while (it.hasNext()) {
                if (it.next().equals(ingrediente)) {
                    feitizosUsando.add(e);
                }
            }
        }

        return feitizosUsando;

    }

    public static List<Feitizo> feitizosPosibles(Set<String> ingredientes, Collection<Feitizo> feitizos) {
        List<Feitizo> feitizosPosibles = new ArrayList<>();

        for (Feitizo feitizo : feitizos) {
            if (ingredientes.containsAll(feitizo.ingredientes))
                feitizosPosibles.add(feitizo);
        }

        return feitizosPosibles;
    }

    public static Map<String, Integer> ingredientesVecesUsados(Collection<Feitizo> feitizos) {
        Map<String, Integer> contadorIngredientes = new TreeMap<>();

        for (Feitizo e : feitizos) {
            for (String o : e.ingredientes) {
                if (contadorIngredientes.containsKey(o)) {
                    int comodin = contadorIngredientes.get(o);
                    contadorIngredientes.put(o, comodin+1);
                }else{
                    contadorIngredientes.put(o, 1);
                }
            }

        }

        return contadorIngredientes;
    }



    @Override
    public int compareTo(Feitizo o) {
       return  nome.compareTo(o.nome);
    }




}
