package ud5.Practicas.Rol;

import java.util.Arrays;

// TODO Que las monedas no sean negativas 

public class PersonajeEx extends Personaje {
    int monedas; // default 0
    Item[] items;
    private double cargaMaxima;
    private double pesoTotal;

    public PersonajeEx(String nombre, int fuerza, int agilidad, int constitucion, byte nivel, int experiencia,
            int puntosDeVida, Raza raza, int monedas, Item[] items) {
        super(nombre, fuerza, agilidad, constitucion, nivel, experiencia, puntosDeVida, raza);
        this.monedas = monedas;
        this.items = items;
        this.cargaMaxima = (constitucion + 50) *2;
    }

    public PersonajeEx(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int monedas,
            Item[] items) {
        super(nombre, raza, fuerza, agilidad, constitucion);
        this.monedas = monedas;
        this.items = items;

        this.cargaMaxima = (constitucion + 50) *2;
    }

    public PersonajeEx(String nombre, Raza raza, int monedas, Item[] items) {
        super(nombre, raza);
        this.monedas = monedas;
        this.items = items;

        this.cargaMaxima = (constitucion + 50) *2;
        
    }

    // Dejé un constructor como default en el que solo llama al nombre de Personaje y los demas se añade mas tarde

    public PersonajeEx(String nombre, int monedas, Item[] items) {
        super(nombre);
        this.monedas = monedas;
        this.items = items;

        this.cargaMaxima = (constitucion + 50) *2;
    }

    public PersonajeEx(String nombre) {
        super(nombre);
        this.monedas = 0;
        this.items = new Item[0];

        this.cargaMaxima = (constitucion + 50) *2;
    }


    boolean addToInventario(Item item){

        // Peso con el ITEM puesto.
        for (Item itemsLista: items){
            pesoTotal += itemsLista.peso;
        }

        
        if (item.peso + pesoTotal > cargaMaxima) {
            System.out.println("El item excede el peso que puede transportar el Monstruo");
            return false;
        } else{
            items = Arrays.copyOf(	items, items.length+1);
            items[items.length-1] = item;

            System.out.println("Item añadido correctamente");

            return true;
        }
    }

    
    

}
