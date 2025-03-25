package ud5.PreparacionExamen.JuicioIgualdad;

public class ArmaLegendaria extends Arma{
    String habilidadUnica;

    public ArmaLegendaria(String nombre, int dañoBase, TipoArma tipo, String habilidadUnica) {
        super(nombre, dañoBase, tipo);
        this.habilidadUnica = habilidadUnica;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArmaLegendaria other = (ArmaLegendaria) obj;
        if (habilidadUnica == null) {
            if (other.habilidadUnica != null)
                return false;
        } else if (!habilidadUnica.equals(other.habilidadUnica))
            return false;
        return true;
    }

    
}
