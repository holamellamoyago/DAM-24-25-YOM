package ud2.ejerciciosPropuestos;
import java.time.LocalTime;
import java.util.*;

public class E02018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 99;
        final int MIN = 1;
        int contador;


        // Lo que hace aquí es que genera un número maximo de 99 pero también un mínimo de 1 al sumarle el minimo , osea que si diera 0 el resultado daría igual el 1 por el hecho de que se le esta sumando 



        if (resultado == introducifdo) {
            System.out.println("Enhorabuena");
            // horafinal.toSecondOfDay() - hora1.toSecondOfDay();
            System.out.printf("Has tardado %d segundos %n", horafinal.toSecondOfDay() - hora1.toSecondOfDay());
        } else{
            System.out.println("Mal, eran " + resultado);
        }

        do {
            int n1 = (int)(Math.random() * MAX) + MIN;
            int n2 = (int)(Math.random() * MAX) + MIN;
    
            System.out.println("Cuanto es la suma de " + n1 + " con  " + n2);
            LocalTime hora1 = LocalTime.now();
    
            int introducifdo = sc.nextInt();
            LocalTime horafinal = LocalTime.now();
    
            int resultado = n1 + n2;

            System.out.println("Enhorabuena");
            System.out.printf("Has tardado %d segundos %n", horafinal.toSecondOfDay() - hora1.toSecondOfDay());

            contador++;

            
        } while (resultado == introducifdo);

        System.out.println("Mal, eran " + resultado);
        System.out.println("Acertaste: " + contador);



    }
}
