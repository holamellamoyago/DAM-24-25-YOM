package ud1.ejercicio_examen;

import java.util.Scanner;

public class EP0132_ConversionArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad en áreas:");
        double area = sc.nextDouble(); sc.nextLine();

        System.out.println("Cual es la unidad de origen? hectarea , metro cuadrado, pies cuadrados");
        char unidadOrigen = sc.nextLine().charAt(0);

        System.out.println("Cual es la unidad de salida? hectarea , metros cuadrados o pies cuadrados");
        char unidadSalida = sc.nextLine().charAt(0);

        double totalMetrosCuadrados = unidadOrigen == 'h' ? area * 10000 : unidadOrigen == 'p' ? area * 10.7639 : area;
        

        double resultado = unidadSalida == 'h' ? totalMetrosCuadrados / 10000 : unidadSalida == 'p' ? totalMetrosCuadrados / 10.7639 : totalMetrosCuadrados;

        System.out.println("El resultado son: " + resultado + unidadSalida);

        sc.close();
        

    }
}
