package ud5.Practicas.Rol.SubclasesMounstro;

import java.util.Random;

import ud5.Practicas.Rol.Mounstro;

public class Troll extends Mounstro{
        Random random = new Random();
    int ataque, defensa,velocidad,puntosVida;

    public Troll(){
        this.ataque = random.nextInt(60,120);
        this.defensa = random.nextInt(50,70);
        this.velocidad = random.nextInt(20,40);
        this.puntosVida = random.nextInt(100,200);
    }
}
