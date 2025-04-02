package Contornos.MalosCheiros;

public class Ordenador extends Servidor{
    String so;

    Cliente cliente;


    public Ordenador(String cpu, String ram, String grafica, String fuente, String disco, String so, Cliente cliente) {
        super(cpu, ram, grafica, fuente, disco);
        this.so = so;
        this.cliente = cliente;
    }




    @Override
    void levantarServidorWeb() {
        throw new ArithmeticException("Un ordenador no puede levantar el servidor....");
    }


    
    
}
