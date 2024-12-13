package ud3.Apuntes.Ejerciciosmath;

public class Hipotenusa {

    // Calcular hipotenusa
    // Para hacer esto es:  Raiz cuadrada de a^2 + b^2
    private static double hipotenusa(double a, double b){

        double suma = Math.pow(a, 2) + Math.pow(b, 2);

        return Math.sqrt(suma);
    }

    public static void main(String[] args) {
        System.out.println(hipotenusa(20, 20));
        
    }
}
