package test;

import org.junit.jupiter.api.Test;
import tema2.metodos.Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import static tema2.metodos.Ejercicio1.esPrimo;


class Test1Test {
    @Test
    void el7EsPrimo() {
        assertTrue(esPrimo(7));
    }



    @Test
    void esPar() {
        assertTrue(Ejercicio1.esPar(33));
    }

}