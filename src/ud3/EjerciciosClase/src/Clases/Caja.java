package Clases;

public class Caja {
    int monedas1, monedas2, monedas5, monedas10, monedas20, monedas50, monedas1E, moneda2, billete5, billete10,
            billete20, billete50;

    double dineroADevolver;

    public Caja(double dineroADevolver) {
        this.dineroADevolver = dineroADevolver;
    }

    public void devoloverdinero() {

        do {

            if (dineroADevolver == 0) {
                System.out.println("Dinero devuelto correctamente");
            } else if (dineroADevolver < 0.02) {
                imprimirMensaje(monedas1, 0.01);
            } else if (dineroADevolver < 0.05) {
                imprimirMensaje(monedas2, 0.02);
            }
        } while (dineroADevolver != 0);

    }

    private void imprimirMensaje(int moneda, double valor){
        moneda++;
        dineroADevolver -= valor;
        System.out.println("Se te devuelve " + moneda + " monedas de " + valor);

    }


}
