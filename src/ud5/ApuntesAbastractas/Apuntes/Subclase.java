package ud5.ApuntesAbastractas.Apuntes;

public class Subclase extends Superclase implements Interface {
    String nombre;
    
    public Subclase(int edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }


    @Override
    void restarNumero() {
        super.edad--;
    }
    

    public static void main(String[] args) {
        Subclase sub = new Subclase(18, "Pepe");

        sub.sumarNumero();
        System.out.println(sub.edad);

        sub.restarNumero();
        System.out.println(sub.edad);

        sub.mostrarColegio();
        System.out.println(Interface.nombreColegio);
    }


    @Override
    public void restarNumero2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restarNumero2'");
    }




    
}
