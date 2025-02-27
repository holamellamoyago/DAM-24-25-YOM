package ud5.Practicas.Rol.SubclasesMounstro;

import java.util.Random;

public class Dragon {
    Random random = new Random();
    int ataque, defensa,velocidad,puntosVida;

    public Dragon() {
        this.ataque = random.nextInt(100,200);
        this.defensa = random.nextInt(60,100);
        this.velocidad = random.nextInt(80,120);
        this.puntosVida = random.nextInt(120,250);
    }

    
}
