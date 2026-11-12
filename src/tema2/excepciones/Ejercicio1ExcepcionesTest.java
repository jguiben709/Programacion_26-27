package tema2.excepciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tema2.excepciones.Ejercicio1Excepciones.getPrecioConIva;

class Ejercicio1ExcepcionesTest {

    @Test
    void test1() throws PrecioDemasiadoAltoException {
        assertEquals(10.7085, getPrecioConIva(8.85));
    }

}