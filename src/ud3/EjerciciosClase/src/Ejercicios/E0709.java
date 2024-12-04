package Ejercicios;

import Clases.Bombilla;

public class E0709 {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla(1);
        Bombilla b2 = new Bombilla(2);
        Bombilla b3 = new Bombilla(3);


        b1.mostrarEstado();

        b2.alternarEstado();
        b2.mostrarEstado();


    }
}
