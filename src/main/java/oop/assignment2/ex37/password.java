package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class password {
    public static final Scanner in = new Scanner(System.in);
    public List<String> minLength(){
        List<String> inputs = new ArrayList<>();
        System.out.println("What's the minimum length? ");
        int length = in.nextInt();
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i< length; i++){
            inputs.add(String.valueOf(alphabet.charAt(r.nextInt(alphabet.length()))));
        }
        return inputs;
    }

    public List<String> special(List<String> length){
        System.out.println("How many special characters? ");
        int size = in.nextInt();
        Random r = new Random();
        String spec = "[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]";
        for(int i = 0; i < size; i++){
            length.remove(String.valueOf(spec.charAt(r.nextInt(spec.length()))));
            length.add(String.valueOf(spec.charAt(r.nextInt(spec.length()))));
        }
        return length;
    }

    public List<String> numbers(List<String> spec){
        System.out.println("How many special characters? ");
        int size = in.nextInt();
        Random r = new Random();
        String num = "0123456789";
        for(int i = 0; i < size; i++){
            spec.remove(String.valueOf(num.charAt(r.nextInt(num.length()))));
            spec.add(String.valueOf(num.charAt(r.nextInt(num.length()))));
        }
        return spec;
    }

    public String join(List<String> num){
        String change = String.join(", ", num);
        change = change.replaceAll(", ", "");
        return change;
    }
}
