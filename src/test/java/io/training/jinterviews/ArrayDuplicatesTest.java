package io.training.jinterviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayDuplicatesTest {
    @Test
    public void testArrayDuplicates(){
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        String[] testArray = new String[] {"a","b","c","a","a","e","f","b"};
        String[] expectedArray = new String[] {"a", "b"};
        assertArrayEquals(expectedArray, arrayDuplicates.findDuplicates(testArray));
    }

    @Test
    public void testArrayDuplicatesWithoutDuplicates(){
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        String[] testArray = new String[] {"a","b","c","d","e","f"};
        String[] expectedArray = new String[]{};
        assertArrayEquals(expectedArray, arrayDuplicates.findDuplicates(testArray));
    }
    @Test
    public void testArrayDuplicatesWithEmptyArray(){
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        String[] testArray = new String[0];
        assertArrayEquals(testArray, arrayDuplicates.findDuplicates(testArray));
    }

    @Test
    public void testArrayDuplicatesWithNullArray() throws Exception{
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        String[] testArray = null;
        assertNull(arrayDuplicates.findDuplicates(testArray));
    }
}
