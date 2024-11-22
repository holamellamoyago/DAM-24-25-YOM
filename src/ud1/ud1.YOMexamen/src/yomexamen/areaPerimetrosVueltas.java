/*
    Yago Otero Martinez

    2. Área, Perímetro y Vueltas (6p) - 

 * Diseña un programa que calcule el área y el perímetro de un terreno con la forma de la
figura a partir de los datos de largo y ancho que se introducirán por teclado en metros.
Utiliza para los cálculos las fórmulas de área y perímetro de un círculo:
Área círculo = 𝑃𝐼 𝑥 𝑅
2
Perímetro círculo = 2 𝑥 𝑃𝐼 𝑥 𝑅
Siendo 𝑅 el radio del círculo
En dicho terreno se pretende organizar una media maratón, es decir, una carrera en la que
los participantes deberán correr una distancia de 21.097 metros. El programa deberá
calcular y mostrar el número de vueltas completas que deberán dar los participantes y el
número de metros “sobrantes” redondeando hacia arriba.
 * 
 */
package yomexamen;

 import java.util.Scanner;

public class areaPerimetrosVueltas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = Math.PI;

        System.out.println("Introduce el largo en metros");
        double largo = sc.nextDouble();

        System.out.println("Introduce el ancho en metros");
        double ancho = sc.nextDouble();

        double radioCiruclo = ancho / 2;
        sc.close();



        double areaCirculo = PI * Math.pow(radioCiruclo, 2);
        System.out.printf("El area de los dos medio circulo es: %.2f", areaCirculo );


        double perimetroCirculo = 2 * PI * radioCiruclo;
        System.out.printf("\nEl perimetro del circulo es: %.2f", perimetroCirculo);

        double areaRectangulo = largo * ancho - perimetroCirculo;
        System.out.printf("\nEl área del rectangulo es: " + areaRectangulo);
        double areaTotal = areaCirculo + areaRectangulo;
        System.out.printf("\nEl área total del rectangulo mas del circulo es: %.2f",areaTotal);


        double vueltasMaraton = areaTotal / 21097;
        double vueltasSobrante= areaTotal % 21097;

        System.out.printf("\nPuedes dar  %.0f vueltas  y te sobran metros %.2f", vueltasMaraton, vueltasSobrante);
    }
}
