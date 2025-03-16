package ud5.interfacesejercicios.EP0928_Alumnos;

import java.util.Comparator;

import ud5.interfacesejercicios.EP0913_Futbolista.Comparable;

public class ComparadorNota implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;

        int res = -Double.compare(a1.notaMedia, a2.notaMedia);

        if (res == 0) {
            res = new ComparableEdad().compare(o1, o2);
        }

        return res;

    }

}
