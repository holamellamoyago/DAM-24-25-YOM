package Contornos.ValidacionContrasenas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    // caso 1 
    @Test
    void comprobarcontrasenhaValida(){
        assertTrue(PasswordValidator.isValid("1234567A"));
    }

    // Caso 2 
    @Test
    void comprobarContrashenaSin8(){
        assertEquals(false, PasswordValidator.isValid("A12"));
    }

    
}
