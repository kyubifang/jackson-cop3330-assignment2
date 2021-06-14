/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex24.base;

import java.util.Scanner;
/*
Exercise 24 - Anagram Checker

Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.
Example Output

Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints

    Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
    Check that both words are the same length.

Challenge

    Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.

 */
public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //read in two string
        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word 2");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram) {
        if(isAnagram) {
            return "is anagram";
        } else {
            return "is not anagram";
        }
    }
}
