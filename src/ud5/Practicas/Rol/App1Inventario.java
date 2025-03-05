package ud5.Practicas.Rol;

public class App1Inventario {
    public static void main(String[] args) {
        PersonajeEx p = new PersonajeEx("Oscar");

        Item antorcha = new Item("Antorcha", 10, 100);
        Item Escudo = new Item("Escudo", 10000, 100);

        p.addToInventario(antorcha);
        p.addToInventario(Escudo);
    }
}
