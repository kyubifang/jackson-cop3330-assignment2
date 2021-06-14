package oop.assignment2.ex25.base;

import java.util.Scanner;
/*
Exercise 25 - Password Strength Indicator

Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

    A very weak password contains only numbers and is fewer than eight characters.
    A weak password contains only letters and is fewer than eight characters.
    A strong password contains letters and at least one number and is at least eight characters.
    A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output

The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints

    Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
    Use a single output statement.

Challenge

    Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result

 */
public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String pass;

    public static void main(String[] args) {
        //read in string
        readUserInput();

        passwordStrength pd = new passwordStrength();
        int strength = pd.passwordValidator(pass);
        String password = determineStrength(strength);

        String output = generateOutput(password);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter a password");
        pass = in.next();
    }

    public static String determineStrength(int passwordValidator) {
        if(passwordValidator == 1){
            return "The password '" + pass + "' is a very weak password.";
        }else if(passwordValidator == 2){
            return "The password '" + pass + "' is a weak password.";
        }else if(passwordValidator == 3){
            return "The password '" + pass + "' is a good password.";
        }else if(passwordValidator == 4){
            return "The password '" + pass + "' is a strong password.";
        }else{
            return "The password '" + pass + "' is a very strong password.";
        }
    }

    public static String generateOutput(String password) {
        return password;
    }
}
