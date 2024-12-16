package ud3.yomExamen;

public class JuegoCarreras01 {
    CocheCarreras coche1;
    CocheCarreras coche2;
    int metrosRecorridos = 0;

    public JuegoCarreras01(CocheCarreras coche1, CocheCarreras coche2) {
        this.coche1 = coche1;
        this.coche2 = coche2;
    }

    public void iniciarCarrera(){
        int turno = coche1.getVelocidadMaxima() > coche2.getVelocidadMaxima() ? 1 : 2;

        // do

        // while(metrosRecorridos>=500){

        // }
    }





    public static void main(String[] args) {
        

    }

    
}
