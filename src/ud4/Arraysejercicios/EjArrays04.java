package ud4.Arraysejercicios;

import java.util.Arrays;

public class EjArrays04 {
    public static void main(String[] args) {
        int t[] = new int[20];
        boolean bandera = false;
        int posicion = 0;

        for (int i = 0; bandera != true; i++) {
            if (i % 2 == 0) {
                t[posicion] = i;
                posicion++;
                if (posicion >= 20) {
                    bandera = true;
                }
                Arrays.copyOf(t, t.length + 1);
            }
        }



        System.out.println(Arrays.toString(t));
    }
}
