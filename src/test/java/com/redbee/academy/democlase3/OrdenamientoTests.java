package com.redbee.academy.democlase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrdenamientoTests {

    @Test
    void testOrdenamiento() {
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3},
                Ordenamiento.ordenar(List.of(3, 2, 1)).toArray());
    }

    @Test
    void testOrdenamiento2() {
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5},
                Ordenamiento.ordenar(List.of(5, 4, 3, 2, 1)).toArray());
    }
}
