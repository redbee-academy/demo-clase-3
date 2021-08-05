package com.redbee.academy.democlase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciRecursivoTests {

    @Test
    void testFibonacciRecursivo() {
        Assertions.assertEquals(8, Fibonacci.fibonacciAt(6));
    }
}
