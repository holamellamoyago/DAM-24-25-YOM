package ud5.Practicas.Rol2;

public class Personaje {
    enum raza  {HUMANO,ELFO, ENANO,HOBBIT,ORCO,TROLL}
    String nombre;
    int  fuerza,agilidad,constitucion;
    int nivel,experiencia, puntosVida;

    public Personaje(String nombre, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosVida) {
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

    

}
