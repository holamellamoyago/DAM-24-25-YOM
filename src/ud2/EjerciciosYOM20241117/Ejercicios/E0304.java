package ud2.EjerciciosYOM20241117.Ejercicios;

import java.util.Scanner;

public class E0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorArboles = 0, centimetros = 0, arbolMasAlto = 0, contadorArbolMasAlto = 0;

        
        while (centimetros != -1) {
            System.out.println("Inserta árboles: ");
            centimetros = sc.nextInt();
            
            if (centimetros > arbolMasAlto) {
                arbolMasAlto = centimetros;
                contadorArbolMasAlto = contadorArboles;
                System.out.println("Ahora el arbol mas alto es el " + contadorArbolMasAlto + " con " + arbolMasAlto + "cm");
            }
            
            contadorArboles++;

            System.out.println("Siguiente: ");
            
        }

        System.out.println("El arbol mas alto es el " + contadorArbolMasAlto + " con " + arbolMasAlto + "cm");
        sc.close();

    }
}
