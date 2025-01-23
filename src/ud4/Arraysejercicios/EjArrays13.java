package ud4.Arraysejercicios;
// Una matriz diagonal es una matriz cuadrada cuyos elementos fuera de la diagonal principal son todos cero. 
// Ejemplo de una matriz de tamaño 3×3:

import java.util.Arrays;

public class EjArrays13 {
    public static void main(String[] args) {
        int m [][] = new int[1][1];

        
        
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j < 2; j++){
                m[i] =  Arrays.copyOf(m[i], m[i].length+1);
                
                
            }
        }
        System.out.println(Arrays.toString(m[0]));
    }
}
