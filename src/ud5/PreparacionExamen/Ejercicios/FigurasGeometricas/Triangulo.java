package ud5.PreparacionExamen.Ejercicios.FigurasGeometricas;

public class Triangulo extends Figura implements Calculos {
    int lado1, lado2, lado3;

    public Triangulo(String nombre, String color, int lado1, int lado2, int lado3) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Triangulo");
    }

    @Override
    public double calcularArea() {

        int s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

    }

    @Override
    public double calcularPerimetro() {

        return lado1 + lado2 + lado3;
    }

}
