package io.training.jinterviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringReversalTest {
    StringReversal stringReversal = new StringReversal();

    @Test
    public void testStringReversalWithValidString() throws Exception{
        String str = "Hello";
        assertEquals("olleH", stringReversal.stringReversal(str));
    }
    @Test
    public void testStringReversalWithInvalidString() throws Exception{
        String str = "Hell0";
        assertNotEquals("olleH", stringReversal.stringReversal(str));
    }

}
