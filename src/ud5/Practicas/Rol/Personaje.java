package ud5.Practicas.Rol;

import java.util.Random;

public class Personaje {
    enum Raza {
        HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
    }

    String nombre;
    Raza raza;
    int experiencia, puntosDeVida;
    byte nivel;
    double fuerza, agilidad, constitucion;


    int vidaInicial;

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

        vidaInicial = puntosDeVida;

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

        vidaInicial = puntosDeVida;

        
    }

    public Personaje(String nombre, Raza raza){
        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = generarValor();
        this.agilidad = generarValor();
        this.constitucion = generarValor();
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosDeVida = 50 + generarValor();


        vidaInicial = puntosDeVida;



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
    }


    private int generarValor(){
        return new Random().nextInt(0, 101);
    }


    private int validarValor(int valor) {
        return valor < 1 ? 1 : valor;
    }

    private double validarValor(double valor) {
        return valor < 1 ? 1 : valor;
    }

    @Override
    public String toString() {
        return "Personaje " + nombre + "\nFuerza=" + fuerza + ", agilidad=" + agilidad + ", constitucion="
                + constitucion + ", nivel=" + nivel + ", experiencia=" + experiencia + ", puntosDeVida=" + puntosDeVida;
    }

    byte sumarExperiencia(int puntos){

        this.experiencia += puntos;

        while (puntos > 1000) {
            this.nivel++;
            puntos-=1000;
        }

        return this.nivel;
    }


    public void subirNivel(){
        this.nivel++;

        this.fuerza = fuerza + fuerza*0.05;
        this.agilidad = agilidad + agilidad*0.05;
        this.constitucion = constitucion + constitucion*0.05;
    }

    public void curar(){

    }
}
