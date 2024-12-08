package ud3.EjerciciosClase.Ejercicios;

import java.util.Scanner;

import ud3.EjerciciosClase.Clases.*;

public class EjemploEnum {

    public static void main(String[] args) {
        
        DiaDeLaSemana hoy;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que día de la semana es mañana?");
        hoy = DiaDeLaSemana.valueOf(sc.nextLine());


        if (hoy == DiaDeLaSemana.SABADO) {
            System.out.println("Fin de semana");
        }


        sc.close();
    }

    
}
