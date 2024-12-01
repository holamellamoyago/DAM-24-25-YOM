package ud3.ApuntesClase;

<<<<<<< HEAD:src/ud3/EjerciciosClase/CuentaCorriente.java
public class CuentaCorriente {
    String dni;
    public String titular;
=======
public class E0701CuentaCorriente {
    private String dni;
    private String nombre;
>>>>>>> 7144c1f0902a83fd8a8ceb427d310cc5ff45afc7:src/ud3/ApuntesClase/E0701CuentaCorriente.java
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

<<<<<<< HEAD:src/ud3/EjerciciosClase/CuentaCorriente.java
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
=======
    
    // Constructores 
    public E0701CuentaCorriente(String dni, String nombre, double sueldo) {
>>>>>>> 7144c1f0902a83fd8a8ceb427d310cc5ff45afc7:src/ud3/ApuntesClase/E0701CuentaCorriente.java
        this.dni = dni;
        this.titular = titular;
        this.saldo = sueldo;
    }
<<<<<<< HEAD:src/ud3/EjerciciosClase/CuentaCorriente.java

    public CuentaCorriente(String titular, String dni) {
=======
    public E0701CuentaCorriente(String dni, String nombre) {
>>>>>>> 7144c1f0902a83fd8a8ceb427d310cc5ff45afc7:src/ud3/ApuntesClase/E0701CuentaCorriente.java
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
