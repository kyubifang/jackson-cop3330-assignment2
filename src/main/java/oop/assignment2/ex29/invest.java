/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex29;

public class invest {
    public String investmentCalculator(double r) {
        double math = 72 / r;
        String total = Double.toString(math);
        if(math % 1 == 0) {
            total = String.format("%.0f", math);
        }
        return total;
    }
}
