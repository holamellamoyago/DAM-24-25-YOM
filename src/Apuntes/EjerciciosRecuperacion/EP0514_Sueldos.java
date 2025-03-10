package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sueldo = 0;
        int [] sueldos = new int[0];

        do {
            System.out.println("Cuanto cobras?");
            sueldo = sc.nextInt();

            if (sueldo != -1) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length+1);
                sueldos[sueldos.length-1] = sueldo;
            }
        } while (sueldo != -1);

        System.out.println("Sueldos ordenados crecientemente: ");
        Arrays.sort(sueldos);
        System.out.println(Arrays.toString(sueldos));

        System.out.println("Sueldo máximo: " + sueldos[sueldos.length-1] + " ,sueldo mínimo: " + sueldos[0]);
        System.out.println("Sueldos por encima de la media");
        System.out.println(Arrays.toString(sueldosEncimaMedia(sueldos)));

    }

    static int[] sueldosEncimaMedia(int [] m){

        int sumaTotal = 0;
        int[] sueldosEncimaMedia = new int[0];

        for(int a: m){
            sumaTotal += a;
        }

        int media = sumaTotal / m.length;

        for (int a: m){
            if (a > media) {
                sueldosEncimaMedia = Arrays.copyOf(sueldosEncimaMedia, sueldosEncimaMedia.length+1);
                sueldosEncimaMedia[sueldosEncimaMedia.length-1] = a;
            }
        }

        return sueldosEncimaMedia;
    }
}
