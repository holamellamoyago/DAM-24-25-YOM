package AceptaElReto.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {

    Calculadora calcBasica;

    @BeforeEach
    public void ejecutarAntesDeCadaPrueba(){
        new Calculadora(5, 5);

    }

    @Test  
    public void testDivisionorCero(){
        
        Calculadora calculadora = new Calculadora(10, 0);
        try {
            int resultado = calculadora.divide();
            fail("Deberóa dar una excepcion");
        } catch (Exception e) {
            
        }
    }
    
    @ParameterizedTest
    @CsvSource({    "10, 20, 0",
    "30, -2, -15",
    "8, 2, 4" })
    public void testDivide1(int a, int b, int valorEsperado) {
        Calculadora calcu = new Calculadora(a, b);
        int resultado = calcu.divide();
        assertEquals(valorEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({    "10, 20, 200",
                    "30, -2, -60",
                    "8, 2, 16" })
    void testMultiplica(int a, int b, int valorEsperado) {
        Calculadora calcu = new Calculadora(a, b);
        int resultado = calcu.multiplica();
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void testResta() {
        double valorEsperado = 10;
        Calculadora calcu = new Calculadora(20, 10);
        double resultado = calcu.resta();
        assertEquals(valorEsperado, resultado, 0);
    }

    @Test
    void testSuma() {
        double valorEsperado = 30;
        Calculadora calcu = new Calculadora(20, 10);
        double resultado = calcu.suma();
        assertEquals(valorEsperado, resultado, 0);
    }
}
