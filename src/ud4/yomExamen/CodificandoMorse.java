package ud4.yomExamen;

import java.util.Arrays;
import java.util.Scanner;

// Yago Otero

public class CodificandoMorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respuesta;
        boolean siguePatron = true;

        // char[] letrasValidas = "ABCDFGHJKLMNOPQRSTVWXYZ0-9?! ".toCharArray();
        String letrasValidas = "ABCDFGHJKLMNOPQRSTVWXYZ0-9?! ";

        do {

            System.out.println("Introduce una frase de no mas de 80 letras en inglés");
            respuesta = sc.nextLine();
            siguePatron = comprobarrespuesta(respuesta);

        } while (!siguePatron);

        // SEPARO EN CHARACTERES CON ESPACIOS
        char[] fraseSeparada = respuesta.toCharArray();

        // System.out.println(Arrays.toString(fraseSeparada));
        // System.out.println(numPuntosMorse(respuesta));
        int puntos = numPuntosMorse(respuesta);
        System.out.println(puntos);

        // String respuesta2[] = respuesta.split(respuesta);
        // TODO NO VAN LOS ESPACIOS

    }

    static int numPuntosMorse(String frase) {

        int puntosTotales = 0;

        for (int i = 0; i < frase.length(); i++) {

            int puntosPorLetra = 0;
            String valorLetra = "";

            switch (frase.charAt(i)) {
                case 'A':
                    valorLetra = ".-";
                    break;
                case ' ':
                    valorLetra = ".";
                    break;
                case 'B':
                    valorLetra = "";
                    break;
                case 'C':
                    valorLetra = "";
                    break;
                case 'D':
                    valorLetra = "";
                    break;
                case 'E':
                    valorLetra = "";
                    break;
                case 'F':
                    valorLetra = "";
                    break;
                case 'G':
                    valorLetra = "";
                    break;
                case 'N':
                    valorLetra = "";
                    break;
                case 'O':
                    valorLetra = "";
                    break;
                case 'P':
                    valorLetra = "";
                    break;
                case 'Q':
                    valorLetra = "";
                    break;
                case 'R':
                    valorLetra = "";
                    break;
                case 'S':
                    valorLetra = "";
                    break;
                case 'T':
                    valorLetra = "";
                    break;
                case 'H':
                    valorLetra = "";
                    break;

                default:
                    break;
            }

            puntosTotales += sumarPuntosIndividual(valorLetra);

        }

        return puntosTotales;

    }

    static int sumarPuntosIndividual(String valorLetra) {

        int contador = 0;

        char[] valorLetraArray = valorLetra.toCharArray();

        for (int i = 0; i < valorLetra.length(); i++) {
            if (valorLetraArray[i] == ' ') {
                contador += 1;
            } else if (valorLetraArray[i] == '.') {
                contador += 1;
            } else if (valorLetraArray[i] == '-') {
                contador += 3;
            }
        }

        return contador;
    }

    static boolean comprobarrespuesta(String respuesta) {

        boolean siguePatron = true;
        Scanner sc = new Scanner(System.in);
        String letrasValidas = "ABCDFGHJKLMNOPQRSTVWXYZ0-9?! ";

        for (int i = 0; i < respuesta.length(); i++) {

            respuesta = respuesta.toUpperCase();

            int indice = letrasValidas.indexOf(respuesta.charAt(0));

            if (indice < 0) {
                siguePatron = false;
            }
        }

        if (!siguePatron)
            System.out.println("La expresion no encaja con el patrón");

        return siguePatron;
    }

}
