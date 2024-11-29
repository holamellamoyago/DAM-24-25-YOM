package ud3.EjerciciosClase;

public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo;
    private String banco;

    private Gestor gestor;

    // Getters & Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String nombre) {
        this.titular = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double sueldo) {
        this.saldo = sueldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // Constructores
    public CuentaCorriente(String titular, String dni, double sueldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = sueldo;
    }

    public CuentaCorriente(String titular, String dni) {
        this.dni = dni;
        this.titular = titular;
    }

    // Metodos
    void sacarDinero(double dinero) {
        if (saldo <= 0) {
            System.out.println("Disculpa , dinero insuficiente");
        } else {
            saldo = -dinero;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    void ingresarDinero(double dinero) {
        dinero = getSaldo() + dinero;

        setSaldo(dinero);
    }

    public void mostrar() {
        System.out.println("El sueldo de: " + titular + " con DNI " + dni + " es " + getSaldo());

        if (gestor != null) {
            System.err.print(" - ");
            gestor.mostrar();
        }
    }

    public static void main(String[] args) {

    }

    public static boolean transferencia(CuentaCorriente c1, CuentaCorriente c2, double importe) {
        boolean resultado = false;
        if (c1 != null && c2 != null && c1.saldo >= importe) {

            c1.saldo -= importe;
            c2.saldo += importe;

            resultado = true;

        }

        return resultado;
    }

    public boolean transferir(CuentaCorriente c2, double importe) {
        
        boolean resultado = false;
        if (c2 != null && this.saldo >= importe) {

            this.saldo -= importe;
            c2.saldo += importe;

            resultado = true;

        }

        return resultado;
    }

}
