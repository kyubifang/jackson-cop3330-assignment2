/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex27;

import java.util.Scanner;

/*
Exercise 27 - Validating Inputs

Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.

Display appropriate error messages on incorrect data.
Example Output

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints

    Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
    Use a single output statement to display the outputs.

Challenges

    Use regular expressions to validate the input.
    Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
    Repeat the process if the input is not valid.

 */
public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    private static String fn;
    private static String ln;
    private static String zc;
    private static String ei;

    public static void main(String[] args) {
        readUserInput();

        userInputs ui = new userInputs();
        String fName = ui.firstName(fn);
        String lName = ui.lastName(ln);
        String zCode = ui.zipCode(zc);
        String ID = ui.employeeID(ei);
        String valid = ui.validateInput(fName, lName, zCode, ID);

        String output = generateOutput(valid);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter the first name: ");
        fn = in.next();
        System.out.println("Enter the last name: ");
        ln = in.next();
        System.out.println("Enter the ZIP code: ");
        zc = in.next();
        System.out.println("Enter the employee ID: ");
        ei = in.next();
    }

    public static String generateOutput(String valid) {
        return valid;
    }
}
