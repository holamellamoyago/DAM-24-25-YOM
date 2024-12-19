package ud3;


public class Util {
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    static int mayorQue(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    static boolean esCasiCero(int n) {
        if (n == 0) {
            return false;
        } else if (n < 1) {
            return true;
        } else {
            return false;
        }
    }

    static String notaEnTexto(int n) {
        switch (n) {
            case 1, 2, 3, 4:
                return "Suspenso";
            case 5:
                return "Suficiente";
            case 6:
                return "bien";
            case 7, 8:
                return "notable";
            case 9, 10:
                return "sobresaliente";
            default:
                return "error";
        }
    }

    static String notaEnTexto(double n) {
        String notaEnTexto = "";

        if (n >= 0 && n < 5) {
            notaEnTexto = "insuficiente";
        } else if (n >= 5 && n < 6) {
            notaEnTexto = "suficiente";
        } else if (n >= 6 && n < 7) {
            notaEnTexto = "bien";
        } else if (n >= 7 && n < 9) {
            notaEnTexto = "notable";
        } else if (n >= 9 && n <= 10) {
            notaEnTexto = "sobresaliente";
        }

        return notaEnTexto;

    }

    public static void cajaTexto(String str, char simbolo) {
        int n = str.length(); // longitud del String

        leerLinea(n, simbolo);

        System.out.println();
        System.out.println(simbolo + str + simbolo); // cadena con un borde en cada lado

        leerLinea(n, simbolo);
        System.out.println();
    }

    public static void leerLinea(int n, char simbolo) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba
            System.out.print(simbolo);
        }
    }

    public static void main(String[] args) {
        cajaTexto("Hola", 'a');
        // System.out.println(esPar(2));
        // System.out.println(esBisiesto(2025));
        // System.out.println(mayorQue(353, 55));
        // System.out.println(es);
        // System.out.println(notaEnTexto(2));
    }
}
