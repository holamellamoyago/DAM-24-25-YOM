package ud1.ejercicio_examen;

import java.util.Scanner;

public class comidaGrupo {
    public static void main(String[] args) {
        System.out.println("Cuantas personas sois? ");
        Scanner sc = new Scanner(System.in);
        int personas = sc.nextInt();
        System.out.println("Cuanto es el importe total?");
        double total = sc.nextDouble();
        sc.close();

        System.out.println("El importe a repartir por " + personas + "es igual a " + total / personas   + "por cabeza") ;



    }
}
