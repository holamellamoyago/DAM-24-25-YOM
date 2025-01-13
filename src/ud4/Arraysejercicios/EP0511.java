package ud4.Arraysejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EP0511 {

    static Integer[] buscarTodos(Integer t[], int clave) {

        Integer f[] = new Integer[0];
        int contadorf = 0;

        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                f = Arrays.copyOf(f, f.length + 1);
                f[contadorf] = i;
                contadorf++;
            }
        }

        return f;
    }

    public static void main(String[] args) {
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 5);

        System.out.println(Arrays.toString(buscarTodos(t, 3)));

    }
}
