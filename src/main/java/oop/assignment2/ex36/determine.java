/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex36;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class determine {
    public static final Scanner in = new Scanner(System.in);
    public int[] numbers(){
        String input = "";
        List<String> inputs = new ArrayList<>();
        while(!input.equals("done")){
            System.out.println("Enter a number: ");
            if(!input.equals("done")){
                input = in.nextLine();
                inputs.add(input);
            }
        }
        inputs.remove(input);
        int[] inputArray = new int[inputs.size()];
        for(int i = 0; i < inputs.size(); i++){
            inputArray[i] = Integer.parseInt(inputs.get(i));
        }
        return inputArray;
    }

    public double average(int[] num) {
        double total = 0;
        for (double v : num) {
            total += v;
        }
        return total / num.length;
    }

    public int min(int[] num) {
        int minimum = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] < minimum){
                minimum = num[i];
            }
        }
        return minimum;
    }

    public int max(int[] num) {
        int maximum = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > maximum){
                maximum = num[i];
            }
        }
        return maximum;
    }
    public BigDecimal std(int[] num, double avg){
        double standard = 0;
        double sq;
        double result;
        for (int j : num) {
            standard = standard + Math.pow((j - avg), 2);
        }
        sq = standard / num.length;
        result = Math.sqrt(sq);
        BigDecimal result2 = new BigDecimal(result);
        result2 = result2.setScale(2, RoundingMode.HALF_EVEN);
        return result2;
    }
}
