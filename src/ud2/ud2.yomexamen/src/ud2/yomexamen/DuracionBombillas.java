package ud2.yomexamen;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

//Yago Otero Martínez

public class DuracionBombillas {

    public static void main(String[] args) {

        causaFinBombilla(1000, 200, 10);
        causaFinBombilla(1000, 100, 1);
        causaFinBombilla(1000, 100, 10);
        causaFinBombilla(100, 100, 100);
        causaFinBombilla(100, -10, 10);
        causaFinBombilla(1000, 10, 0);

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

    private static void causaFinBombilla(int horasTotales, int numEncendidos, int horasEncendidas) {

        int totalHorasEncendida = horasEncendidas * numEncendidos;

        if (horasEncendidas > 10 || horasTotales <= 0 || numEncendidos <= 0 || horasEncendidas == 0) {
            System.out.println("ERROR");

        } else {

            if (totalHorasEncendida == horasTotales) {
                System.out.println("ENCENDIDOS + HORAS");
            } else if (totalHorasEncendida > horasTotales) {
                System.out.println("HORAS");
            } else {
                System.out.println("ENCENDIDOS");
            }
        }

    }

}
