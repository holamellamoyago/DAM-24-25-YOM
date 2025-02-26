package ud5.Practicas.Rol;

import ud5.Practicas.Rol.Personaje.Raza;

public class app {
    public static void main(String[] args) {
        Personaje barbudo = new Personaje("Antonio", Raza.ORCO,1, 20 ,    20);

        barbudo.sumarExperiencia(1000);


        // System.out.println(barbudo.toString());

        barbudo.subirNivel();

        barbudo.setPuntosDeVida(10);

        System.out.println(barbudo.toString());

        barbudo.curar();
        System.out.println(barbudo.toString());


    }
}
