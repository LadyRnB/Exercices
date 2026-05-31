package io.training.jinterviews;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int number;

    @Test
    public void testFizzBuzzMultipleOfThreeAndFive() throws Exception {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
    }

    @Test
    public void testFizzBuzzMultipleOfFive() throws Exception {
    assertEquals("Buzz", fizzBuzz.fizzBuzz(25));
    assertEquals("Buzz", fizzBuzz.fizzBuzz(35));
    }

    @Test
    public void testFizzBuzzMultipleOfThree() throws Exception {
    assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
    assertEquals("Fizz", fizzBuzz.fizzBuzz(12));
    }

    @Test
    public void testFizzBuzzWithANormalNumber() throws Exception {
    assertEquals("7", fizzBuzz.fizzBuzz(7));
    assertEquals("4", fizzBuzz.fizzBuzz(4));
    }
}
