package ud6.ApuntesYago;

import java.util.*;

public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }



    public static void main(String[] args) {
        Persona pepe = new Persona("pepe");
        
        Set<Persona> personasClase = new HashSet<>();
        personasClase.add(new Persona("pepe"));

        Set<Persona> personasInstituto = new HashSet<Persona>();
        personasInstituto.add(pepe);


        System.out.println(personasClase.equals(personasInstituto));
    }
}
