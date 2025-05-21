package ud6.yomexamenrec.musicollab;
import java.util.*;

// Yago Otero Martínez

public class Musico implements Comparable<Musico> {
    String nombre;
    String alias;
    List<String> instrumentos;
    Set<Cancion> repertorio;

    


    public Musico(String nombre, String alias, List<String> instrumentos, Set<Cancion> repertorio) {
        this.nombre = nombre;
        this.alias = alias;
        this.instrumentos = instrumentos;
        this.repertorio = repertorio;
    }

    public Musico(String nombre, String alias){
        this(nombre, alias, new ArrayList<>(), new TreeSet<>());
    }

    




    @Override
    public String toString() {
        return alias + " " + nombre + ": " + instrumentos; 
    }

    @Override
    public int compareTo(Musico o) {
        return alias.compareTo(o.alias);
    }
    
}