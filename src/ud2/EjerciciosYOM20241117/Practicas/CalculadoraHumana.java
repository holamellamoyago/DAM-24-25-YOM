package ud2.EjerciciosYOM20241117.Practicas;

import java.util.Scanner;

public class CalculadoraHumana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoOperacion = (int) (Math.random() * 4) + 1;

        int tipoOperacion2 = 1;
        int resultado = 2000;
        int intento;
        int contadorFallos = 0;

        for (int i = 1; i <= 7; i++) {
            int n1 = (int) (Math.random() * 50) + 1;
            int n2 = (int) (Math.random() * 10) + 1;
            switch (tipoOperacion2) {
                case 1:
                    do {
                        resultado = operacionSumar(n1, n2);
                        System.out.println("¿Cuanto es " + n1 + " + " + n2 + "?");
                        intento = sc.nextInt();

                        if (intento == resultado) {
                            System.out.println("Acertaste , siguiente ! ");
                        } else {
                            contadorFallos++;
                            if (contadorFallos == 2) {
                                System.out.println("Perdiste todas las vidas");
                                break;
                            }
                            System.out.println("Fallaste -1 vida");
                        }

                    } while (resultado > 200);
                    break;

                default:
                    break;
            }

        }

        System.out.println("Ganaste ! ");
    }

    private static int operacionSumar(int n1, int n2) {
        return n1 + n2;

    }
}