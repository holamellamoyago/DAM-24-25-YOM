package ud5.Practicas.Rol;

public class Item {
    String nombre;
    double peso;
    int precioBase;


    public Item(String nombre, double peso, int precioBase) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioBase = precioBase;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        if (precioBase != other.precioBase)
            return false;
        return true;
    }


    

    
}
