package ud5.Practicas.Bingo;

import java.util.Arrays;

public class Carton {
    int[][] numeros;

    public Carton(int[][] numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Carton [numeros=" + Arrays.toString(numeros) + "]";
    }

    

    

    
}
