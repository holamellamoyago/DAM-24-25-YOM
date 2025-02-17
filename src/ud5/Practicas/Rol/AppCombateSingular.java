package ud5.Practicas.Rol;

import java.util.Scanner;

import ud5.Practicas.Rol.Personaje.Raza;

public class AppCombateSingular {
    public static void main(String[] args) {
        System.out.println("Comienza la partida.");
        

    Personaje personaje = escogerPersonaje();

    System.out.println(personaje.toString());



    }

    static  Personaje escogerPersonaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como se llamará esté personaje?");
        String nombre = sc.nextLine();
        
        System.out.println("Escoge el personaje1 ( HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL)");

        String raza = sc.nextLine();

        Personaje personaje = new Personaje(nombre, Raza.valueOf(raza.toUpperCase()));

        return personaje;

    }
}
