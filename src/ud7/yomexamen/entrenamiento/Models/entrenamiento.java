package ud7.yomexamen.entrenamiento.Models;

import java.io.Serializable;

// Yago Otero Martínez

public class entrenamiento implements Serializable {
    private String nombreDeportista;
    private String fechaEntrenamiento;
    private int kmRecorridos;

    public entrenamiento(String nombreDeportista, String fechaEntrenamiento, int kmRecorridos) {
        this.nombreDeportista = nombreDeportista;
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public String toString() {
        return "( " + nombreDeportista + "), " + fechaEntrenamiento
                + " -> " + kmRecorridos + " Kms";
    }

}
