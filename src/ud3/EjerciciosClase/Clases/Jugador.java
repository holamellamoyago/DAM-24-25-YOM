package ud3.EjerciciosClase.Clases;

public class Jugador  {
    private String dni;
    private String nombre;
    private enum Posiciones {PORTERO,DEFENSA,CENTROCAMPISTA,DELANTERO,NO_POSICION};
    private Posiciones posicion;
    private double estatura;

    public Jugador(String dni, String nombre, double estatura, String posicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.estatura = estatura;
        this.posicion = Posiciones.valueOf(posicion.toUpperCase());
    }

    public Jugador(String nombre){
        this("dni", nombre, 99, "no_posicion");
    }

    public Jugador(String nombre, String posicion){
        this("dni", nombre, 99, posicion);
    }

    

    public void setPosicion(String posicion) {
        try {
            this.posicion = Posiciones.valueOf(posicion.toString());
            System.out.println("Hecho");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    


   public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void cambiarPosicion(String newPosicion){
        try {
            setPosicion(newPosicion.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error");
        }
   }



   
   
    public static void main(String[] args) {
        Jugador j = new Jugador("Yago", "portero");
        Jugador j2 = new Jugador("1234567X", "Yago", 180, "portero");
        Jugador j3 = new Jugador("Yago");

        j3.cambiarPosicion("portero");

        System.out.println(j3.getPosicion());
    }

    
}
