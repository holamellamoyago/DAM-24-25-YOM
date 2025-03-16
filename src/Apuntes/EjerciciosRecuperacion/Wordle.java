package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Palabra palabra[] = {
                new Palabra("frase"),
                new Palabra("tabla"),
                new Palabra("perro"),
                new Palabra("cielo"),
                new Palabra("silla"),
                new Palabra("mujer"),
                new Palabra("noche"),
                new Palabra("flore"),
                new Palabra("luzon"),
                new Palabra("rojon")
        };

        System.out.println("Bienvenido a WORDLE");

        comenzarPartida(palabra[new Random().nextInt(palabra.length)]);
    }

    static boolean comenzarPartida(Palabra palabra) {
        Scanner sc = new Scanner(System.in);

        int vidas = 3;
        int ronda = 1;

        char[] letras = palabra.palabra.toCharArray();
        String palabraIntroducida;
        boolean partidaGanada = false;

        System.out.println("La palabra es: " + palabra.palabra);

        do {
            System.out.println("\n Ronda " + ronda + " intenta acertar la palabra, te quedan : " + vidas + " vidas");
            System.out.println("Introduce palabra");

            palabraIntroducida = comprobarPalabra(sc.nextLine());

            if (Arrays.equals(comprobarPalabraIntroducida(palabra.palabra, palabraIntroducida), letras)) {
                System.out.println("Palabra acertada");
                partidaGanada = true;
            } else {
                System.out.println("\nPalabra errada, letras acertadas: ");
                System.out.println(Arrays.toString(comprobarPalabraIntroducida(palabra.palabra, palabraIntroducida)));

                vidas--;
                ronda++;
            }

        } while (!partidaGanada && vidas > 0);

        if (vidas <= 0) {
            System.out.println("Has perdido debido a que te quedaste sin vidas");
        }

        if (partidaGanada) {
            System.out.println("Enhorabuena , ganaste . ");
        }

        return partidaGanada;
    }

    static char[] comprobarPalabraIntroducida(String palabraOriginal, String palabraIntroducida) {
        char[] palabraIntroducidaChar = palabraIntroducida.toCharArray();
        char[] palabraOriginalChar = palabraOriginal.toCharArray();
        boolean bandera = false;

        char[] letrasAcertadas = new char[5];

        for (int i = 0; i < palabraIntroducidaChar.length; i++) {
            if (palabraIntroducidaChar[i] == palabraOriginalChar[i]) {
                letrasAcertadas[i] = palabraIntroducidaChar[i];
            }
        }

        return letrasAcertadas;

    }

    static String comprobarPalabra(String palabra){
        Scanner sc = new Scanner(System.in);

        if (palabra.length() != 5) {
            do {
                System.out.println("\nLa palabra no contiene 5 caracteres, vuelce a introducir");
                palabra = sc.nextLine();
            } while (palabra.length()!= 5);
        }

        return palabra;
    }

}
