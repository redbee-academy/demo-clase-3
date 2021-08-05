package com.redbee.academy.democlase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumerosPrimosTests {

    @Test
    void testEsNumeroPrimo() {
        Assertions.assertTrue(NumerosPrimos.esPrimo(2));
    }

    @Test
    void testEsNumeroPrimo2() {
        Assertions.assertFalse(NumerosPrimos.esPrimo(2000));
    }

    @Test
    void testNoEsNumeroPrimo() {
        Assertions.assertFalse(NumerosPrimos.esPrimo(6));
    }

    @Test
    void testNoEsNumeroPrimo2() {
        Assertions.assertFalse(NumerosPrimos.esPrimo(0));
    }

    @Test
    void testNoEsNumeroPrimo3() {
        Assertions.assertFalse(NumerosPrimos.esPrimo(1));
    }

    @Test
    void testListaNumerosPrimos() {
        Assertions.assertArrayEquals(new Integer[]{2, 3, 5, 7},
                NumerosPrimos.listaNumerosPrimos(4, 0).toArray());
    }

    @Test
    void testListaNumerosPrimosDesdeNumeroNegativo() {
        Assertions.assertArrayEquals(new Integer[]{2, 3, 5, 7},
                NumerosPrimos.listaNumerosPrimos(4, -1000).toArray());
    }
}
