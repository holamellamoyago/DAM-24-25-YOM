package ud5.PreparacionExamen.Ejercicios.FigurasGeometricas;

public class App {
    public static void main(String[] args) {
        Circulo c = new Circulo("Círculo A", "Rojo", 5.0);
        System.out.println(c.calcularArea()); // ~78.54
        Rectangulo r = new Rectangulo("Rectángulo B", "Azul", 4.0, 6.0);
        System.out.println(r.calcularPerimetro()); // 20.0
    }
}
