package ud3.ApuntesClase;

public class Persona {
    // Datos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double estatura = 180;
    private String dni = null;
    public static int contadorPersonas;
    // private final String dni;

    // Constructores
    public Persona (String nombre, int edad, double estatura) {
        this.nombre = nombre; //asigna el parámetro al atributo
        this.edad =  edad;
        this.estatura = estatura;
    }

    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }



    


    Persona(){

    }



    // Métodos
    public void inicializar(String n, String a1, String a2, int e) {
        nombre = n;
        apellido1 = a1;
        apellido2 = a2;
        edad = e;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void incrementarContador() {
        contadorPersonas++;
    }

    public void incrementarAnhos() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        }
    }

    void crecer(double altura) {
        estatura += altura;
    }

    void saludar() {
        System.out.println("Hola, mi nombre es: " + nombre);
    }

}
