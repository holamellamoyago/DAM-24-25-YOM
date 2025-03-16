package ud5.interfacesejercicios.EP0928_Alumnos;

import java.util.Comparator;

public class ComparableEdad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
                Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;

        return -Integer.compare(a1.edad, a2.edad);
        
    }
    
}
