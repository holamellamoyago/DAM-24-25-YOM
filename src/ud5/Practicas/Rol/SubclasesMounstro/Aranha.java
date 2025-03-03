package ud5.Practicas.Rol.SubclasesMounstro;

import java.util.Random;

import ud5.Practicas.Rol.Mounstro;

public class Aranha extends Mounstro{
        Random random = new Random();
    int ataque, defensa,velocidad,puntosVida;


    public Aranha(){
        this.ataque = random.nextInt(10,50);
        this.defensa = random.nextInt(20,40);
        this.velocidad = random.nextInt(40,70);
        this.puntosVida = random.nextInt(30,80);
    }
}
