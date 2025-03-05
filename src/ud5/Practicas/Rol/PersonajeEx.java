package ud5.Practicas.Rol;

import java.util.Arrays;

import ud5.Practicas.Rol.Armadura.TipoDefensa;

// TODO Que las monedas no sean negativas 

public class PersonajeEx extends Personaje {
    int monedas; // default 0
    Item[] items;
    private double pesoMaximo;

    Item itemManoIzq;
    Item itemManoDch;
    Armadura armaduraCabeza;
    Armadura armaduraCuerpo;

    private int manosOcupadas;

    public PersonajeEx(String nombre, int fuerza, int agilidad, int constitucion, byte nivel, int experiencia,
            int puntosDeVida, Raza raza, int monedas, Item[] items) {
        super(nombre, fuerza, agilidad, constitucion, nivel, experiencia, puntosDeVida, raza);
        this.monedas = monedas;
        this.items = items;
        this.pesoMaximo = (constitucion + 50) * 2;
    }

    public PersonajeEx(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int monedas,
            Item[] items) {
        super(nombre, raza, fuerza, agilidad, constitucion);
        this.monedas = monedas;
        this.items = items;

        this.pesoMaximo = (constitucion + 50) * 2;
    }

    public PersonajeEx(String nombre, Raza raza, int monedas, Item[] items) {
        super(nombre, raza);
        this.monedas = monedas;
        this.items = items;

        this.pesoMaximo = (constitucion + 50) * 2;

    }

    // Dejé un constructor como default en el que solo llama al nombre de Personaje
    // y los demas se añade mas tarde

    public PersonajeEx(String nombre, int monedas, Item[] items) {
        super(nombre);
        this.monedas = monedas;
        this.items = items;

        this.pesoMaximo = (constitucion + 50) * 2;
    }

    public PersonajeEx(String nombre) {
        super(nombre);
        this.monedas = 0;
        this.items = new Item[0];

        this.pesoMaximo = (constitucion + 50) * 2;
    }

    double pesoActualInventario() {
        double peso = 0;

        for (Item itemsLista : items) {
            peso += itemsLista.peso;
        }

        return peso;
    }

    boolean addToInventario(Item item) {

        // Peso con el ITEM puesto.

        if (item.peso + pesoActualInventario() > pesoMaximo) {
            System.out.println("El item excede el peso que puede transportar el Monstruo");
            return false;
        } else {
            items = Arrays.copyOf(items, items.length + 1);
            items[items.length - 1] = item;

            System.out.println("Item añadido correctamente");

            return true;
        }
    }

    void mostrarInformacion() {
        System.out.println("1. Inventario de personaje");
        System.out.println("==========================");
        System.out.println("\nInventario de " + nombre);

        for (int i = 0; i < items.length; i++) {
            System.out.println(i + ". " + items[i].nombre + ", peso: " + items[i].peso + ", precio: "
                    + items[i].precioBase + monedas);
        }

        System.out.println("\nCarga total transportada: " + pesoActualInventario() + "/" + pesoMaximo + " kilos");
    }

    @Override
    public String toString() {
        return "1. Inventario de personaje";
    }

    boolean equipar(Item item) {

        if (item instanceof Armadura) {
            Armadura armadura = (Armadura) item;

            if (armadura.tipoDefensa == TipoDefensa.ESCUDO) {
                if (itemManoDch == null) {
                    itemManoDch = armadura;
                    return true;
                } else if (itemManoIzq == null) {
                    itemManoIzq = armadura;
                    return true;
                } else {
                    return false;
                }
            } else if (armadura.tipoDefensa == TipoDefensa.YELMO) {
                if (armaduraCabeza == null) {
                    armaduraCabeza = armadura;
                    return true;
                } else {
                    return false;
                }
                // Es armadura pero no escud
            } else {
                // Es armadura por narices
                if (armaduraCuerpo == null) {
                    armaduraCuerpo = armadura;
                    return true;
                } else {
                    return false;
                }
            }
        } else if (item instanceof Arma) {
            Arma arma = (Arma) item;
            if (arma.dosManos) {
                if (itemManoDch == null && itemManoIzq == null) {
                    itemManoDch = arma;
                    itemManoIzq = arma;
                    return true;
                } else {
                    return false;
                }
            } else {
                // El arma es de una mano
                if (itemManoDch == null) {
                    itemManoDch = arma;
                    return true;
                } else if (itemManoIzq == null) {
                    itemManoIzq = arma;
                    return true;
                } else {
                    return false;
                }

                
            }
        } else {

            // No es ni arma ni armadura =?'='
            return false;
        }
    }

}
