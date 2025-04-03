package ud6.Practicas.E1211;
import java.time.LocalDate;

public class Socio implements Comparable<Socio>{
    String dni, nombre;
    String fechaAlta;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = "a";
    }

    public Socio(String dni){
        this(dni, "Sin nombre");
    }

    

    @Override
    public String toString() {
        return nombre+": (" + dni+")";
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Socio other = (Socio) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Socio o) {
       return this.dni.compareTo(o.dni);
    }

    void antiguedad(){

    }

    
}
