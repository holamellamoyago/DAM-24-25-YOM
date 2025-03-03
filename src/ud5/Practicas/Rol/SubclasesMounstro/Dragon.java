package ud5.Practicas.Rol.SubclasesMounstro;

import java.util.Random;

import ud5.Practicas.Rol.Mounstro;

public class Dragon extends Mounstro{
    Random random = new Random();
    int ataque, defensa,velocidad,puntosVida;

    public Dragon() {
        this.ataque = random.nextInt(100,200);
        this.defensa = random.nextInt(60,100);
        this.velocidad = random.nextInt(80,120);
        this.puntosVida = random.nextInt(120,250);
    }

    
}
