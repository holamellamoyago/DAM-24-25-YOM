package ud5.Practicas.Rol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import ud5.Practicas.Rol.Personaje.Raza;
import ud5.Practicas.Rol.SubclasesMounstro.Aranha;
import ud5.Practicas.Rol.SubclasesMounstro.Dragon;
import ud5.Practicas.Rol.SubclasesMounstro.Orco;
import ud5.Practicas.Rol.SubclasesMounstro.Troll;

public class app {
    public static void main(String[] args) {
        Personaje barbudo = new Personaje("Antonio", Raza.ORCO,1, 15 ,    20);
        Personaje oscar = new Personaje("Óscar", Raza.ORCO,1, 21 ,    20);
        Personaje eca = new Personaje("Eva", Raza.ORCO,1, 10 ,    20);

        barbudo.sumarExperiencia(1000);


        // System.out.println(barbudo.toString());

        barbudo.subirNivel();

        barbudo.setPuntosDeVida(10);

        System.out.println(barbudo.toString());

        barbudo.curar();
        System.out.println(barbudo.toString());

        Personaje[] personajes = {barbudo, oscar, eca};

        System.out.println(Arrays.toString(sortAgilidadDesc(personajes)));
    }

    static Personaje[] sortAgilidadDesc(Personaje[] personajes){
        Personaje comodin;

        for (int i = 0; i < personajes.length; i++) {
            if (personajes.length-1 != i) {
                if (personajes[i].agilidad > personajes[i+1].agilidad) { // El 1 está bien ordenado
                
                } else if(personajes[i].agilidad < personajes[i+1].agilidad){ // Cambiar posiciones
                    comodin = personajes[i];
    
                    personajes[i]= personajes[i+1];
                    
                    personajes[i+1] = comodin;
    
                    i = -1;
    
    
                } else{ // Son iguales

                }
            }
        }

        return personajes;


    }


    public Mounstro generarMostruo(){
        int nRandom = new Random().nextInt(11);

        switch (nRandom) {
            case 1,2,3,4:
                    return new Troll();
            case 5,6,7:
                    return new Aranha();
            case 8,9: return new Troll();
            case 10: return new Dragon();
        
            default:
            new  ArithmeticException("Error en generar mostruo");
            return null;
        }

    }
}
