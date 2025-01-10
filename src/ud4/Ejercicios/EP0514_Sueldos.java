package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    static void encuesta(){
        Scanner sc = new Scanner(System.in);
        int sueldo = 0;
        int contador = 0;
        int t[] = new int[0];
        do {
            t = Arrays.copyOf(t, t.length+1);
            System.out.println("Itroduce el sueldo porfavor: ");
            sueldo = sc.nextInt();

            t[contador] = sueldo;
            contador++;



            System.out.println(Arrays.toString(t));


        } while (sueldo!= -1);
    }

    public static void main(String[] args) {
        encuesta();
    }
}
