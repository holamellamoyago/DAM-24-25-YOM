package ud2.ejerciciosPropuestos;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha, días , meses y años");
        int dias = sc.nextInt();
        int meses = sc.nextInt();
        int anhos = sc.nextInt();
        sc.close();

        switch (meses) {
            case 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:

                if (dias == 31) {
                    dias = 1;
                    meses++;
                    if (meses == 13) {
                        meses = 1;
                        anhos++;
                    }
                } else if (dias > 31) {
                    System.out.println("Fecha no válida");
                } else {
                    dias++;

                } {

            }
                break;
            case 2:
                if (dias == 28) {
                    dias = 1;
                    meses++;
                    if (meses == 13) {
                        meses = 0;
                        anhos++;
                    }
                } else if (dias > 28) {
                    System.out.println("Fecha no válida");
                } else {
                    dias++;

                } {
            }
                break;

            default:
                System.out.println("Introdujiste un mes inválido ");
                break;
        }

        System.out.println("La fecha es: " + dias + "-" + meses + "-" + anhos);

    }
}
