package ud2.ejerciciosPropuestos;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        System.out.println("Introduce hora, minuto y segundos");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int segundo = sc.nextInt();
        sc.close();

        // switch (segundo) {
        // case 59 : minuto++;
        // default:
        // switch (minuto) {
        // case 59:
        // hora++;
        // break;

        // default:
        // break;
        // }
        // break;
        // }

        if (segundo >= 0 && segundo < 60) {
            if (segundo == 59) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                }
            } else {
                segundo++;
            }

            if (minuto >= 0 && minuto < 60) {
                if (minuto == 59) {
                    hora++;
                }
            }
        } else {
            System.out.println("Hora no valida");
        }

        System.out.println("Hora:" + hora + " Minutos: " + minuto + " segundos : " + segundo);
    }

}
