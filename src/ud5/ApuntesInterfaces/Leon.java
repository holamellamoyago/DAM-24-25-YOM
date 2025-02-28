package ud5.ApuntesInterfaces;

public class Leon implements Sonido {

    @Override
    public void voz() {
        System.out.println("Grrrr");
        
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("GRR ZZ ");
        Sonido.super.vozDurmiendo();
    }

    
}
