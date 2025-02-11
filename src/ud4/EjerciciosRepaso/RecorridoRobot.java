package ud4.EjerciciosRepaso;

import java.util.Arrays;

import ud4.ArraysUtil;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };

        System.out.println(recorridoRobot(mapa, "AALARAARAA"));
        System.out.println(recorridoRobot(mapa, "RAALAAAALA"));
        System.out.println(recorridoRobot(mapa, "ARALA"));
        System.out.println(recorridoRobot(mapa, "LAA"));

    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {

        // 1. Paso todo a una matriz de mayusculas

        char[][] mapaMatriz = new char[0][0];

        instrucciones = instrucciones.toUpperCase();

        for (int i = 0; i < mapa.length; i++) {
            mapaMatriz = Arrays.copyOf(mapaMatriz, mapaMatriz.length + 1);
            mapaMatriz[mapaMatriz.length - 1] = mapa[i].toCharArray();

        }

        // Aquí lo que hago es buscar la poscion de A para después poder moverla
        int filaA = -1;
        int columnaA = -1;

        for (int i = 0; i < mapaMatriz.length; i++) {
            int posicion = ArraysUtil.buscarLetra(mapaMatriz[i], 'A');

            if (posicion >= 0) {

                

                    filaA = i;
                    columnaA = posicion;
                

            }

        }

        int filaZ = -1;
        int columnaZ = -1;

        for (int i = 0; i < mapaMatriz.length; i++) {
            int posicion = ArraysUtil.buscarLetra(mapaMatriz[i], 'Z');

            if (posicion >= 0) {

                

                    filaZ = i;
                    columnaZ = posicion;
                

            }

        }

        // Orientacion será 1 (frontal), 2 (derehca)
        int orientacion = 1;

        for (int i = 0; i < instrucciones.length(); i++) {
            char accion = instrucciones.charAt(i);

            switch (accion) {
                case 'A':
                    if (orientacion == 1) {

                        if (mapaMatriz[filaA - 1][columnaA] != '*') {
                            filaA = filaA-1;
                        } else {
                            return false;
                        }

                    }

                    if (orientacion == 2) {
                        if (mapaMatriz[filaA][columnaA + 1] != '*') {
                            columnaA = columnaA+1;
                        } else {
                            return false;
                        }
                    }

                    if (orientacion == 3) {
                        if (mapaMatriz[filaA + 1][columnaA] != '*') {
                            filaA = filaA+1;
                        } else {
                            return false;
                        }
                    }

                    if (orientacion == 4) {
                        if (mapaMatriz[filaA][columnaA -1] != '*') {
                            columnaA = columnaA-1;
                        } else {
                            return false;
                        }
                    }

                    break;

                case 'R':
                    orientacion++;

                    if (orientacion >= 5) {
                        orientacion = 1;
                    }

                    break;

                case 'L':
                    orientacion--;

                    if (orientacion <= 0) {
                        orientacion = 4;
                    }

                    break;

                default:
                    break;
            }

            // moverPosicion(mapaMatriz, accion, orientacion);
        }

        if (filaA == filaZ && columnaA == columnaZ) {
            return true;
        } else {
            return false;
        }

    }

}
