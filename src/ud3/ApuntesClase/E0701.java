package ud3.ApuntesClase;

public class E0701 {

    public static void main(String[] args) {
        E0701CuentaCorriente c = new E0701CuentaCorriente("39511342X", "Yago", 0);

        System.out.println("Elige operación");
        System.out.println("1. Sacar dinero");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Mostrar información");
        System.out.println("_________________________");

        int operacion = 1;

        switch (operacion) {
            case 1:
                c.sacarDinero(50);
                System.out.println(c.getSaldo());
                break;
            case 2:
                c.ingresarDinero(25);
                System.out.println(c.getSaldo());
                break;
            case 3:
                c.mostrar();
                break;

            default:
                break;
        }

    }
}