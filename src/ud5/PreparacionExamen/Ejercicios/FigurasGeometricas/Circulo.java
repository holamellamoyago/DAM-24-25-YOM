package ud5.PreparacionExamen.Ejercicios.FigurasGeometricas;

public class Circulo extends Figura implements Calculos {
    double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Radio: " + radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }

}
