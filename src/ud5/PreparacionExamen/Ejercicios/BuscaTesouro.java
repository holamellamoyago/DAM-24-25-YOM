package ud5.PreparacionExamen.Ejercicios;

import java.util.Random;
import java.util.Scanner;

import ud4.ArraysUtil;

public class BuscaTesouro {
    public static void main(String[] args) {
        boolean[][] tablero;
        boolean banderaAcierto = false;
        
        tablero = crearTablero();
        int vidasRestantes = calcularVidas(tablero)+1;
        

        System.out.println("Comienza el juego");

        do {
            vidasRestantes--;
            System.out.println("Te quedan intentos" + vidasRestantes);
            banderaAcierto = pedirRespuesta(tablero);

        } while (!banderaAcierto && vidasRestantes > 1);

        if (banderaAcierto) {
            System.out.println("Enhorabuena acertaste");
            System.out.println("Te llevo " + (calcularVidas(tablero) - vidasRestantes));
        }



    }

    static boolean pedirRespuesta(boolean[][] m) {
        Scanner sc = new Scanner(System.in);

        int filabomba = -1;
        int columnaBomba = -1;
        int totalCasillas = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == true) {
                    filabomba = i;
                    columnaBomba = j;
                }
                totalCasillas++;
            }
        }

        // Calcúlo el total de casillas del mapa para después vidas.
        

        System.out.println("Inserta fila: ");
        int filaRespuesta = sc.nextInt();

        System.out.println("Columna: ");
        int columnaRespuesta = sc.nextInt();

        if (m[filaRespuesta][columnaRespuesta] == true) {
            return true;
        } else if (filaRespuesta == filabomba && columnaBomba < columnaRespuesta) {
            System.out.println("Mas al oeste");
        } else if (filaRespuesta == filabomba && columnaBomba > columnaRespuesta) {
            System.out.println("Este");
        } else if (filaRespuesta > filabomba && columnaBomba == columnaRespuesta) {
            System.out.println("norte");
        } else if (filaRespuesta < filabomba && columnaBomba == columnaRespuesta) {
            System.out.println("sur");
        } else if (filaRespuesta < filabomba && columnaBomba < columnaRespuesta) {
            System.out.println("suroeste");
        } else if (filaRespuesta < filabomba && columnaBomba > columnaRespuesta) {
            System.out.println("sureste");
        } else if (filaRespuesta > filabomba && columnaBomba > columnaRespuesta) {
            System.out.println("noreste");
        } else if (filaRespuesta > filabomba && columnaBomba < columnaRespuesta) {
            System.out.println("noroeste");
        }

        return false;

    }

    static int calcularVidas(boolean[][] m){
        int totalCasillas = 0;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                totalCasillas++;
            }
        }
        return (int)(totalCasillas*0.1);
    }

    static boolean[][] crearTablero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, numero de filas: ");
        int filas = 5;
        System.out.println("Columnas: ");
        int columnas = 5;

        boolean[][] tablero = new boolean[filas][columnas];

        // Escondo la bomba
        Random rdm = new Random();
        tablero[rdm.nextInt(filas)][rdm.nextInt(columnas)] = true;

        ArraysUtil.mostrarMatriz(tablero);
        return tablero;
    }
}
