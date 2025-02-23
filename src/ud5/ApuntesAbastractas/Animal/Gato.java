package ud5.ApuntesAbastractas.Animal;

public class Gato extends Animal {
    String nombre;
    int edad;
    public Gato(String nombre, Raza raza, int edad) {


        super(raza);
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
        
    }

    

    

    
}
