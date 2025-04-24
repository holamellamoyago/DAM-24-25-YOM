package ud6.Practicas.Meigas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Meiga {
    String nombre;
    int alcumeMax;
    Set<Feitizo> feitizosFavoritos = new HashSet<>();

    public Meiga(String nombre, int alcumeMax, Set<Feitizo> feitizosFavoritos) {
        this.nombre = nombre;
        this.alcumeMax = alcumeMax;
        this.feitizosFavoritos = feitizosFavoritos;
    }

    public Meiga(String nombre, int alcumeMax, Feitizo[] feitizosFavoritos) {
        Collection<Feitizo> feitizosFav = Arrays.asList(feitizosFavoritos);
        this.nombre = nombre;
        this.alcumeMax = alcumeMax;
        this.feitizosFavoritos.addAll(feitizosFav);
    }

    
}
