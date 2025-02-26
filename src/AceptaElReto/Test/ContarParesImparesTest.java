package AceptaElReto.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import AceptaElReto.Test.Pruebas;

public class ContarParesImparesTest {
    int [] numeros = {1,2,3,4,5,6,7,8,9};
    int [] resultado = {4,5};

    @Test
    void testContarParesImpares() {
        int [] paresImpares = Pruebas.contarParesImpares(numeros);

        assertEquals(Arrays.toString(resultado), Arrays.toString(paresImpares));

    }

    @Test
    void testContarParesImpares2() {
        assertEquals("Pares: 4 Impares: 5" , Pruebas.contarParesImpares());
    }
}
