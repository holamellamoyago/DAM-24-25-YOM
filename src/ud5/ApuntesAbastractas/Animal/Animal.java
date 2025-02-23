package ud5.ApuntesAbastractas.Animal;

public abstract class Animal {
    public enum Raza {
        PERRO, GATO, CABALLO, VACA, CERDO, PATO, CONEJO, CABRA, LEON, TIGRE, LAGARTO, SERPENTE
    }

    

    Raza raza;

    public Animal(Raza raza) {
        this.raza = raza;
    }

    public abstract void hacerSonido();

}
