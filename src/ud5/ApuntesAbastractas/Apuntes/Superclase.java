
package ud5.ApuntesAbastractas.Apuntes;

public abstract class Superclase {
    int edad;

    public Superclase(int edad) {
        this.edad = edad;
    }

    void sumarNumero(){
        edad++;
    }

    abstract void restarNumero();

    

    
}