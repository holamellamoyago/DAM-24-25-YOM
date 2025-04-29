package ud6.Practicas.E1301;

import java.util.List;

abstract interface Saludo<T> {
    abstract String saludar(T o);

    static <B> void saludoGrupo(List<B> lista) {
        for (Object e : lista) {
            System.out.println("Super "+ e);
        }
    }

}
