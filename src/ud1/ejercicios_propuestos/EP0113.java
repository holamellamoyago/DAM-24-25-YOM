package ud1.ejercicios_propuestos;

 import java.util.Scanner;


public class EP0113 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de A");
        double coeficientea = sc.nextDouble();

        System.out.println("Introduce el valor de B");
        double coeficienteb = sc.nextDouble();

        System.out.println("Introduce el valor de C");
        double coeficientec = sc.nextDouble();

        System.out.println("Introduce el valor de X");
        double coeficientex = sc.nextDouble();

        //double potencia = Math.pow(coeficientea * coeficientex, 2);

        double y = coeficientea * Math.pow(coeficientex, 2) + coeficienteb * coeficientex + coeficientec;

        System.out.println(y);

        //System.out.println(Math.pow(coeficientea * coeficientex, 2));

        sc.close();
    }
}
