package ud2.ejerciciosPropuestos;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una fecha, primero días , meses y años");

        int dias = sc.nextInt();
        int meses = sc.nextInt();
        int anhos = sc.nextInt();
        sc.close();


        if (anhos > 0 && anhos < 2025) {
            switch (meses) {
                case 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                    if (dias > 0 && dias < 32) {
                        System.out.println("La fecha es correcta");
                    } else {
                        System.out.println("La fecha no es correcta");
                    }
                    break;
                case 2:
                    if (dias > 0 && dias < 29) {
                        System.out.println("La fecha es correcta");
                    } else {
                        System.out.println("La fecha no es correcta");
                    }
                    ;
                    break;
                default:
                    System.out.println("La fecha no es correcta");
                    ;
            }
        }

    }
}
