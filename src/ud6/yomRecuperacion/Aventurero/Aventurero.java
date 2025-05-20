package ud6.yomRecuperacion.Aventurero;

import java.util.*;

public class Aventurero implements Comparable<Aventurero>{
    private String nombre;
    private String clase; // Guerrero, Mago, Arquero, etc.
    private int nivel;
    private List<String> habilidades;

    public Aventurero(String nombre, String clase, int nivel, List<String> habilidades) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.habilidades = habilidades;
    }

    // Constructor, getters, setters

    

    public static void main(String[] args) {
        Aventurero a = new Aventurero(
                "Elara", "Maga", 8,
                Arrays.asList("Magia de fuego", "Curación", "Meditación"));
        System.out.println(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Aventurero o) {
        return nivel-o.nivel;
    }
}
