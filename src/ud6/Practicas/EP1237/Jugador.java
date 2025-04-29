package ud6.Practicas.EP1237;

enum posicion {
    PORTERO, DEFENSA, CENTRO, DELANTERO
};

public class Jugador {
    String nombre;
    String dni;
    posicion posiicion;

    public Jugador(String nombre, String dni, posicion posiicion) {
        this.nombre = nombre;
        this.dni = dni;
        this.posiicion = posiicion;
    }

    public Jugador(String nombre){
        this(nombre, "NO DNI", null);
    }

    @Override
    public String toString() {
        return nombre;
    }

    

    


}
