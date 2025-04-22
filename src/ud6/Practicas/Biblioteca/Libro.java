package ud6.Practicas.Biblioteca;

public class Libro implements Comparable<Libro>{
    final String titulo;
    String autor;
    int año;

    public Libro(String titulo, String autor, int anhoPublicacion) {
        this.autor = autor;
        this.año = anhoPublicacion;
        this.titulo = titulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.titulo);
    }

    

}
