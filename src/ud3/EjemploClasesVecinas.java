package ud3;

import ud3.EjerciciosClase.CuentaCorriente;
import ud3.EjerciciosClase.Persona;

public class EjemploClasesVecinas {
    
    public static void main(String[] args) {
        Persona p = new Persona("39511342x" , "Yago");
        CuentaCorriente cc = new CuentaCorriente("39511342x", "Yago", 500);
        // System.out.println(cc.dni);
        // System.out.println(cc.nombre);
        // System.out.println(cc.saldo);
    }
}
