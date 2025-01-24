package ud2.ejerciciosCondicionales;
import java.util.Scanner;
public class E0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta dos números : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else{
            System.out.println("No son iguales");
        }
    }
}
