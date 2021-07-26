/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class winner {
    private static final Scanner in = new Scanner(System.in);
    public String whoWins() {
        String entry;
        Random rand = new Random();
        List<String> names = new ArrayList<>();
        System.out.println("Enter a name: ");
        entry = in.nextLine();
        while(!entry.equals("")){
            names.add(entry);
            System.out.println("Enter a name: ");
            entry = in.nextLine();
        }
        int listSize = names.size();
        int win = rand.nextInt((listSize - 1) + 1) + 1;
        return names.get(win);
    }
}
