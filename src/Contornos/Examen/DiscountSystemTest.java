package Contornos.Examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
// Yago Otero Martínez 

import org.junit.jupiter.api.Test;

public class DiscountSystemTest {
    @Test
    void testApplyDiscountMenorQue0() {
        try {
            double precio = DiscountSystem.applyDiscount(-1, false);
            fail("O importe non pode ser negativo");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    void testSinDescuento() {
        assertEquals(30, DiscountSystem.applyDiscount(30, false), 0.01);
    }

    @Test
    void testConDescuentodel005() {
        assertEquals(47.5, DiscountSystem.applyDiscount(50, false), 0.01);

    }

    @Test
    void testConDescuentodel010() {
        assertEquals(99, DiscountSystem.applyDiscount(110, false), 0.01);

    }

    @Test
    void testConDescuentodel015() {
        assertEquals(170, DiscountSystem.applyDiscount(200, true), 0.01);

    }

    @Test
    void testConDescuentodel10False() {
        assertEquals(180, DiscountSystem.applyDiscount(200, false), 0.01);

    }
}
