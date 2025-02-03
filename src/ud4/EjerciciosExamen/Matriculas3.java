package ud4.EjerciciosExamen;

import java.util.Arrays;

public class Matriculas3 {
    public static void main(String[] args) {


        String[] l = { "0001Yago", "8784Eva", "3233Antonio", "1234Z" };

        for (int i = 0; i < l.length; i++) {

            if (i == l.length-1) {

            } else if (l[i].compareTo(l[i + 1]) > 0) {
                String aux = l[i];
                l[i] = l[i + 1];
                l[i + 1] = aux;
                i = -1;
            }



        }

        System.out.println(Arrays.toString(l));

    }
}
