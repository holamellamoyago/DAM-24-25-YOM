package ud2.ejemplos;
import java.util.Scanner;

public class EjemploIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota: ");
        int nota = sc.nextInt();
        sc.close();

        if (nota % 2 == 0) {
            System.out.println("Es par");
        } else{
            System.out.println("Impar");
        }
    }
}
