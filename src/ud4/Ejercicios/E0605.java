package ud4.Ejercicios;

public class E0605 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String frase = "Hola mundo";

        System.out.println(invertirCadena(frase));
    }

    static String invertirCadena(String cad){

        String fraseInvertida ="";
        System.out.println("a");

        for(int i = cad.length()-1; i>=0; i--){
            fraseInvertida += cad.charAt(i);
            System.out.println(fraseInvertida);

        }


        return fraseInvertida;
    }
}
