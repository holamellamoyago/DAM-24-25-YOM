package ud4.EjerciciosExamen;

import java.util.Arrays;

public class BuscandoLetras {

    public static void main(String[] args) {
        String s = "hola";

        System.out.println("Aparece en las posiciones: ");
        System.out.println(Arrays.toString(buscarLetra(s, 'a')));

        
    }

    static Integer[] buscarLetra(String cadena, char letra){

        char[] t = cadena.toCharArray();
        Integer posiciones[] = new Integer[0];
        System.out.println(Arrays.toString(t));


        int contadorP = 0;

        for(int i = 0; i<t.length; i++){
            int posicion = Arrays.binarySearch(t, t[i]);

            if (posicion < 0) {
                posiciones =  Arrays.copyOf(posiciones , posiciones.length+1);
                posiciones[posiciones.length-1] = i;
            }
        }


        return posiciones;

    } 
    
}
