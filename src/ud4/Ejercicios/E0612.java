package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E0612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sonAnagrama("amor","roma"));
        System.out.println(sonAnagrama("Amor","Roma"));
        System.out.println(sonAnagrama("amor","rollo"));

    }

    static boolean sonAnagrama(String cad1, String cad2){
        char[] t1 = cad1.toLowerCase().toCharArray();
        char[] t2 = cad2.toLowerCase().toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        return Arrays.equals(t1,t2);
    }
}
