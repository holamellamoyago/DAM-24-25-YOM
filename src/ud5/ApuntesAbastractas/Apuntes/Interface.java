package ud5.ApuntesAbastractas.Apuntes;

public interface Interface {

    String nombreColegio = "Chan Do Monte";
    
    default void mostrarColegio(){
        System.out.println(nombreColegio);
    }

    void restarNumero2();
}