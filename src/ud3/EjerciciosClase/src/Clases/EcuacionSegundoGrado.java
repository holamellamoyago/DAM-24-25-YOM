package Clases;


public class EcuacionSegundoGrado {
    private int a;
    private int b;
    private int c;

    public EcuacionSegundoGrado(int a, int b, int c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }

    double raizCuadrada() {
        double resultado;

        resultado = (Math.pow(b, 2)) - 4 * a * c;

        return resultado;
    }

    double realizarEcuacionPositiva() {
        double resultado = 0;
        double raizCuadrada;

        raizCuadrada = Math.sqrt(raizCuadrada());

        if (raizCuadrada() < 0) {
            throw new ArithmeticException("No tiene soluciones reales.");
        }

        resultado = (-b + raizCuadrada) / (2 * a);
        return resultado;

    }

    double realizarEcuacionNegativa() {
        double resultado = 0;
        double raizCuadrada;

        raizCuadrada = Math.sqrt(raizCuadrada());

        if (raizCuadrada() < 0) {
            throw new ArithmeticException("No tiene soluciones reales.");
        }

        resultado = (-b - raizCuadrada) / (2 * a);
        return resultado;

    }

    public void resultado() {
        System.out.println("Positiva: " + realizarEcuacionPositiva());
        System.err.println("Negativa: " + realizarEcuacionNegativa());
    }


}
