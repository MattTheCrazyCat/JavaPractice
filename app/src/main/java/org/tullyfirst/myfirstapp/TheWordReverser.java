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
        for (int i=wordArray.length -1; i >= 0; i = i-1){
            reversedWord = reversedWord + wordArray[i];
        }
        return reversedWord;
    }
}
