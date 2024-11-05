package ud2.ejerciciosPropuestos;

import java.util.Scanner;

public class E0307 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;

        if (7%14 == 14) {
            System.out.println("Si");
        } else{
            System.out.println("No");
        }

        do {
            if (x % 7 == 0) {
                System.out.println(x + "Es multiplo");
            } else{
                System.out.println(x + " No es multilpo");
            }
            x++;
        } while (x < 100);

    }
}
