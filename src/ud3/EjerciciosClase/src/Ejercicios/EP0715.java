package Ejercicios;

import Clases.Caja;
import Clases.Calendario2;

// Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al
// realizar una compra, con el menor número de monedas y billetes posibles.

public class EP0715 {
    public static void main(String[] args) {
        Calendario2 fecha = new Calendario2(2025, 03, 31);
        // fecha.incrementarDia();
        Calendario2 fecha2 = new Calendario2(2025, 03, 31);
        System.out.println(fecha.iguales(fecha2));
        fecha.mostrar();
    }
}

    