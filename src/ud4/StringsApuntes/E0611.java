package ud4.StringsApuntes;

import java.util.Arrays;

public class E0611 {
    public static void main(String[] args) {
        String conj1 = "eikmpqrstuv";
        String conj2 = "pviumterkqs";

        String palabra = "PaquiTo";

        System.out.println(codifica(conj1.toCharArray(), conj2.toCharArray(), palabra));

    }

    static String codifica(char conjunto1[], char conjunto2[], String p) {

        p = p.toLowerCase();
        String palabraFinal ="";
        
        
        for(int i = 0; i<p.length(); i++){
            int pos = Arrays.binarySearch(conjunto1, p.charAt(i));
            System.out.println(pos);

            if (pos >= 0) {
                palabraFinal += conjunto2[pos];
            } else{
                palabraFinal += p.charAt(i);
            }
            
        }

        return palabraFinal;
    }
}
