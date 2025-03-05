package ud5.Practicas.Rol;

import ud5.Practicas.Rol.Armadura.TipoDefensa;

public class App2Armas{
    public static void main(String[] args) {
        PersonajeEx p = new PersonajeEx("Oscar");

        Armadura armadura = new Armadura("Yelmo de plata", 10, 100, 5, TipoDefensa.ESCUDO);
        Arma arma = new Arma("Espada de hierro", 20, 100, 50);

        p.equipar(armadura);
    }
}
