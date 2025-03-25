package ud6.ApuntesGenericos;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Contornos.MathUtils;

public class TestTest {
    // @Test
    // void testFactorialErrorNegativo() {

    //     try {
    //         int res = MathUtils.factorial(-1);
    //         fail("O número debe ser positivo");

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }

    @Test
    void testFactorial5() {

        Assert.assertEquals(120,MathUtils.factorial(5) );
    }

}
