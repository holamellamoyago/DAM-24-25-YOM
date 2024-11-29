package ud3;

import ud3.EjerciciosClase.CuentaCorriente;

public class EjemploClaseExternaCuentaCorriente {
    public static void main(String[] args) {
        // CuentaCorriente cc = new CuentaCorriente("39511342x", "Yago", 500);
        // CuentaCorriente cc2 = new CuentaCorriente("78739706b", "María", 1000);

        // // System.out.println(CuentaCorriente.getBanco());

        // Gestor gestor = new Gestor("Gestoria Otero", "692433876");
        // cc.setGestor(gestor);

        // cc.mostrar();
        // cc2.mostrar();

        CuentaCorriente c1 = new CuentaCorriente("Pepe", "99999999Z", 100);
        CuentaCorriente c2 = new CuentaCorriente("Marta", "77777777X", 50);
        c1.mostrar();
        c2.mostrar();
        // Método estático para transferencia entre 2 cuentas
        if (CuentaCorriente.transferencia(c1, c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");
        if (c1.transferir(c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");
        c1.mostrar();
        c2.mostrar();
    }
}
