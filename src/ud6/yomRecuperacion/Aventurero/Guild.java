package ud6.yomRecuperacion.Aventurero;

import java.util.*;

public class Guild {
    private String nombre;
    private List<Aventurero> miembros;
    private List<Mision> misionesDisponibles;

    public Guild(String nombre, List<Aventurero> miembros, List<Mision> misionesDisponibles) {
        this.nombre = nombre;
        this.miembros = miembros;
        this.misionesDisponibles = misionesDisponibles;
    }

    public Guild(String nombre) {
        this(nombre, new ArrayList<>(), new ArrayList<>());
    }

    // Constructor, getters, setters

    public List<Aventurero> getMiembros() {
        return miembros;
    }

    public List<Mision> getMisionesDisponibles() {
        return misionesDisponibles;
    }

    public List<Aventurero> realizarMision(String mision) {
        List<Aventurero> aDispo = new ArrayList<>();
        List<Mision> mAEliminar = new ArrayList<>();

        for (Mision e : misionesDisponibles) {
            if (e.getNombre().equals(mision)) {
                aDispo = e.capacesHacerMision(miembros);

                if (aDispo.size() > 0) {
                    mAEliminar.add(e);
                }

            }
        }

        for (Aventurero e : aDispo) {
            int comodin = e.getNivel() + 1;
            e.setNivel(comodin);
        }

        misionesDisponibles.removeAll(mAEliminar);

        return aDispo;
    }

    public Aventurero aventureroMayor() {
        Map<Aventurero, Integer> contadorHabilidades = new HashMap<>();
        for (Aventurero e : miembros) {
            contadorHabilidades.put(e, e.getHabilidades().size());
        }

        List<Map.Entry<Aventurero, Integer>> lista = new ArrayList<>(contadorHabilidades.entrySet());
        lista.sort((a, b) -> a.getValue() - b.getValue());

        return lista.get(0).getKey();
    }

    public Map<String, List<Aventurero>> agruparClase() {
        Map<String, List<Aventurero>> mapa = new TreeMap<>();
        for (Aventurero e : miembros) {
            if (mapa.containsKey(e.getClase())) {
                mapa.get(e.getClase()).add(e);
            } else {
                mapa.put(e.getClase(), new ArrayList<>(List.of(e)));
            }

        }

        return mapa;
    }

    public static void main(String[] args) {
        Guild g = new Guild("Los Valientes");

        Aventurero a1 = new Aventurero("Thorin", "Guerrero", 10, Arrays.asList("Espada", "Resistencia", "Bloqueo"));
        Aventurero a2 = new Aventurero("Nym", "Maga", 9, Arrays.asList("Magia de hielo", "Curación", "Reflejos"));

        Mision m1 = new Mision("Curar al dragón herido", 7, Arrays.asList("Curación", "Magia de hielo"));

        g.getMiembros().addAll(Arrays.asList(a1, a2));
        g.getMisionesDisponibles().add(m1);

        System.out.println(g);

        System.out.println("Aventurero con mas habilidades: ");

    }
}
