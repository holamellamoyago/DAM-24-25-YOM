package ud1.YOM20241008;

import java.util.Scanner;

public class EP0123_ConversionMasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double masaOrigen,masaDestino;
        byte unidadMedida;
        String medidaDestino;

        System.out.println("Intriduce la masa de origen");
        masaOrigen = sc.nextDouble();

        System.out.println("Introduce la unidad de medida de origen: (1 = Kilos, 2 = Libras)");
        unidadMedida = sc.nextByte();

        masaDestino = unidadMedida == 1 ? masaOrigen * 1000 / 453.592 : masaOrigen * 453.592 / 1000;

        medidaDestino = unidadMedida == 1 ? "Libras" : "Kilos";





        System.out.printf("La masa en la  medida de destino es: %.3f %s", masaDestino , medidaDestino);

        sc.close();
    }
}
