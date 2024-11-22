package Ejercicios;
import java.util.Scanner;


public class E0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un día entre 1 y 7");
        int numeroDia = sc.nextInt();
        sc.close();

        String dia = switch(numeroDia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            default -> "Error";
        };

        System.out.println(dia);
    }    
}
