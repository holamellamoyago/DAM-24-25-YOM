package ud5.Practicas.Rol;

import java.util.Random;

public class Mounstro {

    String nombre;
    int ataque, defensa, velocidad, puntosDeVida;

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

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public String mostrar() {
        return "Mostruo " + nombre + "\nAtaque=" + ataque + ", defensa=" + defensa + ", velocidad="
                + velocidad + ", puntosVida=" + puntosDeVida;
    }

    @Override
    public String toString() {
        return "nombre" + "(" + puntosDeVida + ")";
    }

    int atacar(Mounstro enemigo) {
        int puntuacionAtaque = new Random().nextInt(1, 101) + this.ataque;

        int defensaDefensor = new Random().nextInt(1, 101) + enemigo.defensa;

        int diferencia = puntuacionAtaque - defensaDefensor;

        if (puntuacionAtaque == defensaDefensor) {
            // No pasa nada
        } else if (diferencia > 0 && diferencia >= enemigo.getPuntosDeVida()) {
            // El atacante gana la partida porqué termeino en 0 o menos la vida del enemigo
            System.out.println("El defensor muere");
            enemigo.perderVida(diferencia);
        } else if (diferencia > 0 && diferencia < enemigo.getPuntosDeVida()) {
            enemigo.perderVida(diferencia);

        } else {
            // El defensa gana
            System.out.println("El atacado consigue defenderse");
        }

        return diferencia;
    }
}
