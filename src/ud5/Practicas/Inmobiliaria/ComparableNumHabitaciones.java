package ud5.Practicas.Inmobiliaria;

import java.util.Comparator;

public class ComparableNumHabitaciones implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Inmueble m1 = (Inmueble) o1;
        Inmueble m2 = (Inmueble) o2;

        int res = m1.habitaciones - m2.habitaciones;

        if (res == 0) {
            return new ComparableMetrosCuadrados().compare(o1, o2);
        } else{
            return res;
        }
    }
    
}
