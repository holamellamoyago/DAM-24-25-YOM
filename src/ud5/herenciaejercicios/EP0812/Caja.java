package ud5.herenciaejercicios.EP0812;

public class Caja {
    public enum Unidad {
        CM, M
    };

    int ancho, alto, fondo;
    public Unidad unidad;
    String etiqueta;

    public Caja() {
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    

    public Unidad getUnidad() {
        return unidad;
    }

    public double getVolumen(Caja caja) {
        return caja.alto * caja.ancho * caja.fondo;
    }

    void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            throw new ArithmeticException("Menor de 30");
        } else {
            this.etiqueta = etiqueta;
        }

    }

    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
                + etiqueta + "]";
    }

}
