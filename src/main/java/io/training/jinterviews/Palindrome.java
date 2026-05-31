package io.training.jinterviews;

public class Palindrome {

 public boolean isPalindrome(String wordToCheck ){
     if(wordToCheck == null || wordToCheck.isBlank()){
         return false;
     }
     String wordPalindrome = "";
     for(int i = wordToCheck.length() - 1; i>=0; i--) {
         wordPalindrome += wordToCheck.charAt(i);
     }
     return wordPalindrome.equalsIgnoreCase(wordToCheck);
     }
}
