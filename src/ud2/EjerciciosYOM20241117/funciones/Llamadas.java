package ud2.EjerciciosYOM20241117.funciones;
import java.util.Scanner;

import ud3.Util;
public class Llamadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Inserta un digito");
        char simbolo = sc.nextLine().charAt(0);
        System.out.println(simbolo);

        
        Util.cajaTexto("Holamellamoyago", simbolo);



    }
}
