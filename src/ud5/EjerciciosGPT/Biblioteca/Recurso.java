package ud5.EjerciciosGPT.Biblioteca;

public abstract class Recurso {
    String titulo;
    String autor;

    
    public Recurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract void mostrarDetalles();
}
