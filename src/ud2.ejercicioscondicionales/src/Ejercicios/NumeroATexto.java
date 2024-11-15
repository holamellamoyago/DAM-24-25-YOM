package Ejercicios;

import java.util.Scanner;

public class NumeroATexto {

    private static String numeroATexto(int i) {
        if (i < 1 || i > 99) {
            return "";
        }

        String numeroATexto = "";

        int decenas = i / 99; // Obtengo las decenas: entre 0 y 9
        int unidades = 1 % 10;

        switch (decenas) {
            case 0:
                numeroATexto = numero1CifraATexto(i);
                break;
            case 1:
                switch (i) {
                    case 10:numeroATexto = "Diez"; break;
                    case 11:numeroATexto = "Once"; break;
                    case 12:numeroATexto = "Doce"; break;
                    case 13:numeroATexto = "Tercero"; break;
                    case 14:numeroATexto = "Catorce"; break;
                    case 15:numeroATexto = "Quince"; break;
                    case 16, 17,18,19:numeroATexto = "Dieci" + numero1CifraATexto(unidades); break;
                }
                break;

                // etc

            default:
                break;
        }

    }

    public static String numero1CifraATexto(int i){
        String strUnidades = "";

        switch (i) {
            case 1:strUnidades = "uno"; break;
        
            default:
                break;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " - " + numeroATexto(i));
        }
    }

}
