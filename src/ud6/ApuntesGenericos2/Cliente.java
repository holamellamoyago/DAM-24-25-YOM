package ud6.ApuntesGenericos2;

public class Cliente{

    String dni;
    String nombre;

    

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    



    // @Override
    // public int compareTo(Cliente o) {
    //     return o.dni.compareTo(o.dni);
    // }




    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }





    public static void main(String[] args) {
        
    }
}