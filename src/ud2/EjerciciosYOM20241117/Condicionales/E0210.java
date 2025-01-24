package Condicionales;

import java.util.Scanner;

public class E0210 {
    public static void main(String[] args) {
        System.out.println("Introduce una nota: ");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        sc.close();

        String resultado = switch(nota){
            case 0,1,2,3,4 -> "Suspenso";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7,8 -> "notable";
            case 9,10 -> "sobresaliente";
            default -> "Error";
        };

        System.out.println("Su nota fue: " + resultado);
    }
}
