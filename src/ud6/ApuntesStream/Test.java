package ud6.ApuntesStream;

import java.util.ArrayList;
import java.util.List;

import ClasesPublicas.Persona;

public class Test {
    
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>(List.of(new Persona("Pepe"), new Persona("Amador")));
        
        listaPersonas.sort((a,b) -> a.getNombre().compareTo(b.getNombre()));

        System.out.println(listaPersonas);
    }
}
