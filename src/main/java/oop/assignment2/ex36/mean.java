/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mean {
    public static final Scanner in = new Scanner(System.in);
    public double average(){
        String input = "";
        double convert = 0;
        ArrayList<Double> inputs = new ArrayList<>();
        while(!input.equals("done")){
            System.out.println("Enter a number: ");
            input = in.nextLine();
            if(input.matches(".*\\d.*")){
                convert = Double.parseDouble(input);
                inputs.add(convert);
            }
        }
        Collections.sort(inputs);
        min(inputs);
        double avg = convert / inputs.size();
        return avg;
    }

    public double min(ArrayList<Double> inputs) {
        return inputs.indexOf(0);
    }

    public double max(ArrayList<Double> inputs) {
        return inputs.indexOf(0);
    }
}
