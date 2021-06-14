package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    private static final Scanner in = new Scanner(System.in);

    private static String choice;
    public ArrayList<String> employeeNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        System.out.println("There are 5 employees:\n" +
                names.get(0) + "\n" +
                names.get(1) + "\n" +
                names.get(2) + "\n" +
                names.get(3) + "\n" +
                names.get(4) + "\n\n");
        readUserInput();
        switch (choice) {
            case "John Smith" -> names.remove(0);
            case "Jackie Jackson" -> names.remove(1);
            case "Chris Jones" -> names.remove(2);
            case "Amanda Cullen" -> names.remove(3);
            case "Jeremy Goodwin" -> names.remove(4);
            default -> System.out.println("That's not an employee.");
        }
        return names;
    }

    public static void readUserInput() {
        System.out.println("Enter an employee name to remove: ");
        choice = in.nextLine();
    }
}
