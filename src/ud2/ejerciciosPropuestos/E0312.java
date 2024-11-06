package ud2.ejerciciosPropuestos;

// E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean haySuspensos = false;

        for (int i = 1; i < 5; i++) {
            System.out.println("Dame calificación" + i);
            int nota = sc.nextInt();
            if (nota < 5) {
                haySuspensos = true;
            }

        }

        if (haySuspensos) {
            System.out.println("Hay suspensos");
        } else{
            System.out.println("No hay suspensos");
        }

    }
}
