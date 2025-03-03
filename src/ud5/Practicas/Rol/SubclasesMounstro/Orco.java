package ud5.Practicas.Rol.SubclasesMounstro;

import java.util.Random;

import ud5.Practicas.Rol.Mounstro;

public class Orco extends Mounstro{
        Random random = new Random();
    int ataque, defensa,velocidad,puntosVida;

    public Orco() {
        this.ataque = random.nextInt(30,80);
        this.defensa = random.nextInt(30,50);
        this.velocidad = random.nextInt(30,60);
        this.puntosVida = random.nextInt(30,100);
    }

    
}
