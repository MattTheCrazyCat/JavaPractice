package org.tullyfirst.myfirstapp;

import java.lang.reflect.Array;
/**
 * Created by ball on 7/7/2016.
 */
public class TheWordReverser {

    public String reverse(String word){
        char[] wordArray = word.toCharArray();
        char letter;
        String reversedWord = "";
        for (int i=wordArray.length -1; i >= 0; i--){
            reversedWord = reversedWord + wordArray[i];
        }
        return reversedWord;
    }
    public String reverseMultipleWords (String word){
        char[] wordArray = word.toCharArray();
        int spaces = 0;
        for (int i = 0; i < wordArray.length; i++{
            if (wordArray[i] = " ") {
                spaces++;
            }
        }
    }

}
