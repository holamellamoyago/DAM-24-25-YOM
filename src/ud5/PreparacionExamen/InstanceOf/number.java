package ud5.PreparacionExamen.InstanceOf;

import java.util.Arrays;
import java.util.Comparator;

public class number implements Comparator {
    public static void main(String[] args) {
        int contadorInt = 0;
        int contadorDouble = 0;

        Object[] t = {
            1,2.4,3, "Hola"
        };

        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i].getClass().getSimpleName());
            if (t[i] instanceof Integer) {
                contadorInt++;
            }
            
        }

        System.out.println(contadorInt);
        
        Object[] num2 = {1,2,3,4,5};

        Arrays.sort(num2, new number());

        System.out.println(Arrays.toString(num2));
    }
    
    @Override
    public int compare(Object o1, Object o2) {
        return -((Integer)o1) - ((Integer)o2);
        
    }



    
}
