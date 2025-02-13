package ud4.yomExamen;

import java.util.Random;
import java.util.Scanner;

// Yago Otero

public class BuscaTesouro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filaTesoro = 0;
        int columnaTesoro = 0;


        boolean banderaAcierto = false;

        System.out.println("Introduce el numero de filas : ");
        int filas = sc.nextInt();

        System.out.println("Introduce el numero de columnas: ");
        int columnas = sc.nextInt(); // TODO Cambiar al scanner, comprobar postivo

        // Calculo las vidas del usuario
        Integer vidasRestantes  = (int)calcularVidas(filas * columnas);

        // Genero 2 nRandom para eso
        filaTesoro = new Random().nextInt(0, filas);
        columnaTesoro = new Random().nextInt(0, columnas);

        // Lo añado

        char mapa[][] = crearMatrizTesoro(filas, columnas, filaTesoro, columnaTesoro);
        mapa[filaTesoro][columnaTesoro] = '1';

        mostrarMatriz(mapa);

        banderaAcierto = buscarTesoro(mapa, filaTesoro, columnaTesoro, vidasRestantes);

    }

    public static double calcularVidas(int totalHuecos){
        return totalHuecos*0.1;
    }

    public static boolean buscarTesoro(char[][] mapa, int filaTesoro, int columnaTesoro, int vidasRestantes){
        Scanner sc = new Scanner(System.in);

        int filaIntroducida = 0;
        int columnaIntroducida = 0;

        boolean banderaAcierto = true;

        int intentos = 0;
        

        do {
            System.out.println(
                    "Ahora dime separados por un ENTER donde crees que esta , primero la fila  ,después columna");

                    System.out.println("Te quedan " + vidasRestantes + " vidas restantes");
            


            
            filaIntroducida = sc.nextInt();

            columnaIntroducida = sc.nextInt();

            

            if (filaIntroducida == filaTesoro && columnaIntroducida == columnaTesoro) {
                intentos++;
                System.out.println("Enhorabuena , encontraste el tesoro");
                System.out.println("Te llevo " + intentos + " intentos");
            } else {
                intentos++;
                vidasRestantes--;
                // fila determina norte y sur

                if (columnaIntroducida < columnaTesoro && filaIntroducida>filaTesoro) {
                    System.out.println("Máis ao noreste");
                } else if (columnaIntroducida > columnaTesoro && filaIntroducida>filaTesoro) {
                    System.out.println("Máis ao noroeste");
                } else if (columnaIntroducida < columnaTesoro && filaIntroducida<filaTesoro) {
                    System.out.println("Máis ao sureste");
                } else if (columnaIntroducida > columnaTesoro && filaIntroducida<filaTesoro) {
                    System.out.println("Máis ao suroeste");
                } else if (columnaIntroducida == columnaTesoro && filaIntroducida > filaTesoro) {
                    System.out.println("Máis ao norte");
                } else if (columnaIntroducida == columnaTesoro && filaIntroducida < filaTesoro) {
                    System.out.println("Máis al sur");
                } else if (columnaIntroducida < columnaTesoro && filaIntroducida == filaTesoro) {
                    System.out.println("Máis ao este");
                } else if (columnaIntroducida > columnaTesoro && filaIntroducida == filaTesoro) {
                    System.out.println("Máis ao oeste");
                }

                
            }

            

        } while (banderaAcierto != true || vidasRestantes <= 0);

        if (vidasRestantes <= 0) {
            System.out.println("Agotaste tus vidas");
        } else{
            System.out.println("Enhorabuena encontras");
        }


        return banderaAcierto;
    }

    public static char[][] crearMatrizTesoro(int filas, int columnas, int filaTesoro, int columnaTesoro) {

        char[][] mapa = new char[filas][columnas];

        // Inicializo todo a 0

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = '0';
            }
        }

        return mapa;

    }

    public static void mostrarMatriz(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.err.println();
        }
    }
}
