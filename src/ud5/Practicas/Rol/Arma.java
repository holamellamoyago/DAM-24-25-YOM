package ud5.Practicas.Rol;

public class Arma extends Item {
    int ataque;
    boolean dosManos;

    public Arma(String nombre, double peso, int precioBase, int ataque, boolean dosManos) {
        super(nombre, peso, precioBase);
        this.ataque = ataque;
        this.dosManos = dosManos;
    }


    public Arma(String nombre, double peso, int precioBase, int ataque){
        this(nombre, peso, precioBase, ataque, false);
    }


    
}
