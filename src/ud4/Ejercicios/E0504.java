package ud4.Ejercicios;

import java.util.Arrays;

public class E0504 {
    static Integer maximo (int t[]){
        
        if (t == null || t.length == 0) {
            return null;
        }
        
        Integer maximo = t[0];
        for(int i = 0; i<t.length;i++){
            if (t[i] > maximo) {
                maximo = t[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        int l [] = E0501.arrayAleatorio(5,-10,10);

        System.out.println(Arrays.toString(l));
        System.out.println("Maximo : "  + maximo(l));
    }
}
