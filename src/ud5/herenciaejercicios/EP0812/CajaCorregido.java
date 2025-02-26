package ud5.herenciaejercicios.EP0812;

public class CajaCorregido {
    final int ancho, alto, fondo;
    String etiqueta;

    enum Unidad {
        CM, M
    }

    public CajaCorregido(int ancho, int alto, int fondo, String etiqueta, Unidad unidad) {
        int multiplicador = switch(unidad){
            case CM -> 1;
            case M -> 100;
            default -> 0;
        };
        
        if (multiplicador == 0) {
            throw new IllegalArgumentException("Medida no valida, CM o M");
        }

        if (ancho <= 0 || alto <= 0 || fondo <= 0) {
            throw new IllegalArgumentException("Ancho , alto o fondo mal ");
        }
        
        this.ancho = ancho * multiplicador;
        this.alto = alto * multiplicador;
        this.fondo = fondo * multiplicador;
    };

    double getVolumen(){
        return ancho * alto * fondo / 1000000.0;
    }

    public void setEtiqueta(String etiqueta){
        if (etiqueta != null && etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        }
    }

}
