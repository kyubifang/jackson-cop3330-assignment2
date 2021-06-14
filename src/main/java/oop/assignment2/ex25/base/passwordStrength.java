/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex25.base;

public class passwordStrength {
    public int passwordValidator(String pass) {
        int p = pass.length();
        /*
            1 = v weak
            2 = weak
            3 = good
            4 = strong
            5 = v strong
         */
        int level = 0;
        String specials = "~`!@#$%^&*()_-=+[{]}\\|;:',<.>/?";
        boolean letter = false;
        boolean num = false;
        boolean specChar = false;
        for(char i : pass.toCharArray()) {

            if(Character.isLetter(i)){
                letter = true;
            }
            if(Character.isDigit(i)) {
                num = true;
            }
            if(specials.contains(Character.toString(i))) {
                specChar = true;
            }
        }

        //word, num, char and >= 8 = 5
        if((letter && num && specChar) && (p >= 8)) {
            level = 5;
        //word/char, num and >= 8 = 4
        }else if((letter && num) || (specChar && num) && (p >= 8)) {
            level = 4;
        //char only and >= 8 = 3
        }else if(specChar && (p >= 8)) {
            level = 3;
        //word/num only and >= 8 = 2
        }else if((letter || num) && (p >= 8)) {
            level = 3;
        //word/char only and < 8 = 2
        }else if((letter || specChar) && p < 8) {
            level = 2;
        //num only and < 8 = 1
        }else if(num && p < 8) {
            level = 1;
        }
        return level;
    }
}
