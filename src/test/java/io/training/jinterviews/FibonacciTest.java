package io.training.jinterviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacciRecursion() throws Exception {
        assertEquals(34, fibonacci.fibonacciRecursion(9));
        assertEquals(8, fibonacci.fibonacciRecursion(6));
        assertEquals(0, fibonacci.fibonacciRecursion(-1));
        assertEquals(0, fibonacci.fibonacciRecursion(0));
        assertEquals(1, fibonacci.fibonacciRecursion(1));
    }

    @Test
    public void testFibonacciSchleife() throws Exception {
        assertEquals(34, fibonacci.fibonacciSchleife(9));
        assertEquals(21, fibonacci.fibonacciSchleife(8));
        assertEquals(0, fibonacci.fibonacciSchleife(-10));
        assertEquals(0, fibonacci.fibonacciSchleife(0));
        assertEquals(1, fibonacci.fibonacciSchleife(1));
    }
}
