package ud6.Practicas.EP1237;

import java.util.Map;
import java.util.TreeMap;

public class EP1237 {
    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new TreeMap<>();

        altaJugador(plantilla, 1, new Jugador("Antonnio Recio", "X", posicion.PORTERO));
        altaJugador(plantilla, 11, new Jugador("CRY el Bixoo siuuuuu", "x", posicion.DELANTERO));

        mostrar(plantilla);
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (plantilla.containsKey(dorsal)) {
            throw new ArithmeticException("No posible repetir num");
        }

        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!plantilla.containsKey(dorsal)) {
            throw new ArithmeticException("No se encontro el jugadir");
        }

        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Integer e : plantilla.keySet()) {
            System.out.print(e + " - ");
            System.out.print(plantilla.get(e));
            System.out.println();
        }

    }
}
