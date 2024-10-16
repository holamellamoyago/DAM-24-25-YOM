package ud1.ejercicio_examen;

import java.util.Scanner;

// Diseña un programa que lea una medida de peso en kilogramos y la devuelva en libras. Una libra equivale a 0.453592 kilogramos. Redondear a 2 decimales.

public class kilosAlibras {
    public static void main(String[] args) {
        System.out.println("Cuantos kilogramos tienes");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble();
        sc.close();

        final double LIBRA = 0.453592;

        double resultado = peso / LIBRA;

        System.out.println(resultado);
    }
}
