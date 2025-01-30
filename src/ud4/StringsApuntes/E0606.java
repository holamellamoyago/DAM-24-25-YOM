package ud4.StringsApuntes;

import java.util.Arrays;

//Escribir un
//programa que
//pida el
//nombre completo
//al usuario
//y lo
//muestre sin
//
//vocales(mayúsculas, minúsculas y acentuadas).
//Por ejemplo, “
//Álvaro Pérez”
//quedaría como “
//lvr Prz”.


public class E0606 {


    public static void main(String[] args) {
        System.out.println("Introduce un nombre");
        String nombre = "Yago Otero";

        System.out.println(sinVocales(nombre));
    }

    static String sinVocales(String cad) {
        String fraseDevolver = "";
        String vocales = "aeiouÁÉÍÚÚ";
        char a [] = vocales.toCharArray();
        
        for(int i = 0; i<cad.length(); i++){
           int pos = Arrays.binarySearch(a, cad.charAt(i));

            if (pos < 0) {
                fraseDevolver+= cad.charAt(i);
            }

        }

        
        return fraseDevolver;
    }



}
