package ud5.ApuntesAbastractas.Animal;

public class Perro extends Animal {
    String nombre;
    int edad;

    public Perro(String nombre, Raza raza, int edad) {
        super(raza);
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
        
    }

    
}
