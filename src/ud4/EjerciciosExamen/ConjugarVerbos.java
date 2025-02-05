package ud4.EjerciciosExamen;

import java.util.Scanner;

public class ConjugarVerbos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un verbo en INFINITIVO");
        String verbo = sc.nextLine();

        if (comprobarVerbo(verbo)) {
            while (verbo != "fin" && comprobarVerbo(verbo)) {
                
                conjugarPresente(verbo);
                verbo = sc.nextLine();
            }
            
        } else{ 
            System.out.println("Añadiste un verbo que no estaen infinitivo");
        }


    }

    static String[] conjugarPresente(String verbo) {

        char vocal = verbo.charAt(verbo.length() - 2);
        String principio = verbo.substring(0, verbo.length() - 2);

        String[] verbosConjugados = new String[6];


        // Primera persona
        System.out.println("Yo " + principio + "o");
        verbosConjugados[0] = principio + "o";

        // Segunda persona
        if (vocal == 'i') {
            System.out.println("Tú " +  principio + "es");
            verbosConjugados[1] = principio + "es";
        } else {
            System.out.println("Tú " + principio + vocal + "s");
            verbosConjugados[1] = principio + vocal + "s";
        }

        // Tercera persona

        if (vocal == 'i') {
            System.out.println( "El / ella " +  principio + 'e');
            verbosConjugados[2] = principio + 'e';
        } else {
            System.out.println("El / ella " + principio + vocal);
            verbosConjugados[2] = principio + vocal;

        }

        // cuarta
        System.out.println("Nosotros: " +  principio + vocal + "mos");
        verbosConjugados[3] = principio + vocal + "mos";

        // quita
        System.out.println("Vosotros "+  principio + vocalTilde(vocal) + "is");
        verbosConjugados[4] = principio + vocalTilde(vocal) + "is";

        // sexta
        if (vocal == 'i') {
            System.out.println("Ellos / ellas " + principio + "en");
            verbosConjugados[5] = principio + "en";
        } else {

            System.out.println("Ellos / ellas " +principio + vocal + "n");
            verbosConjugados[5] = principio + vocal + "n";
        }

        return verbosConjugados;
    }

    static char vocalTilde(char l) {
        switch (l) {
            case 'a':
                return 'á';
            case 'e':
                return 'é';
            case 'i':
                return 'í';

            default:
                return 'z';

        }
    }

    static boolean comprobarVerbo(String verbo){

        String terminacion = verbo.substring(verbo.length()-2);
        System.out.println(terminacion);

        if (terminacion != "ar" || terminacion=="er" || terminacion=="ir") {

            return true;
            
        } else{
            return false;
        }


    }

}
