package Ejercicios;
import java.util.Scanner;

public class E0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta dos números : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if (n1 > n2) {
            System.out.println(n1 + " " + n2);
        } else{
            System.out.println(n2 + " " + n1);
        }
    }
}
