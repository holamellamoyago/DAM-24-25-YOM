package ud5.PreparacionExamen.Ejercicios.FigurasGeometricas;

public class Rectangulo extends Figura implements Calculos{
    double base,altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Base: " + base + ", Altura: " + altura);
        
    }

    @Override
    public double calcularArea() {
        
        return base* altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2* (base + altura);
    }
}
