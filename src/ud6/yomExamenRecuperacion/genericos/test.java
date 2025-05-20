package ud6.yomExamenRecuperacion.genericos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import ClasesPublicas.Persona;

public class test {
    public static  void main(String[] args) {
        Persona p1 = new Persona("Yago", 22);
        Persona p2 = new Persona("Yago", 21);

        Comparator<Persona> c = new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int res ;

                res = o1.getNombre().compareTo(o2.getNombre());

                if (res == 0) {
                    res = o1.getEdad() - o2.getEdad();
                }


                return res;
            }
        };

        List<Persona> personas = Arrays.asList(p1,p2);

        personas.sort(c);

        System.out.println(personas);
        
    }
}
