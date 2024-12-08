package ud3.EjerciciosClase.Ejercicios;

import ud3.EjerciciosClase.Clases.*;

// Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al
// realizar una compra, con el menor número de monedas y billetes posibles.

public class EP0715 {
    public static void main(String[] args) {
        Calendario fecha = new Calendario(2025, 03, 31);
        // fecha.incrementarDia();
        Calendario fecha2 = new Calendario(2025, 03, 31);
        System.out.println(fecha.iguales(fecha2));
        fecha.mostrar();
    }
}

    