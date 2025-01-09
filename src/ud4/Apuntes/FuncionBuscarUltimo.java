package ud4.Apuntes;

import java.util.Random;

public class FuncionBuscarUltimo {
    static int buscarUltimo(int t[], int clave) {
        for (int i = t.length -1; i >= 0; i--)
            if (t[i] == clave)
                return i;
        return -1;
    }
    private static int[] arrayAleatorio(int n) {
        int t [] = new int[n];

        Random rnd = new Random();

        for(int i = 0; i<n; i++){
            t[i] = rnd.nextInt(-9,9);
            
        }

        return t;
        
    }

    public static void main(String[] args) {
        int numeros[] = arrayAleatorio(10);

        int pos = buscarUltimo(numeros, 5);



        if (pos != -1) {
            System.out.println("Hay un 5 en la posicion " + pos);
        }else{
            System.out.println("No hay ningun 5");
        }
    }


}
