package ud2.funciones;
import ud2.Util;
import java.util.Scanner;
public class Llamadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Inserta un digito");
        char simbolo = sc.nextLine().charAt(0);
        System.out.println(simbolo);

        
        Util.cajaTexto("Holamellamoyago", simbolo);



    }
}
