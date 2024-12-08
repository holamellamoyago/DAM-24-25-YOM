package Ejercicios;

import Clases.CuentaCorriente;

public class E0702 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("12345X", "Yago");
        cc.ingresarDinero();

        cc.sacarDinero();
    }
}
