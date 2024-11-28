package ud3.ApuntesClase;

public class E0702CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;


    // Getters & Setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    // Constructores 
    

    public E0702CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public E0702CuentaCorriente(String dni, int saldo) {
        this(dni, "nombre", saldo);
    }

    // Metodos 
    void sacarDinero(double dinero){
        if (saldo <= 0) {
            System.out.println("Disculpa , dinero insuficiente");
        } else{
            saldo =- dinero;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    void ingresarDinero(double dinero){
        dinero = getSaldo() + dinero;

        setSaldo(dinero);
    }

    void mostrarInformacion(){
        System.out.println("El sueldo de: " + nombre + " con DNI " + dni + " es " + getSaldo());
    }
    
    
    
}
