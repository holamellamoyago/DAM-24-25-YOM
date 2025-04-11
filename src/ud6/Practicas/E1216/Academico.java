package ud6.Practicas.E1216;

import java.time.Year;


public class Academico implements Comparable<Academico> {
    String nombre;
    int anoIngreso;

    public Academico(String nombre, int anoIngreso) {
        this.nombre = nombre;
        this.anoIngreso = anoIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return nombre + ", " + anoIngreso;
    }

    

    



    


}
