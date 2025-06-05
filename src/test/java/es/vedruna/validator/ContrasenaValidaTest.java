package es.vedruna.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ContrasenaValidaTest {

    @Test
    void testValidPassword() {
        assertTrue(ContrasenaValida.isValidPassword("Clave123"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(ContrasenaValida.isValidPassword("clave"));
    }

    @Test
    void testValidEmail() {
        assertTrue(ContrasenaValida.isValidEmail("correo@example.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(ContrasenaValida.isValidEmail("correo@com"));
    }
}
