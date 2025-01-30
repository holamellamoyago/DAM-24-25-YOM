package ud4.Ejercicios;

import java.util.Scanner;

public class E0608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PREFIJO = "Javalín javalón";
        final String SUFIJO = "javalén, len, len";

        System.out.println("Introduce una frase normal o en dialecto: " + "Que comience por \"" + PREFIJO + "\" "
                + " o termine en  \"" + SUFIJO + "\".");

        String frase = sc.nextLine();

        if (frase.startsWith(PREFIJO)) {
            System.out.println("La frase está escrita en idioma de Javalandia");
            String traducicon = frase.substring(PREFIJO.length());
            traducicon = traducicon.strip();
            System.out.println("Traduccion: " + traducicon);
        } else if (frase.endsWith(SUFIJO)) {
            System.out.println("La frase está escrita en idioma de Javalandia");
            String traduccion = frase.substring(0, frase.length() - SUFIJO.length()).strip();
            System.out.println("Traduccion: " + traduccion);
        }

    }
}
