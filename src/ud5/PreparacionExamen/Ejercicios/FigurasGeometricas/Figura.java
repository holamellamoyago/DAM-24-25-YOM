package ud5.PreparacionExamen.Ejercicios.FigurasGeometricas;

public abstract class Figura {
    String nombre, color;

    abstract void mostrarDetalles();

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    
}
