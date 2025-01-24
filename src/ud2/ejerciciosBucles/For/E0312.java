package ud2.ejerciciosBucles.For;
import java.util.Scanner;
public class E0312 {
    public static void main(String[] args) {
        boolean suspenso = false;
        Scanner sc = new Scanner(System.in);

        for(int i  = 1; i<=5; i++){
            System.out.println("Dime la calificación " + i);
            int calificacion = sc.nextInt();

            if (calificacion < 5) {
                suspenso = true;
            }
        }

        if (suspenso) {
            System.out.println("Hay una nota suspensa");
        } else {
          System.out.println("todo aprobado");  
        }

        sc.close();
    }
}
