package Ejercicios;
import java.util.Scanner;
public class E0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta dos números distintos: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if (n1 == n2) {
            System.out.println("Son iguales, no válidos.");
        } else if(n1 > n2){
            System.out.println("El número " + n1 + "es mayor que " + n2);
        } else{
            System.out.println("El número " + n2 + "es mayor que " + n1);
        }
    }
}
