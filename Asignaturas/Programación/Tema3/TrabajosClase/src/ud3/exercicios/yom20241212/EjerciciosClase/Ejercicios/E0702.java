package ud3.EjerciciosClase.Ejercicios;

import ud3.EjerciciosClase.Clases.*;

public class E0702 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("12345X", "Yago");
        cc.ingresarDinero();

        cc.sacarDinero();
    }
}
