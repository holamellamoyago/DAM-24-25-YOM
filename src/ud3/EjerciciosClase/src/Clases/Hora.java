package Clases;


public class Hora {

    private int hora, minuto, segundos;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void mostrar() {
        System.out.println(
                "Hora : " + hora + " , Minuto: " + minuto + " , segundos: " + segundos);
    }

    // public Hora(){

    // }


    

    public Hora(int hora, int minuto, int segundos) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    public void incrementar1Segundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

    }

}
