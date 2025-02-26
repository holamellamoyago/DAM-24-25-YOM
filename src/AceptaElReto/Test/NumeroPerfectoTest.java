package AceptaElReto.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NumeroPerfectoTest {
    @Test
    void testEsNumeroPerfecto() {
        boolean bandera = Pruebas.esNumeroPerfecto(4);
        assertEquals(true, bandera);
    }
}
