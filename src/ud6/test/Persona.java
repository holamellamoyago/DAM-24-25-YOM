package ud6.test;

import java.util.*;

public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
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
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }







    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe");

        Set<Persona> personas1 = new HashSet<>(Set.of(p1));
        Set<Persona> personas2 = new HashSet<>(Set.of(new Persona("Pepe")));

        System.out.println(personas1.equals(personas2));

        List<Persona> personas = new ArrayList<>();
        
        
        Iterator<Persona> it = personas1.iterator();
        Iterator<Persona> it2 = personas2.iterator();

        System.out.println(it.next().equals(it2.next()));
    }
}
