package ud5.ApuntesInterfaces.Animales;

public interface Sonido {
    int version = 1;
    void voz();

    default void vozDurmiendo(){
        System.out.println("ZZZZzzzzz");
    }

    static void bostezo(){
        System.out.println("Auuu");
    }
}
