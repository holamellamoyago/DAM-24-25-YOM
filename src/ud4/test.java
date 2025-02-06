package ud4;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] nombres = { "Yago", "Manuel", "Eva", "Pepa", "Antonio" };

        ordenarAlfabeticamente(nombres);
    }

    static void ordenarAlfabeticamente(String[] n) {
        System.out.println(n[1].compareTo(n[2]));

        for (int i = 0; i < n.length - 1; i++) {
            if (n[i].compareTo(n[i + 1]) == 0 || n[i].compareTo(n[i + 1]) < 0) {
                System.out.println("Esta ordenador");
            } else {
                System.out.println("No esta ordenado");

                String aux = n[i];

                n[i] = n[i + 1];

                n[i + 1] = aux;

                i = -1;

            }
        }

        System.out.println(
                Arrays.toString(n));

        String s = new String("Hola").concat(" Mundo");

        System.out.println(s);

        String str = "abcde";
        System.out.println(str.substring(1, 3));

        String s1 = "Java";
String s2 = "Ja" + "va";
System.out.println(s1 == s2);

            Arrays.toString(n)
        );


        
    }
}
