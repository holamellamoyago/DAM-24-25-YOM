
package ud4.Ejercicios;

import java.util.Scanner;

import ud4.ArraysUtil;

public class EP0515 {

    public static void main(String[] args) {
        int [][] notas = new int[5][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce la nota del alumno " + i + " del trimestre: " + j);

                int nota = sc.nextInt();

                if (nota >= 0 && nota <11) {
                    notas[i][j] = nota;
                }
            }
        }

        notaMediaGrupoTrimestre(notas);


        ArraysUtil.mostrarMatriz(notas);
        
    }

    static void notaMediaGrupoTrimestre(int [][]m){
        
        System.out.println("Media ");
        
            for (int j = 0; j < m.length; j++) {
                int suma = 0;
                suma += m[j][0];


                System.out.println("Media del grupo " + j + " es " + suma/m.length);
            }

        


    }
}