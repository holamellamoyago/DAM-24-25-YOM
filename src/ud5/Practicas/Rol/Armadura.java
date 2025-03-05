package ud5.Practicas.Rol;

public class Armadura extends Item{
    enum TipoDefensa {YELMO, ARMADURA, ESCUDO};

    int defensa;
    TipoDefensa tipoDefensa;

    public Armadura(String nombre, double peso, int precioBase, int defensa, TipoDefensa tipoDefensa) {
        super(nombre, peso, precioBase);
        this.defensa = defensa;
        this.tipoDefensa = tipoDefensa;
    }

    

    



    
}
