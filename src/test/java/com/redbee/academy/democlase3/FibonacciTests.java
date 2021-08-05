package com.redbee.academy.democlase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTests {

    @Test
    void testFibonacci() {
        Assertions.assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
                Fibonacci.serieFibonacci(10).toArray());
    }

    @Test
    void testFibonacci2() {
        Assertions.assertArrayEquals(new Integer[]{},
                Fibonacci.serieFibonacci(0).toArray());
    }

    @Test
    void testFibonacci3() {
        Assertions.assertArrayEquals(new Integer[]{},
                Fibonacci.serieFibonacci(1).toArray());
    }

    @Test
    void testFibonacci4() {
        Assertions.assertArrayEquals(new Integer[]{0, 1},
                Fibonacci.serieFibonacci(2).toArray());
    }
}
