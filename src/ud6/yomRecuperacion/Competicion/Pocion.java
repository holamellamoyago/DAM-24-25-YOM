package ud6.yomRecuperacion.Competicion;

import java.util.*;

public class Pocion implements Comparable<Pocion> {
    private String nombre;
    private List<String> ingredientes;
    private int nivelPotencia;

    public Pocion(String nombre, List<String> ingredientes, int nivelPotencia) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.nivelPotencia = nivelPotencia;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public int getNivelPotencia() {
        return nivelPotencia;
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
        Pocion other = (Pocion) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + "(" + nivelPotencia + ")";
    }

    @Override
    public int compareTo(Pocion o) {
        int res;

        res = o.nivelPotencia - nivelPotencia;

        if (res == 0) {
            getNombre().compareTo(o.nombre);
        }

        return res;
    }

}
