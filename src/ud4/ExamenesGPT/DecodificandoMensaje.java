package ud4.ExamenesGPT;

import java.util.Scanner;

public class DecodificandoMensaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        System.out.println("Dime el numero de filas: ");
        int nFilas = sc.nextInt();

        System.out.println("Dime el numero de columnas");
        int nColumnas = sc.nextInt();

        int[][] m = new int[nFilas][nColumnas];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Introduce el caracter " + j + " de la fila " + i);
                m[i][j] = sc.nextLine().charAt(0);
            }
        }
    }
}
