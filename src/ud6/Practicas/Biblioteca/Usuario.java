package ud6.Practicas.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Comparable<Usuario> {
    final String id;
    String nombre;
    List<Libro> librosPrestados = new  ArrayList<>();
    // Porque tenemos que hacer un List si 
    // esta no controla que haya duplicados , 
    // un usuaroi no puede coger el mismo dos veces..., no ? 

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    void prestarLibro(Libro l){
        if (l != null) {
            librosPrestados.add(l);
        }
    }

    void devolverLibro(Libro l) {
        librosPrestados.remove(l);
    }

    @Override
    public int compareTo(Usuario o) {
        return this.librosPrestados.size()-o.librosPrestados.size();
    }

    @Override
    public String toString() {
        return id + ", " + nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

    


    
}
