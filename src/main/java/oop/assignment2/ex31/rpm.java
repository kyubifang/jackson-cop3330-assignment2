/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex31;

public class rpm {
    public String restingHeartRate(int rHR, int age) {
        int x = 220 - age;
        int y = x - rHR;
        String out = "";
        System.out.println("Resting pulse: " + rHR + "        Age: " + age + "\n\n" +
                "Intensity    | Rate\n" +
                "-------------|--------");
        for(int i = 55; i <= 95; i += 5) {
            double intensity = i / 100.0;
            double target = y * intensity + rHR;
            target = Math.round(target);
            String convert = String.format("%.0f", target);
            out = out.concat(i + "%          | " + convert + " bpm\n");
        }
        return out;
    }
}
