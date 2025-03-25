package ud5.PreparacionExamen.JuicioIgualdad;

public class Arma {
    enum TipoArma {
        ESPADA, ARCO, VARITA
    }

    String nombre;
    int dañoBase;
    TipoArma tipo;

    public Arma(String nombre, int dañoBase, TipoArma tipo) {
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Arma other = (Arma) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Arma [nombre=" + nombre + ", dañoBase=" + dañoBase + ", tipo=" + tipo + "]";
    }

    

    

}
