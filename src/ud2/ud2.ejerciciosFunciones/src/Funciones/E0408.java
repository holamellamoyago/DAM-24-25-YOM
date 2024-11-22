package Funciones;

import java.util.Scanner;

public class E0408 {
    private static double calculadora(int n1, int n2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Otero, 1 sumar , 2restar , 3multiplicar, 4 dividir , escoge");
        int opcionEscogida = sc.nextInt();
        sc.close();

        switch (opcionEscogida) {
            case 1:return n1 + n2;
            case 2: return n1-n2;
            case 3: return n1*n2;
            case 4: return n1/n2;
            
            default:
            System.out.println("Escoge bien");
            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(calculadora(2213, 342));
        
    }
}
