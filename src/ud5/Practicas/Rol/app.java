package ud5.Practicas.Rol;

public class app {
    public static void main(String[] args) {
        Personaje barbudo = new Personaje("Barbudo");

        barbudo.sumarExperiencia(1000);


        // System.out.println(barbudo.toString());

        barbudo.subirNivel();

        barbudo.setPuntosDeVida(10);

        System.out.println(barbudo.toString());



        barbudo.curar();

        System.out.println(barbudo.toString());


    }
}
