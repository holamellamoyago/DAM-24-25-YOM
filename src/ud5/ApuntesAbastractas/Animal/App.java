package ud5.ApuntesAbastractas.Animal;

import ud5.ApuntesAbastractas.Animal.Animal.Raza;

public class App {
    public static void main(String[] args) {
        
        // Animal gato = new Animal("Minima" , Raza.GATO);
        Animal gato = new Gato("Minina", Raza.GATO, 21);
        Animal perro = new Perro("Arya", Raza.PERRO, 18);

        gato.hacerSonido();
        perro.hacerSonido();

    }
}
