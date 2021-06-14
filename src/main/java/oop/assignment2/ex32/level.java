package oop.assignment2.ex32;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class level {
    private static final Scanner in = new Scanner(System.in);
    public String guessGame(int difficulty) {
        String finish = "";
        Random rand = new Random();
        int guess = 0;
        if(difficulty == 1) {
            while(true) {
                try {
                    int input = 0;
                    int randomNum;
                    randomNum = rand.nextInt((10 - 1) + 1) + 1;
                    System.out.println("I have my number. What's your guess? ");

                    while (true) {
                        input = in.nextInt();
                        guess++;
                        if (input < randomNum) {
                            System.out.println("Too low. Guess again.");
                        } else if (input > randomNum) {
                            System.out.println("Too high. Guess again.");
                        } else {
                            System.out.println("You got it in " + guess + " guesses!");
                            break;
                        }
                    }break;
                } catch (InputMismatchException e) {
                    System.out.println("Not a number. Guess again.");
                    in.next();
                    guess++;
                }
            }
        }else if(difficulty == 2) {
            while(true) {
                try {
                    int input = 0;
                    int randomNum;
                    randomNum = rand.nextInt((100 - 1) + 1) + 1;
                    System.out.println("I have my number. What's your guess? ");

                    while (input != randomNum) {
                        input = in.nextInt();
                        guess++;
                        if (input < randomNum) {
                            System.out.println("Too low. Guess again.");
                        } else if (input > randomNum) {
                            System.out.println("Too high. Guess again.");
                        } else {
                            System.out.println("You got it in " + guess + " guesses!");
                            break;
                        }
                    }break;
                } catch (InputMismatchException e) {
                    System.out.println("Not a number. Guess again.");
                    in.next();
                    guess++;
                }
            }
        }else if(difficulty == 1) {
            while(true) {
                try {
                    int input = 0;
                    int randomNum;
                    randomNum = rand.nextInt((1000 - 1) + 1) + 1;
                    System.out.println("I have my number. What's your guess? ");

                    while (input != randomNum) {
                        input = in.nextInt();
                        guess++;
                        if (input < randomNum) {
                            System.out.println("Too low. Guess again.");
                        } else if (input > randomNum) {
                            System.out.println("Too high. Guess again.");
                        } else {
                            System.out.println("You got it in " + guess + " guesses!");
                            break;
                        }
                    }break;
                } catch (InputMismatchException e) {
                    System.out.println("Not a number. Guess again.");
                    in.next();
                    guess++;
                }
            }
        }
        return finish;
    }
}
