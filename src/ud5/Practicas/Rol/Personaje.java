package ud5.Practicas.Rol;

import java.util.Random;

public class Personaje {
    public enum Raza {
        HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
    }

    String nombre;
    Raza raza;
    int experiencia, puntosDeVida;
    byte nivel;
    double fuerza, agilidad, constitucion;

    private int vidaInicial;

    public Personaje(String nombre, int fuerza, int agilidad, int constitucion, byte nivel, int experiencia,
            int puntosDeVida, Raza raza) {

        this.nombre = nombre;
        this.fuerza = validarValor(fuerza);
        this.agilidad = validarValor(agilidad);
        this.constitucion = validarValor(constitucion);
        this.nivel = nivel < 0 ? 1 : nivel;
        this.experiencia = experiencia < 0 ? 0 : experiencia;
        this.puntosDeVida = 50 + validarValor(constitucion);
        this.raza = raza;

        this.vidaInicial = puntosDeVida;

    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = validarValor(fuerza);
        this.agilidad = validarValor(agilidad);
        this.constitucion = validarValor(constitucion);
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = 50 + validarValor(constitucion);

        this.vidaInicial = puntosDeVida;

    }

    public Personaje(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = generarValor();
        this.agilidad = generarValor();
        this.constitucion = generarValor();
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = 50 + generarValor();

        this.vidaInicial = puntosDeVida;

    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.raza = Raza.HUMANO;
        this.fuerza = generarValor();
        this.agilidad = generarValor();
        this.constitucion = generarValor();
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = 50 + generarValor();

        this.vidaInicial = puntosDeVida;

    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    private int generarValor() {
        return new Random().nextInt(0, 101);
    }

    private int validarValor(int valor) {
        if (valor >= 0) {
            return valor;
        } else {
            throw new ArithmeticException("Personaje no valido");
        }
    }

    public String mostrar() {
        return "Personaje " + nombre + "\nFuerza=" + fuerza + ", agilidad=" + agilidad + ", constitucion="
                + constitucion + ", nivel=" + nivel + ", experiencia=" + experiencia + ", puntosDeVida=" + puntosDeVida;
    }

    @Override
    public String toString() {
        return this.nombre + "(" + puntosDeVida + "/" + vidaInicial + ")";
    }

    byte sumarExperiencia(int puntos) {

        this.experiencia += puntos;

        while (puntos > 1000) {
            this.nivel++;
            puntos -= 1000;
        }

        return this.nivel;
    }

    public void subirNivel() {
        this.nivel++;

        this.fuerza = fuerza + fuerza * 0.05;
        this.agilidad = agilidad + agilidad * 0.05;
        this.constitucion = constitucion + constitucion * 0.05;
    }

    public void curar() {

        if (puntosDeVida >= vidaInicial) {
            System.out.println("No se puede usar curación , tu vida está al limite");
        } else {
            puntosDeVida = vidaInicial;
        }
    }

    boolean perderVida(int puntos) {
        this.puntosDeVida -= puntos;

        if (this.puntosDeVida <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaVivo() {
        if (this.puntosDeVida > 0) {
            return true;
        } else {
            return false;
        }

    }

    int atacar(Personaje enemigo) {
        int puntuacionAtaque = new Random().nextInt(1, 101) + (int) fuerza;

        int defensaDefensor = new Random().nextInt(1, 101) + (int) agilidad;

        int diferencia = puntuacionAtaque - defensaDefensor;

        if (puntuacionAtaque == defensaDefensor) {
            // No pasa nada
        } else if (diferencia > 0 && diferencia >= enemigo.getPuntosDeVida()) {
            // El atacante gana la partida porqué termeino en 0 o menos la vida del enemigo
            System.out.println("El defensor muere");
            enemigo.perderVida(diferencia);
        } else if (diferencia > 0 && diferencia < enemigo.getPuntosDeVida()) {
            enemigo.perderVida(diferencia);

            this.experiencia += diferencia;
            enemigo.sumarExperiencia(diferencia);
        } else {
            // El defensa gana
            System.out.println("El atacado consigue defenderse");
        }

        return diferencia;
    }

    int atacar(Mounstro enemigo) {
        int puntuacionAtaque = new Random().nextInt(1, 101) + (int) fuerza;

        int defensaDefensor = new Random().nextInt(1, 101) + (int) agilidad;

        int diferencia = puntuacionAtaque - defensaDefensor;

        if (puntuacionAtaque == defensaDefensor) {
            // No pasa nada
        } else if (diferencia > 0 && diferencia >= enemigo.getPuntosDeVida()) {
            // El atacante gana la partida porqué termeino en 0 o menos la vida del enemigo
            System.out.println("El defensor muere");
            enemigo.perderVida(diferencia);
        } else if (diferencia > 0 && diferencia < enemigo.getPuntosDeVida()) {
            enemigo.perderVida(diferencia);

            this.experiencia += diferencia;
        } else {
            // El defensa gana
            System.out.println("El atacado consigue defenderse");
        }

        return diferencia;
    }
}
