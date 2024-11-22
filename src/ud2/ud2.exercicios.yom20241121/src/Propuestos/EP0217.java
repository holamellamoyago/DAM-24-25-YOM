package Propuestos;
import java.time.LocalTime;
import java.util.Scanner;

public class EP0217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = (int)(Math.random() *10) +1;
        int n2 = (int)(Math.random() *10) +1;

        System.out.println("Bienvenido ... Cuanto es: " + n1 + " + " + n2);
        LocalTime hora1 = LocalTime.now();
        int solucion = n1+n2;
        int respuesta = sc.nextInt();

        LocalTime contadorFinalizado = LocalTime.now();
        LocalTime horafinal = LocalTime.now();


        if (respuesta == solucion) {
            System.out.println("Acertaste!");
        }   

        System.out.printf("Has tardado %d segundos %n", horafinal.toSecondOfDay() - hora1.toSecondOfDay());
        

    }
}
