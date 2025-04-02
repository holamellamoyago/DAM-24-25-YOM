package Contornos.MalosCheiros;

// Ejemplo de mala herencia , refused bequest
public class Servidor {
    String cpu, ram, grafica, fuente, disco;

    


    public Servidor(String cpu, String ram, String grafica, String fuente, String disco) {
        this.cpu = cpu;
        this.ram = ram;
        this.grafica = grafica;
        this.fuente = fuente;
        this.disco = disco;
    }




    void levantarServidorWeb() {

        System.out.println("Levantando servidor");
    }

}
