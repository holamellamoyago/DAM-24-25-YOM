package ud2.yomexamen;
// Yago Otero Martínez

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        figuras();
        
    }

    private static void rectangulo() {
        // int baseRectangulo = solicitarMedida();
        int baseRectangulo = 4;

        // for(int i = 0; i<4; i++ ){
        // System.err.print("*");
        // for(int j = 0; j<3 ; j++){
        // System.err.print("+");
        // }
        // System.err.println();

        // }

        // for(int j = 0; j<3 ; j++){
        // System.err.print("*");

        // if (j != 2) {
        // for(int i = baseRectangulo; i>0; i-- ){
        // System.err.print("+");
        // }
        // } else{
        // for(int b = baseRectangulo; b>0; b--){
        // System.out.print(" ");
        // }
        // }

        // System.err.print("*");
        // System.err.println();

        // }

        for (int i = 0; i < baseRectangulo; i++) {
            System.out.print("+");
            for (int j = 1; j < 2; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

    }

    private static void triangulo() {
        int baseTriangulo = solicitarMedida();

        for (int i = 0; i <= baseTriangulo; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

    }

    private static void figuras() {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta;
        char opcionEscogida;

        do {
            System.out.println("1. TRIÁNGULO");
            System.out.println("2. Rectángulo");
            System.out.println("0. SALIR");

            respuesta = sc.nextLine();

            opcionEscogida = respuesta.charAt(0);

            switch (opcionEscogida) {
                case '0' -> {
                    contadorFallos = despedida();
                }
                case '1' -> {
                    triangulo();

                }
                case '2' -> {
                    rectangulo();
                    // contadorFallos = despedida();
                }

                default -> {
                    contadorFallos++;
                    System.out.println("Opcion inválida");
                    System.out.println("Error: " + contadorFallos + ", el programa terminara al llegar a 3 errores");

                    if (contadorFallos >= 3) {
                        despedida();
                    }

                }
            }

        } while (contadorFallos < 3);

    }

    private static int solicitarMedida() {
        Scanner sc = new Scanner(System.in);
        int medida;

        do {
            System.out.println("Buenas ... Medida?");
            medida = sc.nextInt();

            if (medida < 2 || medida > 20) {
                System.out.println("Valores incorrectos ... entre 2 y 20");

            }

        } while (medida < 2 || medida > 20);

        return medida;
    }

    private static int despedida() {
        System.out.println("Programa terminado ... tenga buen día");

        return 3;
    }
}
