package ud4.Ejercicios;

import ud4.ArraysUtil;

public class E0613 {
    public static void main(String[] args) {
        String frase = "En un luygar de la mancha";

        String abecedario = "abcdefghijklmnñopqerstuvwxyz";
        int repeticiones [] = new int[abecedario.length()];

        for(int i = 0; i<frase.length(); i++){
            char letra = Character.toLowerCase(frase.charAt(i));
            int pos  = abecedario.indexOf(letra);

            if (pos != -1){
                repeticiones[pos]++;
            }
        }

        System.out.println("Frase: "+ frase);
        System.out.println("Resultado: ");

        for(int i =0; i<repeticiones.length; i++){
            if (repeticiones[i]> 0){
                System.out.print(abecedario.charAt(i) + " : " + repeticiones[i] );
                System.out.println(repeticiones[i] > 1 ? " veces" : "vez");
            }
        }

    }
}
