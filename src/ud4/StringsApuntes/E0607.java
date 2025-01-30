package ud4.StringsApuntes;
// Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuantas veces aparece la palabra en la frase.

public class E0607 {
    public static void main(String[] args) {
        String frase = "Hola yo me llamo yago por que yago es muuy yago";
        String palabra = "yago";

        int inicio = 0;
        int contador = 0;
        int pos =0;

        for(int i= 0; i<frase.length(); i++){
            if (contador == 0) {
                pos = frase.indexOf(palabra);

                if (pos >= 0) {
                    contador++;
                    inicio = pos + palabra.length();
                }
            } else{
                pos = frase.indexOf(palabra, inicio);

                if (pos >= 0) {
                    contador++;
                    inicio = pos +palabra.length();
                }
            }
        }

        System.out.println("La palabra está: " + contador);
    }
}
