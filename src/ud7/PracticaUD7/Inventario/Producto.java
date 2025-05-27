package ud7.PracticaUD7.Inventario;

import java.io.Serializable;

public class Producto implements Serializable, Comparable<Producto>{
    private int codigo, cantidad;
    private String nombre;
    private double precio;

    public Producto(int codigo, int cantidad, String nombre, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    

    public Producto(int codigo) {
        this.codigo = codigo;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
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
        Producto other = (Producto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo(Producto o) {
        return codigo-o.codigo;
    }

    @Override
    public String toString() {
        return "(" + codigo + ") " + nombre;
    }

    

    

}
