package ud5.PreparacionExamen.Rol;

import java.util.Random;

public class Personaje {
    public enum Raza {
        HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
    }

    String nombre;
    int fuerza, agilidad, constitucion;
    int nivel, experiencia, puntosVida;
    Raza raza;

    public Personaje(String nombre, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosVida, Raza raza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosVida = puntosVida;

        if (this.fuerza < 0 || this.agilidad < 0 || this.constitucion < 0) {
            throw new ArithmeticException("Error en los valores de los atributos");
        }
    }

    public Personaje(String nombre, int fuerza, int agilidad, int constitucion, Raza raza) {
        this(nombre, fuerza, agilidad, constitucion, 1, 0, (50 + constitucion), raza);
    }

    public Personaje(String nombre, Raza raza) {
        Random rdm = new Random();
        int constitucion = rdm.nextInt(1, 101);
        this(nombre, rdm.nextInt(1, 101), rdm.nextInt(1, 101), constitucion, 1, 0, 50 + constitucion, raza);
    }

    public Personaje(String nombre) {
        Random rdm = new Random();
        int constitucion = rdm.nextInt(1, 101);
        this(nombre, rdm.nextInt(1, 101), rdm.nextInt(1, 101), constitucion, 1, 0, 50 + constitucion, Raza.HUMANO);
    }

    public static void main(String[] args) {
        Personaje p = new Personaje("Orco malo", 10, 2, 4, 9, 10, 100, Raza.ORCO);
    }

}
