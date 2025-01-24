package ud1.ejercicios_parejas;

/**
 * unidadesMedidas
 */

 import java.util.Scanner;
 import java.util.Locale;
 import java.math.*;
public class unidadesMedidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primero pasamos todo a m2

        double ht;
        double m2CamposFutbol = 105 * 70;
        double m2CanhasBaloncesto = 28 * 15;
        double m2PistasTenis = 23.77 * 10.97;
        double m2ParquesRetiro = 125*10000;


        // Le solicitamos al usuario las hectareas que a la vez pasamos a m2
        System.out.println("Introduce el numero de hectareas");
        ht = sc.nextDouble();
        double m2 = ht*10000;


        // Entoncs ahora que tenemos las hectareas del usuario a m2 y los m2 de cada sitio los dividimos
        double numCamposFutbol = m2 / m2CamposFutbol;
        double numCanchasBaloncesto = m2 / m2CanhasBaloncesto;
        double numPitasTenis = m2 / m2PistasTenis;
        

        System.out.printf("%.2f hectareas medida en campos de futbol es: %.2f ",ht,m2CamposFutbol);
    
    }
}