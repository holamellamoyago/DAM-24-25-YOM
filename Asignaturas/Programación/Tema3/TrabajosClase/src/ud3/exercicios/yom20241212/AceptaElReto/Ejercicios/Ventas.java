package AceptaElReto.Ejercicios;

import java.util.Scanner;

// Ejercicio 105

public class Ventas {

    public static String diaSemana(int n){
        return switch(n){
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Error en el día";
        };
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaMax = 0, diaMin = 0;
        double venta, ventaMax = 0, ventaMin = 0, media= 0;
        boolean ventasDomingo = false, empateMax = false;


        for(int i = 2; i<8 ; i++){
            System.out.println("Dime la venta del día " + diaSemana(i));
            venta = sc.nextDouble();
            media += venta;


            if (venta>ventaMax) {
                diaMax = i;
                ventaMax = venta;
            }

            if (i==2) {
                ventaMin = venta;
                diaMin = i;
            } else{
                if (venta<ventaMin) {
                    ventaMin = venta;
                    diaMin = i;

                }
            }

            media = media/6;

            if (i==7 && venta>media) {
                ventasDomingo = true;
            }

        }


        String resultadoDomingo = ventasDomingo ? "SI" : "NO";


        System.out.println(diaSemana(diaMax) + " " + diaSemana(diaMin) + " " + resultadoDomingo);

        sc.close();
    }
}
