package ud4.Apuntes;

import java.util.Arrays;

public class EjemplosCopia06 {
    public static void main(String[] args) {
        int l[] = {5,6,2,4,5};

        int l2[] = new int[6];

        // int l2[] = l;

        int l3[] = new int[l.length];

        for(int i=0; i<l.length; i++){
            l3[i] = l[i];
        }

        int l4[] =  Arrays.copyOf(l, l.length /2);
        l =  Arrays.copyOf(l, l.length + 1);

        System.arraycopy(l, 0, l2, 0, l.length);

        int l5[] =  l.clone();

        l[l.length-1] = 66;

        System.out.println(Arrays.toString(l));
    }
}
