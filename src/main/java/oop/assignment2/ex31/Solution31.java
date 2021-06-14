package oop.assignment2.ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exercise 31 - Karvonen Heart Rate

When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output

Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints

    Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
    Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
    Display the results in a tabular format.

Challenge

    Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface in real time as the slider moves.

 */
public class Solution31 {
    private static final Scanner in = new Scanner(System.in);

    private static int rHR;
    private static int age;
    public static void main(String[] args) {
        readUserInput();

        rpm pulse = new rpm();
        String karvonen = pulse.restingHeartRate(rHR, age);

        String output = generateOutput(karvonen);

        System.out.println(output);
    }

    public static void readUserInput() {
        while(true) {
            try {
                System.out.println("What is your resting pulse? ");
                rHR = in.nextInt();
                System.out.println("How old are you? ");
                age = in.nextInt();
                break;
            } catch(InputMismatchException e) {
                System.out.println("You must enter a number.");
            }
        }
    }

    public static String generateOutput(String karvonen) {
        return karvonen;
    }
}
