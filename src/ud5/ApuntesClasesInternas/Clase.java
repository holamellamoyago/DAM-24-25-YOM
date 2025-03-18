package ud5.ApuntesClasesInternas;

import java.util.Comparator;

public class Clase {
    static class clase2 {

    }

    class ClaseInterna{

    }

    public static void main(String[] args) {

        class ClaseInternaLocal{

        }


        Comparator claseAnonima = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {

                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            }

        };


    }
}
