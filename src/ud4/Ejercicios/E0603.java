package ud4.Ejercicios;

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena = "mundo";

        String palabraIntroducida;

        do {
            palabraIntroducida = sc.nextLine();
            
        } while (!contrasena.equals(palabraIntroducida));

        System.out.println("Felicidades acertaste");
    }
}
