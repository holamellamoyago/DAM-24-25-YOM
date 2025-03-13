package ud5.interfacesejercicios.EP0913_Futbolista;

import java.util.Comparator;

public class Comparable implements Comparator {

    @Override
     public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;

        return f1.dni.compareTo(f2.dni);
        
    }

    Comparator compararNombre = new Comparator() {

        @Override
            public int compare(Object o1, Object o2) {
                Futbolista f1 = (Futbolista) o1;
                Futbolista f2 = (Futbolista) o2;
                return -f1.nombre.compareTo(f2.nombre);
            }
    };
    
    
}
