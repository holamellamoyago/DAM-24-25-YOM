package ud6.yomRecuperacion.Aventurero;

import java.util.*;

public class Mision implements Comparable<Mision> {
    private String nombre;
    private int dificultad; // 1-10
    private List<String> requisitos; // Habilidades necesarias

    public Mision(String nombre, int dificultad, List<String> requisitos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.requisitos = requisitos;
    }



    
    // Constructor, getters, setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public static void main(String[] args) {
        Mision m = new Mision(
                "Templo de lava", 9,
                Arrays.asList("Magia de fuego", "Resistencia"));
        


        Aventurero a1 = new Aventurero("Yago", "clase", 50, List.of("Magia de fuego", "Resistencia"));
        Aventurero a2 = new Aventurero("Yago2", "clase", 50, List.of("Magia de agua"));

        System.out.println(m.capacesHacerMision(List.of(a1,a2)));



    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mision other = (Mision) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public List<Aventurero> capacesHacerMision(List<Aventurero> aventureros){
        List<Aventurero> aCapaces = new ArrayList<>();
        for (Aventurero e : aventureros) {
            if (e.getHabilidades().containsAll(requisitos)) {
                aCapaces.add(e);
            }
        }


        return aCapaces;
    }

    @Override
    public int compareTo(Mision o) {
        return dificultad - o.dificultad;

    }
}
