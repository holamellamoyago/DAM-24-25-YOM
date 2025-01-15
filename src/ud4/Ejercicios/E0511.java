package ud4.Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import ud4.ArraysUtil;

public class E0511 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que longitud quieres la combinacion, 1 al 5");
        int longitudCominacion = sc.nextInt();
        Integer t[] = new Integer[longitudCominacion];

        Integer combinacionSecreta[] = generarCombinacion(longitudCominacion);
        Integer combinacionUsuario [] = leerCombinacion(longitudCominacion);

        while(!Arrays.equals(combinacionUsuario, combinacionSecreta)){

            mostrarPista(combinacionSecreta,combinacionUsuario);

            combinacionUsuario = leerCombinacion(longitudCominacion);
        }

        System.out.println("Enhorabuena");

    }

    static void mostrarPista(Integer[] cSecreto, Integer[] cUsuario){
        for(int i = 0; i< cUsuario.length;i++){
            if (cSecreto[i] == cUsuario[i]) {
                System.out.println(" = ");
            } else if(cSecreto[i] > cUsuario[i]){
                System.out.println(" > ");
            } else{
                System.out.println(" < ");
            }
        }
    }


    static public Integer[] generarCombinacion(int longitud){
        Integer t[]  = ArraysUtil.arrayAleatorio(longitud, 1, longitud);

        return t;
    }

    static Integer[] leerCombinacion(int longitud){
        Scanner sc = new Scanner(System.in);
        Integer combinacion[] = new Integer[longitud];


        System.out.println("Introduce los " + longitud + " digitos de la combinacion");
        for(int i = 0 ; i<combinacion.length; i++){
            combinacion[i] = sc.nextInt();
        }




        return combinacion;
    }
}
