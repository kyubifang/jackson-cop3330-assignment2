/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        //if anagrams
        if(word1.length() == word2.length()){
            char[] a1 = word1.toLowerCase().toCharArray();
            char[] a2 = word2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        //else
        }else{
            return false;
        }
    }
}
