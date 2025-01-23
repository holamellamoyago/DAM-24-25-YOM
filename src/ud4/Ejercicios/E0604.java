package ud4.Ejercicios;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String fraseIntroducidad = sc.nextLine();
        
        

        System.out.println("La frase tiene " + contarEspacios(fraseIntroducidad) + " espacios");
        
        
        
    }
    
    static int contarEspacios(String cad){
        int espacios = 0;
        for(int i = 0; i<cad.length(); i++){
            if (Character.isSpaceChar(cad.charAt(i))) {
                espacios++;
            }
        }

        return espacios;
    }
}
