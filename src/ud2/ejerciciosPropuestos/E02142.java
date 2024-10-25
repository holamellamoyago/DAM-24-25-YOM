package ud2.ejerciciosPropuestos;

import java.util.Scanner;

public class E02142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean incrementarMes = false;

        System.out.println("Introduce una fecha, días , meses y años");
        int dias = sc.nextInt();
        int meses = sc.nextInt();
        int anhos = sc.nextInt();
        sc.close();

        dias++;

        switch (meses) {
            case 1, 3, 4, 5, 6, 7, 8, 9, 10, 11:

                if (dias > 31) incrementarMes = true;
                break;

            case 12:
                if (dias > 31) {
                    anhos++;
                    incrementarMes = true;
                }
                break;

            case 2:
                if (dias > 28) incrementarMes = true;
                break;

            default:
                System.out.println("Introdujiste un mes inválido ");
                break;
        }

        if (incrementarMes) {
            dias = 1;
            meses++;

            if (meses >= 12) {
                anhos++;
                meses = 1;
            }
        }

        System.out.println("La fecha es: " + dias + "-" + meses + "-" + anhos);

    }
}
