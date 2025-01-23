package ud4.StringsApuntes;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);;

        String h = "hola";

        h.length();


        while (c != -1) {
            if (Character.isDigit(c)) {
                System.out.println("Es dígito");
            }
            
            if (Character.isLetter(c)) {
                System.out.println("Es una letra");
            }

            if (Character.isLetterOrDigit(c)) {
                System.out.println("Es un dígto o letra");
            }
            
            if (Character.isUpperCase(c) && Character.isLetter(c)) {
                System.out.println("Es mayusucla - " + Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                System.out.println("Es minúscula - " + Character.toUpperCase(c));
            }
            
            if (Character.isWhitespace(c)) {
                System.out.println("Es un espacio");
            }
            
            c =  sc.nextLine().charAt(0);
            
        }

    }
}
