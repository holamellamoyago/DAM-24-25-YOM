package ud4.EjemploRegEx;

import java.util.Scanner;

public class EjemploRegEx {


    public static void main(String[] args) {
        boolean siguePatron = false;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Escribe una matricula: ");
            respuesta = sc.nextLine();
            siguePatron = respuesta.matches("[0-9]{4}[BCDFGHJKLMNOPQRSTVWXYZ]{3}");

            if (!siguePatron)
                System.out.println("La expresion no encaja con el patrón");
        } while (!siguePatron);

        System.out.println("Expresihón correcta!");
    }

}
