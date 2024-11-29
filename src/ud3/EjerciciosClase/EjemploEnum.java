package ud3.EjerciciosClase;
import java.util.Scanner;
public class EjemploEnum {

    public static void main(String[] args) {
        DiaDeLaSemana hoy;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que día de la semana es mañana?");
        hoy = DiaDeLaSemana.valueOf(sc.nextLine());


        if (hoy == DiaDeLaSemana.SABADO) {
            System.out.println("Fin de semana");
        }
    }

    
}
