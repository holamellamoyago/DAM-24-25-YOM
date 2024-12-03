package Clases;
public class Sintonizador {
    private double frecuencia;
    private double memoria1;
    private double memoria2;
    private double memoria3;

    public Sintonizador(double frecuencia) {

        if (frecuencia < 80 || frecuencia>108) {
            this.frecuencia = 80;
        } else {

            this.frecuencia = frecuencia;
        }

    }


    void mostrarFrecuencia() {
        System.out.println(frecuencia + "Mhz");
    }

    void bajarFrecuencia() {
        if (frecuencia <= 0) {
            System.out.println("Ya alcanzaste el mínimo");
            frecuencia = 80;
        } else {
            frecuencia = -0.5;
        }

        System.out.println("Ahora la frecuencia es: " + frecuencia);

    }

    void subirFrecuencia() {
        if (frecuencia < 0) {
            frecuencia = 0.5;
        } else {
            frecuencia = +0.5;
        }

        System.out.println("Ahora la frecuencia es: " + frecuencia);

    }
}
