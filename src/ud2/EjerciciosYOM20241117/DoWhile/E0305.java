package ud2.EjerciciosYOM20241117.DoWhile;

import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultadoCorrecto, resultadoIntroducido, contador = 0;

        do {
            int num1 = (int) (Math.random() * 100) + 1;
            int num2 = (int) (Math.random() * 100) + 1;
            resultadoCorrecto = num1 + num2;
            System.out.println("Cuanto es la suma de: " + num1 + " + " + num2 + "?");
            resultadoIntroducido = sc.nextInt();
            if (resultadoIntroducido == resultadoCorrecto) {
                System.out.println("Perfecto ! Acertaste ! ");
                contador++;
            }
        } while (resultadoIntroducido == resultadoCorrecto);

        System.out.println("Fallaste :( , tu contador de acuertos fue: " + contador);
        sc.close();

    }
}
