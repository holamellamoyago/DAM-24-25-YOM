package Clases;

public class Bombilla {
    private int bombilla;
    private boolean encendida = false;
    private boolean interruptor = false;
    private static boolean interruptorGeneral;

    public void encender(){
        interruptor = true;
    }
    public void apagar(){
        interruptor = false;
    }

    public static void encenderInterruptorGeneral(){
        interruptorGeneral = true;
    }
    public static void apagarInterruptorGeneral(){
        interruptorGeneral = false;
    }

    public boolean estado(){
        return interruptor && interruptorGeneral;
    }

    public static boolean estado(Bombilla b2){
        return b2.interruptor && interruptorGeneral;
    }

    
    


    // public Bombilla(int bombilla) {
    //     this.bombilla = bombilla;
    // }


    // public void interruptorGeneral(int b1, int b2, int b3){
    //     alternarEstado();
    // }


    // public void alternarEstado(){
    //     encendida  = !encendida;
    // }

    // public void mostrarEstado(){

    //     String estado = encendida ? "Encendida" : "Apagada";

    //     System.out.println("La bombilla " + bombilla + " esta " + estado);
    // }
}
