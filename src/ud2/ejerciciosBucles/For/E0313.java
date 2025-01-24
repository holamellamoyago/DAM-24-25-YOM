package ud2.ejerciciosBucles.For;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        boolean suspenso = false;
        int contadorSuspensos = 0, contadorCondicionados = 0, contadorAprobados = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Dime la calificación " + i);
            int calificacion = sc.nextInt();

            switch (calificacion) {
                case 1,2,3 :{
                    suspenso = true;
                    contadorSuspensos++;
                }
                case 4: {
                    contadorCondicionados++;
                    contadorSuspensos++;
                    suspenso = true;
                }

                default:
                    contadorAprobados++;
                    
            }
        }

        if (suspenso) {
            System.out.println("Hay una nota suspensa");
        } else {
            System.out.println("todo aprobado");
        }

        System.out.println("Aprobados: " + contadorAprobados);
        System.out.println("con: " + contadorCondicionados);
        System.out.println("sus: " + contadorSuspensos);

        sc.close();
    }
}
