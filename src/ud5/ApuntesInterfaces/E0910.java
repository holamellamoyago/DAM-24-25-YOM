package ud5.ApuntesInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class E0910 {
    public static void main(String[] args) {
        Integer[] a = new Integer[20];
        
        
        for (int i = 0; i < a.length; i++) {
            a[i] =  new Random().nextInt(100);
        }

        Comparator comparar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                 Integer n1 = (Integer) o1;    
                 Integer n2 = (Integer) o2;

                 return n1-n2;
                
            }
            
        };

        Arrays.sort(a,comparar);

        System.out.println(Arrays.toString(a));
    }
}
