package Contornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DiscountCalculatorTest {

    @Test
    @ParameterizedTest 
    @CsvSource( {"100,20,80"}) 
    void testApplyDiscountValido(int a, int b, int valorEsperado) {
        assertEquals(valorEsperado, DiscountCalculator.applyDiscount(a,b),0.01);
    }

    @Test
    void testErrorMayorQue100(){
        try {
            assertEquals(80, DiscountCalculator.applyDiscount(100, 101));
            fail();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
