package ud3.Apuntes.Ejerciciosmath;

public class InteresCompuesto {

    private static double calcularInteresCompuesto(double dinero, double tasa, int años){
        // Para calcular esto es MontoFinal=P(1 + (r / n))^n*t

        double exponente = 1*años;
        System.out.println(exponente);

        double parentesis = Math.pow((1+(tasa / 1)), exponente);
        System.out.println(parentesis);


        return dinero*parentesis;
        // Se debería retornar este resultado menos la cantidad de dinero inicial pero Ósca no pone nada.
    }

    public static void main(String[] args) {
        double dineroInicial = 20, tasa=0.05;
        int numAños=10;

        System.out.println(calcularInteresCompuesto(dineroInicial, tasa, numAños));


    }
}
