package ud3.EjerciciosClase.Ejercicios;

import ud3.EjerciciosClase.Clases.*;

import java.util.Scanner;


public class E0706 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una hora: (horas , minutos , segundos) ");
        
        Hora hora = new Hora(sc.nextInt(),sc.nextInt(),sc.nextInt());
        hora.setHora(sc.nextInt());
        hora.setMinuto(sc.nextInt());
        hora.setSegundos(sc.nextInt());

        hora.mostrar();

        System.out.println("Introduce numero de segundo de incremento de 1 segundo");
        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
            hora.incrementar1Segundo();
            hora.mostrar();
        }


        sc.close();
    }

}
