package ud3.Apuntes.Ejerciciosmath;
import java.util.Scanner;
// Solicita al usuario que ingrese el radio de un círculo y calcula su área y su perímetro utilizando Math.PI y Math.pow(). Suponiendo que el radio sea el de una esfera, calcula también su volumen usando la fórmula:

public class Circulo {

    private static double calcularAreaCirculo(int radio){
        // Para calcular el área de un circulo hay que hacer A= PI * Radio^2
        return Math.PI * (Math.pow(radio, 2));
    }

    private static double calcularPerimetro(int radio){
        // Para calcular el perimetro de un circulo hay que hacer 2 * PI * R

        return 2.0 * Math.PI * radio;
    }

    private static double calcularVolumen(int radio){
        // Para calcular el volumen de una esfera , suponiendo que el radio es el de esta misma deberemos hacer
        // V = 4 / 3 * PI * R^3



        return 4.0 / 3.0 * Math.PI * (Math.pow(radio, 3));
    }

    //TODO IMPORTANTE, PASAR TODOS LOS ENTEROS A DECIMALES


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio");
        int radio = sc.nextInt();
        System.out.printf("%.2f",calcularAreaCirculo(radio));
        System.err.println();
        System.out.println(calcularPerimetro(radio));

        System.out.println("Voluemn de una esfera: ");
        System.out.println(calcularVolumen(20));

        System.out.println(Math.pow(radio, 3));



    }
}
