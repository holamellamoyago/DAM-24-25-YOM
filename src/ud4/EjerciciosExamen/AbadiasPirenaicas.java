package ud4.EjerciciosExamen;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int totalMontañas = 0;
        int a[] = new int[0];

        do {
            altura = sc.nextInt();
            a = registrarMontana(a, altura);
        } while (altura > 0 || totalMontañas >= 1000);

        contarAbadias(a);

    }

    static int[] contarAbadias(int a[]) {

        int alturaMaxima = 0;
        int alturaAnterior = 0;
        int indices[] = new int[0];

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > alturaAnterior && a[i] > alturaMaxima) {
                indices = Arrays.copyOf(indices, indices.length + 1);
                indices[indices.length - 1] = i;

                alturaAnterior = a[i];

                if (a[i] > alturaMaxima) {
                    alturaMaxima = a[i];
                }
            }
        }

        Arrays.sort(indices);

        System.out.println("El numero máximo de cordilleras es: " + indices.length);
        System.out.println(Arrays.toString(indices));

        return indices;
    }

    static int[] registrarMontana(int[] a, int n) {
        if (a != null) {

            if (n != -1) {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = n;

            }

        }

        return a;
    }
}
