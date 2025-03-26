package Contornos.Examen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import Contornos.Examen.EmailValidator;

// Yago OTero Martínez

public class EmailValidatorTest {

    @Test
    void testIsValid() {
        assertTrue(EmailValidator.isValid("yago@yago.com"));
    }

    @Test
    void noPunto() {
        assertFalse(EmailValidator.isValid("yago@acom"));
    }

    @Test
    void noArroba() {
        assertFalse(EmailValidator.isValid("yago.acom"));
    }
    @Test
    void nousuario() {
        assertFalse(EmailValidator.isValid("@a.com"));
    }
    @Test
    void testNull() {
        assertFalse(EmailValidator.isValid(null));
    }
}
