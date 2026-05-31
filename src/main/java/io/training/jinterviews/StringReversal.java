package io.training.jinterviews;


public class StringReversal {

    public String stringReversal(String wordToReverse){
        String reversedWord = "";
        for( int i = wordToReverse.length() - 1 ; i>= 0 ; i--){
                reversedWord = reversedWord + wordToReverse.charAt(i);
            }
        return reversedWord;
    }

}
