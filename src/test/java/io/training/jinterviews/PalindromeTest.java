package io.training.jinterviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void testPalindromeTestWithValidPalindrome() throws Exception {
        String str = "Lagerregal";
        assertTrue(palindrome.isPalindrome(str));
    }
    @Test
    public void testPalindromeTestWithInvalidPalindrome() throws Exception {
        String str = "Hello";
        assertFalse(palindrome.isPalindrome(str));
    }

    @Test
    public void testPalindromeTestWithNullWord() throws Exception {
        String str = null;
        assertFalse(palindrome.isPalindrome(str));
    }
    @Test
    public void testPalindromeTestWithEmptyWord() throws Exception {
        String str = "";
        assertFalse(palindrome.isPalindrome(str));
    }
}
