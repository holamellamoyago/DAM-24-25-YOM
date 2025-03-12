package Contornos.ValidacionContrasenas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    // Caso 1 , menor o igual que 8 + caso 2 no entra en el bucle
    @Test
    void testIsValid() {
        assertFalse(PasswordValidator.isValid("123"));
    }

    // Caso 2, tiene mayusculas ¡¡ Tiene error , no detecta mayusculas!! 
    @Test 
    void testMayusculas(){
        assertTrue(PasswordValidator.isValid("AAAAAAAAAAAAAAAAAAAA"));
    }

    @Test
    void tieneNumeros(){
        assertTrue(PasswordValidator.isValid("1234567890"));
    }
    
}
