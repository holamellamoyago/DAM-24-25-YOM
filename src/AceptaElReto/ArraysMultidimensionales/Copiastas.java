package AceptaElReto.ArraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Copiastas {
    public static void main(String[] args) {

        char[][] matriz = generarMatriz();

        mostrarMatriz(matriz);        

        matriz = cambiarColores(matriz);

        mostrarMatriz(matriz);
    }

    static char[][] cambiarColores(char[][] m){
        Scanner sc = new Scanner(System.in);
        char color1 = 'Z';
        char color2 = 'Z';

        do {
            System.out.println("Escoge dos colore spara cambiar: ");
            System.out.println("COLOR2 [ESPACIO] COLOR2");
            color1 = sc.nextLine().charAt(0);
            color2 = sc.nextLine().charAt(0);

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j] == color1) {
                        m[i][j] = color2;
                    }
                }
            }
            
             
        } while (color1 != '0' && color2!= '0');

        return m;
    }

    static char[][] generarMatriz(){
        // Genero una matriz de 10* 10 , después genero un numero del 1-10 , si es 1,2 Sale R s, 4 o 5 V
        char[][] matriz = new char[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int rdm = new Random().nextInt(11)                ;
                switch (rdm) {
                    case 1,2:
                        matriz[i][j] = 'V'; // Verde
                        break;
                    case 3,4:
                        matriz[i][j] = 'R'; // Verde
                        break;
                
                    default:
                        matriz[i][j] = 'A';
                        break;
                }
            }
        }

        return matriz;
    }

    static void mostrarMatriz(char[][] parcelas) {
        for (int i = 0; i < parcelas.length; i++) {
            for (int j = 0; j < parcelas[i].length; j++) {
                System.out.print("[");
                System.out.print(parcelas[i][j]);
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
