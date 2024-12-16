package ud3.EjercicioYago;

public class Ascensor {
    
    private int plantaOrigen;
    private int plantaDestino;


    public Ascensor(int plantaOrigen) {
        this.plantaOrigen = plantaOrigen;
    }

    private void cambiarPlanta(int plantaDestino){
        // plantaDestino = Math.abs(plantaDestino);
        this.plantaOrigen += plantaDestino;

        if (this.plantaOrigen > 4 || this.plantaOrigen<-2) {
            throw new IllegalAccessError("Error , no puedes bajar menos de -2 o subir de la planta 4");
        }else{
            System.out.println(this.plantaOrigen);
        }
    }

    
    public static void main(String[] args) {
        Ascensor a = new Ascensor(1);
        a.cambiarPlanta(3);
    }


}
