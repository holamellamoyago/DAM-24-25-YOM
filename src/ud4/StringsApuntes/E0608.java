package ud4.StringsApuntes;

// Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con “Javalín, javalón”, para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje. 

// Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla “javalén, len, len”. 
// Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.

public class E0608 {
    public static void main(String[] args) {
        String frase1 = "  Javalín, javalón hola tomate";
        String frase4 = "  Javalín, javalón hola tomate javalén, len, len";
        String frase2 = "   hola tomate javalén, len, len    ";
        String frase3 = "hola tomate";

        comprobarDialecto(frase4);

    }

    static void comprobarDialecto(String frase) {
        String inicio = "Javalín, javalón";
        String ffinal = "javalén, len, len";

        frase = frase.strip();

        if (frase.startsWith(inicio) || frase.endsWith(ffinal)) {
            System.out.println("Esta en dialecto, mensaje descrifrado: ");
        }

        if (frase.startsWith(inicio) && frase.endsWith(ffinal)) {
            frase = frase.replace(inicio, "");
            frase = frase.replace(ffinal, "");

            frase = frase.strip();
            System.out.println(frase);

        } else if (frase.startsWith(inicio)) {
            frase = frase.substring(inicio.length());
            frase = frase.strip();

            System.out.println(frase);
        } else {

        }
    }
}
