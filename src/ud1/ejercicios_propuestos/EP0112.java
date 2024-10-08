package ud1.ejercicios_propuestos;

import java.util.Scanner;

public class EP0112 {
    
    // Calcular el área de un triangulo
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base");
        final double base = sc.nextDouble();
        System.out.println("Introduce la altura");
        final double altura = sc.nextDouble();

        final double area = base *altura / 2;

        System.out.println("El área del triangulo teniendo en cuenta que la base es: " + base + "más la altura es : " + altura + "es un total de: " +  area );
        sc.close();
    }
}
