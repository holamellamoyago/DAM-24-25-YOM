package ud4.yomexamenrec;

// Yago Otero Martínez

public class Vogais {
    public static void main(String[] args) {
        System.out.println(cambiaVogais("Holí MUndo", 'Í'));
    }

    static String cambiaVogais(String str, char vogal){
        char[] frase = str.toCharArray();
        String frase2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (esVocal(frase[i])) {
                if (Character.isUpperCase(frase[i])) {
                    if (vogal == 'Í') {
                        frase[i] = 'I';
                    }else{
                        frase[i] = Character.toUpperCase(vogal);
                    }
                }else{
                    if (vogal == 'í') {
                        frase[i] = 'i';
                    } else{
                        frase[i] = Character.toLowerCase(vogal);

                    }
                }
            }    
        }

        for (int i = 0; i < frase.length; i++) {
            frase2 += frase[i];
        }

        return frase2;
    }


    static boolean esVocal(char l){
        l = Character.toLowerCase(l);
        switch (l) {
            case 'a','e','i','o','u','í', 'ü':
                return true;    
        
            default:
            return false;
                
        }
    }



}
