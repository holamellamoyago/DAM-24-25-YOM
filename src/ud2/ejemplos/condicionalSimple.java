package ud2.ejemplos;
import java.util.Scanner;

public class condicionalSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota: ");
        int nota = sc.nextInt();
        sc.close();

        if (nota >= 5) {
            System.out.println("Enhorabuena has aprobado");
        } 
        System.out.println("Hasta pronto");
    }
}
