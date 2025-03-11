package Apuntes.EjerciciosRecuperacion;

// EjCadenas03. Contar el número de veces que aparece un carácter en un texto.


public class EjCadenas03 {
    public static void main(String[] args) {
        String frase = "Hola mundo";

        contarcaracter(frase);
    }

    static void contarcaracter(String s){

        char[] frase = s.toCharArray();

        for (int i = 0; i < frase.length; i++) {
            int contador = 0;
            char letra = frase[i];

            if (letra != '.' && !Character.isWhitespace(letra)) {
                for (int j = 0; j < frase.length; j++) {
                    if (frase[j] == letra) {
                        frase[j] = '.';
                        contador++;
                    }
                }
                System.out.println("La letra " + letra + " aparecio " + contador + " veces");
            }



            
        }
    }
}
