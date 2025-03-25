package ud5.PreparacionExamen.Ejercicios;

public class CodificandoMorse {

    public static void main(String[] args) {

        System.out.println(numPuntosMorse("? ??"));
        System.out.println(numPuntosMorse("YA NACIO"));

    }

    static int numPuntosMorse(String frase) {

        char[] fraseArray = frase.toCharArray();
        int totalFrase = 0;

        // Este contado hace que cuando termine una palabra vuelva a 0 para no contar espacios entre letra no reales
        int contadorPorPalabra = 0;

        for (int i = 0; i < fraseArray.length; i++) {


            if (Character.isSpaceChar(fraseArray[i])) {
                totalFrase += 5;
                contadorPorPalabra = 0;
            } else {
                if (contadorPorPalabra != 0) {
                    totalFrase += 3;
                }

                totalFrase += decodificarLetra(buscarLetra(fraseArray[i]));
                contadorPorPalabra++;
            }

        }

        return totalFrase;

    }

    static int decodificarLetra(int i) {
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--..",
                "-.-.--", "..--.." };

        int totalLetra = 0;
        String letra = letrasMorse[i];

        for (int j = 0; j < letra.length(); j++) {

            if (j != 0) {
                totalLetra += 1;
            }

            if (letra.charAt(j) == '.') {
                totalLetra += 1;
            }

            if (letra.charAt(j) == '-') {
                totalLetra += 3;
            }
        }

        return totalLetra;
    }

    static int buscarLetra(char l) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        char[] letrasArray = letras.toCharArray();

        int posicion = -1;

        for (int i = 0; i < letrasArray.length; i++) {
            if (l == letrasArray[i]) {
                posicion = i;
            }
        }

        return posicion;
    }
}