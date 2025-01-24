package For;
import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, edad = 0;
        
        for(int i = 1; i<11; i++){
            System.out.println("Dime la edad " + i);
            edad = sc.nextInt();

            contador = edad+contador;
        }

        System.out.println("La media de la edad es: " + (contador / 10));
        sc.close();
    }
}
