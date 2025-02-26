package ud5.Practicas.Rol;

import java.util.Random;
import java.util.Scanner;

import ud5.Practicas.Rol.Personaje.Raza;

public class AppCombateSingular {
    public static void main(String[] args) {
        System.out.println("Comienza la partida.");

        // Personaje personaje1 = escogerPersonaje();
        Personaje personaje1 = new Personaje("Oscar");
        System.out.println("________________________________");
        // Personaje presonaje2 = escogerPersonaje();
        Personaje presonaje2 = new Personaje("Antonio");

        if (personaje1.agilidad == presonaje2.agilidad) {
            int rdm = new Random().nextInt(1);

            if (rdm == 0) {
                atacar(personaje1, presonaje2);
            } else {
                atacar(presonaje2, personaje1);
            }
        } else if (personaje1.agilidad > presonaje2.agilidad) {
            atacar(personaje1, presonaje2);
        } else {
            atacar(presonaje2, personaje1);
        }
    }

    static void atacar(Personaje atacante, Personaje defensor) {
        System.out.println(atacante.nombre + "(" + atacante.puntosDeVida + ")" + " ataca a " + defensor.nombre + "("
                + defensor.puntosDeVida + " )");

        boolean bandera = false;

        do {
            atacante.atacar(defensor);

            int puntosDeAtaque = atacante.atacar(defensor);

            if (puntosDeAtaque == 0 || puntosDeAtaque < 0) {
                System.out.println("El ataque no tuvo exito");
            } else if (puntosDeAtaque > 0) {
                System.out.println("El ataque tuvo exito");

                System.out.println("Se perdieron " + puntosDeAtaque + " de vida");

                if (!defensor.estaVivo()) {
                    System.out.println("El personaje atacado " + (defensor.nombre) + " murio");
                }
            }

            comprobarSiEstanvivos(Personaje atacante , Personaje defensor)
        } while (!bandera);

    }

    static void comprobarSiEstanvivos(Personaje p1, Personaje p2){
        if (!p1.estaVivo()) {
            System.out.println("________________________________");
            System.out.println("El personaje" + p1.nombre + " murio");
            System.out.println("El personaje " + p2.nombre + " ha ganado");
        }

        if (!p2.estaVivo()) {
            System.out.println("________________________________");
            System.out.println("El personaje" + p1.nombre + " murio");
            System.out.println("El personaje " + p2.nombre + " ha ganado");
        }
    }

    static Personaje escogerPersonaje() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como se llamará esté personaje?");
        String nombre = sc.nextLine();

        System.out.println("Escoge el personaje1 ( HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL)");

        String raza = sc.nextLine();

        Personaje personaje = new Personaje(nombre, Raza.valueOf(raza.toUpperCase()));

        return personaje;

    }
}
