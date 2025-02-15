package ud5.Practicas.Rol;

public class Personaje {
    enum raza {
        HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
    }

    String nombre;

    int fuerza, agilidad, constitucion, nivel, experiencia, puntosDeVida;

    public Personaje(String nombre, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosDeVida) {
        this.nombre = nombre;
        this.fuerza = validarValor(fuerza);
        this.agilidad = validarValor(agilidad);
        this.constitucion = validarValor(constitucion);
        this.nivel = validarValor(nivel);
        this.experiencia = experiencia < 0 ? 0 : experiencia;
        this.puntosDeVida = validarValor(puntosDeVida);

    }

    private int validarValor(int valor) {
        return valor < 1 ? 1 : valor;
    }

    @Override
    public String toString() {
        return "Personaje " + nombre + "\nFuerza=" + fuerza + ", agilidad=" + agilidad + ", constitucion="
                + constitucion + ", nivel=" + nivel + ", experiencia=" + experiencia + ", puntosDeVida=" + puntosDeVida;
    }

}
