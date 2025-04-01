package ud6.apuntescolecciones;

import java.util.ArrayList;
import java.util.Collection;

public class Coche {
    String modelo, matricula;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        Collection<Coche> coleccionCoche = coches;

        
    }
}
