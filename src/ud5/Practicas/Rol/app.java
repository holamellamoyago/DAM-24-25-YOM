package ud5.Practicas.Rol;

public class app {
    public static void main(String[] args) {
        Personaje barbudo = new Personaje("Barbudo");

        barbudo.sumarExperiencia(1000);


        System.out.println(barbudo.toString());

        barbudo.subirNivel();

        System.out.println(barbudo.toString());
    }
}
