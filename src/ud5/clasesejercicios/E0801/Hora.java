package ud5.clasesejercicios.E0801;

public class Hora {
    int hora;
    int minuto;
    int segundo;

    // Constructores
    // _______________________________________________

    public Hora(int hora, int minuto) {

        if (hora <= 23 && hora >= 0 && minuto >= 0 && minuto <= 59) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            throw new ArithmeticException("No se pueden crear esta hora");
        }

    }

    // Getters y setters
    // _________________________________________________

    void inc() {

        // Pasa un día
        if (hora >= 23) {
            if (minuto >= 59) {
                hora = 0;
                minuto = 0;
            }
        } else if (minuto >= 59) {
            hora++;
            minuto = 0;
        } else {
            minuto++;
        }

    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean setMinuto(int minuto) {
        return comprobarMinuto(minuto);
    }

    // Metodos
    // _______________________________________________________

    @Override
    public String toString() {
        return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
    }

    boolean comprobarHora(int hora) {
        return hora <= 23 && hora >= 0 ? true : false;
    }

    boolean comprobarMinuto(int minuto) {
        return minuto <= 59 && minuto >= 0 ? true : false;
    }


}
